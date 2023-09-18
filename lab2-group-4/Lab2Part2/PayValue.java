/**
 * Objects of this class represent one
 * winning combination of stops of a 
 * three reel slot machine, and
 * the amount this combination pays
 * in cents.
 * 
 * @author Mrs. White
 * @version Spring 2010
 */
public class PayValue
{
    private String position1;
    private String position2;
    private String position3;
    private int pays;

    /**
     * Constructs a PayValue object by initializing the
     * field variables.
     * 
     * @param position1 The stop value on the first reel.
     * @param position2 The stop value on the second reel.
     * @param position3 The stop value on the third reel.
     * @param pays The amount this combination pays in dollars.
     */
    public PayValue(String position1, String position2, String position3, int pays)
    {
        this.position1 = position1;
        this.position2 = position2;
        this.position3 = position3;
        this.pays = pays;
    }

    /**
     * @return The stop value of the first reel.
     */
    public String getPosition1()
    {
        return position1;
    }

    /**
     * @return The stop value of the second reel.
     */
    public String getPosition2()
    {
        return position2;
    }

    /**
     * @return The stop value of the third reel.
     */
    public String getPosition3()
    {
        return position3;
    }

    /**
     * @return The amount this combination of stop
     * values pays in dollars.
     */
    public int getPays()
    {
        return pays;
    }

    /**
     * @return The three reel positions and what the combination
     * pays.
     */
    public String toString()
    {
        return position1 + " " + position2 + " " + position3 + pays;
    }
}
