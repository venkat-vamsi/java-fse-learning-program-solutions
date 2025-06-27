DECLARE
  TYPE BT IS TABLE OF NUMBER;
  balances BT := BT(1001, 1507, 2000, 7089, 2560, 3700);

  PROCEDURE ProcessMonthlyInterest IS
  BEGIN
    FOR i IN 1 .. balances.COUNT LOOP
      balances(i) := balances(i) * 1.01;
    END LOOP;

    FOR i IN 1 .. balances.COUNT LOOP
      DBMS_OUTPUT.PUT_LINE('Updated Balance of savings Account ' || i || 'is ' || balances(i));
    END LOOP;
  END;
BEGIN
  DBMS_OUTPUT.PUT_LINE('Processing Monthly Interests ');
  ProcessMonthlyInterest;
END;
/