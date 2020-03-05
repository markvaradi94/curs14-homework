package ro.fasttrackit.curs14.palindrome;

import ro.fasttrackit.curs14.palindrome.countries.Country;
import ro.fasttrackit.curs14.palindrome.countries.CountryFileReader;
import ro.fasttrackit.curs14.palindrome.countries.CountryStatistics;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CountryFileReader reader = new CountryFileReader();
        reader.readCountries();
        for (Country country : reader.readCountries()) {
            System.out.println(country);
        }
        List<Country> countries = reader.readCountries();
        CountryStatistics countryStatistics = new CountryStatistics(countries);
        System.out.println();
        System.out.println(countryStatistics.findByName("rom"));
    }


}
