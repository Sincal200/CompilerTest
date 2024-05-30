DECLARE @i INT; SET @i = 5;
DECLARE @j INT; SET @j = 5;
DECLARE @k INT; SET @k = 9;
-- Realizar la operación
PRINT 'Resultado: ' + CAST((@i * @k + @i - @k) AS VARCHAR);-- Realizar la operación
PRINT 'Resultado: ' + CAST((@j ^ @i) AS VARCHAR);