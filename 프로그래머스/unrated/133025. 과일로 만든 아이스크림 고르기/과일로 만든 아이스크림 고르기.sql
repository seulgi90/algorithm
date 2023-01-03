-- 코드를 입력하세요
SELECT a.FLAVOR
from FIRST_HALF a join ICECREAM_INFO b on a.FLAVOR = b.FLAVOR
where b.INGREDIENT_TYPE = 'fruit_based'
group by a.SHIPMENT_ID
having sum(a.TOTAL_ORDER) >= 3000;