DROP TABLE IF EXISTS products;

	CREATE TABLE products (
	  product_Id INT AUTO_INCREMENT  PRIMARY KEY,
	  product_Name VARCHAR(250) NOT NULL,
	  product_Description VARCHAR(250) NOT NULL,
	  product_Price DOUBLE DEFAULT NULL
	);

	INSERT INTO products (product_Name,product_Description, product_Price) VALUES
	  ('JAVA 11 TextBook', 'Java 11: a journey to begin', 22.12),
	  ('SpringBoot', 'New features for version 2.4', 15.99),
	  ('IBM MQ V9.0', 'MQ Objects to advanced level', 12.49);