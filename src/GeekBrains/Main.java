package GeekBrains;

public class Main {

    public static void main(String[] args) {

        Wall[] wall = new Wall[4];
        wall[0] = new Wall(2.3);
        wall[1] = new Wall(4);
        wall[2] = new Wall(1);
        wall[3] = new Wall(5);

        Treadmill[] treadmill = new Treadmill[4];
        treadmill[0] = new Treadmill(200);
        treadmill[1] = new Treadmill(600);
        treadmill[2] = new Treadmill(300);
        treadmill[3] = new Treadmill(1200);


        JumpandRun[] j = {
        new Cat("Барсик"),
        new Robot("R2D2"),
        new Human("Vasya"),
        new Cat("Myrzik")
        };

        for (int i = 0; i < j.length; i++) {
            j[i].jump(wall[i].getHeight());
        }
        for (int i = 0; i < j.length; i++) {
            j[i].run(treadmill[i].getDistance());
        }
    }
}