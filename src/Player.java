//Creating a Player class.
public class Player
{
    //Declaring strength and attack as final so, It cannot be modified by user once it gets declare.
    private int health;
    private final int strength;
    private final int attack;

    //Checks if the player is alive.
    public boolean isAlive()
    {
        return this.health > 0;
    }

    //Returns the health of the player.
    public int getHealth()
    {
        return health;
    }

    //Reduces the health of the player by the specified damage.
    public void reduceHealth(final int damage)
    {
        this.health = Math.max(this.health - damage, 0);
    }

    //Returns the strength of the player.
    public int getStrength()
    {
        return strength;
    }

    //Returns the attack power of the player.
    public int getAttack()
    {
        return attack;
    }

    //Creating a Constructor for the Player class.
    public Player(final int health, final int strength, final int attack)
    {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }
}
