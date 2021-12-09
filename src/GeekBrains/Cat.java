package GeekBrains;

public class Cat implements JumpandRun {
    private String name;
    private double maxDistanceRun = 400;
    private double maxJumpHeight = 2.5;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(double d) {
        if (maxDistanceRun > d) {
            System.out.println("Cat " + name + " Пробежал");
        } else System.out.println("Cat " + name + " Не смог пробежать");
    }

    @Override
    public void jump(double h) {
        if (maxJumpHeight > h) {
            System.out.println("Cat " + name + " Успешно перепрыгнул");
        } else System.out.println("Cat " + name + " Не смог перепрыгнуть");
    }
}