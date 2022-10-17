import java.util.Scanner;


public class PatikaDevUsluSayi {
    public static void main(String[] args){
        
           Scanner scan=new Scanner(System.in);
    
           System.out.print("Please enter the number :");
           int num=scan.nextInt();
           
           System.out.print("Please enter the number to get the exponent :");
           int us=scan.nextInt();
           
           int result=(int) Math.pow(num, us);
           System.out.println("The result is :"+result);
           
           
           int total = 1;
           
           for(int i=1;i<=us;i++){
              total=total*num;
           }
           System.out.println("The result is with for :"+total);
    }
}
