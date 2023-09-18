import java.util.Random;
import java.util.Scanner;

/**
 * Making a board and moving all the chips to the end.
 *
 * @author (Saif Ullah and Jonathan Masih)
 * @version (3/14/2021)
 */
public class Shift
{
    private static String[] board;
    private static Random rand = new Random();
    private static int randChipsNum = rand.nextInt(3) + 3;

    private Shift(int size){
        board = new String[size];   
    }

    //METHOD TO PRINT THE ARRAY
    private static void printArray(String[] board){
        for(int i = 0; i < board.length; i++){
            if(board[i] == null){
                System.out.print("-");
            }else {
                System.out.print(board[i]);

            }
        }
    }

    //GETTER METHOD
    private static String getChip(int location){
        String value = board[location];
        return value;
    }

    //SETTER METHOD
    private static void setChip(int location, String value){
        board[location] = value;
    }

    private static  int chipLocation (int chipValue){
        int chipLocation = 0;

        for(int i = 0; i < board.length; i++ ){
            if(board[i] == null){

            }else if(Integer.parseInt(board[i]) == chipValue) {

                return i;

            }

        }
        return  chipLocation;
    }

    private static void moveChip(int coin , int pos){
        int numOfSpaceTillNextChip = 0;

       
        if( coin ==  randChipsNum   ){
            for(int i = chipLocation(coin) ; i < board.length ; i++ ){
                numOfSpaceTillNextChip++;
            }
        }else {
           numOfSpaceTillNextChip = Math.abs(chipLocation(coin) - chipLocation(coin + 1) );
        
        }
        if( pos + chipLocation(coin) > chipLocation(coin) && pos <= numOfSpaceTillNextChip && pos + chipLocation(coin) !=   chipLocation(coin + 1)){
            setChip( chipLocation(coin) + pos , coin + "");
            setChip(chipLocation (coin) , null);
        }else{
            System.out.println("Invalid move!");
        }

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please select the size of the board from 9-15: ");
        int size = input.nextInt();
        while(size < 9 || size > 15){
            System.out.print("Please select an appropriate size from 9-15: ");
            size = input.nextInt();
        }
        Shift game = new Shift(size);

        //RANDOM NUMBER OF CHIPS 


        int currentChip = 0;
        int chipLocation = 0;
        int numOfSpaces = rand.nextInt(3);
        for(int i = 0; i < randChipsNum ; i++ ){

            if(chipLocation > size){
                numOfSpaces = rand.nextInt(chipLocation - size );

            }
            chipLocation += numOfSpaces;
            if( chipLocation < size){
                game.setChip(chipLocation ,currentChip +"" );
                chipLocation += 1;
                currentChip++;
            }else if (chipLocation > size ) {
                chipLocation -= numOfSpaces;

                i--;

            }
            numOfSpaces = rand.nextInt(3);
        }  

        System.out.print("Current configuration: ");
        printArray(board); 
        System.out.println("\nSpecify the coin number and move distance.");

        //CHECKS TO SEE IF CHIPS ARE AT THE END
        int coin = input.nextInt();
        int coinAtPosToMove = input.nextInt();
        boolean elementsAtEnd = false;

        //LOOP TO SPECIFY THE COIN NUMBER AND DISTANCE
        while(elementsAtEnd == false){
            moveChip(coin , coinAtPosToMove);
            if(board[board.length - randChipsNum  ] == null || Integer.parseInt( board[board.length - randChipsNum  ]) != 0){

            }  else if(Integer.parseInt( board[board.length - randChipsNum  ]) == 0 ){
                elementsAtEnd = true;
                break;
            } 

            System.out.print("Current configuration: ");
            printArray(board); 
            System.out.println("\nSpecify the coin number and move distance.");

            coin = input.nextInt();
            coinAtPosToMove = input.nextInt();

        }

        System.out.println("Current configuration: ");
        printArray(board);
        System.out.println("\nGame Over");

        input.close();
    }
}

