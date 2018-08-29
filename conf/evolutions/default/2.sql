# --- Sample dataset

# --- !Ups

insert into category (id,name) values ( 1,'Upcoming Events' );
insert into category (id,name) values ( 2,'Tickets' );
insert into category (id,name) values ( 3,'Offers' );
insert into category (id,name) values ( 4,'Packs' );
insert into category (id,name) values ( 5,'Accessories' );
insert into category (id,name) values ( 6,'Clothing' );

insert into product (id,name,description,stock,price) values ( 1,"Martin Garrix", "19th of October", 2475, 70.00);
insert into product (id,name,description,stock,price) values ( 2,"Money Maker", "1L bottle of Whiskey, Rum or Vodka and reserved L.A Suite", 1, 159.00 );
insert into product (id,name,description,stock,price) values ( 3,"Perfect Party", "Free entry, Bottle of Champagne and VIP access all areas. only available for groups of 5 or over", 15, 189.00 );
insert into product (id,name,description,stock,price) values ( 4,"The DJ", "Backstage with Martin Garrix. 19th of October", 25, 129.00 );
insert into product (id,name,description,stock,price) values ( 5, "Armand Van Heldon", "November 17th", 2000, 99.0 );
insert into product (id,name,description,stock,price) values ( 6, "Mall Grab", "September 19th", 2000, 79.0 );
insert into product (id,name,description,stock,price) values ( 7, "Genesis Cap", "One Sized Genesis Cap", 50, 29.0 );
insert into product (id,name,description,stock,price) values ( 8, "Genesis wrist band", "Black and Green adjustable wrist band", 50, 15.0 );
insert into product (id,name,description,stock,price) values ( 9, "Clubbers Pack", "Unlimited Acceses for 30 days after purchase", 60, 70.0 );
insert into product (id,name,description,stock,price) values ( 10, "Party Pack", "Unlimited acesses for you and a Club Pal for the Month", 25, 100.0 );
insert into product (id,name,description,stock,price) values ( 11, "Pro", "Unlimited access to the club for the year", 300, 399.0 );
insert into product (id,name,description,stock,price) values ( 12, "Mens Genesis Hoodie", "Logo hoodie in MEDIUM size", 50, 45.0 );
insert into product (id,name,description,stock,price) values ( 13, "Womans Genesis Hoodie", "Logo hoodie in MEDIUM size", 50, 40.0 );

insert into category_product (category_id,product_id) values (1,1);
insert into category_product (category_id,product_id) values (2,1);
insert into category_product (category_id,product_id) values (3,2);
insert into category_product (category_id,product_id) values (3,3);
insert into category_product (category_id,product_id) values (3,4);
insert into category_product (category_id,product_id) values (1,5);
insert into category_product (category_id,product_id) values (1,6);
insert into category_product (category_id,product_id) values (2,6);  
insert into category_product (category_id,product_id) values (5,7);
insert into category_product (category_id,product_id) values (5,8);
insert into category_product (category_id,product_id) values (4,9);
insert into category_product (category_id,product_id) values (4,10);
insert into category_product (category_id,product_id) values (4,11);
insert into category_product (category_id,product_id) values (4,12);
insert into category_product (category_id,product_id) values (6,12);  
insert into category_product (category_id,product_id) values (6,13);  

insert into user (email,name,password,role) values ( 'admin@products.com', 'Alice Admin', 'password', 'admin' );
insert into user (email,name,password,role) values ( 'manager@products.com', 'Bob Manager', 'password', 'manager' );
insert into user (email,name,password,role) values ( 'customer@products.com', 'Charlie Customer', 'password', 'customer' );
