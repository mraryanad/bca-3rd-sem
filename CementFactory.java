class CementFactory {

  public static void main(String[] args) {
    /* 
        <----------------------------------->
         1) AMBUJA Cement Factory
         => produces 250 quintal cement in 30 minutes
         => How much is produced in a day? ✅
         => How much is produced in a year? ✅
         => 1 sack = Rs 15.5 profit
         => How much total profit in a year? ✅
        <----------------------------------->
         2) Production
         => 50kg in a sack
         => How many sack produced in a year? ✅
        <----------------------------------->
         3) 50 rooms in a school
         => 15 sack cement used in a room
         => How many sack used in 50 rooms? ✅
         => 3.2 sack cement per sq ft used for base / ceiling
         => How many sack required for 40 sq ft ceiling? ✅
         => How many sack required for 50 sq ft base? ✅
         => How many sack required for the entire school? ✅
         => Cost? (Rs 750 per sack) ✅
        <----------------------------------->
    */

    factoryRelatedCalculations();
    schoolRelatedCalculations();
  }

  public static void factoryRelatedCalculations() {
    // Main Calculation
    int cementProducedIn30Min = 250;
    int cementProducedIn30MinInKg = cementProducedIn30Min * 100; // 1 Quintal = 100 Kg
    int cementProducedInAnHour = cementProducedIn30MinInKg * 2;
    int cementProducedInADay = cementProducedInAnHour * 24; // 24 Hours in a day
    int cementProducedInAYear = cementProducedInADay * 365;
    int sacksProducedInAYear = cementProducedInAYear / 50;
    double profitInAYear = sacksProducedInAYear * 15.5;

    // Display the required results
    System.out.println(
      "Cement Produced In A Day (kg): " + cementProducedInADay
    );
    System.out.println(
      "Cement Produced In A Year (kg): " + cementProducedInAYear
    );
    System.out.println("Total Profit In A Year: " + profitInAYear);
    System.out.println(
      "Total Sacks Produced In A Year: " + sacksProducedInAYear
    );
  }

  public static void schoolRelatedCalculations() {
    // Main Calculation
    int cementUsedInARoom = 15; // In Sack
    int roomsInSchool = 50;
    int cementUsedIn50Rooms = cementUsedInARoom * roomsInSchool; // In Sack

    final double cementPerSqFt = 3.2;
    double cementForCeiling = 40 * cementPerSqFt;
    double cementForBase = 50 * cementPerSqFt;

    double cementForEntireSchool =
      cementUsedIn50Rooms + cementForBase + cementForCeiling;

    final double costPerSack = 750;
    double costForEntireSchool = cementForEntireSchool * costPerSack;

    // Display the required results
    System.out.println("Cement Sacks used in 50 Rooms: " + cementUsedIn50Rooms);
    System.out.println(
      "Cement Sacks required for 40 sq ft ceiling: " + cementForCeiling
    );
    System.out.println(
      "Cement Sacks required for 40 sq ft base: " + cementForBase
    );
    System.out.println(
      "Cement Sacks Required for Entire School: " + cementForEntireSchool
    );
    System.out.println("Total Cost Of Construction: " + costForEntireSchool);
  }
}
