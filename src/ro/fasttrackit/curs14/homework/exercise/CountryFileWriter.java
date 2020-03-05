package ro.fasttrackit.curs14.homework.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryFileWriter {
    private final List<Country> countries;

    public CountryFileWriter(List<Country> countries) {
        this.countries = new ArrayList<>(countries == null ? new ArrayList<>() : countries);
    }

    public void writeCountries() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\fasttrack\\curs14\\curs14-code\\src\\ro\\fasttrackit\\curs14\\homework\\exercise\\countriesFormat1"));
        for (Country country : this.countries) {
            writer.write("The country of " + country.getName() + " has capital in " + country.getCapital()
                    + " with a population of " + country.getPopulation()
                    + " on an area of " + country.getArea() + " km2.");
            writer.newLine();
        }
        writer.close();
    }

    public List<Country> getCountries() {
        return countries;
    }
}
