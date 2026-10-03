import java.util.Scanner;
public class HackIfElse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter water consumed: ");
        int waterConsumed=sc.nextInt();
        if (waterConsumed<=500){
            System.out.println("Total bill amount: Rs.100 ");
            
        }else{
            System.out.println("Total bill amount: Rs.200");
        }
        sc.close();
    }
}
