CREATE TABLE `mayDB`.`phones` (
  `id` INT NOT NULL,
  `manufacturer` VARCHAR(45) NOT NULL,
  `model` VARCHAR(45) NOT NULL,
  `price` INT NULL,
  `quantity` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`));

INSERT INTO `mayDB`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('1', 'Apple', 'iPhone 13', '100000', '5');
INSERT INTO `mayDB`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('2', 'Apple', 'iPhone 12', '90000', '4');
INSERT INTO `mayDB`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('3', 'Apple', 'iPhone XR', '40000', '10');
INSERT INTO `mayDB`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('4', 'Samsung', 'Galaxy Note S10', '120000', '5');
INSERT INTO `mayDB`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('5', 'Samsung', 'A310', '30000', '8');
INSERT INTO `mayDB`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('6', 'Samsung', 'Fold', '200000', '2');
INSERT INTO `mayDB`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('7', 'Realme', 'X31', '40000', '15');
INSERT INTO `mayDB`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('8', 'Motorola', 'E398', '50000', '3');

SELECT * FROM `mayDB`.`phones`


CREATE PROCEDURE `get_all_phones` ()
BEGIN
	SELECT * FROM `mayDB`.`phones`;
END


CREATE PROCEDURE `get_most_expensive_phones` ()
BEGIN
	SELECT * FROM `mayDB`.`phones`
    WHERE price = (SELECT MAX(price) FROM `mayDB`.`phones`);
END


CREATE PROCEDURE `get_all_phones_in_range` (IN first_price INTEGER, IN second_price INTEGER)
BEGIN
	IF first_price > second_price
    THEN
		SELECT * FROM `mayDB`.`phones` WHERE price BETWEEN second_price AND first_price;
	ELSE
		SELECT * FROM `mayDB`.`phones` WHERE price BETWEEN first_price AND second_price;
	END IF;
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `add_new_phone`(IN id INT, IN manufacturer VARCHAR(45), IN model VARCHAR(45), IN price INT, IN quantity INT)
BEGIN
	INSERT INTO `mayDB`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES (id, manufacturer, model, price, quantity);
END


CREATE FUNCTION `return_max_id` ()
RETURNS INTEGER
DETERMINISTIC
BEGIN
	DECLARE maxID INTEGER;
    SELECT MAX(id) INTO maxID FROM `mayDB`.`phones`;    
RETURN maxID;
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `add_new_phone_without_id`(IN manufacturer VARCHAR(45), IN model VARCHAR(45), IN price INT, IN quantity INT)
BEGIN
	DECLARE id INTEGER;
    SET id = mayDB.return_max_id() + 1;
	INSERT INTO `mayDB`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES (id, manufacturer, model, price, quantity);
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `make_sale!!!`(IN discount INTEGER)
BEGIN
	UPDATE `mayDB`.`phones`
    SET price = price * ((100 - discount) / 100)
    WHERE quantity > 0;
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `sell_phone`(IN idx INTEGER, IN count INTEGER)
BEGIN
	DECLARE q INTEGER;
    SELECT quantity INTO q FROM `mayDB`.`phones` WHERE id = idx;
    
    IF q >= count
    THEN
		UPDATE `mayDB`.`phones`
		SET quantity = quantity - count
		WHERE id = idx;
	ELSE
		ROLLBACK;
	END IF;
END