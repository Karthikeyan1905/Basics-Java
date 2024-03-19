package operator;

public class Ternary {
    public static void main(String[] args) {
        {
            int a=10;
            String num = (a%2==0)?"even":"odd";
            System.out.println(num);
            int b=10,c=5,d;
            d=(b>c)?b+c:b-c;
            System.out.println(d);
        }
    }
}
