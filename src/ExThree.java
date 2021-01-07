
public class ExThree {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0, res = 0;

        try {
            System.out.println("Inside Try....");
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            res = n1 / n2;
            System.out.println("Try Completed...");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Numbers...");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Insufficient Values...");
        } 
        finally{
            System.out.println("Inside Finally Always....");
        }
        System.out.println("Result : " + res);
        System.out.println("End of program...");
    }
}
