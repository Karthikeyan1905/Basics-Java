package operator;

public class Assignment {
    public static void main(String[] args) {
    int x = 10;
    int z = x;
    System.out.println("z = " + z);

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
output:
z = 10
x += 5: 15
x -= 3: 12
x *= 2: 24
x /= 4: 6
x %= 3: 0
