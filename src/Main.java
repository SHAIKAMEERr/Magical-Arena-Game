public class Main
{
    public static void main(String[] args)
    {
        Player playerA=new Player(100,10,5);
        Player playerB=new Player(50,10,5);
        Arena arena=new Arena(playerA, playerB);
        arena.startFight();
    }
}