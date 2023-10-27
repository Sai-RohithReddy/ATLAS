-- Crateing basic Stored Procedure 

delimiter //

create procedure SelectAllCustomers()
begin
	select * from customers;
end //

delimiter ;

-- Invoking Stored Procedure

call SelectAllCustomers(); 

-- Stored Procedure with single parameter

 delimiter //
 
 create procedure SelectAllCustomersByCity(IN myCity varchar(50))
 begin
	select * from customers where city = myCity;
end //

delimiter ;

call SelectAllCustomersByCity("Singapore");

-- Stored Procedure with two different parameter

delimiter //

create procedure SelectAllCustomerByCityAndPin(in myCity varchar(50), in pin varchar(15))
begin
	select * from customers where city = myCity and postalCode = pin;
end //

delimiter ;

call SelectAllCustomerByCityAndPin("Singapore", "079903");

-- Stored Procedure with input and output parameter

delimiter //

create procedure  get_order_by_cust(
	in cust_no int,
    out shipped int,
    out canceled int,
    out resolved int,
    out disputed int)
begin
	select count(*) into shipped from orders where customerNumber = cust_no and status = "Shipped";
    select count(*) into canceled from orders where customerNumber = cust_no and status = "Canceled";
    select count(*) into resolved from orders where customerNumber = cust_no and status = "Resolved";
    select count(*) into disputed from orders where customerNumber = cust_no and status = "Disputed";
end //

delimiter ;

call get_order_by_cust(141, @shipped, @canceled, @resolved, @disputed);
select @shipped, @canceled, @resolved, @disputed;

-- Stored Procedure with multiple conditions

delimiter //
create procedure GetCustomerShipping(
	in pCustomerNumber int,
    out pShipping varchar(50))
begin
	declare customerCountry varchar(100);
select country into customerCountry from customers where customerNumber = pCustomerNumber;
	case customerCountry
		when "USA" then
			set pShipping = "2-day shipping";
		when "Canada" then
			set pShipping = "3-day shipping";
		else
			set pShipping = "5-day shipping";
		end case;
end //
delimiter ;

call GetCustomerShipping(112, @shipping);
select @shipping;

call GetCustomerShipping(260, @shipping);
select @shipping;

call GetCustomerShipping(353, @shipping);
select @shipping;

-- Stored Procedure to handle errors

create table supplierproducts(supplierId int, productId int, primary key (supplierId, productId));
desc supplierproducts;
insert into supplierproducts values(1,1),(1,2),(1,3);
select * from supplierproducts; 
set sql_safe_updates=0;
delete from supplierproducts;

delimiter //
create procedure InsertSupplierProduct(in inSupplierId int, in inProductId int)
begin
	declare exit handler for 1062 select "Duplicate keys error encountered" Message;
    declare exit handler for sqlexception select "SQLException encountered" Message;
    declare exit handler for sqlstate "23000" select "SQLState 23000" ErrorCode;
    
    insert into supplierproducts(supplierId, productId) values (inSupplierId, inProductId);
    
    select count(*) from supplierproducts where supplierId = inSupplierId;
end //
delimiter ;

call InsertSupplierProduct(1,1);
call InsertSupplierProduct(1,2);
call InsertSupplierProduct(1,3);

call InsertSupplierProduct(1,1);