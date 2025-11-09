package br.com.mottu.legtech;
import java.util.regex.Pattern;
/** Valida o padrão de tag RFID da operação (ex.: TAG-9001). */
public class RfidTagValidator {
    private static final Pattern PATTERN = Pattern.compile("^TAG-[0-9]{4}$");
    public static boolean isValid(String tag) {
        if (tag == null) return false;
        return PATTERN.matcher(tag.trim().toUpperCase()).matches();
    }
}
