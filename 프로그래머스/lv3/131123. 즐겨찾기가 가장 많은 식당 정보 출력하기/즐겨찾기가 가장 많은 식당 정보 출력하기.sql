-- 코드를 입력하세요
SELECT FOOD_TYPE, REST_ID, REST_NAME,FAVORITES
from REST_INFO
where FAVORITES in (SELECT MAX(FAVORITES) FROM REST_INFO GROUP BY FOOD_TYPE)
group by FOOD_TYPE
order by FOOD_TYPE desc