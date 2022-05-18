package gameoflife;

import java.util.ArrayList;
import java.util.List;

public class Game_Of_Life {
    private final int[][] arr;
    public static int SIZE = 10;

    public Game_Of_Life(int[][] arr) {
        this.arr = arr;
    }

    public List<int[]> getNextGeneration() {
        int currentGenerationArr[][] = getCurrentGenerationArray();

        int nextGenerationArr[][] = getNextGenerationArrFrom(currentGenerationArr);
        List<int[]> resultantCoordinates = new ArrayList<>();

        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (nextGenerationArr[row][column] == 1) {
                    resultantCoordinates.add(new int[]{row, column});
                }
            }
            System.out.println();
        }

        return resultantCoordinates;
    }

    private int[][] getNextGenerationArrFrom(int[][] currentGenerationArr) {
        int initialArray[][] = getEmptyArray();

        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {

                int countOfAliveNeighbours = getCountOfAliveNeighbours(row, column, currentGenerationArr);
                if (currentGenerationArr[row][column] == 0) {

                    if (countOfAliveNeighbours == 3) initialArray[row][column] = 1;

                } else {

                    if (countOfAliveNeighbours < 2) initialArray[row][column] = 0;

                    else if (countOfAliveNeighbours > 3) initialArray[row][column] = 0;

                    else initialArray[row][column] = 1;
                }
            }
        }

        return initialArray;
    }

    private int getCountOfAliveNeighbours(int row, int column, int[][] currentGenerationArr) {
        int count = 0;

        if (row > 0 && currentGenerationArr[row - 1][column] == 1) count++;

        if (row < SIZE - 1 && currentGenerationArr[row + 1][column] == 1) count++;

        if (column > 0 && currentGenerationArr[row][column - 1] == 1) count++;

        if (column < SIZE - 1 && currentGenerationArr[row][column + 1] == 1) count++;

        if (row > 0 && column > 0 && currentGenerationArr[row - 1][column - 1] == 1) count++;

        if (row < SIZE - 1 && column < SIZE - 1 && currentGenerationArr[row + 1][column + 1] == 1) count++;

        if (row > 0 && column < SIZE - 1 && currentGenerationArr[row - 1][column + 1] == 1) count++;

        if (row < SIZE - 1 && column > 0 && currentGenerationArr[row + 1][column - 1] == 1) count++;

        return count;
    }


    private int[][] getCurrentGenerationArray() {
        int currentGenerationArr[][] = getEmptyArray();

        for (int row = 0; row < arr.length; row++)
            currentGenerationArr[arr[row][0]][arr[row][1]] = 1;

        return currentGenerationArr;
    }

    private int[][] getEmptyArray() {
        int initialArray[][] = new int[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                initialArray[row][column] = 0;
            }
        }

        return initialArray;
    }
}

