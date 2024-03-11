
import java.util.Arrays;
class Main {
    public static void main(String[] a) {
        {
            int[] num = {2, 7, 11, 15};
            for (int i = 0; i < num.length; i++) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] + num[j] == 9) {
                        System.out.println("[" + i + ","+j+"]");
                    }

                }
            }
        }
    }
}