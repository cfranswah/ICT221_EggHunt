package egghunt.engine;
import java.util.Arrays;



public class GameEngine {
    private GameEngine gameEngine;
    /**
     * An example board to store the current game state.
     *
     * Note: depending on your game, you might want to change this from 'int' to String or something?
     */
    private int[][] map;

    /**
     * Creates a square game board.
     *
     * @param size the width and height.
     */
    public GameEngine(int size) {
        map = new int[size][size];
    }

    /**
     * The size of the current game.
     *
     * @return this is both the width and the height.
     */

    public int getSize() {

        return map.length;

    }

    public void setup() {
        gameEngine = new GameEngine(10);

    }

    public void generateGrid() {
        for (int[] row : map) {
            Arrays.fill(row, 0);
        }
    }

    public void displayGrid() {
        for (int[] row : map) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    /**
     * Plays a text-based game
     */
    public static void main(String[] args) {
        GameEngine engine = new GameEngine(10);
        engine.generateGrid();
        engine.displayGrid();
        System.out.printf("The size of map is %d * %d\n", engine.getSize(), engine.getSize());
    }
}
