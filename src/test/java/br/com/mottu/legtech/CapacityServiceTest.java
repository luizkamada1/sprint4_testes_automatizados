package br.com.mottu.legtech;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class CapacityServiceTest {
    @Test
    void devePermitirCapacidadeDaZonaMenorOuIgualAoPatio() {
        CapacityService svc = new CapacityService();
        assertThat(svc.isZoneCapacityAllowed(120, 250)).isTrue();
        assertThat(svc.isZoneCapacityAllowed(300, 250)).isFalse();
    }
}
