import java.util.Random;

//Simulates a 6-sided dice roll.
public class Dice
{
    private static final Random random = new Random();

    //Rolls a 6-sided dice and returns the result.
    public static int roll()
    {
        return random.nextInt(6) + 1;
    }
}
