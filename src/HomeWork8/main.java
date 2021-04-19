package HomeWork8;

public class main {
    public static void main(String[] args) {
        JumpingRunning[] members = {
                new Human(2, 2, "Egor"),
                new Human(1, 2, "Igor"),
                new Cat(3, 4, "Marsel"),
                new Cat(1, 1, "Barsyk"),
                new Robot(0, 10, 13),
                new Robot(4,7,66)
        };

        Obstaclable[] obstacles = {
                new RunningTrack(1),
                new RunningTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpingRunning member : members) {
            System.out.println("Препятствие проходит " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("У него получилось!");
                } else {
                    winner = false;
                    System.out.println("У него не получилось");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}

