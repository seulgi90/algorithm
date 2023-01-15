-- 코드를 입력하세요
SELECT CATEGORY, sum(SALES) TOTAL_SALES
from BOOK a join BOOK_SALES b on a.BOOK_ID = b.BOOK_ID
where date_format(SALES_DATE, '%Y-%m') = '2022-01'
group by CATEGORY
order by CATEGORY