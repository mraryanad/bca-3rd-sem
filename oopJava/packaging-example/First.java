import packaging.subpackaging.Third;

public class First {

  public static void main(String[] args) {
    System.out.println("THIS IS FIRST");
    Third importedClass = new Third();

    importedClass.printer();
  }
}
