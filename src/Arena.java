//Manages the overall fight between two players.
public class Arena
{
    private final Player player1;
    private final Player player2;

    //Starts the fight between the two players.
    public void startFight()
    {
        System.out.println("Fight starts between Player A & Player B ");
        while (player1.isAlive() && player2.isAlive())
        {
            takeTurns();
        }
        announceWinner();
    }

    private void takeTurns()
    {
        if (player1.getHealth() <= player2.getHealth())
        {
            executeRound(player1, player2);
            if (player2.isAlive())
            {
                executeRound(player2, player1);
            }
        }
        else
        {
            executeRound(player2, player1);
            if (player1.isAlive())
            {
                executeRound(player1, player2);
            }
        }
    }

    //Executes rounds between players.
    private void executeRound(Player attacker, Player defender)
    {
        Fight fight = new Fight(attacker, defender);
        fight.execute();
    }

    //Announcing the winner.
    private void announceWinner()
    {
        if (player1.isAlive())
        {
            System.out.println("Player A wins!");
        }
        else
        {
            System.out.println("Player B wins!");
        }
    }

    //Constructs an Arena with two players.
    public Arena(final Player player1, final Player player2)
    {
        this.player1 = player1;
        this.player2 = player2;
    }
}
