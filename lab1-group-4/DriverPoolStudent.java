
import java.util.Scanner;
/**
 * import java.util.Scanner;
 * This program is used to unit test the Pool class.
 * The format of the dollar amount is not important.
 * You should not be concerned that there are no 
 * dollar signs or there are more than two decimal
 * places.
 * 
 * @author Jonathan Masih And Saif Ullah
 * @version Spring 2019
 */
public class DriverPoolStudent
{
    public static void main(String args[])
    {
        //1.  Create a Pool object.
        Pool p = new Pool();

        //2.  Test bounds of the range for pool days
        //2A. day - lower bound test
        System.out.println("Testing Lower bound for poolDays with day 0 Expected: false" 
            + " Actual: " + p.addEntry(0,11,"Dav",56.0));
        System.out.println("Testing Lower bound for poolDays with day 1 Expected: true" 
            + " Actual: " + p.addEntry(1,12,"Mill",3.0));
        System.out.println("Testing Lower bound for poolDays with day 2 Expected: true" 
            + " Actual: " + p.addEntry(2,13,"Sam",9.0));

        //2B. day - mid-range test
        System.out.println("\nTesting Mid-Range bond for poolDays with day 4 Expected: true" 
            + " Actual: " + p.addEntry(4,12,"Chris",24.0));

        //2C. day - upper bound test

        System.out.println("\nTesting Upper-Range bond for poolDays with day 6 Expected: true" 
            + " Actual: " + p.addEntry(6,11,"ellen",24.0));
        System.out.println("Testing Upper-Range bond for poolDays with day 7 Expected: true" 
            + " Actual: " + p.addEntry(7,12,"Rob",20.0));
        System.out.println("Testing Upper-Range bond for poolDays with day 8 Expected: false" 
            + " Actual: " + p.addEntry(8,13,"Pete",13.0));

        //3.  Test the bounds of the range for pool hours
        //3A. hour - lower bound test
        System.out.println("\nTesting Lower bound for pool hours with day 2 and hour 0"
            + " Expected: false Actual: "+p.addEntry(2,0,"Mill",66.0));
        System.out.println("Testing Lower bound for pool hours with day 2 and hour 1"
            + " Expected: true Actual: "+p.addEntry(2,1,"Bill",61.0));
        System.out.println("Testing Lower bound for pool hours with day 2 and hour 2"
            + " Expected: true Actual: "+p.addEntry(2,2,"Jill",23.0));

        //3B. hour - mid-range test
        System.out.println("\nTesting mid-range bound for pool hours with day 1 and hour 10"
            + " Expected: true Actual: "+p.addEntry(1,10,"Ben",7.0));
        System.out.println("Testing mid-range bound for pool hours with day 2 and hour 11"
            + " Expected: true Actual: "+p.addEntry(2,11,"Com",90.0));
        System.out.println("Testing mid-range bound for pool hours with day 5 and hour 12"
            + " Expected: true Actual: "+p.addEntry(5,13,"Jack",7.0));
        
            //3C. hour - upper bound test
        System.out.println( "\nTesting upper bound for pool hours with day 1 and hour 23"
            + " Expected: true Actual: "+ p.addEntry(1,22,"Mo",16.0));
        System.out.println( "Testing upper bound for pool hours with day 1 and hour 23"
            + " Expected: true Actual: "+ p.addEntry(1,23,"Tom",12));
        System.out.println( "Testing upper bound for pool hours with day 1 and hour 24"
            + " Expected: false Actual: "+ p.addEntry(1,24,"Nick",11.0));

        //4A.  Test pool total; total is based on the pool entries above
        System.out.println("\nPoolTotal Ecpected: 199.0 " + "Actual: " + p. poolTotal());

        //4B.  Test pool total with a new pool and no entries.
        Pool p2 = new Pool();
        System.out.println("\nPoolTotal with no entries Ecpected: 0 "  + "Actual: " + p2. poolTotal());

        //5A.  Test getWinner - winner exists
        System.out.println("\nTesting getWinner with day 1 and hour 10 Expected: Ben"
            + " Actual: "+  p.getWinner(1,10));

        //5B.  Test getWinner - no winner
        System.out.println("\nTesting getWinner with day 3 and hour 15 Expected: null"
            + " Actual: "+  p.getWinner(3,15));

        //6.   print the complete matrix
        System.out.println("\n" + p);
        /*
         * 7. 
         * Use the Pool object, p, you created above.  If there are entries 
         * still available (there should be lots!), ask the user to pick a day 
         * and time.  Keep asking until they have picked one that is not 
         * already used (is null).  Then, add the user to the pool.  You 
         * will need their name and the amount they would like to enter.
         * You only need to enter one user in the pool.
         */
        Scanner scnr = new Scanner(System.in);
        int day = 0;
        int time = 0;
        String name = "";
        double amount = 0;

        System.out.print("Please enter the day: ");
        day = scnr.nextInt();
        System.out.print("\nPlease enter the hour: ");
        time = scnr.nextInt();
        System.out.print("\nPlease enter the name for the entry: ");
        name = scnr.next();
        System.out.println("\nPlease enter the Amount for the entry: ");
        amount = scnr.nextDouble();

        if (p.addEntry(day,time,name,amount) == false){
            while(p.addEntry(day,time,name,amount) == false){
                System.out.println("\nThat day and time is not avaible please Select another day and time");
                System.out.print("\nPlease enter the day: ");
                day = scnr.nextInt();
                System.out.print("\nPlease enter the hour: ");
                time = scnr.nextInt();

            }
            p.addEntry(day,time,name,amount);
            System.out.println("Your entry has been added!!!");

        }else{
            p.addEntry(day,time,name,amount);
            System.out.println("Your entry has been added!!!");

        }

        System.out.println("Pool After Entry");

        System.out.println("\n" + p);
    }
}
