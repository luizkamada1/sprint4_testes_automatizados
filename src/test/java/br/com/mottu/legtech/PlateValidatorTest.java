package br.com.mottu.legtech;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class PlateValidatorTest {
    @Test
    void deveValidarPlacaMercosul() {
        assertThat(PlateValidator.isValid("ABC1D23")).isTrue();
        assertThat(PlateValidator.isValid("AAA0000")).isFalse();
    }
}
