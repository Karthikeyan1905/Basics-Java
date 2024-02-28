1.Write a program to find the factorial of given number.

code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        int i,n;
        System.out.println("enter the value for factorial:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int f=1;
        for(i=1;i<=n;i++) {
            f = f * i;
        }
            System.out.println("Factorial of "+ n+ " is"+f);
    }
}
output:
enter the value for factorial:
5
Factorial of 5 is120
_______________________________________________________________________________

2.write a program to find the sum and average of given n number.
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        int i,n;
        System.out.println("enter the limit:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int sum=0,a;
        for(i=1;i<=n;i++)
        {
            System.out.println("enter the number:"+i+":");
            a=in.nextInt();
            sum+=a;
        }
        System.out.println("the sum for given value is:"+sum);
        System.out.println("the average for given value is:"+sum/n);
    }
}
output:
enter the limit:
4
enter the number:1:
10
enter the number:2:
20
enter the number:3:
30
enter the number:4:
40
the sum for given value is:100
the average for given value is:25
_______________________________________________________________________________
3.Write a program to find the fibonacci series of given value.

code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int a=-1,b=1,c;
        for(i=1;i<=n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
output:
Enter the number:
6
0
1
1
2
3
5
______________________________________________________________________________
4.write a program to find the reverse of a n digit number in java .

code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
        int reverse = 0;
        int rem;
        while(n!=0)
        {
            rem=n%10;
            reverse = (reverse*10)+rem;
            n=n/10;
        }
        System.out.println("the reverse value is:"+reverse);

    }
}
output:
enter the number:
2356
the reverse value is:6532
_________________________________________________________________________
5.Write a program to check whether the given 3 digit number is armstrong or not.
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
       int number = in.nextInt();
       int temp = number;
    int digit1,digit2,digit3;
    digit3=temp%10;
    temp=temp/10;
    digit2 = temp%10;
    temp = temp/10;
    digit1=temp%10;
    int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
        if (number==result){
            System.out.println(number+"is a armstrong number");
        }
        else
        {
            System.out.println(number+ " is not a armstrong number");
        }
    }
}
output:
enter the number:
153
153is a armstrong number
_______________________________________________________________________________________________________
6.Write a program to print the multiplication tables.

code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the table:");
        int t = in.nextInt();
        System.out.println("Enter the limit");
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(t+"x"+i+"="+(t*i));
        }
    }
}
output:

enter the table:
8
Enter the limit
10
8x1=8
8x2=16
8x3=24
8x4=32
8x5=40
8x6=48
8x7=56
8x8=64
8x9=72
8x10=80
__________________________________________________________________________________
7.Write a program to find the factor of the given number.

code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
        }

    }
}
output:
enter the number:8
1 
2 
4 
8 
____________________________________________________________________
8.write a program to check the given number is prime or not.
code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
       int f=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
               f++;
            }
        }
        if(f==2)
        {
            System.out.println(n+" is a prime number ");
        }
        else{
            System.out.println(n+"is not a prime number ");

        }

    }
}
output:
enter the number:
11
11 is a prime number 
__________________________________________________________________________________

9.write a program to print the prime number between 1 to 999.
code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = 0;
        for (int n = 1; n <= 999; n++) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0){
                    f++;
            }
        }
        if (f == 2) {
            System.out.println(n + "is a prime number");
        }
        f = 0;
    }
    }
}
output:
2is a prime number
3is a prime number
5is a prime number
7is a prime number
11is a prime number
13is a prime number
17is a prime number
19is a prime number
23is a prime number
29is a prime number
31is a prime number
37is a prime number
41is a prime number
43is a prime number
47is a prime number
53is a prime number
59is a prime number
61is a prime number
67is a prime number
71is a prime number
73is a prime number
79is a prime number
83is a prime number
89is a prime number
97is a prime number
101is a prime number
103is a prime number
107is a prime number
109is a prime number
113is a prime number
127is a prime number
131is a prime number
137is a prime number
139is a prime number
149is a prime number
151is a prime number
157is a prime number
163is a prime number
167is a prime number
173is a prime number
179is a prime number
181is a prime number
191is a prime number
193is a prime number
197is a prime number
199is a prime number
211is a prime number
223is a prime number
227is a prime number
229is a prime number
233is a prime number
239is a prime number
241is a prime number
251is a prime number
257is a prime number
263is a prime number
269is a prime number
271is a prime number
277is a prime number
281is a prime number
283is a prime number
293is a prime number
307is a prime number
311is a prime number
313is a prime number
317is a prime number
331is a prime number
337is a prime number
347is a prime number
349is a prime number
353is a prime number
359is a prime number
367is a prime number
373is a prime number
379is a prime number
383is a prime number
389is a prime number
397is a prime number
401is a prime number
409is a prime number
419is a prime number
421is a prime number
431is a prime number
433is a prime number
439is a prime number
443is a prime number
449is a prime number
457is a prime number
461is a prime number
463is a prime number
467is a prime number
479is a prime number
487is a prime number
491is a prime number
499is a prime number
503is a prime number
509is a prime number
521is a prime number
523is a prime number
541is a prime number
547is a prime number
557is a prime number
563is a prime number
569is a prime number
571is a prime number
577is a prime number
587is a prime number
593is a prime number
599is a prime number
601is a prime number
607is a prime number
613is a prime number
617is a prime number
619is a prime number
631is a prime number
641is a prime number
643is a prime number
647is a prime number
653is a prime number
659is a prime number
661is a prime number
673is a prime number
677is a prime number
683is a prime number
691is a prime number
701is a prime number
709is a prime number
719is a prime number
727is a prime number
733is a prime number
739is a prime number
743is a prime number
751is a prime number
757is a prime number
761is a prime number
769is a prime number
773is a prime number
787is a prime number
797is a prime number
809is a prime number
811is a prime number
821is a prime number
823is a prime number
827is a prime number
829is a prime number
839is a prime number
853is a prime number
857is a prime number
859is a prime number
863is a prime number
877is a prime number
881is a prime number
883is a prime number
887is a prime number
907is a prime number
911is a prime number
919is a prime number
929is a prime number
937is a prime number
941is a prime number
947is a prime number
953is a prime number
967is a prime number
971is a prime number
977is a prime number
983is a prime number
991is a prime number
997is a prime number
_____________________________________________________________________________________
10.Write a program to check the given number is perfect number or not.
code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number:");
        int n=in.nextInt();
        int sum = 0;
        for(int i=1;i<n;i++) {
            if (n % i == 0)
                sum += i;
        }
        if(sum==n)
            {
                System.out.println(n+" is a perfect number");
            }
        else
        {
            System.out.println(n+" is not a perfect number");
        }
    }
}
output:
enter a number:
6
6 is a perfect number
-----------------------------------
not perfect output:
enter a number:
4
4 is not a perfect number
____________________________________________________________________________________________________________
11.Write a program to find the given number is strong number or not .    

code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        int rem,sum=0,OriginalNum,fact;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number:");
        int num=in.nextInt();
        OriginalNum=num;
        while(num>0)
        {
            rem=num%10;
            fact=1;
            for(int i=1;i<=rem;i++)
            {
                fact*=i;
            }
            sum+=fact;
            num=num/10;
        }
        if(sum == OriginalNum)
        {
            System.out.println(OriginalNum+"is a Strong number");
        }
        else {
            System.out.println(OriginalNum+"is not a Strong number");
        }
    }

}
output:
enter a number:
145
145 is  a Strong number
    -------------
enter a number:
876
876is not a Strong number
___________________________________________________________________________________________________
12.To check the given number is palindrome or not:
code:
import java.util.Scanner;
public class basics {
    public static void main(String[] args){
        int n,rem,reverse=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        n=in.nextInt();
        int a=n;
     while(n!=0)
     {
         rem=n%10;
         reverse=(reverse*10)+rem;
         n=n/10;

     }
        System.out.println(reverse);
        System.out.println(a);
if(a==reverse)
{
    System.out.println("the number is palindrome");
}
else {
    System.out.println("the number is not palindrome");
}
    }
    }
output:
enter the number:
121
121
121
the number is palindrome
    ____________________________
    enter the number:
824
428
824
the number is not palindrom
__________________________________________________________________________________________________
13.Sorting number using array
    code:
import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        int temp;
        int[] arr = {10, 20, 54, 36, 41};
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                                }

            }
            System.out.print(arr[i]+" ");
        }
    }
}
output:

    10 20 36 41 54 
___________________________________________________________________________________________________
14.Sorting n number using array.
    
 code:
    
import java.util.Scanner;
public class basics {
    static  void Sorting(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            System.out.print(arr[i]+"|");
        }

    }
    public static void main(String[] args) {
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array:");
        int size = sc.nextInt();
        a = new int[size];
        System.out.println("Enter " + size + " integers separated by space : ");
        for (int i=0 ;i<size ; i++)  {
            a[i] = sc.nextInt();
        }
        System.out.println(" before sorting : ");
        for(int i=0 ; i<a.length; i++ ) {
            System.err.println(a[i]);
        }
        System.out.println("\n after sorting : \n");
        Sorting(a);
        sc.close();
    }
}
output:
Enter the number of elements you want in array:
3
Enter 3 integers separated by space : 
20
10
15
 before sorting :20  |10  |15  | 
 after sorting : 10|15|20|
    __________________________________________________________________________________________________
15.Write a program to count the even and odd number in an array.
    code:
import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        int e=0,o=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the limit:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the a["+i+"] value:");
                    a[i]=in.nextInt();
    }
        for( int element:a)
        {
            if(element%2==0)
            {
                e++;
            }
            else {
                o++;
            }
        }
        System.out.println("Total even nos:"+e);
        System.out.println("Total odd nos:"+o);
    }
}
output:
enter the limit:
5
enter the a[0] value:
1
enter the a[1] value:
2
enter the a[2] value:
3
enter the a[3] value:
4
enter the a[4] value:
5
Total even nos:2
Total odd nos:3
_______________________________________________________________________________
 16. Write a program to insert a element in specific index of an array.
    code:
import java.util.Scanner;
import java.util.Arrays;
public class basics {
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60,70,80,90,100};
        int index=2;
        int value=25;
        System.out.println("Before swapping:"+Arrays.toString(a));
        for(int i=a.length-1;i>index;i--)
        {
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println("After swapping:"+Arrays.toString(a));
    }
}
output:
Before swapping:[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
After swapping:[10, 20, 25, 30, 40, 50, 60, 70, 80, 90]
__________________________________________________________________________________________    
17.Write a program to find the duplicate element in array. 
code:
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

output:
Duplicate value:2
Duplicate value:5
Duplicate value:8
    ________________________________________________________________________
18.


