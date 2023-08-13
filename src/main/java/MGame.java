public class MGame {
    private int roundCnt;
    private int n;
    private Die[] dice;
    private Player[] players;
    private Board board;
    private int N = 10;

    public void playGame(){
        for(roundCnt = 0; roundCnt < N; roundCnt++){
            playRound();
        }
    }

    private void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }

    public MGame(int roundCnt) {
        this.roundCnt = roundCnt;
    }
}
