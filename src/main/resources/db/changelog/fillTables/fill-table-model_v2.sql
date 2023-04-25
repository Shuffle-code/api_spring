insert into MODEL (NAME, SERIAL_NUMBER, COLOR, SIZE, COST, PRESENCE,
                   TECHNOLOGY, TYPE_PROCESSOR, REMEMBER, COUNT_CAMERAS,
                   COUNT_DUST_COLLECTOR, COUNT_MODES, COUNT_DOORS, TYPE_COMPRESSOR,
                   TECHNIC_ID, CATEGORY)
values ('Рубик', '123as23', 'Blue', 'big', 123.56, 'AVAILABLE', 'Огонь_технология', null,  null, null, null, null, null, null, 7, 'low'),
       ('Кубик', '123as232', 'Orange', 'big', 123.56, 'NOT_AVAILABLE', 'wireless', null,  null, null, null, null, null, null,  8, 'высшая'),
       ('SONY', '1as23', 'Orange', 'big', 111, 'NOT_AVAILABLE', 'так_себе_технология', null,  null, null, null, null, null, null,  9, 'High'),
       ('LGd', '1s232', 'Blue', 'big', 33, 'AVAILABLE', 'future', null,  null, null, null, null, null, null,  8, 'low'),
       ('SONYa', '1as223', 'Orange2', 'big', 1111, 'NOT_AVAILABLE', 'так_себе_технология', null,  null, null, null, null, null, null,  9, 'High'),
       ('LG', '1s23', 'Blue', 'big', 355, 'AVAILABLE', 'future', null,  null, null, null, null, null, null,  7, 'low'),
       ('DNS', '123as23', 'Blue', 'big', 7065.3, 'AVAILABLE', null, '80486',  null, null, null, null, null, null,  10, 'low'),
       ('AMD', '123as232', 'Blue', 'big', 7, 'NOT_AVAILABLE', null, 'AMD', null, null, null, null, null, null,  10, 'высшая'),
       ('IPad', '1as23', 'RED', 'big', 100000, 'AVAILABLE', null, 'AMD', null, null, null, null, null, null, 11, 'High'),
       ('Hp', '1s23', 'Orange', 'big', 3678, 'AVAILABLE', null, '80386',  null, null, null, null, null, null,  11, 'low'),
       ('IPad12', '12as23', 'RED', 'big', 100000, 'AVAILABLE', null, 'AMD', null, null, null, null, null, null, 12, 'High'),
       ('Hp1', '1s2223', 'Orange', 'big', 3678, 'AVAILABLE', null, '80386',  null, null, null, null, null, null,  12, 'low'),
       ('DNS', '123as23', 'Blue', 'big', 12323.56, 'NOT_AVAILABLE', null, null, '128', 2, null, null, null, null,  13, null),
       ('AMD', '123as232', 'Blue', 'big', 4123.56, 'AVAILABLE', null, null, '256', 2, null, null, null, null,  13, null),
       ('IPad', '1as23', 'RED', 'big', 4445123.56, 'AVAILABLE', null, null, '64', 3, null, null, null, null, 14, null),
       ('Hp', '1s23', 'Orange', 'big', 3.56, 'NOT_AVAILABLE', null, null, '128', 4, null, null, null, null,  14, null),
       ('IPad1', '1as333323', 'RED', 'big', 4445123.56, 'AVAILABLE', null, null, '64', 3, null, null, null, null, 15, null),
       ('Hp2', '1s2323', 'Orange', 'big', 3.56, 'NOT_AVAILABLE', null, null, '128', 4, null, null, null, null,  15, null),
       ('DNS', '123as23', 'Blue', 'big', 54, 'AVAILABLE', null, null, null, null, 3, 2, null, null,  1, null),
       ('Dust', '123as232', 'Blue', 'big', 14123.56, 'AVAILABLE', null, null, null,  null, 4, 4, null, null,  2, null),
       ('Dust2', '1asxc23', 'RED', 'big', 34445123.6, 'NOT_AVAILABLE', null, null,  null,  null, 3, 4, null, null, 1, null),
       ('Collector', '1s1123', 'Orange', 'big', 12453.6, 'AVAILABLE', null, null,  null, null, 2, 1, null, null,  2, null),
       ('Dust22', '1asxhkc23', 'RED', 'big', 34445123.6, 'NOT_AVAILABLE', null, null,  null,  null, 3, 4, null, null, 3, null),
       ('Collector1', '1s1112323', 'Orange', 'big', 12453.6, 'AVAILABLE', null, null,  null, null, 2, 1, null, null,  3, null),
       ('Cool', '123a2s23', 'Blue', 'big', 54, 'AVAILABLE', null, null, null, null, null, null, 1, 'cool',  4, null),
       ('Frost', '1232232', 'Синий', 'small', 14123.56, 'AVAILABLE', null, null, null,  null, null, null, 4, 'not_cool',  5, null),
       ('Fridge', '1a223', 'Красный', 'big', 34445123.6, 'NOT_AVAILABLE', null, null,  null,  null, null, null, 2, 'cool', 5, null),
       ('Frost12', '1231q2232', 'Синий', 'small', 14123.56, 'AVAILABLE', null, null, null,  null, null, null, 1, 'not_cool',  6, null),
       ('Fridge1', '1adf223', 'Красный', 'big', 34445123.6, 'NOT_AVAILABLE', null, null,  null,  null, null, null, 2, 'cool', 6, null),
       ('camCool', '23', 'Orange', 'little', 12453.6, 'AVAILABLE', null, null,  null, null, null, null, 3, 'not_cool', 4, null);