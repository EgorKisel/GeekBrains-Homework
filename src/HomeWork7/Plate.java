package HomeWork7;

public final class Plate {
    private int foodValue;


    public Plate(int foodValue) {
        this.foodValue = foodValue;
    }
    public boolean decreaseFood(int countEatFood) {
        if ( hasEnoughFood(countEatFood)) {
            foodValue -= countEatFood;
            return true;
        }
        return false;
    }

    private boolean hasEnoughFood(int requiredCountFood) {
        return foodValue >= requiredCountFood;
    }

    public void addFood (int countFood) {
        foodValue += countFood;
    }

    public void info () {
        System.out.println("Bowl:" + foodValue);
    }
}
