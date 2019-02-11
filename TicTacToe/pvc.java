import java.util.*;
import java.lang.Math;
import java.lang.Double;
public class pvc {
    Scanner input;
    Board player;
    public pvc(Scanner input, Board player) {
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
        char side = 'x';
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
    public int Tilepc(int turns) {
        int[] tile = new int[2];
        tile[0] = (int)(Math.random()*3);
        tile[1] = (int)(Math.random()*3);
        char side = 'o';
        if (player.checkTile(tile[0],tile[1],side)) {
            player.printBoard();
            if (player.streak(side)== false){
                turns +=1;
            }
            else {
                player.printBoard();
                System.out.println("Computer won");
                return 16;
            }
        }
        else {
            return turns;
        }
        return turns;
    }
}