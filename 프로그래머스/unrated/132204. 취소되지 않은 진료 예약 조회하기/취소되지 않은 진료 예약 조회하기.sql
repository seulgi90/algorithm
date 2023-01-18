-- 코드를 입력하세요
select a.APNT_NO, p.PT_NAME, p.PT_NO, a.MCDP_CD, d.DR_NAME, a.APNT_YMD
from PATIENT p join APPOINTMENT a on p.PT_NO = a.PT_NO
join DOCTOR d on d.DR_ID = a.MDDR_ID
where a.MCDP_CD ='cs' and a.APNT_CNCL_YN ='n' and
a.APNT_YMD like '%2022-04-13%'
GROUP BY p.PT_NAME 
order by a.APNT_YMD