-- 코드를 입력하세요
SELECT YEAR(b.SALES_DATE) YEAR, 
       MONTH(b.SALES_DATE) MONTH, 
       count(distinct b.USER_ID) PUCHASED_USERS, 
       round(count(distinct b.USER_ID) 
             / (SELECT count(USER_ID)
                FROM USER_INFO
                WHERE DATE_FORMAT(JOINED, '%Y') = '2021'), 1) PUCHASED_RATIO
from USER_INFO a join ONLINE_SALE b on a.USER_ID = b.USER_ID
where DATE_FORMAT(a.JOINED, '%Y') = '2021'
group by YEAR(b.SALES_DATE), MONTH(b.SALES_DATE)
order by YEAR(b.SALES_DATE), MONTH(b.SALES_DATE)