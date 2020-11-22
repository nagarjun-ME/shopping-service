DROP TABLE IF EXISTS products;

	CREATE TABLE products (
	  product_Id INT AUTO_INCREMENT  PRIMARY KEY,
	  product_Name VARCHAR(250) NOT NULL,
	  product_Description VARCHAR(250) NOT NULL,
	  product_Price DOUBLE DEFAULT NULL
	);

DROP TABLE IF EXISTS payments;

	CREATE TABLE payments(
	  payment_Id INT AUTO_INCREMENT  PRIMARY KEY,
	  description VARCHAR(250) NOT NULL,
	  amount DOUBLE DEFAULT NULL,
	  payment_date VARCHAR(50),
	  item_id VARCHAR(100) NOT NULL
	);