package ro.fasttrackit.curs14.palindrome.countries;

import java.util.Objects;

public class Country {
    private String name;
    private String capital;
    private long population;
    private long surfaceArea;
    private final PopulationDensityLevels populationDensityLevels;

    public Country(String name, String capital, long population, long surfaceArea) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.surfaceArea = surfaceArea;
        this.populationDensityLevels = PopulationDensityLevels.calculateDensity(population / (surfaceArea == 0 ? 1 : surfaceArea));
    }

    public String getName() {
        return name;
    }

    public PopulationDensityLevels getPopulationDensityLevels() {
        return populationDensityLevels;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public long getSurfaceArea() {
        return surfaceArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return population == country.population &&
                surfaceArea == country.surfaceArea &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital) &&
                populationDensityLevels == country.populationDensityLevels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, population, surfaceArea, populationDensityLevels);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name = " + name +
                ", capital = " + capital +
                ", population = " + population +
                ", surfaceArea = " + surfaceArea +
                ", populationDensityLevels = " + populationDensityLevels +
                '}';
    }
}
