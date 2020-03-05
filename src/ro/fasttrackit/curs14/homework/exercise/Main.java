package ro.fasttrackit.curs14.homework.exercise;

import java.io.IOException;
import java.util.List;

import static ro.fasttrackit.curs14.homework.exercise.PopulationDensityLevels.*;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryFileReader reader = new CountryFileReader();
        List<Country> countries = reader.readCountries();
        CountryStatistics statistics = new CountryStatistics(countries);
        System.out.println();
        for (Country country : statistics.findByName("ica")) {
            System.out.println(country);
        }
        printSeparator();
        for (Country country : statistics.getCountriesStartingWithLetter("n")) {
            System.out.println(country);
        }
        printSeparator();
        System.out.println(statistics.getCountryCapital("somalia"));
        printSeparator();
        System.out.println(statistics.getPopulation("uganda"));
        printSeparator();
        System.out.println(statistics.getArea("nepal"));
        printSeparator();
        System.out.println(statistics.getLargestCountry());
        printSeparator();
        System.out.println(statistics.getMostPeopleCountry());
        printSeparator();
        System.out.println(statistics.getMostDenseCountry());
        printSeparator();
        for (Country country : statistics.getCountriesForDensity(HIGH)) {
            System.out.println(country);
        }
        printSeparator();

        CountryFileWriter writer = new CountryFileWriter(countries);
        writer.writeCountries();

        CountryWriter2 writer2 = new CountryWriter2(countries);
        writer2.writeCountries();

        statistics.makeAdvanced("romania", "Jmekerie");
        statistics.makeAdvanced("france", "Biochemistry");
        statistics.makeAdvanced("uganda", "Nanotechnology");
        statistics.makeAdvanced("Poland", "Slavic science");
        statistics.printWithTechnology();
    }

    public static void printSeparator() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
