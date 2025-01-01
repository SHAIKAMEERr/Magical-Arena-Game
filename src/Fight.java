//Manages a round of attack between two players.
public class Fight
{
    private final Player attacker;
    private final Player defender;

    //Executes one round of attack.
    public void execute() {
        final int attackRoll = Dice.roll();
        final int defendRoll = Dice.roll();
        int damage = calculateDamage(attackRoll, defendRoll);
        defender.reduceHealth(damage);
        printsResult(damage);
    }

    //Calculates damage received in an attack.
    private int calculateDamage(int attackRoll, int defendRoll) {
        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defendRoll;
        return Math.max(attackDamage - defenseStrength, 0);
    }

    //Printing the result of an attack.
    private void printsResult(int damage)
    {
        System.out.println("Attacker attack  with" + attacker.getAttack() + " rolled " + damage + " damage. " +
                "Defender with strength " + defender.getStrength() + " & health " + defender.getHealth());
    }

    //Constructs a Fight between an attacker and a defender.
    public Fight(final Player attacker, final Player defender)
    {
        this.attacker = attacker;
        this.defender = defender;
    }
}
