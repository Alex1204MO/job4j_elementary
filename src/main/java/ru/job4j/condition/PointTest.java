package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


    public class PointTest {
        @Test
        void when00to20then2() {
            double expected = 2;
            int x1 = 0;
            int y1 = 0;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }

        @Test
        void when00to40then4() {
            double expected = 4;
            int x1 = 0;
            int y1 = 0;
            int x2 = 4;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }

        @Test
        void when00to60then6() {
            double expected = 6;
            int x1 = 0;
            int y1 = 0;
            int x2 = 6;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }
}
