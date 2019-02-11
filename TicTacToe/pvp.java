import java.util.*;
public class pvp {
    Scanner input;
    Board player;
    public pvp(Scanner input, Board player) {
        this.input = input;
        this.player = player;
    }
    public int[] getTile () {
        System.out.println("Which tile would you like to choose? (Column,Row)");
        int[] tile = new int[2];
        String in = input.nextLine();
        tile[0] = Integer.parseInt(in.substring(0,1));
        tile[1] = Integer.parseInt(in.substring(2,3));
        return tile;
    }
    public int TileP1(int turns) {
        System.out.println("Player 1's turn (X)");
        int[] x = getTile();
        char side = 'X';
        if (player.checkTile(x[0],x[1],side)) {
            player.printBoard();
            if (player.streak(side)== false){
                turns +=1;
            }
            else {
                player.printBoard();
                System.out.println("Player 1 won");
                return 16;
            }
        }
        else {
            return turns;
        }
        return turns;
    }
    public int TileP2(int turns) {
            System.out.println("Player 2's turn (O)");
            int[] x = getTile();
            char side = 'O';
            if (player.checkTile(x[0],x[1],side)) {
                player.printBoard();
                if (player.streak(side)== false){
                    turns +=1;
                }
                else {
                    player.printBoard();
                    System.out.println("Player 2 won");
                    return 16;
                }
            }
            else {
                return turns;
            }
            return turns;
    }
}

