package gameoflife;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Game_Of_Life_Test {
    @Test
    void blockPattern() {
        Game_Of_Life game_of_life = new Game_Of_Life(new int[][]{{1, 1}, {1, 2}, {2, 1}, {2, 2}});

        List<int[]> nextGeneration = game_of_life.getNextGeneration();

        assertArrayEquals(new int[][]{{1, 1}, {1, 2}, {2, 1}, {2, 2}}, nextGeneration.toArray());
    }

    @Test
    void boatPattern() {
        Game_Of_Life game_of_life = new Game_Of_Life(new int[][]{{0, 1}, {1, 0}, {2, 1}, {0, 2}, {1, 2}});

        List<int[]> nextGeneration = game_of_life.getNextGeneration();

        assertArrayEquals(new int[][]{{0, 1}, {0, 2}, {1, 0}, {1, 2}, {2, 1}}, nextGeneration.toArray());
    }

    @Test
    void blinkerPattern() {
        Game_Of_Life game_of_life = new Game_Of_Life(new int[][]{{1, 1}, {1, 0}, {1, 2}});

        List<int[]> nextGeneration = game_of_life.getNextGeneration();

        assertArrayEquals(new int[][]{{0, 1}, {1, 1}, {2, 1}}, nextGeneration.toArray());
    }

    @Test
    void toadPattern() {
        Game_Of_Life game_of_life = new Game_Of_Life(new int[][]{{1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {2, 4}});

        List<int[]> nextGeneration = game_of_life.getNextGeneration();

        assertArrayEquals(new int[][]{{0, 2}, {1, 1}, {1, 4}, {2, 1}, {2, 4}, {3, 3}}, nextGeneration.toArray());
    }
}
