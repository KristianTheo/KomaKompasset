package teddo.todo.training.komakompasset.model;

import lombok.*;

@Data
public class CalculationEntry {
    public String entryName;
    public double entryValue1;
    public double entryValue2;
    public double entryValue3;
    public double entryMultiplier;
    public String unit;

    public CalculationEntry(String entryName, double val1, double val2, double val3, double entryMultiplier, String unit) {
        this.entryName = entryName;
        this.entryValue1 = val1;
        this.entryValue2 = val2;
        this.entryValue3 = val3;
        this.entryMultiplier = entryMultiplier;
        this.unit = unit;
    }
}
