/*Recursion is when a method calls itself to solve smaller versions of a problem. It helps reduce the code size by reducing the repeatable code, thus reducing complexity of problem. */

public class Financial_Forecast{
    public static double futureVal(double pv, double r, int y) {
        if(y==0) 
        return pv;
        return futureVal(pv, r, y-1)*(1+r);
    }

    public static void main(String[] args) {
        int amount = 100000;
        double rate = 0.3;           
        int y = 5;
        double ans = futureVal(amount, rate, y);
        System.out.printf("Forecast value is "+ ans);
    }
}


/* As we are calling the function y times complexity is O(y) */