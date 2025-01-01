import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest
{
    @Test
    public void testFightOutcome()
    {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB);
        arena.startFight();

        assertTrue(playerA.isAlive() ^ playerB.isAlive());
    }

    @Test
    public void testPlayer1Wins()
    {
        Player playerA = new Player(100, 10, 10);
        Player playerB = new Player(50, 5, 10);
        Arena arena = new Arena(playerA, playerB);
        arena.startFight();

        assertTrue(playerA.isAlive());
        assertFalse(playerB.isAlive());
    }

    @Test
    public void testPlayer2Wins()
    {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 10);
        Arena arena = new Arena(playerA, playerB);
        arena.startFight();

        assertFalse(playerA.isAlive());
        assertTrue(playerB.isAlive());
    }
}
