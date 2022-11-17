SELECT distinct ao.ANIMAL_ID, ao.NAME
from ANIMAL_OUTS as ao
left join ANIMAL_INS as ai
ON ao.ANIMAL_ID = ai.ANIMAL_ID
where ai.datetime is null
order by animal_id