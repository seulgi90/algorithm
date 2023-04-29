-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/', board.board_id, '/', file.file_id, file.file_name, file.file_ext)  FILE_PATH
FROM USED_GOODS_BOARD AS board
    INNER JOIN USED_GOODS_FILE AS file ON board.board_id = file.board_id
WHERE views = (SELECT MAX(views) FROM used_goods_board)
ORDER BY file.file_id DESC