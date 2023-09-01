package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class ConverterTest {
    @Test
    void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert200RblThen2dot3333Euro() {
        float in = 200;
        float expected = 3.333f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}