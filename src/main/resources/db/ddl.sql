-- DROP TABLE BUYER;
-- DROP TABLE PURCHASE;
-- DROP TABLE SHIPMENT;

CREATE TABLE MODEL (
    ID BIGSERIAL NOT NULL PRIMARY KEY,
    NAME VARCHAR(80) NOT NULL,
    SERIAL_NUMBER VARCHAR(80) NOT NULL,
    COLOR VARCHAR(80) NOT NULL,
    SIZE VARCHAR(80) NOT NULL,
    COST DECIMAL(10, 2) NOT NULL,
    TECHNOLOGY VARCHAR(80) NOT NULL,
    PRESENCE VARCHAR(80) NOT NULL,
    TECHNIC_ID  INT NOT NULL,
    CONSTRAINT TECHNIC_FOREIGN_KEY FOREIGN KEY (TECHNIC_ID) REFERENCES TECHNIC (ID)
);

CREATE TABLE TECHNIC (
                        ID BIGSERIAL NOT NULL PRIMARY KEY,
                        TITLE VARCHAR(80) NOT NULL,
                        MANUFACTURE_COUNTRY VARCHAR(80) NOT NULL,
                        MANUFACTURE VARCHAR(80) NOT NULL,
                        ORDER_ON VARCHAR(80) NOT NULL,
                        CREDIT VARCHAR(80) NOT NULL,
                        TYPE_TECHNIC VARCHAR(80) NOT NULL
);

ALTER TABLE MODEL
    ADD COLUMN CATEGORY VARCHAR(80);
--
-- Наименование, Страна производитель, Фирма производитель,
--     возможность заказа онлайн(да/нет), возможность оформления рассрочки(да/нет),
--     модели в наличии (выборка из моделей, которые представлены в виде справочника).
--
-- CREATE TABLE PURCHASE(
--     ID BIGSERIAL NOT NULL PRIMARY KEY,
--     BUYER_ID BIGSERIAL,
--     SHIPMENT_ID BIGSERIAL,
--     DATA DATE,
--     CONSTRAINT BUYER_FOREIGN_KEY FOREIGN KEY (BUYER_ID) REFERENCES BUYER (ID),
--     CONSTRAINT SHIPMENT_FOREIGN_KEY FOREIGN KEY (SHIPMENT_ID) REFERENCES SHIPMENT (ID)
-- );
--
-- CREATE TABLE SHIPMENT(
--     ID BIGSERIAL NOT NULL PRIMARY KEY,
--     TITLE VARCHAR(80) NOT NULL,
--     COST DECIMAL(10, 2) NOT NULL
-- );
--
-- CREATE VIEW bad_info AS select
-- max(buyer_id) as buyer, count(shipment_id) as count
-- from purchase group by buyer_id order by count;



-- WITH this_shipment AS (select * from purchase
-- JOIN shipment on purchase.shipment_id = shipment.id
-- where shipment.title = 'Минеральная вода'),
-- amount_buyer_info AS (select count(shipment_id) as count,
-- buyer_id from this_shipment group by buyer_id)
-- SELECT buyer_id from amount_buyer_info where count >= 1;
--
--
-- WITH purchese AS (SELECT * FROM purchase),
-- shipment_without_title AS
-- (SELECT id, cost FROM shipment),
-- full_join AS
-- (SELECT * FROM purchese FULL JOIN shipment_without_title
-- ON purchese.shipment_id = shipment_without_title.id),
-- stat AS (SELECT buyer_id, shipment_id, cost FROM full_join),
-- summ AS (SELECT buyer_id, SUM(cost) AS SUM
-- FROM stat GROUP BY buyer_id ORDER BY buyer_id)
-- SELECT * FROM summ WHERE sum >= 112 AND sum <= 4000;
--
-- SELECT e_author.lastname as 'ФИО автора', e_executor.lastname as 'ФИО Исполнителя',  text as 'Текст'
-- FROM resolution res
--          INNER JOIN employee as e_author
--                     ON (res.id_author = e_author.id)
--          INNER JOIN employee as e_executor
--                     ON (res.id_executor = e_executor.id);
--
-- SELECT CONCAT(e_author.lastname, SPACE(1), LEFT(e_author.firstname, 1), SPACE(1), LEFT(e_author.middlename, 1)) as 'ФИО автора',
--         CONCAT(e_executor.lastname, SPACE(1), LEFT(e_executor.firstname, 1), SPACE(1), LEFT(e_executor.middlename, 1)) as 'ФИО Исполнителя',
--         text as 'Текст'
-- FROM resolution res
--          INNER JOIN employee as e_author
--                     ON (res.id_author = e_author.id)
--          INNER JOIN employee as e_executor
--                     ON (res.id_executor = e_executor.id);
--
