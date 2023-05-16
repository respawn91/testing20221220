-- Вспоминаем 
SELECT * FROM phones WHERE manufacturer = 'Apple' AND price BETWEEN 50000 AND 80000
ORDER BY price
DESC

-- Вывести максимальное значение цены телефона
SELECT price FROM phones 
ORDER BY price
DESC
LIMIT 1

SELECT MAX(price) FROM phones 

-- Вывести среднее значение цены телефона
SELECT AVG(price) FROM phones 

-- Вывести минимальное значение цены телефона
SELECT MIN(price) FROM phones 

-- Вывести общее количество телефонов
SELECT SUM(quantity) FROM phones 

-- Вывести общее количество моделей телефонов
SELECT COUNT(model) FROM phones 

-- Найти "настоящее" среднее значение цены телефона
SELECT SUM(price * quantity) / SUM(quantity) FROM phones

-- Вывести информацию о самом дорогом телефоне
SELECT * FROM phones
ORDER BY price 
DESC
LIMIT 1

-- Вывести информацию о самом дорогом телефоне
SELECT * FROM phones WHERE price = (SELECT MAX(price) FROM phones)

-- Вывести информацию о телефонах с ценой выше средней
SELECT * FROM phones WHERE price > (SELECT AVG(price) FROM phones)

-- Вывести информацию о телефонах с ценой выше средней
SELECT * FROM phones WHERE price > (SELECT AVG(price) FROM phones)
ORDER BY price
DESC

-- Вывести среднюю стоимость телефонов производителя Apple
SELECT AVG(price) FROM phones WHERE manufacturer = 'Apple'

-- Вывести среднюю стоимость телефонов по производителю
SELECT manufacturer, ROUND(AVG(price), 2) FROM phones
GROUP BY manufacturer

-- Вывести среднюю стоимость телефонов по производителю со средней ценой выше 50000
SELECT manufacturer, ROUND(AVG(price), 2) FROM phones 
GROUP BY manufacturer
HAVING ROUND(AVG(price), 2) > 50000
ORDER BY ROUND(AVG(price), 2)
DESC


SELECT price, COUNT(price) FROM phones
GROUP BY price
HAVING COUNT(price) > 1

-- Вывести список производителей
SELECT DISTINCT(manufacturer) FROM phones

-- Вывести количество производителей
SELECT COUNT(DISTINCT(manufacturer)) FROM phones

-- 
SELECT CONCAT(manufacturer, ' ', model) FROM phones

-- LIKE
SELECT * FROM phones WHERE model LIKE 'EP%'
SELECT * FROM phones WHERE model LIKE '%EP%'


