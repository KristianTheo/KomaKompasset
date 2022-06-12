package teddo.todo.training.komakompasset.model;

import lombok.*;

@Data
public class CalculationEntry {
    public String entryName;
    public double entryValue1;
    public double entryValue2;
    public double entryValue3;
    public double entryMultiplier;

    public CalculationEntry(String entryName, double val1, double val2, double val3, double entryMultiplier) {
        this.entryName = entryName;
        this.entryValue1 = val1;
        this.entryValue2 = val2;
        this.entryValue3 = val3;
        this.entryMultiplier = entryMultiplier;
    }
}
