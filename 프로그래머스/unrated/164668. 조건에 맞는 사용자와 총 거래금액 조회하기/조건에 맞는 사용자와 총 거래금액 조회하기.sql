-- 코드를 입력하세요
SELECT user.USER_ID, user.NICKNAME, sum(board.PRICE) TOTAL_SALES
from USED_GOODS_BOARD board
join USED_GOODS_USER user on board.WRITER_ID = user.USER_ID
where board.STATUS ='DONE'
group by user.USER_ID
having TOTAL_SALES >= 700000
order by TOTAL_SALES
