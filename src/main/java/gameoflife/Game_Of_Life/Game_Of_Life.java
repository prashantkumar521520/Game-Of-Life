package gameoflife.Game_Of_Life;

import java.util.ArrayList;
import java.util.List;

public class Game_Of_Life {
    private final int[][] arr;
    public static int SIZE = 10;

    public Game_Of_Life(int[][] arr) {
        this.arr=arr;
    }


    public List<int[]> getNextGeneration() {
        return new ArrayList<int[]>();
    }
}
