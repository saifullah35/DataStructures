
import java.io.*;
/**
 * Order the roads of USHighways by length
 *
 * @author (Saif Ullah and Jonathan Masih)
 * @version (May 17, 2021)
 */
public class USHighway implements Comparable <USHighway>
{
    //INSTANCE VARIABLES
    private final String routeNumber;
    private final String startLocation;
    private final String routeOfStates;
    private final String endLocation;
    private final int lengthOfMiles;

    /**
     * Constructor for objects of class USHighway
     */
    public USHighway(String routeNumber, String startLocation, String routeOfStates, String endLocation, int lengthOfMiles)
    {
        this.routeNumber = routeNumber;
        this.startLocation = startLocation;
        this.routeOfStates = routeOfStates;
        this.endLocation = endLocation;
        this.lengthOfMiles = lengthOfMiles;
    }

    //ACCESSOR METHODS
    public String getRouteNumber(){
        return routeNumber;
    }

    public String getStartLocation(){
        return startLocation;
    }

    public String getRouteOfStates(){
        return routeOfStates;
    }

    public String getEndLocation(){
        return endLocation;
    }

    public int getLengthOfMiles(){
        return lengthOfMiles;
    }

    public boolean equals(USHighway other){

        if(this.routeNumber.equals(other.routeNumber)){
            if( this.startLocation == other.startLocation ){
                if(   this.routeOfStates  == other.routeOfStates){
                    if(  this.endLocation  ==   other.endLocation ){
                        if(  this.lengthOfMiles == other.lengthOfMiles){
                            return true;

                        }else{
                            return false;
                        }

                    }else{
                        return false;
                    }

                }else{
                    return false;

                }

            }else{
                return false;
            }

        }else{

            return false;
        }

    }
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.routeNumber +  "\n");
        sb.append(this.startLocation +  "\n");
        sb.append( this.routeOfStates +  "\n");
        sb.append(this.endLocation +  "\n");
        sb.append( this.lengthOfMiles +  "\n");

        return sb.toString();

    }

    @Override
    public int compareTo(USHighway other){
        if(this.lengthOfMiles < other.lengthOfMiles){
           return -1;
        
        }else if(this.lengthOfMiles > other.lengthOfMiles){
           return 1;
        }else{
          return 0;
        }
    }
}
