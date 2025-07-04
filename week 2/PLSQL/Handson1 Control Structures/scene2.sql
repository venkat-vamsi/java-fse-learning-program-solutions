DECLARE
  TYPE BalanceT IS TABLE OF NUMBER;
  TYPE VipT IS TABLE OF VARCHAR2(10);
  
  balances BalanceT := BalanceT(11000, 5000, 18000, 10000);
  isVIP VipT := VipT('False', 'False', 'False', 'False');
  
BEGIN
  FOR i IN 1 .. balances.COUNT LOOP
    IF balances(i) > 10000 THEN
      isVIP(i) := 'True';
    END IF;
    DBMS_OUTPUT.PUT_LINE('Customer ' || i || 's VIP Status is ' || isVIP(i));
  END LOOP;
END;
/