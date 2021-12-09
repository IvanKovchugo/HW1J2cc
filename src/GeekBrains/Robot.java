package GeekBrains;

public class Robot implements JumpandRun {
    private String name;
    private double maxDistanceRun = 1000;
    private double maxJumpHeight = 5;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run(double d) {
        if (maxDistanceRun > d) {
            System.out.println("Robot " + name + " Пробежал");
        } else System.out.println("Robot " + name + " Не смог пробежать");
    }

    @Override
    public void jump(double h) {
        if (maxJumpHeight > h) {
            System.out.println("Robot " + name + " Успешно перепрыгнул");
        } else System.out.println("Robot " + name + " Не смог перепрыгнуть");
    }
}