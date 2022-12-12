-- 코드를 입력하세요
SELECT A.apnt_no, P.pt_name, A.pt_no, A.mcdp_cd, D.dr_name, A.apnt_ymd
from appointment A
left join PATIENT P
on P.PT_NO = A.PT_NO
left join DOCTOR D
on D.DR_ID = A.MDDR_ID
WHERE DATE_FORMAT(A.APNT_YMD, '%Y-%m-%d') = DATE_FORMAT( '2022-04-13', '%Y-%m-%d') and A.MCDP_CD = 'CS' and A.APNT_CNCL_YN = 'N'
order by A.APNT_YMD asc;
