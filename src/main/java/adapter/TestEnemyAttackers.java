package adapter;

//his pattern is used when you want to translate one interface of a class into another interface.
// Now, it makes sense that these 2 interfaces are compatible otherwise the pattern may not make sense.
// To accomplish this, all you need to do is bridge the differences using our old friend composition again.

public class TestEnemyAttackers{

    public static void main(String[] args){

        EnemyTank rx7Tank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }

}
