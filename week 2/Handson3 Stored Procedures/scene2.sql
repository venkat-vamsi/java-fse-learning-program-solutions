DECLARE
  TYPE ST IS TABLE OF NUMBER;
  salaries ST := ST(35000, 45000, 50000, 100000, 75000, 57000);

  PROCEDURE UpdateEmployeeBonus(bon IN NUMBER) IS
  BEGIN
    FOR i IN 1 .. salaries.COUNT LOOP
      salaries(i) := salaries(i) + (salaries(i) * bon/100);
    END LOOP;
    FOR i IN 1 .. salaries.COUNT LOOP
      DBMS_OUTPUT.PUT_LINE('Updated Salary of employee ' || i || ' is ' || salaries(i));
    END LOOP;
  END;
BEGIN
  DBMS_OUTPUT.PUT_LINE('Bonus is 12% ');
  UpdateEmployeeBonus(12);
END;
/