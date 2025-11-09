package br.com.mottu.legtech;
public class StatusService {
    public String updateStatus(String novoStatus, Long zonaId) {
        if ("em_manutencao".equals(novoStatus) && zonaId == null) {
            throw new IllegalArgumentException("Zona obrigatória para status 'em_manutencao'");
        }
        return novoStatus;
    }
}
