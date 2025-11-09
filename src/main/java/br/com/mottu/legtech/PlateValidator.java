package br.com.mottu.legtech;
import java.util.regex.Pattern;
public class PlateValidator {
    // Padrão Mercosul simplificado: AAA1A23 ou ABC1D23
    private static final Pattern PLATE_PATTERN = Pattern.compile("^[A-Z]{3}[0-9][A-Z][0-9]{2}$");
    public static boolean isValid(String placa) {
        if (placa == null) return false;
        return PLATE_PATTERN.matcher(placa).matches();
    }
}
