
public class ExSeven {
    public static void div(int a, int b){
        System.out.println("Starting Div.....");
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Handled By Div....");
        }
        System.out.println("Ending Div.....");
    }
    public static void callDiv(int p, int q){
        System.out.println("Starting CallDiv.....");
        try{
            div(p,q);
        }catch(ArithmeticException e){
            System.out.println("Handled By CallDiv....");
        }
        System.out.println("Ending CallDiv.....");
    }
    public static void main(String[] args) {
        System.out.println("Starting Main.....");
        try{
            callDiv(100,0);
        }catch(ArithmeticException e){
            System.out.println("Handled By Main....");
        }
        System.out.println("Ending Main......");
    }
}
