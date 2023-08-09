package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = (float) Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenConvert180RblThen3Dlr() {
        double in = 180;
        double expected = 3;
        double out = Converter.rubleToDollar(in);
        double eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}