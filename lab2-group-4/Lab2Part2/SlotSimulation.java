import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Granny Green likes to play the slots.  She
 * goes to the casino every Sunday with $1000.
 * She bets $1 every time she spins and pockets
 * any winnings.  Any losses are placed on her tab.
 * How many times does Granny Green leave the casino
 * a winner?  What is her tab at the end of the year?
 * 
 * This class runs from the main method and simulates 
 * Granny Green's luck at the casino.  For each Sunday 
 * of the year, 52 in all, a text file is generated.  
 * The files generated are named slotStudy + week number 
 * + .txt.  E.g., For week 1, the file name is 
 * slotStudy1.txt.
 * 
 * In the file, the result of each spin and the amount
 * it paid is entered, one spin per line.  After Granny 
 * Green spends all $1000 for the day, the amount she
 * won or lost is printed to the file.
 * 
 * At the end of the year, the number of times Granny
 * Green walked out of the casino a winner is printed
 * to the terminal window, along with the amount of her
 * tab.
 * 
 * Good luck, Granny Green!
 * 
 * @author Mrs. White
 * @version Spring 2010
 */
public class SlotSimulation
{
    public static void main() throws FileNotFoundException
    {
        int wins = 0;
        int tab = 0;
        for (int fileNum = 1; fileNum < 53; fileNum++)
        {
            PrintWriter outFile = new PrintWriter(new File("slotStudy" + fileNum + ".txt"));
            SlotMachine slots = new SlotMachine();        
            ArrayList<String> stop = new ArrayList<String>();
            int winnings = -1000;
            for (int i = 0; i < 1000; i++)
            {
                stop = slots.spin();
                winnings += Integer.parseInt(stop.get(3));
                outFile.println(stop.get(0) + " " +
                                stop.get(1) + " " +
                                stop.get(2) + " " +
                                stop.get(3) + " ");
            }
            if (winnings > 0) 
                ++wins;
            else
                tab += winnings;
            System.out.println("Week " + fileNum + ":  Granny Green won(lost) $" + 
                                winnings + ".");
            outFile.println("Week " + fileNum + ":  Granny Green won(lost) $" + 
                                winnings + ".");
            outFile.close();
        }
        System.out.println("\nIn 52 trips, Granny Green won " + wins + " times.");
        System.out.printf("Her tab is $%,d.", tab);
    }
}
