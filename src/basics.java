import java.util.Scanner;
import java.util.Arrays;
public class basics {
    public static void main(String[] args) {
        int []a={1,2,2,5,5,6,7,8,8};
        for(int i=0;i<a.length -1;i++){
            for(int j=i+1;j<a.length;j++){
                if ((a[i]==a[j])&&(i!=j)){
                    System.out.println("Duplicate value:"+a[j]);
                }
            }
        }

    }
}