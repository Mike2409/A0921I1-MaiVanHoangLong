DROP VIEW if exists classicmodels.customer_views; 
CREATE VIEW classicmodels.customer_views AS

SELECT customerNumber, customerName, phone

FROM  classicmodels.customers;

select * from customer_views;