DECLARE
  TYPE BT IS TABLE OF NUMBER;
  balances BT := BT(50000, 30000);

  PROCEDURE TransferFunds(fromac IN INTEGER, toac IN INTEGER, amount IN NUMBER) IS
  BEGIN
    IF balances(fromac) < amount THEN
      DBMS_OUTPUT.PUT_LINE('Insufficient funds in account ' || fromac);
    ELSE
      balances(fromac) := balances(fromac) - amount;
      balances(toac)   := balances(toac) + amount;

      DBMS_OUTPUT.PUT_LINE('Transferred ' || amount || ' from account ' || fromac || ' to account ' || toac);
      DBMS_OUTPUT.PUT_LINE('balance of account ' || fromac || ': ' || balances(fromac));
      DBMS_OUTPUT.PUT_LINE('balance of account ' || toac || ': ' || balances(toac));
    END IF;
  END;
BEGIN
  TransferFunds(1, 2, 2000);
END;
/