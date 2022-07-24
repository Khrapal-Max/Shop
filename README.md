# Shop
task

Done
System from the start has 3 products that can be sold. Each product contains:
  1. Id
  2. Name
  3. Price
● System from the start has 3 users that can buy products. Each user has:
  1. Id
  2. First name
  3. Last name
  4. Amount of money
● System has menu that supports next operations:
  1. Display list of all users
  2. Display list of all products
  3. Display list of user products by user id (If user didn't buy anything yet, don't show anything)
  4. Display list of users that bought product by product id (If nobody bought this product yet, don't show anything)
  
● Add Spring Boot to application
● Add relational database and Hibernate to application for persistence storage

  
In work
3. User should be able to buy product, to do this operation we should enter:Id of user who want to buy productId of 
     product which user want to buy
     ● If user doesn't have enough money to buy product, throw exception
     ● If user successfully bought the product display message about successful purchase
     ● When user is buying product, his amount of money decreases by product price
     ● After successful purchase, information about user and his products has to be stored in collection best 
       suited for that purpose
       
● Get rid of console menu and move all the logic to REST endpoints
● Implement global error handling and user friendly exception messages with correct HTTP statuses

Project setup:
  Database: MySQL8.0
  Schema: Shop
  
Script SQL
CREATE DATABASE shop;

USE shop;

CREATE TABLE users
(
  id int(10) PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(20),
  last_name  VARCHAR(20),
  amount double
);

INSERT INTO `users` (`first_name`,`last_name`,`amount`)
VALUES
  ("User1", "Surname1", 100),
  ("User2", "Surname2", 100),
  ("User3", "Surname3", 100);

CREATE TABLE products
(
  id int(10) PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(20),
  price double
);

INSERT INTO `products` (`name`,`price`)
VALUES
  ("Product1", 50),
  ("Product2", 25),
  ("Product3", 1000);
  
  CREATE TABLE transactions
(
  id int(10) PRIMARY KEY AUTO_INCREMENT,
  user_id int(10),
  product_id int(10)
);

INSERT INTO `transactions` (`user_id`,`product_id`)
VALUES
  (1, 1),
  (1, 2),
  (2, 2),
  (2, 3);
  
HTTP requests:
http://localhost:8080/api/v1/users/allUsers - all users
http://localhost:8080/api/v1/products/allProducts - all products
http://localhost:8080/api/v1/users/products/1 - many
http://localhost:8080/api/v1/users/products/2 - many
http://localhost:8080/api/v1/users/products/3 - null
http://localhost:8080/api/v1/products/users/1 - one user
http://localhost:8080/api/v1/products/users/2 - two users
http://localhost:8080/api/v1/products/users/3 - one user
http://localhost:8080/api/v1/transactions/purchase
{
    "userId": 1,
    "productId": 1
}

