package homeworkDay20;

public class WaterTracker {
    int consumedWater;

    int dailyWaterGoal = 2000;


    public void addWater(int milliliters){
        if (milliliters > 0){
            System.out.println("You just drink " + milliliters + "ml of water");
            consumedWater += milliliters;
        }
        else {
            System.out.println("Consumed amount of water can be only positive number");
        }
    }

    public int getWaterIntake(){
        return consumedWater;
    }

    public String getStatus(){
        if (consumedWater >= dailyWaterGoal){
            return "You are hydrated!";
        }
        else {
            return "You need to drink " + (dailyWaterGoal - consumedWater) + "ml of water";
        }
    }

    public void reset(){
        consumedWater = 0;
    }

    public void setWaterGoal(int waterGoalAmount){
        if (waterGoalAmount > 2000){
            System.out.println("You set a new daily water consumption limit");
            dailyWaterGoal = waterGoalAmount;
        }
        else {
            System.out.println("The amount of water should be more than 2000 ml");
        }
    }



    public static void main(String[] args) {
        WaterTracker waterTracker1 = new WaterTracker();
        waterTracker1.addWater(500);
        System.out.println(waterTracker1.getWaterIntake());
        waterTracker1.addWater(1000);
        System.out.println(waterTracker1.getWaterIntake());
        System.out.println(waterTracker1.getStatus());
        waterTracker1.addWater(500);
        System.out.println(waterTracker1.getStatus());

        waterTracker1.addWater(-500);
    }
}
