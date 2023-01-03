-- 코드를 입력하세요
SELECT a.FLAVOR
from FIRST_HALF a join ICECREAM_INFO b on a.FLAVOR = b.FLAVOR
where b.INGREDIENT_TYPE = 'fruit_based' and a.TOTAL_ORDER > 3000
order by a.TOTAL_ORDER desc;

