package entities;

import java.util.ArrayList;
import java.util.List;

public class Validate {
    
    List<String> validation = new ArrayList<>();
    
    public void emailInCache(String email) {
        validation.add(email);
    }
    
    public Boolean verify(String email) {
        for (String item : validation) {
            if (item.equalsIgnoreCase(email)) {
                return true; // Retorna true se encontrar um email correspondente
            }
        }
        return false; // Retorna false se não encontrar nenhum email correspondente
    }
}

