-->//basic program in Java

//print hello world program:

public class hello_world {
    public static void main(String[] args) {
        System.out.println("hello world!");

    }
}

Output:
hello world!
____________________________________________________________________

Data types in java :
1.primitive Data types
a.byte
b.short
c.int
d.long
e.float
f.double
g.Boolean 
h.char
2.reference Data types
____________________________________________________________________

1.primitive Data types example program:

public class hello_world {
    public static void main(String[] args) {
        int age = 18;

        System.out.println(age);

    }
}
Output:
18
_____________________________________________________________________________

public class hello_world {
    public static void main(String[] args) {
        
        long age = 10000000000L;
        System.out.println(age);

    }
}

output:
10000000000
________________________________________________________________________________________

float in datatype:

public class hello_world {
    public static void main(String[] args) {
        float mark = 95.5f;
        System.out.println(mark);

    }
}
output:
95.5
_______________________________________________________________
boolean :

public class hello_world {
    public static void main(String[] args) {
        boolean presence = true;
        System.out.println(presence);

    }
}
output:
true
_______________________________________________________________________
task:
public class hello_world {
    public static void main(String[] args) {
        String a="code io";

        System.out.println(a);
        System.out.println(a.length());
    }
}

output:
code io
7
___________________________________________________________________________________

2.reference Data types

A reference is like a pointer to memory. When an object is created from a class, Java allocates enough memory required to store the object.
When the newly created object is assigned to a variable , the variable gets the value of the reference to the object , but not to the object itself.

example for reference data type:

import java.util.Date;
public class hello_world {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 5;
        System.out.println(a);  //value is change   
        System.out.println(b);
        Date today = new Date();
        System.out.println(today);
    }
}
output:
5
10
Fri Feb 02 22:38:02 IST 2024
____________________________________________________________________
type casting in java:
widening casting:
->byte->short->char->byte->int->long->float->double
narrowing casting:
->double->float->long->int->byte->char-.short-0>byte
 import java.util.Scanner;
   import java.util.*;
    public class hello_world {
        public static void main(String[] args) {
        int a = 10;
        double b = a,d=25.56;
        int c = (int)d;

            System.out.println("int :"+a);
            System.out.println("double :"+b);
            System.out.println("double :"+d);
            System.out.println("int :"+c);


        }
    }
output
int :10
double :10.0
double :25.56
int :25
___________________________________________________________

-->Aritmetic operation (+,-,*,/,%)


public class hello_world {

    public static void main(String[] args) {
        int a=10;
        int b=4;

        int c=a+b;
        int d=a-b;
        int e=a*b;
        int g=a%b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(g);
    }
}
output:
14
6
40
2
_________________________________________________________
division eg program:

public class hello_world {

    public static void main(String[] args) {
        int a=10;
        int b=4;


        float g=(float)a/(float)b;
        System.out.println(g);

    }
}
output:
2.5
________________________________________________________________

Increment and Decrement operator in java:

public class hello_world {

    public static void main(String[] args) {
        int a=10;
        a++;

        System.out.println(a);
        a--;
        System.out.println(a);

        int b = 5;
        System.out.println(b++);
        System.out.println(b);
        int c= 7;
        System.out.println(c--);
        System.out.println(c);
    }
}

output:

11
10
5
6
7
6

____________________________________________________________________

Relational operator in java:
<   -lessthan
>   -grater than
>=  -greater than are equal to 
<=  -less than are equal to 
==  -equal to
!=  -not equal to

example code:
public class hello_world {

    public static void main(String[] args) {
        int a=10;
        int b=5;

        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

    }
}
output:
false
false
true
true
false
true
_______________________________________________________________

Logical operator in java:
&& - and operator
|| - or operator
! - not operator

precedence for logical operator:
first --not
2-second-and
3 third - or
_________________________________________________________
eg code for not operator:! - not operator

    public class hello_world {

        public static void main(String[] args) {
            boolean a = true;
            boolean b = false;

            System.out.println(!a);
            System.out.println(!b);
        }
    }

output:
false
true
_________________________________________________________________________
eg code for or operator: ||

    public class hello_world {

        public static void main(String[] args) {
            boolean a = true;
            boolean b = false;
            boolean c = false;
            boolean d = false;

            System.out.println(a||b);
            System.out.println(c||b);
        }
    }
output:
true
false
__________________________________________________
eg code for and operator:&& 

    public class hello_world {
       public static void main(String[] args) {
            boolean a = true;
            boolean b = false;
            boolean c = false;
            boolean d = false;
            boolean e = true;
            boolean f = true;

            System.out.println(a&&b);
            System.out.println(c&&b);
            System.out.println(e&&f);
        }
    }
output:
false
false
true
__________________________________________________________________
GETTING  INPUT SCANNER CLASS IN JAVA:

eg code:
   import java.util.Scanner;
   import java.util.*;
    public class hello_world {
        public static void main(String[] args) {
       int a,b,c;
       Scanner in = new Scanner(System.in);
            System.out.println("enter 2 no:");
            a= in.nextInt();
            b = in.nextInt();
            c=(a*a)+(b*b)+(2*a*b);
            System.out.println("result :"+c);


        }
    }
output:
 
enter 2 no:
2
23
result :2025   
---------------------------------

Condtion statement in java:

1.if statement 
2.if else statement
3.if else ladder statement
4.nested if statement
5.Switch statement
----------------------------------
1.if statement

eg code;
    public class hello_world {
       public static void main(String[] args) {
            boolean attendance = true;
            if (attendance == true)
            {
                System.out.println("attending class");
            }
        }
    }
output:
true

------------------------------
2.if else statement
eg codeimport java.util.Scanner;

    public class hello_world {
        public static void main(String[] args) {
        int age;
            System.out.println("enter your age:");
            Scanner in = new Scanner(System.in);
            age=in.nextInt();
            if(age>=18)
            {
                System.out.println("you are eligible for vote");
            }
            else{
                System.out.println("you are not eligible for vote");
            }


        }
    }
outp
enter your age:
10
you are not eligible for vote
--------------------------------
3.if else ladder statement

eg code:
    public class hello_world {
        public static void main(String[] args) {
        char attendance = 'O';
            if (attendance  == 'P')
            {
                System.out.println("attending class");
            }
            else if(attendance == 'O')
        {
            System.out.println("on-duty");
        }
            else{
                System.out.println("Not attending class");
            }
        }
    }
output:
on-duty
________________________________________________________________
4.nested if statement:
eg code:
      import java.util.Scanner;
   import java.util.*;
    public class hello_world {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter marital status M/U:");
            char marital = in.next().charAt(0);
            if (marital == 'u' || marital == 'U')
            {
                System.out.println("enter your gender M/F:");
            char gender = in.next().charAt(0);
            System.out.println("enter your age:");
            int age = in.nextInt();
            if ((gender == 'm' || gender == 'M') && age >= 30) {
                System.out.println("you are eligible for insurance");
            } else if ((gender == 'f' || gender == 'F') && age >= 25) {
                System.out.println("you are eligible for insurance");
            } else {
                System.out.println("you are not eligible for insurance");
            }
        }
            else if (marital=='M'||marital=='m')
            {
                System.out.println("you are eligible for insurance");
            }
            else {
                System.out.println("invalid input");
            }
        }
    }
output
Enter marital status M/U:
u
enter your gender M/F:
m
enter your age:
20
you are not eligible for insurance
___________________________________________
5.switch statement in java:

eg code:
   import java.util.Scanner;
import java.util.Date;
public class hello_world {
    public static void main(String[] args) {
        int a,b,c,ch;
        System.out.println("1.Addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice:");
        Scanner in = new Scanner(System.in);
        ch=in.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("enter 2 nos:");
                a=in.nextInt();
                b=in.nextInt();
                c=a+b;
                System.out.println("addition:"+c);
                break;
            case 2:
                System.out.println("enter 2 nos:");
                a=in.nextInt();
                b=in.nextInt();
                c=a-b;
                System.out.println("subtraction:"+c);
                break;
            case 3:
                System.out.println("enter 2 nos:");
                a=in.nextInt();
                b=in.nextInt();
                c=a*b;
                System.out.println("multiplication:"+c);
                break;
            case 4:
                System.out.println("enter 2 nos:");
                a=in.nextInt();
                b=in.nextInt();
                c=a/b;
                System.out.println("division:"+c);
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
output:
1.Addition
2.subtraction
3.multiplication
4.Division
Enter your choice:
3
enter 2 nos:
2345
124
multiplication:290780
...........................
--> Another output:
1.Addition
2.subtraction
3.multiplication
4.Division
Enter your choice:
5
invalid input
_____________________________________________________________

group switch in java:

eg code:

import java.util.Scanner;
import java.util.Date;
public class hello_world {
    public static void main(String[] args) {
    char c;
        System.out.println("enter a character:");
        Scanner in = new Scanner(System.in);
        c=in.next().charAt(0);
        switch(c)
        {
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
            case'A':
            case'E':
            case'I':
            case'O':
            case'U':
                System.out.println(c + " is a vowel");
                break;
            default:
                System.out.println(c +" is not a vowel");
                break;


        }
    }
}

output:
enter a character:
i
i is a vowel
...................
enter a character:
k
k is not a vowel

____________________________________________________________________________

while loop in java:

->while is a entry control loop

eg code:
import java.util.Scanner;
import java.util.*;
public class demo {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the limit:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}

output:
enter the limit:4
1
2
3
4
__________________________________________________________________________________
Do-while loop in java:

->do-while is a exit contol loop .
eg code:

import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        int n;
        int i=2;
        System.out.println("enter the limit:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        do
            {
                System.out.println(i);
                i+=2;
            }
            while(i<=20);
    }
}

output:
enter the limit:20
2
4
6
8
10
12
14
16
18
20
________________________________________________________________________________
For loop using in java:

print odd value upto 20 using for loop:

eg code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the limit:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i+=2)
        {
            System.out.println(i);
        }
    }
}
output:
enter the limit:
20
1
3
5
7
9
11
13
15
17
19
_______________________________________________________________________

Enhanced for loop in java:

->It is easy to use .It does not have initialization, condition checking and increment or decrement.

eg code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
     int number[] ={10,20,30,40,50};
        for(int n:number)
        {
            System.out.println(n);
        }
    }
}
output:
10
20
30
40
50
__________________________________________________________________________

Nested for loop in java:

It is used to print patter and matric .

eg code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
     for(int i=1;i<=5;i++)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     }
    }
}
output:
*
**
***
****
*****
___________________________________________________________

Break and Continue in java:

This Statement is uses for looping statement for break the condition and continue the condition.
eg code:
import java.util.Scanner;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i==5)
                continue;
            System.out.println(i);
            if(i==8)
                break;
        }
    }
}
output:
1
2
3
4
6
7
8
______________________________________________________

Array in java:
    An array is a collection of elements of the same type placed in contiguous memory locations that can be individually referenced by using an index to a unique identifier.

Syntax:
     Datatype variable_name [ ] ;
    
Eg Code:
    
import java.sql.Statement;
import java.util.Scanner;
import java.util.*;

public class basics {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("_________________________________________");
        for (int element : a) //Enhanced for loop
        {
            System.out.println(element);
        }
        System.out.println("_________________________________________");
        int b[];//Declaring array
        b=new int[10]; // Allocation memory to a=Array
        int [] c = new int[10]; //combining both Statement
                for(int element : b)
                {
                    System.out.println(element);

                }
                for(int i =0;i<10;i++)
                {
                    Scanner in=new Scanner(System.in);
                    System.out.println("enter the number:");
                    c[i]=in.nextInt();
                }
                for(int element :c)
                {
                    System.out.println(element);
                }
    }
    }

output :
10
20
30
40
_________________________________________
10
20
30
40
_________________________________________
0
0
0
0
0
0
0
0
0
0
enter the number:
1
enter the number:
2
enter the number:
3
enter the number:
4
enter the number:
5
enter the number:
6
enter the number:
7
enter the number:
8
enter the number:
9
enter the number:
10
    
1
2
3
4
5
6
7
8
9
10
_______________________________________________________________________________


