import java.util.*;
 public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Board player = new Board();
        game gamelogic = new game(input,player);
        player.setTile();
        gamelogic.logic();
    }
 }