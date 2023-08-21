package entities;

import java.text.Normalizer;

public class StringTreater {
    public static String stringRegulator(String input) {
        input = input.toLowerCase(); // Corrigir para atribuir o resultado
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll("[^\\p{ASCII}]", "");
    }
}
