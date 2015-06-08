
if not exists (select * from sys.tables where name='student')
    CREATE TABLE [javase_jdbc_mssql_example1].[dbo].[student] (
	    id int NOT NULL IDENTITY(1,1)
	    , firstname varchar(10) NOT NULL
	    , create_date datetime NOT NULL
    );
