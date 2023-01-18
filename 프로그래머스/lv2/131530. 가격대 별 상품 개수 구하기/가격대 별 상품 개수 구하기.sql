-- 코드를 입력하세요
SELECT (PRICE-PRICE%10000) PRICE_GROUP, count(*)  PRODUCTS
from product
group by PRICE_GROUP
order by PRICE_GROUP