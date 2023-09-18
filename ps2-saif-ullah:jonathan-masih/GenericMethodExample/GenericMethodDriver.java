import java.awt.Point;
/**
 * GenericMethodDriver to test GenericMethod from the GenericMethodExample class .
 *
 * @author (Jonathan Masih & Saif Ullah)
 * @version (11/31/2021)
 */
public class GenericMethodDriver
{
    public static void main(String [] args){
        String[] arr = {"Emma", "Jonathan", "Saif", "TComp" , "Twitter", "Data Structures" , "Emma" , "Emma"};
        Integer[] arr2 = {16, 23, 24, 35, 55, 72, 69, 16 , 72 , 72 };
        Point[] arr3 = {new Point(1,2), new Point(3,4) , new Point(5,6) , new Point(7,8) , new Point(9,10) , new Point(1,2) };

        //TESTING STRING ARRAY
        System.out.println("String Array: Emma, Jonathan, Saif, TComp , Twitter, Data Structures , Emma , Emma" );
        System.out.println("Testing String array With Saif Expected: 1 Actual: " + GenericMethodExample.countOccurrences(arr, "Saif"));
        System.out.println("Testing String array With Emma Expected: 3 Actual: " + GenericMethodExample.countOccurrences(arr, "Emma"));
        System.out.println("Testing String array With Comp Expected: 0 Actual: " + GenericMethodExample.countOccurrences(arr, "Comp"));

        //TESTING INTEGER ARRAY
        System.out.println("\nInteger Array: 16, 23, 24, 35, 55, 72, 69, 16 , 72 , 72" );
        System.out.println("Testing Integer array With 16 Expected: 2 Actual: " + GenericMethodExample.countOccurrences(arr2, 16));
        System.out.println("Testing Integer array With 72 Expected: 3 Actual: " + GenericMethodExample.countOccurrences(arr2, 72));
        System.out.println("Testing Integer array With 0 Expected: 0 Actual: " + GenericMethodExample.countOccurrences(arr2, 5));

        //TESTING POINT ARRAY
        System.out.println("\nPoint Array: Point(1,2), Point(3,4) , Point(5,6) , Point(7,8) , Point(9,10) , Point(1,2) ");
        System.out.println("Testing Point array With Point(1,2)  Expected: 2 Actual: " + GenericMethodExample.countOccurrences(arr3, new Point(1,2) ));
        System.out.println("Testing Point array With Point(9,10)  Expected: 1 Actual: " + GenericMethodExample.countOccurrences(arr3, new Point(9,10) ));
        System.out.println("Testing Point array With Point(11,12)  Expected: 0 Actual: " + GenericMethodExample.countOccurrences(arr3, new Point(11,12) ));

    }
}
