-- 코드를 입력하세요
SELECT CATEGORY, price MAX_PRICE, PRODUCT_NAME
from FOOD_PRODUCT
where CATEGORY in('과자', '국', '김치', '식용유') and
price in (select max(price) from FOOD_PRODUCT group by CATEGORY)
order by MAX_PRICE desc