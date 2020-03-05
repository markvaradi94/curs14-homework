package ro.fasttrackit.curs14.homework.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CountryWriter2 extends CountryFileWriter {

    public CountryWriter2(List<Country> countries) {
        super(countries);
    }

    @Override
    public void writeCountries() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\fasttrack\\curs14\\curs14-code\\src\\ro\\fasttrackit\\curs14\\homework\\exercise\\countriesFormat2"));
        for (Country country : getCountries()) {
            writer.write(country.getName() + " has a population of "
                    + country.getPopulation() + " on an area of "
                    + country.getArea() + " km2 and has its capital in " + country.getCapital() +".");
            writer.newLine();
        }
        writer.close();
    }
}
