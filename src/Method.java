public class Method {
    void Addition(){
        int a=10,b=20;
        int c=a+b;
        System.out.println("Add:"+c);
    }
    void Sub(int a,int b){
        int c=a-b;
        System.out.println("Sub:"+c);

    }
    void Str(String a,String b,String c){
        System.out.println("Str Add:"+a+b+c);
    }
    int add(int a,int b){
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Method caller = new Method();
        caller.Addition();
        caller.Sub(20,10);
        caller.Str("x","y","z");
        caller.add(10,20);
        int d=caller.add(10,30);
        System.out.println("add:"+d);
        }
    }

output:
Add:30
Sub:10
Str Add:xyz
add:40
    
