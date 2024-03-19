package operator;

public class Assignment {
    public static void main(String[] args) {
    int x = 10;
    int z = x;
    System.out.println("y = " + z);

    x += 5;
    System.out.println("x += 5: " + x);

    x -= 3;
        System.out.println("x -= 3: " + x);

    x *= 2;
        System.out.println("x *= 2: " + x);

    x /= 4;
        System.out.println("x /= 4: " + x);

    x %= 3;
        System.out.println("x %= 3: " + x);

}
}
