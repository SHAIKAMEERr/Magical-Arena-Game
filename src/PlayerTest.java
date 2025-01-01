import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    public void testPlayerInitialization()
    {
        Player player = new Player(100, 10, 10);
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(15, player.getAttack());
    }

    @Test
    public void testPlayerReductionInHealth()
    {
        Player player = new Player(100, 10, 10);
        player.reduceHealth(10);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void testPlayerDeath()
    {
        Player player = new Player(1, 5, 10);
        player.reduceHealth(1);
        assertFalse(player.isAlive());
    }
}