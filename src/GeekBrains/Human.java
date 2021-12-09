package GeekBrains;

public class Human implements JumpandRun {
    private String name;
    private double maxDistanceRun = 100;
    private double maxJumpHeight = 1.2;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run(double d) {
        if (maxDistanceRun > d) {
            System.out.println("Human " + name + " Пробежал");
        } else System.out.println("Human " + name + " Не смог пробежать");
    }

    @Override
    public void jump(double h) {
        if (maxJumpHeight > h) {
            System.out.println("Human " + name + " Успешно перепрыгнул");
        } else System.out.println("Human " + name + " Не смог перепрыгнуть");
    }
}