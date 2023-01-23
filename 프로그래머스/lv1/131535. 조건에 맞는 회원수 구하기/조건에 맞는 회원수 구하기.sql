-- 코드를 입력하세요
SELECT count(USER_ID) USERS
from USER_INFO
where date_format(JOINED, '%Y-%m-%d') = 2021 and
AGE between 20 and 29