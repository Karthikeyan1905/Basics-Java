package array;

import java.util.ArrayList;

public class Arraytypes {
    public static void main(String[] args) {
        //Array declaration
        String[] a = {"abc", "bcd", "cdi"};
        System.out.println(a[0]);
        //Array memory allocation
        String [] b=new String[10];
        b[0]="car";
        System.out.println(b[0]);
        //ArrayList in java
        ArrayList<String> names = new ArrayList<>();
        //Add element in Arraylist .
        names.add("bike");
        names.add("car");
        names.add("truck");
        names.add("bus");
        //print all element
        System.out.println("ArrayList:"+names);
        //print particular element
        String str = names.get(0);
        System.out.println("ArrayList:"+str);
        //update an content in the array.
        names.set(0,"two wheeler");
        System.out.println(names);
        //delete the String in an array
        String rem = names.remove(2);
        System.out.println(names);

    }
}

output:
abc
car
ArrayList:[bike, car, truck, bus]
ArrayList:bike
[two wheeler, car, truck, bus]
[two wheeler, car, bus]

