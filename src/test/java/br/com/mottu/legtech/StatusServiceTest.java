package br.com.mottu.legtech;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;
public class StatusServiceTest {
    @Test
    void deveExigirZonaQuandoStatusEmManutencao() {
        StatusService svc = new StatusService();
        assertThatThrownBy(() -> svc.updateStatus("em_manutencao", null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Zona obrigatória");
        // Cenário válido também passa
        assertThat(svc.updateStatus("em_manutencao", 2005L)).isEqualTo("em_manutencao");
    }
}
