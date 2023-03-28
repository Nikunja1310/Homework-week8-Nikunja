package homework_week8_niks;

/**
 * 15. Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */
public class P15LeftAngleTriangleNestedLoop {

    public static void main(String[] args) {

        int rows = 5 ;
        for ( int i = 1 ; i <= rows ; i++) {
            for (int a = 1; a <= i ; a++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
