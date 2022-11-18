-- 코드를 입력하세요
SELECT CATEGORY, price as 'MAX_PRICE', PRODUCT_NAME
from food_product
where price in (select max(price) from food_product group by category)
and category in ('김치', '과자', '국', '식용유')
order by price desc