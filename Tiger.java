public class Tiger extends Animal implements Walk {
    private static final String TIGER_NAME = "Tiger"; // Use uppercase for constants
    private int numberOfStripes;
    private int speed; // Speed in mph
    private int soundLevelOfRoar; // Sound level of roar

    public Tiger() {
        super(TIGER_NAME); // Call the parent constructor with the tiger's name
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingFood() {
        System.out.println("Tiger: I am eating meat.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed of " + speed + " mph.");
    }
}
