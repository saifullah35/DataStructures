 
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class represents a three reel slot machine.
 * 
 * @author Saif Ullah and Jonathan Masih 
 * @version 
 */
public class SlotMachine
{
    private ArrayList<String> reel1;
    private ArrayList<String> reel2;
    private ArrayList<String> reel3;
    private ArrayList<PayValue> payList;
    private Random rand;

    /**
     * Initializes a SlotMachine object by loading
     * the reel values and the list of combinations
     * of stops with the amount each pays.
     */
    public SlotMachine() throws FileNotFoundException
    {
        reel1 = new ArrayList<String>();
        reel2 = new ArrayList<String>();
        reel3 = new ArrayList<String>();
        loadReels("slotmachine.csv", ",");

        payList = new ArrayList<PayValue>();
        loadPayList("payList.csv", ",");

        rand = new Random();
    }

    /**
     * Reads from the specified file.  The values for 
     * each of three reels at a single stop are on 
     * the same line, separated by the specified value.
     * The number of stops in a file is unknown.
     * 
     * The stops are assumed to have the same order as 
     * is read from the file.  Case should be ignored 
     * when using data from the file.
     * 
     * @param file The input file.
     * @param separator The value used to separate each entry
     * on a line.
     */
    public void loadReels(String file, String separator) throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new FileInputStream(file));

        while (inFile.hasNext()){
            String[] in = inFile.nextLine().split(separator);
            reel1.add(in[1].toLowerCase());
            reel2.add(in[2].toLowerCase());
            reel3.add(in[3].toLowerCase());
 
        }
        
        inFile.close();
    }

    /**
     * Reads the specified file.  This file contains
     * data reelStop1, reelStop2, reelStop3 ,payValue
     * separated by the specified value.  The number
     * of entries in the file is unknown.
     * 
     * If a reelStop has a single word in the first reelStop
     * position, then it is understood that any reelStop that
     * matches will pay.  E.g., If the reelStop is "Red", then
     * any combination of 3 reds will pay.  Case should be ignored
     * when using data from the file.
     * 
     * @param file The input file.
     * @param separator The value used to separate each entry
     * on a line.
     */
    public void loadPayList(String file, String separator) throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new FileInputStream(file));

        while (inFile.hasNext())
        {
            String[] in = inFile.nextLine().split(separator);
            payList.add(new PayValue(in[0].toLowerCase(), in[1].toLowerCase(), 
            in[2].toLowerCase(), Integer.parseInt(in[3])));
        }
        
        inFile.close();
    }

    /**
     * Randomly selects three stop positions, one for each
     * reel.
     * 
     * @return an ArrayList of String objects that
     * represents the value of each reel at the stop position
     * and the amount this combination pays. (Note: An array
     * implementation would be more appropriate here.)
     */
    public ArrayList<String> spin()
    {
        ArrayList<String> spinList = new ArrayList();
        int reel1Stop = rand.nextInt(reel1.size());
        int reel2Stop = rand.nextInt(reel2.size());
        int reel3Stop = rand.nextInt(reel3.size());

        spinList.add(reel1.get(reel1Stop) + "");
        spinList.add(reel2.get(reel2Stop) + "");
        spinList.add(reel3.get(reel3Stop) + "");

        int payValue = getPayValue(spinList);
        spinList.add(payValue + "");

        return spinList;
    }

    /**
     * @param stops The current stop value of each reel.
     * @return The amount this combination pays.
     */
    public int getPayValue(ArrayList<String> stops)
    {
        boolean found = false;
        int index = 0;
        while (!found && index < payList.size())
        {
            PayValue pv = payList.get(index);
            if (pv.getPosition1().contains(" "))
            {
                if (pv.getPosition1().equals(stops.get(0)))
                {
                    if (pv.getPosition2().equals(stops.get(1)))
                    {
                        if (pv.getPosition3().equals(stops.get(2)))
                        {
                            found = true;
                        }
                    }
                }
            }
            else
            {
                String any = pv.getPosition1();
                if (stops.get(0).contains(any))
                {
                    if (stops.get(1).contains(any))
                    {
                        if (stops.get(2).contains(any))
                        {
                            found = true;
                        }
                    }
                }
            }
            ++index;
        }

        return (found ? payList.get(index - 1).getPays() : 0);
    }
}
