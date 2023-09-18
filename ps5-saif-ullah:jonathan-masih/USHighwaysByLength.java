import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Highways by length.
 *
 * @author (Saif and Jonathan)
 * @version (5/17)
 */
public class USHighwaysByLength
{ 
    public static void main(String [] args)throws IOException{
        BST<USHighway> highwayBST = new BST<USHighway>();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the input file: ");
        String fileName = input.nextLine();
        Scanner infile = new Scanner(new File (fileName));

        while(infile.hasNext()){
            String routeNumber = infile.nextLine();
            String startLocation = infile.nextLine();
            String routeOfStates = infile.nextLine();
            String endLocation = infile.nextLine();
            int lengthOfMiles = Integer.parseInt(infile.nextLine());
            highwayBST.add( new USHighway(routeNumber,startLocation,routeOfStates,endLocation,lengthOfMiles));
            

        }
        
        System.out.println( highwayBST.toString());
        

    }
}
