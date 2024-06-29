import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter win or lose:");
       String RCB = sc.nextLine();
       if(RCB.equals("win"))
        {
            System.out.println("ea sala cup numde");
        }
        else{
            System.out.println("cup illa");
        }
    }
}