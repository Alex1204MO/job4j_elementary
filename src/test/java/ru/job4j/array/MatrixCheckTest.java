package ru.job4j.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertFalse(result);
    }
}
