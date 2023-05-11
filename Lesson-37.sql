-- Выбор всех данных из таблицы
SELECT * FROM phones

-- 
SELECT model, manufacturer, price FROM phones

-- Сортировка (по убыванию цены)
SELECT * FROM phones
ORDER BY price
DESC

-- Вывести список телефонов по убыванию цены в количестве 5 записей
SELECT * FROM phones 
ORDER BY price 
DESC
LIMIT 5

-- Выбрать телефоны с ценой больше 50000
SELECT * FROM phones WHERE price > 50000

-- Выбрать телефоны с ценой больше или равной 50000
SELECT * FROM phones WHERE price >= 50000

-- Выбрать Самсунги с ценой больше или равной 60000 и количеством больше 2 штук
SELECT * FROM phones WHERE manufacturer = 'Samsung' AND price >= 60000 AND quantity > 2

-- Выбрать телефоны с ценой от 50к до 100к
SELECT * FROM phones WHERE price >= 50000 AND price <= 100000
SELECT * FROM phones WHERE price BETWEEN 50000 AND 100000

-- Вывести все Samsung и LG
SELECT * FROM phones WHERE manufacturer = 'LG' OR manufacturer = 'Samsung'
SELECT * FROM phones WHERE manufacturer IN ('LG', 'Samsung')

-- Вывести все телефоны не от Apple
SELECT * FROM phones WHERE manufacturer != 'Apple'

-- Вывести все телефоны не от Apple и не от Samsung
SELECT * FROM phones WHERE manufacturer != 'Apple' AND manufacturer != 'Samsung'
SELECT * FROM phones WHERE manufacturer NOT IN ('Apple', 'Samsung')

-- Вывести все телефоны не от Apple и не от Samsung + сортировка по убыванию цены
SELECT * FROM phones WHERE manufacturer NOT IN ('Apple', 'Samsung')
ORDER BY price 
DESC