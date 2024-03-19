package operator;

public class Unary {
    public static void main(String[] args) {
        // Operator 1:unary minus(-)
        //This operator can be used to convert a positive value to a negative one.
        int n1 = 20;
        System.out.println("Number = " + n1);
        n1 = -n1;
        System.out.println("Result = " + n1);
        System.out.println("------------------------");
        //operator 2: NOT -! operator.
        //This is used to convert true to false or vice versa.
        boolean cond = true;
        int a = 10, b = 1;

        // Displaying values stored in above variables
        System.out.println("Cond is: " + cond);
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);

        // Displaying values stored in above variables
        // after applying unary NOT operator
        System.out.println("Now cond is: " + !cond);
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
        System.out.println("--------------------------------------");

        //operator 4 : increment and decrement
        int i = 10;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println("--------------------------------------");
        //operator 5:bitwise complement(~):

        int n2 = 6;

        // Printing numbers on console
        System.out.println("First Number = " + n2);


        // Printing numbers on console after
        // performing bitwise complement
        System.out.println(n2 + "'s bitwise complement = " + ~n2);
        System.out.println("--------------------------------------");

    }
}

