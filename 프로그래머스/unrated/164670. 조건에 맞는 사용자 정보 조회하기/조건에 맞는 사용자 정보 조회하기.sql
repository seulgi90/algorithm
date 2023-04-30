-- 코드를 입력하세요
SELECT 
    user.USER_ID,
    user.NICKNAME,
    concat_ws(" ", user.CITY,user.STREET_ADDRESS1, user.STREET_ADDRESS2) 전체주소,
    concat_ws('-',substr(user.TLNO,1,3), substr(user.TLNO,4,4), substr(user.TLNO,8,4)) 전화번호
from USED_GOODS_USER user
join USED_GOODS_BOARD board on user.USER_ID = board.WRITER_ID
group by board.WRITER_ID 
having count(board.WRITER_ID) >= 3
order by USER_ID desc