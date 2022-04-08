package interfaces;

interface Robot {
    void speak();

    void run();

    void sit();

    void sleep();

    void climb();

    interface RobotTexno {
        void fastSpeak();

        void fastRun();

        void fastSit();

        void fastSleep();

        void fastClimb();
    }

    interface RobotSuper {
        void lotOfLanguageSpeak();

        void lotOfRun();

        void lotOfSit();

        void lotOfSleep();

        void lotOfClimb();
    }
}

class Lesson2 implements Robot, Robot.RobotTexno, Robot.RobotSuper {

    @Override
    public void speak() {
        System.out.println("Robot can speak");
    }

    @Override
    public void run() {
        System.out.println("Robot can run");
    }

    @Override
    public void sit() {
        System.out.println("Robot can sit");
    }

    @Override
    public void sleep() {
        System.out.println("Robot can sleep");
    }

    @Override
    public void climb() {
        System.out.println("Robot can climb");
    }

    @Override
    public void fastSpeak() {
        System.out.println("RobotTexno can fast Speak");
    }

    @Override
    public void fastRun() {
        System.out.println("RobotTexno can fast Run");
    }

    @Override
    public void fastSit() {
        System.out.println("RobotTexno can fast Sit");
    }

    @Override
    public void fastSleep() {
        System.out.println("RobotTexno can fast sleep");
    }

    @Override
    public void fastClimb() {
        System.out.println("RobotTexno can fast climb");
    }

    @Override
    public void lotOfLanguageSpeak() {
        System.out.println("RobotSuper can speak a lot of language ");
    }

    @Override
    public void lotOfRun() {
        System.out.println("RobotSuper can  a lot of run");
    }

    @Override
    public void lotOfSit() {
        System.out.println("RobotSuper can a lot of sit");
    }

    @Override
    public void lotOfSleep() {
        System.out.println("RobotSuper can  a lot of sleep");
    }

    @Override
    public void lotOfClimb() {
        System.out.println("RobotSuper can  a lot of climb");
    }
}

class RobotTest {
    public static void main(String[] args) {
        Lesson2 lesson2 = new Lesson2();
        lesson2.speak();
        lesson2.climb();
        lesson2.run();
        lesson2.sit();
        lesson2.sleep();
        lesson2.fastClimb();
        lesson2.fastRun();
        lesson2.fastSit();
        lesson2.fastSleep();
        lesson2.fastSpeak();
        lesson2.lotOfRun();
        lesson2.lotOfClimb();
        lesson2.fastSpeak();
        lesson2.fastSit();
        lesson2.fastSleep();
    }
}

