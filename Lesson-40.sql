-- Прописываем все JOIN-ы

SELECT * FROM models md
	JOIN sellers sl ON md.seller_id = sl.id
	JOIN offices o ON o.id = sl.office_id
	JOIN quantity q ON q.model_id = md.id
	JOIN prices pc ON pc.id = md.price_id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
	JOIN countries cu ON cu.id = mn.country_id
	JOIN regions rg ON rg.id = cu.region_id


-- Найти страну с максимальной капитализацией всех её производителей

SELECT cu.name FROM manufacturers mn
	JOIN countries cu ON cu.id = mn.country_id
GROUP BY cu.name
HAVING SUM(mn.capitalization) = 
(	SELECT SUM(mn.capitalization) FROM manufacturers mn
		JOIN countries cu ON cu.id = mn.country_id
	GROUP BY cu.name
	ORDER BY SUM(mn.capitalization)
 	DESC
 	LIMIT 1
)


-- Вывести всю доступную информацию о моделе: имя производителя, имя модели, цена, остаток, страна производства

SELECT mn.name, md.name, pc.value, q.count, cu.name FROM models md
	JOIN quantity q ON q.model_id = md.id
	JOIN prices pc ON pc.id = md.price_id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
	JOIN countries cu ON cu.id = mn.country_id


-- Вывести все автомобили и их продавцов, которыми занимаются сотрудники офиса ‘Laconia’ 

SELECT CONCAT(mn.name, ' ', md.name) AS auto, CONCAT(sl.first_name, ' ', sl.last_name) AS seller FROM models md
	JOIN sellers sl ON md.seller_id = sl.id
	JOIN offices o ON o.id = sl.office_id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
WHERE o.name = 'Laconia'


-- Найти марку с наибольшим количеством автомобилей в системе

SELECT mn.name FROM models md
	JOIN quantity q ON q.model_id = md.id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
GROUP BY mn.name
HAVING SUM(q.count) = (
	SELECT SUM(q.count) FROM models md
		JOIN quantity q ON q.model_id = md.id
		JOIN manufacturers mn ON mn.id = md.manufacturer_id
	GROUP BY mn.name
	ORDER BY SUM(q.count)
	DESC
	LIMIT 1
	)


-- Найти все модели, что может купить потребитель

SELECT CONCAT(mn.name, ' ', md.name) FROM models md
	JOIN quantity q ON q.model_id = md.id
	JOIN prices pc ON pc.id = md.price_id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
WHERE md.inStock = 'true' AND q.count > 0 AND pc.value > 0


-- Вывести среднее значение цены всех доступных к продаже автомобилей

SELECT ROUND(AVG(pc.value), 2) FROM models md
	JOIN quantity q ON q.model_id = md.id
	JOIN prices pc ON pc.id = md.price_id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
WHERE md.inStock = 'true' AND q.count > 0 AND pc.value > 0


-- Вывести все уникальные модели производителя ‘KAA’ и среднюю цену на них

SELECT CONCAT(mn.name, ' ', md.name), ROUND(AVG(pc.value), 2) FROM models md
	JOIN prices pc ON pc.id = md.price_id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
WHERE mn.name = 'KAA'
GROUP BY CONCAT(mn.name, ' ', md.name)


-- Вывести все уникальные модели производителя ‘KAA’ и среднюю цену на них (с учетом количества)

SELECT CONCAT(mn.name, ' ', md.name), SUM(pc.value * q.count) / SUM(q.count) FROM models md
	JOIN prices pc ON pc.id = md.price_id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
	JOIN quantity q ON q.model_id = md.id
WHERE mn.name = 'KAA'
GROUP BY CONCAT(mn.name, ' ', md.name)


-- Вывести все модели, которые продаёт самый востребованный продавец

SELECT CONCAT(mn.name, ' ', md.name) FROM models md
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
WHERE md.seller_id = (
	SELECT sl.id FROM models md
		JOIN sellers sl ON md.seller_id = sl.id
		JOIN quantity q ON q.model_id = md.id
		JOIN manufacturers mn ON mn.id = md.manufacturer_id
	GROUP BY sl.id
	HAVING SUM(q.count) = (
		 SELECT SUM(q.count) FROM models md
			JOIN sellers sl ON md.seller_id = sl.id
			JOIN quantity q ON q.model_id = md.id
			JOIN manufacturers mn ON mn.id = md.manufacturer_id
		GROUP BY sl.id
		ORDER BY SUM(q.count)
		DESC
		LIMIT 1
		)
	)


	