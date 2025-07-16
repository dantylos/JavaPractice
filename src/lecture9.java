import java.util.Scanner;

public class lecture9 {

    public static char winner;

    public static void main(String[] args) {
        char currentPlayer = 'X', otherPlayer = 'O';

        char[][] grid = { {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        while(true){
            showGrid(grid);
            getNextMove(currentPlayer, grid);
            if(isGameFinished(grid)){
                break;
            }
            char tmpPlayer = currentPlayer;
            currentPlayer = otherPlayer;
            otherPlayer = tmpPlayer;
        }
        showGrid(grid);
        if(winner == ' '){
            System.out.println("The game is draw.");
        } else {
            System.out.printf("Player %s is winner!", currentPlayer);
        }
    }

    private static boolean isGameFinished(char[][] grid) {
        if(grid[0][0] != ' ' && grid[0][0] == grid[0][1] && grid[0][0] == grid[0][2]) return true;
        if(grid[1][0] != ' ' && grid[1][0] == grid[1][1] && grid[1][0] == grid[1][2]) return true;
        if(grid[2][0] != ' ' && grid[2][0] == grid[2][1] && grid[2][0] == grid[2][2]) return true;
        if(grid[0][0] != ' ' && grid[0][0] == grid[1][0] && grid[0][0] == grid[2][0]) return true;
        if(grid[0][1] != ' ' && grid[0][1] == grid[1][1] && grid[0][1] == grid[2][1]) return true;
        if(grid[0][2] != ' ' && grid[0][2] == grid[1][2] && grid[0][2] == grid[2][2]) return true;
        if(grid[0][0] != ' ' && grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2]) return true;
        if(grid[0][2] != ' ' && grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0]) return true;


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(grid[i][j] == ' '){
                    return false;
                }
            }
        }
        winner = ' ';
        return true;

    }

    private static void getNextMove(char currentPlayer, char[][] grid) {
        while(true){
            System.out.printf("Player %s, what is your next move? ", currentPlayer);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(input.length() != 2){
                continue;
            }
            if(input.charAt(0) != 'A' && input.charAt(0) != 'B' && input.charAt(0) != 'C'){
                continue;
            }
            if(input.charAt(1) != '1' && input.charAt(1) != '2' && input.charAt(1) != '3'){
                continue;
            }
            int line = 0;
            int column = switch (input.charAt(0)) {
                case 'B' -> 1;
                case 'C' -> 2;
                default -> 0;
            };
            line = switch (input.charAt(1)) {
                case '1' -> 0;
                case '2' -> 1;
                case '3' -> 2;
                default -> line;
            };
            if(grid[line][column] != ' '){
                continue;
            }
            grid[line][column] = currentPlayer;
            break;
        }
    }

    private static void showGrid(char[][] grid) {
        System.out.println("   A B C");
        System.out.println("  -------");
        System.out.printf("1 |%s|%s|%s|\n", grid[0][0], grid[0][1], grid[0][2]);
        System.out.println("  -------");
        System.out.printf("2 |%s|%s|%s|\n", grid[1][0], grid[1][1], grid[1][2]);
        System.out.println("  -------");
        System.out.printf("3 |%s|%s|%s|\n", grid[2][0], grid[2][1], grid[2][2]);
        System.out.println("  -------");
    }
}
/*
   A B C
  -------
1 | | | |
  -------
2 | | | |
  -------
3 | | | |
  -------

 */