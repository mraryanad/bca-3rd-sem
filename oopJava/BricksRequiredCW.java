import java.util.Scanner;

class BricksRequiredCW {

  static float wallLength;
  static float wallBreadth;
  static float wallLengthCM;
  static float wallBreadthCM;
  static float brickLength;
  static float brickBreadth;

  public static void main(String args[]) {
    /* QUESTION:
        -  wall = 10ft x 15ft
        -  brick = 12cm x 15cm
        1) 500pcs brick fit in a tractor. How many tractor needed to build the wall?
        2) if tractor travels below 10km then Rs 300 is the fee, (10-20)km = Rs 350, above 20km = Rs 500*/

    Scanner scan = new Scanner(System.in);

    System.out.print("\nEnter the length and breadth of the wall (ft):");
    wallLength = scan.nextFloat();
    wallBreadth = scan.nextFloat();

    System.out.print("\nEnter the length and breadth of the brick (cm):");
    brickLength = scan.nextFloat();
    brickBreadth = scan.nextFloat();

    wallLengthCM = wallLength * 12;
    wallBreadthCM = wallBreadth * 12;

    // To calculate Number of Tractors Required
    float noOfTractors = tractorsRequired(
      wallLengthCM,
      wallBreadthCM,
      brickLength,
      brickBreadth
    );

    if (noOfTractors < 1) {
      System.out.println(
        "Please choose a different medium of transportation. We don't transport bricks less than a tractor!"
      );
    } else {
      // To calculate the Transportation Fee Based on different distance
      calculateTransportationFee(noOfTractors);
    }

    scan.close();
  }

  public static float tractorsRequired(
    float wallLength,
    float wallBreadth,
    float brickLength,
    float brickBreadth
  ) {
    float noOfBricksRequired =
      (wallLength * wallBreadth) / (brickLength * brickBreadth);

    float tractors = noOfBricksRequired / 500;

    System.out.println("Number of Tractors required: " + tractors);
    return tractors;
  }

  public static void calculateTransportationFee(float noOfTractors) {
    Scanner scan = new Scanner(System.in);
    float transportationFee;
    float distanceTraveled;

    // Loop until a positive distance is entered
    do {
      System.out.print("\nEnter the distance traveled (km): ");
      distanceTraveled = scan.nextFloat();

      // Check if the distance traveled is negative
      if (distanceTraveled < 0) {
        System.out.println(
          "\nDistance cannot be negative. Enter the correct Distance in KiloMeters"
        );
      }
    } while (distanceTraveled < 0);

    // Calculate the Transportation Cost Based on different distance
    if (distanceTraveled <= 10) {
      transportationFee = 300;
      System.out.println("Transportation Cost: Rs " + transportationFee);
    } else if (distanceTraveled > 10 && distanceTraveled <= 20) {
      transportationFee = 350;
      System.out.println("Transportation Cost: Rs " + transportationFee);
    } else {
      transportationFee = 500;
      System.out.println("Transportation Cost: Rs " + transportationFee);
    }

    System.out.println(
      "Transportation Fee: Rs " + (noOfTractors * transportationFee)
    );

    scan.close();
  }
}
