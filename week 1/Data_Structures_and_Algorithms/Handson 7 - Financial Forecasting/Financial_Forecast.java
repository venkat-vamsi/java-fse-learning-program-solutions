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
