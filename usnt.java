import java.util.Scanner;
public class usnt{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int testcase = input.nextInt();
        for(int i=0; i<testcase; i++){
            int n = usnt.input.nextInt();
            uSnt(n);
        }
    }
    public static void uSnt(int n){
        int m = 2;
        int run = 1;
        int count = 0;
        boolean flag = false ;
        while(run!=0){
            int k = n%m;
            if (n==1){
                run = 0;
            }
            if(k==0){
                n = n/m;
                flag = true;
                count+=1;
            }
            else{
                if(flag == true){
                    System.out.print(m + " " + count +" ");
                };
                count = 0;
                m+=1;
                flag = false;
            }
            }
        }
}