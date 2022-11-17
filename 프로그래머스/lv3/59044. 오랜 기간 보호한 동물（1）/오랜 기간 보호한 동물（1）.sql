select ai.NAME, ai.DATETIME 
from ANIMAL_INS as ai
left join ANIMAL_OUTS as ao
on ai.ANIMAL_ID = ao.ANIMAL_ID
where ao.DATETIME is null
order by ai.datetime 
limit 3