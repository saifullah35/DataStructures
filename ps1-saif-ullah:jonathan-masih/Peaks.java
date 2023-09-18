import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuffer;
/**
 * Mountain peaks 
 *
 * @author (Joanthan Masih and Saif Ullah)
 * @version (3/8/2021)
 */
public class Peaks
{
    public static boolean isPeak(int pos,ArrayList<Integer> array, int size){
        boolean peakFound = false;

        if(pos == 0  ){
            if(array.get(pos) >= array.get(pos + 1 ) ){
                peakFound = true;

            }
        }
        if(pos == array.size() -1){
            if(array.get(pos) >= array.get(pos - 1 ) ){
                peakFound = true;

            }

        }
        if( pos >= 1 && pos <= array.size() -1 ){
            boolean leftSide = false;
            boolean rightSide = false;
            for(int i = pos ; i <array.size() - 1; i++ ){
                if(array.get(pos) >= array.get(i + 1)){
                    rightSide = true;

                }else{
                    rightSide = false;
                    break;
                }

            }
            for(int i = pos ; i > 0 ; i--){
                if(array.get(pos) >= array.get(i - 1)){
                    leftSide = true;

                }else{
                    leftSide = false;
                    break;
                }

            }
            if((leftSide == true || rightSide == true ) && (array.get(pos) >= array.get(pos - 1 ) && (array.get(pos) >= array.get(pos + 1 )  ))){
                peakFound = true;

            }
            else {
                peakFound = false;

            }
        }
        return peakFound;
    }

    public static void main (String [] args){
        //CREATING A SCANNER TO READ USER INPUT
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt(); 
        ArrayList<Integer> heightsArray = new ArrayList<Integer>();
        heightsArray.add(input);

        while(input != 0){
            input = scan.nextInt(); 
            heightsArray.add(input);

        }
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < heightsArray.size() - 1 ;i++){
            if(isPeak(i,heightsArray,heightsArray.size()) == true ){
                if(isPeak(i,heightsArray,heightsArray.size()) == true  && isPeak(i + 1,heightsArray,heightsArray.size()) == true ){

                }else{

                    sb.append(heightsArray.get(i)+ " ");
                }
            }
        }
        System.out.println(sb);
    }
}
