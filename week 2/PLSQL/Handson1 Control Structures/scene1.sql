DECLARE
  TYPE AgeTable IS TABLE OF NUMBER;
  TYPE InterestTable IS TABLE OF NUMBER;
  
  ages AgeTable := AgeTable(65, 45, 72, 64, 63, 18, 26, 66);
  interests InterestTable := InterestTable(10.0, 9.5, 8.0, 9.3, 1.8, 6.0, 11.1, 7.03);
  
BEGIN
  FOR i IN 1 .. ages.COUNT LOOP
    IF ages(i) > 60 THEN
      interests(i) := interests(i) - 1.0;
      DBMS_OUTPUT.PUT_LINE('Customer ' || i || 's age is ' || ages(i) || ', discounted interest is ' || interests(i));
    END IF;
  END LOOP;
END;
/