import java.util.Scanner;

0class StudentMarks {

  public static void main(String[] args) {
    double math, oop, dsa, sad, web;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter marks obtained (math, oop, dsa, sad, web): ");
    math = scan.nextDouble();
    oop = scan.nextDouble();
    dsa = scan.nextDouble();
    sad = scan.nextDouble();
    web = scan.nextDouble();

    MarksObtained marks = new MarksObtained(math, oop, dsa, sad, web);
    scan.close();
  }
}

class MarksObtained {

  MarksObtained(double math, double oop, double dsa, double sad, double web) {
    double totalMarksObtained, totalMarks = 300, percentObtained;

    totalMarksObtained = math + oop + dsa + sad + web;
    percentObtained = (totalMarksObtained / totalMarks) * 100;

    System.out.println(
      "Total marks obtained: " +
      totalMarksObtained +
      ", Percentage Obtained: " +
      percentObtained
    );
  }
}
