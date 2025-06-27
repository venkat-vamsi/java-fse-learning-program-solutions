public class test {

    public static void main(String[] args){
    Logger l1= Logger.getInstance();
    System.out.println(l1.hashCode());

        
    Logger l2= Logger.getInstance();
    System.out.println(l1.hashCode());

    if(l1.equals(l2)){
        System.out.println("Singleton Pattern Implemented");
    }

    }
    
}
