drop table if exists Products;

create table Products (
    prod_id IDENTITY PRIMARY KEY,
    prod_name VARCHAR(255) NOT NULL,
    prod_price INT NOT NULL
)