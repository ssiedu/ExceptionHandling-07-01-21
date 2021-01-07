
public class ExFive {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, res = 0;

        try {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            res = n1 / n2;
        }catch(ArithmeticException ex){
            System.out.println("ArithmeticException Handled...");
            try{
                res=n1/Integer.parseInt(args[2]);
            }catch(ArrayIndexOutOfBoundsException ex1){
                System.out.println("Please Provide 3 Numbers...");
            }
        }catch(NumberFormatException ex){
            System.out.println("Invalid Numbers...");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Insufficient Values...");
        }

        System.out.println("Result : " + res);
        System.out.println("End of program...");
    }    
}
