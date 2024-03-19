package operator;

public class Logical {
        public static void main(String[] args) {
            boolean a = true;
            boolean b = false;

            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("a && b: " + (a && b));
            System.out.println("a || b: " + (a || b));
            System.out.println("!a: " + !a);
            System.out.println("!b: " + !b);
        }
}
output:
a: true
b: false
a && b: false
a || b: true
!a: false
!b: true
