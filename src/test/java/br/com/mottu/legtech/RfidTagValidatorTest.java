package br.com.mottu.legtech;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class RfidTagValidatorTest {
    @Test
    void deveValidarTagRfidDoPadraoOperacional() {
        assertThat(RfidTagValidator.isValid("TAG-9001")).isTrue();
        assertThat(RfidTagValidator.isValid("tag-9001")).isTrue(); // case-insensitive / trim
        assertThat(RfidTagValidator.isValid("TAG-90A1")).isFalse();
        assertThat(RfidTagValidator.isValid("TAG-123")).isFalse();
        assertThat(RfidTagValidator.isValid(null)).isFalse();
    }
}
