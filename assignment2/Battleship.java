import java.io.File;
import java.util.Locale;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;

public class Battleship {

    public static char[][] initBoard(int n) {
        // YOUR CODE BELOW: initializes a board of size n * n
        char[][] res = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++)
                res[i][j] = '~';

        }
        return res;
    }

    public static void printBoard(int playerTurn, char[][] board,
        int hitsLeft) {
        // YOUR CODE BELOW: prints the board and player information
        //  (as in the example output)
        System.out.println("Player " + playerTurn + " (" + hitsLeft+" hits left):");

        for(int i = 0; i< board.length; i++){
            for(int j = 0; j < board[0].length; j++)
                System.out.print(board[i][j]);

            System.out.println("");
        }
    }

    public static int fireMissile(char[][] board, String target,
        String[] shipLocations, int hitsLeft) {
        // YOUR CODE BELOW: updates the board given the missile
        //  target and returns if a ship is hit
        int[] location = convertLocation(target);
        if (isShip(target, shipLocations))
            board[location[0]][location[1]] = 'x';
        else
        board[location[0]][location[1]] = '0';


        return hitsLeft -1;
    }

    public static boolean isShip(String target, String[] shipLocations) {
        // YOUR CODE BELOW: returns if location is ship
        for (String s:shipLocations ){
            if (s.equalsIgnoreCase(target))
                return true;

        }

        return false;
    }

    public static int[] convertLocation(String coordinate) {
        // YOUR CODE BELOW: returns the integer indices corresponding
        //  with the coordinate string
        int[] res = new int[2];
        coordinate = coordinate.toLowerCase();
        res[0] = coordinate.charAt(0) - 'a'+1;
        res[1] = Integer.valueOf(coordinate.charAt(1));
        return res;
    }

    public static void main(String[] args) {
        int fileInd = (args.length > 0) ? Integer.parseInt(args[0])
            : new Random().nextInt(4);

        String filename = "game" + fileInd + ".txt";

        try {
            Scanner fileReader = new Scanner(new File(filename));
            Scanner inputScanner = new Scanner(System.in);
            // YOUR CODE BELOW: carries out the execution of the game
            //  using the methods defined above

            File file = new File(inputScanner.nextLine());

            inputScanner = new Scanner(file);


            while (inputScanner.hasNextLine()) {
                String line = inputScanner.nextLine();
                System.out.println(line);
            }
            inputScanner.close();


        } catch (FileNotFoundException e) {
            System.out.println("Make sure that " + filename
                + " is in the current directory!");
        }





    }
}