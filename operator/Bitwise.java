package operator;
import java.util.Scanner;
public class Bitwise {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            System.out.println("Bitwise AND: " + (num1 & num2));
            System.out.println("Bitwise OR: " + (num1 | num2));
            System.out.println("Bitwise XOR: " + (num1 ^ num2));
            System.out.println("Bitwise NOT: " + (~num1));
            System.out.println("Bitwise Left Shift: " + (num1 << 2));
            System.out.println("Bitwise Right Shift: " + (num1 >> 2));
            System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2));

            input.close();
        }
    }

output:
Enter first number: 4
Enter second number: 8
Bitwise AND: 0
Bitwise OR: 12
Bitwise XOR: 12
Bitwise NOT: -5
Bitwise Left Shift: 16
Bitwise Right Shift: 1
Bitwise Unsigned Right Shift: 1
        
