import java.util.Scanner;

class VolcanoEruptionCW {

  static int N;
  static int[] year;
  static double[] smokeGenerated;
  static double[] lavaFlow;
  static double[] lavaHeight;

  public static void main(String[] args) {
    /*QUESTION:
A volcano periodically blasts. The details are:
 YEAR | SMOKE_GENERATED | LAVA_FLOW | LAVA_HEIGHT
 1560 | 35km | 2 | 500m
 1620 | 10km | 1 | 200m
 1710 | 25km | 1.5 | 235m
 1835 | 15km | 1.2 | 198m
 1920 | 10km | 1.1 | 558m
 - Calculate Average of all and when the next occurrence might happen.
 */

    Scanner scan = new Scanner(System.in);

    // Number of occurrences from user
    System.out.println("Enter the number of occurrences: ");
    N = scan.nextInt();

    // Initialize arrays
    year = new int[N];
    smokeGenerated = new double[N];
    lavaFlow = new double[N];
    lavaHeight = new double[N];

    // Functions for various purposes
    storeEruptionData(N);
    calculateAverage();
    predictNextOccurrence();

    scan.close();
  }

  public static void storeEruptionData(int N) {
    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < N; i++) {
      System.out.println("\n\nEnter details for eruption " + (i + 1) + ":");
      System.out.println("Enter the year (AD): ");
      year[i] = scan.nextInt();

      System.out.println("Enter the smoke generated (KM): ");
      smokeGenerated[i] = scan.nextDouble();

      System.out.println("Enter the lava flow (KM): ");
      lavaFlow[i] = scan.nextDouble();

      System.out.println("Enter the lava burst height (M): ");
      lavaHeight[i] = scan.nextDouble();
    }

    scan.close();
  }

  public static void calculateAverage() {
    int totalYear = 0;
    double totalSmokeGenerated = 0;
    double totalLavaFlow = 0;
    double totalLavaHeight = 0;

    for (int i = 0; i < N; i++) {
      totalYear += year[i];
      totalSmokeGenerated += smokeGenerated[i];
      totalLavaFlow += lavaFlow[i];
      totalLavaHeight += lavaHeight[i];
    }

    int averageYear = totalYear / N;
    double averageSmokeGenerated = totalSmokeGenerated / N;
    double averageLavaFlow = totalLavaFlow / N;
    double averageLavaHeight = totalLavaHeight / N;

    System.out.println(
      "\n---------------------------------\nAverage Year: " + averageYear
    );
    System.out.println(
      "Average Smoke Generated: " + averageSmokeGenerated + " km"
    );
    System.out.println("Average Lava Flow: " + averageLavaFlow + " km");
    System.out.println("Average Lava Height: " + averageLavaHeight + " m");
  }

  public static void predictNextOccurrence() {
    int totalTimeBetweenEruptions = 0;
    for (int i = 1; i < N; i++) {
      totalTimeBetweenEruptions += year[i] - year[i - 1];
    }

    int averageTimeBetweenEruptions = totalTimeBetweenEruptions / (N - 1);

    // Predict next occurrence
    int lastRecordedYear = year[N - 1];
    int nextOccurrence = lastRecordedYear + averageTimeBetweenEruptions;

    System.out.println(
      "\nPredicted Next Occurrence: " +
      nextOccurrence +
      "\n---------------------------------\n\n"
    );
  }
}
