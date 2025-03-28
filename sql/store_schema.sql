﻿CREATE LOGIN TOAN_QUYEN WITH PASSWORD = 'ADMIN123@';
GO
CREATE USER LECONGBINH FOR LOGIN TOAN_QUYEN;
GO
GRANT SELECT, INSERT, ALTER, DELETE TO LECONGBINH;
GO

CREATE LOGIN DOC_DL1 WITH PASSWORD = 'EMPLOYEE1!';
GO
CREATE USER NGUYENQUOCTAN FOR LOGIN DOC_DL1;
GO
GRANT SELECT TO NGUYENQUOCTAN;
GO
CREATE LOGIN DOC_DL2 WITH PASSWORD = 'EMPLOYEE2!';
GO
CREATE USER TUQUANGCHUONG FOR LOGIN DOC_DL2;
GO
GRANT SELECT TO TUQUANGCHUONG;
GO
CREATE LOGIN DOC_DL3 WITH PASSWORD = 'EMPLOYEE3!';
GO
CREATE USER TRANVANDONG FOR LOGIN DOC_DL3;
GO
GRANT SELECT TO TRANVANDONG;
GO
CREATE LOGIN DOC_DL4 WITH PASSWORD = 'EMPLOYEE4!';
GO
CREATE USER PHAMTRANNHUTQUANG FOR LOGIN DOC_DL4;
GO
GRANT SELECT TO PHAMTRANNHUTQUANG;
GO

CREATE SCHEMA Store_schema
AUTHORIZATION LECONGBINH;
GO

CREATE SCHEMA Order_schema
AUTHORIZATION NGUYENQUOCTAN;
GO

CREATE SCHEMA Product_schema
AUTHORIZATION TUQUANGCHUONG;
GO

CREATE SCHEMA Cus_Account_schema
AUTHORIZATION TRANVANDONG;
GO

CREATE SCHEMA Employees_schema
AUTHORIZATION PHAMTRANNHUTQUANG;
GO