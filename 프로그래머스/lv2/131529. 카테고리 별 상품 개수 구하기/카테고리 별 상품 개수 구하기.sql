-- 코드를 입력하세요
SELECT LEFT(PRODUCT_CODE, 2) AS CATEGORY_CODE, COUNT(PRODUCT_CODE) AS PRODUCT_COUNT
FROM PRODUCT
GROUP BY CATEGORY_CODE
ORDER BY CATEGORY_CODE;
