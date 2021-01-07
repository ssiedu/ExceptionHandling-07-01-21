public class ExTwo {
 public static void main(String[] args) {
        int n1 = 0, n2 = 0, res = 0;

        try {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            res = n1 / n2;
        }catch(ArithmeticException ex){
            res=n1/2;
        }catch(NumberFormatException ex){
            System.out.println("Invalid Numbers...");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Insufficient Values...");
        }catch(Exception ex){
            System.out.println("Unknown Problem...");
        }

        System.out.println("Result : " + res);
        System.out.println("End of program...");
    }    
}
