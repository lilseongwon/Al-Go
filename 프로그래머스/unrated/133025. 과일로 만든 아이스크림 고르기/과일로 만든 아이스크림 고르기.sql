-- 코드를 입력하세요
SELECT I.FLAVOR 
from icecream_info I
inner join first_half F
on I.flavor = F.flavor
where F.TOTAL_ORDER > 3000 and I.INGREDIENT_TYPE = 'fruit_based'