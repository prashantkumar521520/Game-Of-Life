package gameoflife;

import gameoflife.Game_Of_Life.Game_Of_Life;
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
}
