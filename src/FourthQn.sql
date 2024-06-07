set mark HTML on;
spool fourthQn.html;
SET DEFINE OFF;
SET pagesize 50000;
SET echo ON;
SET feedback ON;
SET term ON;

SELECT
    a.id AS USERID,
    a.username,
    a.status,
    a.user_key,
    b.currency,
    NVL(b.balance, 0) AS BALANCE
FROM USERS a
LEFT JOIN USER_WALLET b ON a.id = b.userid
WHERE a.status = 0 AND a.type IN (1, 2)
ORDER BY a.username;

--  NVL function default to 0 if the value is null
-- where clause with type as result only have some value


spool OFF;

