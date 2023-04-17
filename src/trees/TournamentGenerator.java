package trees;

import java.util.ArrayList;

/**
 * Generates a tournament bracket with the names provided
 * to the class
 *
 * @author ???
 * @version ???
 */
public class TournamentGenerator
{
    /**
     * Creates the tournament bracket.
     * @param names a list of tournament entrants
     */
    public TournamentGenerator(ArrayList<String> names)
    {

    }

    /**
     * Prints the rounds of the tournament to the Java console.
     */
    public void printResults()
    {
        //do something...
    }

    /**
     * Helper method that returns true if the number provided
     * is a power of two. This can be used to measure the size
     * of a full tree of height n, where the number of elements
     * in the tree is 2^n - 1
     *
     * @param num the number to inspect
     * @return true if the number is power or two, or false otherwise
     */
    public boolean isPowerOf2(int num)
    {
        while(num % 2 == 0)
        {
            num = num / 2;
        }

        return num == 1;
    }
}
