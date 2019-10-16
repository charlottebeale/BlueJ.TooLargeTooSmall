
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (Charlotte Beale)
 * @version (10/16/19)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }
    
    public Integer guess(Integer g) {
        while (g != null) {
            if (chosenNum == g) {
            return 0;
        } else if (chosenNum > g) {
            return -1;
        } else {
                return 1;
            }
        }
        return chosenNum;
    }
}
