
public class ExOne {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0, res = 0;

        try {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            res = n1 / n2;
        }catch(Exception e){
            System.out.println("Someting Wrong.....");
        }

        System.out.println("Result : " + res);
        System.out.println("End of program...");
    }
}
