 
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuffer;
/**
 * LongestWord.
 *
 * @author (Jonathan Masih & Saih Ullah)
 * @version (3/8/2021)
 */
public class LongestWord
{
    public static void main (String [] args){
        ArrayList<String>  stringArray = new ArrayList<String>();
        System.out.print("Please enter the next word(\"done\" to end): ");

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        stringArray.add(input);  

        while( !input.equalsIgnoreCase("Done")){
            System.out.print("Please enter the next word(\"done\" to end): ");
            input = scan.next();
            stringArray.add(input);
            if(input.equalsIgnoreCase("done") ){
               input.toLowerCase();
               stringArray.remove(input);
            
            }
        }
        
        
        
        
        //FINDING THE LONGEST WORD
        String longWordSt = "";
        int longWord = stringArray.get(0).length();

        for(int i = 0; i < stringArray.size(); i++){
            if(stringArray.get(i).length() >= longWord  ){
                longWord = stringArray.get(i).length();

            }
        }

        for(int i = 0 ; i < stringArray.size(); i++ ){
            if(stringArray.get(i).length() == longWord  ){
                longWordSt += stringArray.get(i) + ", ";

            }

        }

        longWordSt = longWordSt.substring(0, longWordSt.length() -2);
        System.out.println(longWordSt);
    }
}
