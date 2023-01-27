-- 코드를 입력하세요
SELECT m.MEMBER_NAME, r.REVIEW_TEXT, date_format(r.REVIEW_DATE, '%Y-%m-%d') REVIEW_DATE
from MEMBER_PROFILE m join REST_REVIEW r on m.MEMBER_ID = r.MEMBER_ID
where m.MEMBER_ID =
 (select MEMBER_ID from REST_REVIEW group by MEMBER_ID order by count(*) desc limit 1)
order by r.REVIEW_DATE, r.REVIEW_TEXT



