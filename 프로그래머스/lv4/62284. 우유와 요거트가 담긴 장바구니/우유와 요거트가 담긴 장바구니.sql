-- 코드를 입력하세요
SELECT CART_ID
from CART_PRODUCTS
where NAME ='Milk' and CART_ID in (select CART_ID from CART_PRODUCTS where name ='Yogurt')
