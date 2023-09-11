import java.util.Scanner;
public class bcuc{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int testcase = bcuc.input.nextInt();
        for(int i = 0; i<testcase; i++){
            int a = bcuc.input.nextInt();
            int b = bcuc.input.nextInt();
            System.out.println("LMC(a,b) = " + bCnn(a,b));
            System.out.println("GCD(a,b) = " + uCln(a,b));
        }
    }
    public static int uCln(int a, int b){
        int ucln = 1;
        for(int i = 1; i <= a; i++){
            if(a%i == 0 && b%i == 0 && i>= ucln){
                ucln = i;
            }
        }
        return ucln;
    }
    public static int bCnn(int a, int b){
        int bCnn = (a*b)/uCln(a,b);
        return bCnn;
    }
}