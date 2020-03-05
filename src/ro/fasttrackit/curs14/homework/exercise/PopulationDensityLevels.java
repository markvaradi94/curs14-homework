package ro.fasttrackit.curs14.homework.exercise;

public enum PopulationDensityLevels {
    HIGH,
    AVERAGE,
    LOW;

    public static PopulationDensityLevels calculateDensity(long density) {
        if (density >= 1000) {
            return HIGH;
        } else if (density < 200) {
            return LOW;
        } else {
            return AVERAGE;
        }
    }
}
