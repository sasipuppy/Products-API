DROP TABLE IF EXISTS product;

CREATE TABLE product (
  id BIGINT AUTO_INCREMENT NOT NULL,
  name VARCHAR(250) NOT NULL,
  price DOUBLE NOT NULL,
  category VARCHAR(300) NOT NULL, 
  PRIMARY KEY (`id`)
);

INSERT INTO product (name, price, category) VALUES
  ('iPhone 12 Pro', 12888,'Mobile'),
  ('SanDisk Harddrive 128GB', 678,'Electronics'),
  ('Spalding NBA Basket ball', 566,'Sports'),
  ('LEGO Minecraft The Pig House', 500,'Toys' );