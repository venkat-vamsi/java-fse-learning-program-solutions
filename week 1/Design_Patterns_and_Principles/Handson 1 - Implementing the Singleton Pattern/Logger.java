public class Logger{
    
    private static Logger s1=null;

    private Logger(){

    }

    public static Logger getInstance(){
        if(s1==null)
        return s1=new Logger();
        return s1;
    }

    public static void logDetails(String s){
        System.out.println("LogDetails: "+s);
    }



}