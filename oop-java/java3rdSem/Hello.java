class Hello {
    Hello() {
        System.out.println("Lets start CValculator");
    }
    static int numberOne = 1000;
    public static void main(String args[]) {
        Hello h = new Hello();
        System.out.print("hello worl");
        Total total = new Total();
        int a = total.add();
        System.out.println("\t"+a);
        B b = new B();
        System.out.println(numberOne);
    }
}

class A {
    protected int numberOne = 5;
    int numberTwo = 3;
}

class B {
    A parent = new A();
    B(){
        System.out.println(parent.numberOne);
         System.out.println(Hello.numberOne);
    }
    
}