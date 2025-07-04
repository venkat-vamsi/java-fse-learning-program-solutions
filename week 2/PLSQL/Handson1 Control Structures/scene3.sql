DECLARE
  TYPE Name IS TABLE OF VARCHAR2(50);
  TYPE Datet IS TABLE OF DATE;

  names Name := Name('Rahul', 'Sandhya', 'Arjun');
  dues Datet := Datet(SYSDATE + 10, SYSDATE + 31, SYSDATE + 5);
  
BEGIN
  FOR i IN 1 .. dues.COUNT LOOP
    IF dues(i) <= SYSDATE + 30 THEN
      DBMS_OUTPUT.PUT_LINE('Reminder: ' || names(i) || ' has a loan due on ' || TO_CHAR(dues(i), 'DD-MON-YYYY'));
    END IF;
  END LOOP;
END;
/