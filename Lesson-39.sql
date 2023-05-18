-- 
SELECT * FROM manufacturers 
	JOIN products ON manufacturers.id = products.manufacturer_id
	JOIN prices ON products.id = prices.product_id

-- 
SELECT * FROM manufacturers mn
	JOIN products pd ON mn.id = pd.manufacturer_id
	JOIN prices pc ON pd.id = pc.product_id

-- Вывести все товары
SELECT pd.name, mn.name, mn.location, pc.value, pc.discount FROM manufacturers mn
	JOIN products pd ON mn.id = pd.manufacturer_id
	JOIN prices pc ON pd.id = pc.product_id

-- Вывести все товары с ценами
SELECT pd.name, pc.value, pc.discount FROM products pd
	JOIN prices pc ON pd.id = pc.product_id

-- Вывести все товары с ценами (даже если их нет)
SELECT pd.name, pc.value, pc.discount FROM products pd
	LEFT JOIN prices pc ON pd.id = pc.product_id

-- Вывести все данные из БД
SELECT pd.name, mn.name, mn.location, pc.value, pc.discount FROM manufacturers mn
	LEFT JOIN products pd ON mn.id = pd.manufacturer_id
	LEFT JOIN prices pc ON pd.id = pc.product_id

-- Вывести список производителей без товаров
SELECT mn.name, mn.location, pd.name FROM manufacturers mn
	LEFT JOIN products pd ON mn.id = pd.manufacturer_id
WHERE pd.name IS null

-- Вывести товары производителей из Moscow и Vladivostok с ценой >= 5000
SELECT pd.name, mn.name, mn.location, pc.value, pc.discount FROM manufacturers mn
	JOIN products pd ON mn.id = pd.manufacturer_id
	JOIN prices pc ON pd.id = pc.product_id
WHERE mn.location IN ('Moscow', 'Vladivostok') AND pc.value >= 5000

-- 
SELECT pd.name, mn.name, mn.location, pc.value, pc.discount FROM products pd
	JOIN manufacturers mn ON mn.id = pd.manufacturer_id AND mn.location IN ('Moscow', 'Vladivostok') 
	JOIN prices pc ON pd.id = pc.product_id AND pc.value >= 5000

-- Вывести товары производителей из Moscow и Vladivostok с ценой >= 5000. Отсортировать по цене по убыванию
SELECT pd.name, mn.name, mn.location, pc.value, pc.discount FROM products pd
	JOIN manufacturers mn ON mn.id = pd.manufacturer_id AND mn.location IN ('Moscow', 'Vladivostok') 
	JOIN prices pc ON pd.id = pc.product_id AND pc.value >= 5000
ORDER BY pc.value
DESC

-- Вывести список производителей с их количеством товаров
SELECT mn.name, COUNT(pd.id) FROM products pd
	RIGHT JOIN manufacturers mn ON mn.id = pd.manufacturer_id
GROUP BY mn.name
ORDER BY COUNT(pd.id)
DESC

-- Вывести производителя с наибольшей средней ценой за товары
SELECT mn.name, ROUND(AVG(pc.value), 2) FROM products pd
	RIGHT JOIN manufacturers mn ON mn.id = pd.manufacturer_id
	JOIN prices pc ON pd.id = pc.product_id
GROUP BY mn.name
ORDER BY ROUND(AVG(pc.value), 2)
DESC
LIMIT 1
-- Вывести производителя с наибольшей средней ценой за товары
SELECT mn.name, ROUND(AVG(pc.value), 2) FROM products pd
	RIGHT JOIN manufacturers mn ON mn.id = pd.manufacturer_id
	JOIN prices pc ON pd.id = pc.product_id
GROUP BY mn.name
HAVING AVG(pc.value) = 
	(SELECT AVG(pc.value) FROM products pd
		RIGHT JOIN manufacturers mn ON mn.id = pd.manufacturer_id
		JOIN prices pc ON pd.id = pc.product_id
	GROUP BY mn.name
	ORDER BY AVG(pc.value)
	DESC
	LIMIT 1)