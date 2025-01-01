import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FightTest
{
    @Test
    public void testFightExecution()
    {
        Player attacker = new Player(50, 5, 10);
        Player defender = new Player(100, 10, 5);
        Fight fight = new Fight(attacker, defender);

        fight.execute();

        assertTrue( defender.getHealth() > 0 && defender.getHealth() < 100);
    }

    @Test
    public void testFightWithZeroDamage()
    {
        Player attacker = new Player(50, 1, 1);
        Player defender = new Player(100, 7, 1);
        Fight fight = new Fight(attacker, defender);

        fight.execute();

        assertEquals(100, defender.getHealth());
    }
}
