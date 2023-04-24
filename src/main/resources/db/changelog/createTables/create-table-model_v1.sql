

CREATE TABLE IF NOT EXISTS MODEL (
    ID BIGSERIAL NOT NULL PRIMARY KEY,
    NAME VARCHAR(80) NOT NULL,
    SERIAL_NUMBER VARCHAR(80) NOT NULL,
    COLOR VARCHAR(80) NOT NULL,
    SIZE VARCHAR(80) NOT NULL,
    COST DECIMAL(10, 2) NOT NULL,
    TECHNOLOGY VARCHAR(80),
    PRESENCE VARCHAR(80) NOT NULL,
    TYPE_PROCESSOR VARCHAR(80),
    REMEMBER VARCHAR(80),
    COUNT_CAMERAS INT,
    COUNT_DOORS INT,
    COUNT_MODES INT,
    COUNT_DUST_COLLECTOR INT,
    TYPE_COMPRESSOR VARCHAR(80),
    TECHNIC_ID  INT NOT NULL,
    CONSTRAINT TECHNIC_FOREIGN_KEY FOREIGN KEY
    (TECHNIC_ID) REFERENCES TECHNIC (ID)
    );