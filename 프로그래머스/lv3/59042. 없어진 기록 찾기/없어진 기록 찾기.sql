-- 코드를 입력하세요
SELECT o.ANIMAL_ID, o.NAME
from ANIMAL_OUTS o
where not exists (select ANIMAL_ID from ANIMAL_INS i where o.ANIMAL_ID = i.ANIMAL_ID)