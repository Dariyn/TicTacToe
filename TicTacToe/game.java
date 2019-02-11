import java.util.*;
public class game {
    Scanner input;
    Board player;
    public game(Scanner input, Board player) {
        this.input = input;
        this.player = player;
    }
    public boolean logic () {
        System.out.println("Welcome to Tic Tac Toe!");
        Scanner gamemode = new Scanner(System.in);
        System.out.println("1 player or 2 players? (Enter 1 or 2)");
        int game = gamemode.nextInt();
        gamemode.close();
        if (game == 1) {
            pvc vsC = new pvc(input,player);
            int turns = 0;
            while(turns<16) {
                if (turns%2 == 0){
                    turns = vsC.TileP1(turns);
                }
                else if (turns%2 == 1) {
                    turns = vsC.Tilepc(turns);
                }
            }
        }
        else if (game == 2) {
                pvp vsP = new pvp(input, player);
                int turns = 0;
                while(turns<16) {
                if (turns%2 == 0){
                    turns = vsP.TileP1(turns);
                }
                else if (turns%2 == 1) {
                    turns = vsP.TileP2(turns);
                }
            }
        }
        return true;
    }
}