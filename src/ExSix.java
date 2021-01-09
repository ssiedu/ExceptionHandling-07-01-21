public class ExSix {
public static void main(String[] args) {

        int n1 = 0, n2 = 0, res = 0;

        try {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            
            if(n2>n1){
                //we will throw ArithmeticException here
                //ArithmeticException ob=new ArithmeticException();
                BigNoException ob=new BigNoException();
                throw ob;
            }
            
            res = n1 / n2;
            
        }catch(ArithmeticException ex){
            System.out.println("ArithmeticException Handled...");
            res = n1 / 2;
        }catch(BigNoException ex){
            System.out.println("First No Should Be Larger Always...");
        }

        System.out.println("Result : " + res);
        System.out.println("End of program...");
    }        
}
