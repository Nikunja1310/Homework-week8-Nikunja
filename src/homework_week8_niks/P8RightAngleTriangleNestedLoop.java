package homework_week8_niks;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class P8RightAngleTriangleNestedLoop {
    public static void main(String[] args) {

        P8RightAngleTriangleNestedLoop obj = new P8RightAngleTriangleNestedLoop();
        obj.rightAngleTriangle();
    }

    public void rightAngleTriangle() {
        for (int i = 1; i < 6; i++) {              // to iterate each ROW
            for (int a = 0; a < i; a++) {           // to iterate size on each row
                System.out.print("@");              // what to print in same line
            }
            System.out.println();                   // command on next line
        }
    }
}
