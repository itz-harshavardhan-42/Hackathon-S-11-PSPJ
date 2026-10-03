public class WaterConsumeMethod {
    static int waterConsumed(int morningUsage, int eveningUsage){
        int totalUsage=morningUsage+eveningUsage;
        return totalUsage;
    }
    public static void main(String args[]){
        int morningUsage=30;
        int eveningUsage=25;
        int totalWaterConsumed=waterConsumed(morningUsage,eveningUsage);
        System.out.println("Total water consumed: " + totalWaterConsumed + " L");
    }
}
