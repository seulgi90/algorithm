-- 코드를 입력하세요
SELECT ANIMAL_TYPE, count(ANIMAL_TYPE) count
from ANIMAL_INS
where ANIMAL_TYPE ='dog' or ANIMAL_TYPE='cat'
group by ANIMAL_TYPE
order by ANIMAL_TYPE 