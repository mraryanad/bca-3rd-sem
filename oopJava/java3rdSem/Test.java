import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        System.out.println("Hello World");
        // Add a = new Add();
        Add.add();
        Userdata.reader();
    }
}

class Add {
    static int a = 5;
    static int b = 6;
    static int sum = a + b;

    static void add() {
        System.out.println("The total is " + sum);
    }

}

class Userdata {
    public static void reader() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your namae");
        String name = s.nextLine();
        System.out.println(name);
    }
}
