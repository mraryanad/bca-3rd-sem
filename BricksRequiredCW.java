import java.util.Scanner;

class BricksRequiredCW {

  static float wallLength;
  static float wallBreadth;
  static float wallLengthCM;
  static float wallBreadthCM;
  static float brickLength;
  static float brickBreadth;

  public static void main(String args[]) {
    // wall = 10ft x 15ft
    // brick = 12cm x 15cm
    // 500pcs brick fits in a tractor. How many tractor needed to build the wall?
    // if tractor travels above 10km then Rs 300 fee, (10-20)km Rs 350, above 20km = Rs 500

    Scanner scan = new Scanner(System.in);

    System.out.print("\nEnter the length and breadth of the wall (ft):");
    wallLength = scan.nextFloat();
    wallBreadth = scan.nextFloat();

    System.out.print("\nEnter the length and breadth of the brick (cm):");
    brickLength = scan.nextFloat();
    brickBreadth = scan.nextFloat();

    wallLengthCM = wallLength * 12;
    wallBreadthCM = wallBreadth * 12;

    noOfTractorsRequired(
      wallLengthCM,
      wallBreadthCM,
      brickLength,
      brickBreadth
    );

    calculateTransportationCost();
  }

  public static void noOfTractorsRequired(
    float wallLength,
    float wallBreadth,
    float brickLength,
    float brickBreadth
  ) {
    float noOfBricksRequired =
      (wallLength * wallBreadth) / (brickLength * brickBreadth);

    float answer = noOfBricksRequired / 500;

    System.out.println("Number of Tractors required: " + answer);
  }

  public static void calculateTransportationCost() {}
}
