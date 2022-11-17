-- 코드를 입력하세요
SELECT F.FLAVOR
from FIRST_HALF as F
inner join JULY as J
on F.FLAVOR = J.FLAVOR
group by F.FLAVOR, J.FLAVOR
order by sum(F.TOTAL_ORDER) + sum(J.TOTAL_ORDER) desc
limit 3