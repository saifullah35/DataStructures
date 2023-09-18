/**
 * Use this program to test your DoubleArrayList
 * implementation for Problem Set 3.
 * 
 * @author Prof. White 
 * @version Fall 2019
 */
public class TestDoubleArrayListPS2 
{
    public static void testDoubleArrayListB()
    {
        int score = 0;
        int maxscore = 0;      

        try {
            // //-------- Test ensureCapacity
            DoubleArrayList list6 = new DoubleArrayList();
            list6.ensureCapacity(15);
            if (list6.getCapacity() == 15) {
                score++;
            }
            maxscore++;

            // We should be able to add 15 values to list6, 
            // now that its capacity is 15.
            // Add first ten elements
            for (int i = 0; i<10; i++) {
                list6.addSimple(i);
            }

            // Are we able to add 5 more elements?
            for (int i = 10; i<15; i++) {
                if (list6.addSimple(i) == true) {
                    score++;   
                }
                maxscore++;
            }

            //-------- Test add(element) 
            // this add method should automatically double the
            // capacity of list as necessary
            DoubleArrayList list12 = new DoubleArrayList();
            // add 14 items to list, which should double its capacity
            for (int i = 0; i < 14; i++) {
                list12.add(i);
            }

            if (list12.size() == 14) {
                score++;

                if (list12.get(0) == 0.0) {
                    score++;
                }

                if (list12.get(13) == 13.0) {
                    score++;
                }

                if (list12.getCapacity() == 20) {
                    score++;
                }
            }
            maxscore += 4;

            //-------- Test add(pos,newElement)
            DoubleArrayList list7 = new DoubleArrayList();
            list7.addSimple(0.0);
            list7.addSimple(1.0);

            // add to the beginning
            list7.add(0, 2.0); 

            // list should now contain {2, 0, 1}
            if (list7.size() == 3) { 
                score++;

                if (list7.get(0) == 2.0) {
                    score++;
                }

                if (list7.get(2) == 1.0) {
                    score++;
                }

                // at to the end
                list7.add(3, 5.0); 

                // list should now contains {2, 0, 1, 5}
                if (list7.size() == 4) {
                    score++;
                }

                if (list7.get(0) == 2.0) {
                    score++;
                }

                if (list7.get(3) == 5.0) {
                    score++;
                }

                // at to the middle
                list7.add(2, 7.0); 

                // list should now contain {2, 0, 7, 1, 5}
                if (list7.size() == 5) {
                    score++;
                }

                if (list7.get(0) == 2.0) {
                    score++;
                }

                if (list7.get(3) == 1.0) {
                    score++;
                }

                if (list7.get(2) == 7.0) {
                    score++;
                }

                // see if it doubles the capacity when necessary
                list7.add( 5, 50 );
                list7.add( 6, 60 );
                list7.add( 7, 60 );
                list7.add( 8, 60 );
                list7.add( 9, 60 );
                list7.add( 10, 60 );

                if (list7.getCapacity() == 20) {
                    score++;
                }

                if (list7.get( 10 ) == 60) {
                    score++;
                }
            }
            maxscore += 12;

            //-------- Test addAll( addend ) - MOVED TO PROBLEM SET 2
            DoubleArrayList list9 = new DoubleArrayList();
            list9.add(0.0);
            list9.add(1.0);

            DoubleArrayList list8 = new DoubleArrayList();
            list8.add(2.0);
            list8.add(3.0);
            list8.add(4.0);

            list9.addAll( list8 );
            if (list9.size() == 5) {
                score++;

                if (list9.get(0) == 0.0) {
                    score++;
                }

                if (list9.get(4) == 4.0) {
                    score++;
                }

                if (list8.size() == 3) {
                    score++;
                }
            }
            maxscore += 4;

            DoubleArrayList list10 = new DoubleArrayList();
            DoubleArrayList list11 = new DoubleArrayList();
            // put 8 items in both lists
            for (int i = 0; i < 8; i++) {
                list10.add(i);
                list11.add(i);
            }

            list10.addAll( list11 );
            if (list10.size() == 16) {
                score++;

                if (list10.get(0) == 0.0) {
                    score++;
                }

                if (list10.get(8) == 0.0) {
                    score++;
                }

                if (list10.get(15) == 7.0) {
                    score++;
                }

                if (list10.getCapacity() == 16) {
                    score++;
                }
            }
            maxscore += 5;

            //-------- Test addAll(pos, addpos)
            DoubleArrayList listA = new DoubleArrayList();
            listA.add(0.0);
            listA.add(10.0);
            listA.add(20.0);
            listA.add(30.0);

            DoubleArrayList listB = new DoubleArrayList();
            listB.add(5.0);
            listB.add(15.0);
            listB.add(25.0);

            listA.addAll( 2, listB );

            if ( listA.size() == 7 ) {
                score++;

                if ( listA.get(2) == 5 ) {
                    score++;
                }

                if ( listA.get(3) == 15 ) {
                    score++;
                }

                if ( listA.get(4) == 25 ) {
                    score++;
                }

                if ( listA.get(5) == 20 ) {
                    score++;
                }
            }

            maxscore += 5;
            System.out.println( "You scored " + score + " out of a possible " + maxscore + " points." );
            if ( score < maxscore ) {
                System.out.println( "Keep working on it - you can fix the bugs!" );
            } else {
                System.out.println( "You rock -- a perfect score!" );
            }
        } catch(Exception e) {
            System.out.println( "     Unable to complete test program because " );
            System.out.println( "     Exception thrown: " + e.getClass().getSimpleName() );
            System.out.println( "     Use the debugger to figure out what is going on.");
            System.out.println( "     Your score before the exception was thrown was " + score + ".");
        }
    }

}
