-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, date_format(DATE_OF_BIRTH, '%Y-%m-%d')
from MEMBER_PROFILE
where GENDER = 'w' and month(DATE_OF_BIRTH) = 03 and TLNO is not null
order by MEMBER_ID
