drop database if exists view_procedure;
create database view_procedure;
use view_procedure;
-- Bước 2
create table products(
id int not null primary key auto_increment,
productCode varchar(20) NOT null,
productName varchar(50) NOT null,
productPrice int(20) NOT null,
productAmount int(20) NOT null,
productDescription varchar(250) NOT null,
productStatus varchar(50) NOT null
);

insert into products(productCode,productName,productPrice,productAmount,productDescription,productStatus)
values	("0001","Iphone",2000,1000,"Product from Apple","available"),
		("0002","Samsung",1800,1200,"Product from Samsung","not available"),
		("0003","Oppo",1000,10000,"Product from Oppo","not available"),
		("0004","Xiaomi",1100,9000,"Product from Xiaomi","available");
-- Bước 3        
ALTER TABLE products ADD INDEX idxProducts(productCode);
ALTER TABLE products ADD INDEX compositeProducts(productName, productPrice);

select * from products where productCode = '0003';
explain select * from products where productCode = '0003';

select * from products where productName = 'Iphone' and productPrice = '2000';
explain select * from products where productName = 'Iphone' and productPrice = '2000';

-- Bước 4
create or replace view ProductInfor as
select productCode, productName, productPrice, productStatus from products;
select * from ProductInfor;
create or replace view ProductInfor as

select productCode, productName, productPrice, productStatus, productDescription from products where productPrice = '1100';    
select * from ProductInfor;
drop view ProductInfor;

-- Bước 5
delimiter //
create procedure getProductInfor()
begin
	select * from products;
end //
delimiter ;

call getProductInfor();

delimiter //
create procedure addNewProduct()
begin
	insert into products(productCode,productName,productPrice,productAmount,productDescription,productStatus)
    values ("0005","Huawei",1400,5000,"Product from Huawei","available");
end //
delimiter ;

call addNewProduct();
call getProductInfor();

delimiter //
create procedure editProductById(in in_id int)
begin
	update products
    set productPrice = 1500
    where in_id = id;
end //
delimiter ;

call editProductById(5);

delimiter //
create procedure deleteProductById(in in_id int)
begin
	delete from products
    where in_id = id;
end //
delimiter ;

call getProductInfor();
call deleteProductById(2);
call getProductInfor();