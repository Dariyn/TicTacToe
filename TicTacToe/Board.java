        public class Board {
            char[][] gameboard;
            boolean[][] available;
            public Board () {
                gameboard = new char[4][4];
                available = new boolean[4][4];
            }
            public void setTile() {
                for (int i = 0;i<4 ;i++) {
                    for (int j = 0; j<4;j++) {
                        available[i][j] = true;
                        gameboard[i][j] = '_';
                    }
                }
            }
            public void printBoard() {
                    for (int i = 0;i<4;i++) {
                        for (int j = 0;j<4;j++) {
                            System.out.print(gameboard[i][j]);
                        }
                        System.out.println();
                    }
            }
            public boolean checkTile (int x, int y, char side) {
                if (available[x][y]) {
                    available[x][y] = false;
                    gameboard[x][y] = side;
                    return true;
                }
                else {
                    System.out.println("The tile has been taken!");
                    return false;
                }
            }
            public boolean streak (char side) {
                if
                (
                ((gameboard[0][0] == side) && (gameboard[0][0] == gameboard [0][1]) && (gameboard[0][0] == gameboard [0][2]) && (gameboard [0][0] == gameboard[0][3])) ||
                ((gameboard[0][0] == side) && (gameboard[0][0] == gameboard [1][1]) && (gameboard[0][0] == gameboard [2][2]) && (gameboard [0][0] == gameboard[3][3])) ||
                ((gameboard[0][0] == side) && (gameboard[0][0] == gameboard [1][0]) && (gameboard[0][0] == gameboard [2][0]) && (gameboard [0][0] == gameboard[3][0])) ||
                ((gameboard[2][0] == side) && (gameboard[2][0] == gameboard [2][1]) && (gameboard[2][0] == gameboard [2][2]) && (gameboard [2][0] == gameboard[2][3])) ||
                ((gameboard[0][2] == side) && (gameboard[0][2] == gameboard [1][2]) && (gameboard[0][2] == gameboard [2][2]) && (gameboard [0][2] == gameboard[3][2])) ||
                ((gameboard[0][1] == side) && (gameboard[0][1] == gameboard [1][1]) && (gameboard[0][1] == gameboard [2][1]) && (gameboard [0][1] == gameboard[3][1])) ||
                ((gameboard[1][0] == side) && (gameboard[1][0] == gameboard [1][1]) && (gameboard[1][0] == gameboard [1][2]) && (gameboard [1][0] == gameboard[1][3])) ||
                ((gameboard[0][3] == side) && (gameboard[0][3] == gameboard [1][3]) && (gameboard[0][3] == gameboard [2][3]) && (gameboard [0][3] == gameboard[3][3])) || 
                ((gameboard[3][0] == side) && (gameboard[3][0] == gameboard [3][1]) && (gameboard[3][0] == gameboard [3][2]) && (gameboard [3][0] == gameboard[3][3])) || 
                ((gameboard[3][0] == side) && (gameboard[3][0] == gameboard [2][1]) && (gameboard[3][0] == gameboard [1][2]) && (gameboard [3][0] == gameboard[0][3]))
                )
                {
                    return true;
                }
                else {
                    return false;
                }
            }
        } 