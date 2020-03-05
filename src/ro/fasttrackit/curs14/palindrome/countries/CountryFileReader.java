package ro.fasttrackit.curs14.palindrome.countries;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryFileReader {

    public List<Country> readCountries() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("C:\\fasttrack\\curs14\\curs14-code\\src\\ro\\fasttrackit\\curs14\\palindrome\\countries\\countries.txt"));
        List<Country> result = new ArrayList<>();
        while (scanner.hasNextLine()) {
            result.add(readCountry(scanner.nextLine()));
        }
        return result;
    }

    public Country readCountry(String line) {
        String[] data = line.split("[|]");
        return new Country(data[0], data[1], Long.parseLong(data[2]), Long.parseLong(data[3]));
    }


}
