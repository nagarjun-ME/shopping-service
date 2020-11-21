DROP TABLE IF EXISTS products;

	CREATE TABLE products (
	  product_Id INT AUTO_INCREMENT  PRIMARY KEY,
	  product_Name VARCHAR(250) NOT NULL,
	  product_Description VARCHAR(250) NOT NULL,
	  product_Price DOUBLE DEFAULT NULL
	);