package teddo.todo.training.komakompasset.service;

import org.springframework.stereotype.Service;
import teddo.todo.training.komakompasset.model.CalculationEntry;

import java.util.ArrayList;

@Service
public class CalculationService {
    public ArrayList<CalculationEntry> getCalculations() {
        var result = new ArrayList<CalculationEntry>();

        result.add(new CalculationEntry("Flemmings havsalt", 2.0, 2.1, 54.2, 1.105));
        result.add(new CalculationEntry("Franks grå hår", 4.0, 1.1, 32.4, 1.55));
        result.add(new CalculationEntry("Fiskefrikadeller i hø", 2.4, 2.3, 34.33, 1.652));
        result.add(new CalculationEntry("En næse af ler", 3.1, 2, 44, 0.96));
        result.add(new CalculationEntry("Alt godt fra haven", 7.0, 1.1, 13.7, 1.95));
        result.add(new CalculationEntry("Mælkebøttefnug", 5.4, 3.1, 12.2, 1.43));

        return result;
    }
}
