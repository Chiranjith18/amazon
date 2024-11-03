public class Dolphin extends Animal implements Swim {
    private String color;
    private int swimmingspeed;

    public Dolphin(String nameOfAnimal) {
        super(nameOfAnimal); // Call the parent constructor
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingspeed() {
        return swimmingspeed;
    }

    public void setSwimmingspeed(int swimmingspeed) {
        this.swimmingspeed = swimmingspeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    public void eatingCompleted() {
        System.out.println("I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingspeed + " nautical miles per hour.");
    }
}
