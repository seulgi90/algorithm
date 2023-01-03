-- 코드를 입력하세요
SELECT 
a.BOOK_ID, 
b.AUTHOR_NAME, 
date_format(a.PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
from book a left join author b on a.author_id = b.author_id
where category = '경제'
order by PUBLISHED_DATE;