/*
    CREATE USER HOTEL IDENTIFIED BY HOTEL;
    GRANT ALL PRIVILEGES TO HOTEL;
*/

/*
    TABLA DONDE ESTARA LA INFORMACION DEL HOTEL
*/
CREATE TABLE HOTEL (
    ID_HOTEL                    NUMBER,
    NOMBRE_HOTEL                VARCHAR2(30),
    DIRECCION_HOTEL             VARCHAR2(100),
    TELEFONO_HOTEL              NUMBER,
    MAIL_HOTEL                  VARCHAR2(30),
    PRIMARY KEY (ID_HOTEL)
);

/*
    TABLA DONDE ESTARA LA INFORMACION DEL TIPO DE HABITACION
*/
CREATE TABLE TIPO_HABITACION (
    ID_TIPO_HAB                 NUMBER,
    NOMBRE_TIPO_HAB             VARCHAR2(10),
    PRIMARY KEY (ID_TIPO_HAB)
);

/*
    TABLA DONDE ESTARA LA INFORMACION DE LAS HABITACIONES
*/
CREATE TABLE HABITACION (
    ID_HAB                      NUMBER,
    NOMBRE_HAB                  VARCHAR2(10),
    NUMERO_CAMAS                NUMBER,
    DESCRIPCION_HAB             VARCHAR2(4000),
    COSTO_POR_DIA               NUMBER,
    FK_ID_HOTEL                 NUMBER,
    FK_ID_TIPO_HAB              NUMBER,
    PRIMARY KEY (ID_HAB),
    FOREIGN KEY (FK_ID_HOTEL) REFERENCES HOTEL(ID_HOTEL),
    FOREIGN KEY (FK_ID_TIPO_HAB) REFERENCES TIPO_HABITACION(ID_TIPO_HAB)
);

/*
    TABLA DONDE ESTARA LA INFORMACION DE LOS CLIENTES
*/
CREATE TABLE CLIENTE (
    DOCUMENTO_CLI               NUMBER,
    NOMBRE_CLI                  VARCHAR2(30),
    APELLIDO_CLI                VARCHAR2(30),
    FECHA_NACIMIENTO            DATE,
    TELEFONO_CLI                NUMBER,
    MAIL_CLI                    VARCHAR2(30),
    PRIMARY KEY (DOCUMENTO_CLI)
);

/*
    TABLA DONDE ESTARA LA INFORMACION DEL ALQUILER DE LAS HABITACIONES
*/
CREATE TABLE ALQUILER_HABITACION (
    ID_ALQ_HAB                  NUMBER,
    PRECIO_ALQ_HAB              NUMBER,
    FECHA_ENTRADA               DATE,
    FECHA_SALIDA                DATE,
    ESTADO_ALQ_HAB              VARCHAR2(2),
    OBSERVACION_ALQ_HAB         VARCHAR2(4000),
    FK_DOCUMENTO_CLI            NUMBER,
    FK_ID_HAB                   NUMBER,
    PRIMARY KEY (ID_ALQ_HAB),
    FOREIGN KEY (FK_DOCUMENTO_CLI) REFERENCES CLIENTE(DOCUMENTO_CLI),
    FOREIGN KEY (FK_ID_HAB) REFERENCES HABITACION(ID_HAB)
);
