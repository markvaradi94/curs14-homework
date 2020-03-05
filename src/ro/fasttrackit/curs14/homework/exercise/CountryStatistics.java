package ro.fasttrackit.curs14.homework.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static ro.fasttrackit.curs14.homework.exercise.PopulationDensityLevels.*;

public class CountryStatistics {
    private List<Country> countries;

    public CountryStatistics(List<Country> countries) {
        this.countries = new ArrayList<>(countries == null ? new ArrayList<>() : countries);
    }

    public List<Country> findByName(String partialName) {
        List<Country> result = new ArrayList<>();
        for (Country country : this.countries) {
            if (country.getName().toLowerCase().contains(partialName.toLowerCase())) {
                result.add(country);
            }
        }
        return result;
    }

    public List<Country> getAllCountries() {
        return countries;
    }

    public List<Country> getCountriesStartingWithLetter(String letter) {
        List<Country> result = new ArrayList<>();
        for (Country country : this.countries) {
            if (country.getName().toLowerCase().charAt(0) == letter.toLowerCase().charAt(0)) {
                result.add(country);
            }
        }
        return result;
    }

    private Country getCountryByName(String countryName) {
        for (Country country : this.countries) {
            if (country.getName().toLowerCase().equals(countryName.toLowerCase())) {
                return country;
            }
        }
        return null;
    }

    public String getCountryCapital(String countryName) {
        return "The capital of " + Objects.requireNonNull(getCountryByName(countryName)).getName() + " is " + Objects.requireNonNull(getCountryByName(countryName)).getCapital();
    }

    public long getPopulation(String countryName) {
        return Objects.requireNonNull(getCountryByName(countryName)).getPopulation();
    }

    public long getArea(String countryName) {
        return Objects.requireNonNull(getCountryByName(countryName)).getArea();
    }

    private Country getCountryByArea(long area) {
        for (Country country : this.countries) {
            if (country.getArea() == area) {
                return country;
            }
        }
        return null;
    }

    public Country getLargestCountry() {
        long largestArea = Long.MIN_VALUE;
        for (Country country : this.countries) {
            if (country.getArea() > largestArea) {
                largestArea = country.getArea();
            }
        }
        return getCountryByArea(largestArea);
    }

    private Country getCountryByPopulation(long population) {
        for (Country country : this.countries) {
            if (country.getPopulation() == population) {
                return country;
            }
        }
        return null;
    }

    public Country getMostPeopleCountry() {
        long largestPopulation = Long.MIN_VALUE;
        for (Country country : this.countries) {
            if (country.getPopulation() > largestPopulation) {
                largestPopulation = country.getPopulation();
            }
        }
        return getCountryByPopulation(largestPopulation);
    }

    private List<Country> getHighDensityCountries() {
        List<Country> result = new ArrayList<>();
        for (Country country : this.countries) {
            if (country.getDensity().equals(HIGH)) {
                result.add(country);
            }
        }
        return result;
    }

    private Country getCountryByDensity(long density) {
        for (Country country : getHighDensityCountries()) {
            if (country.getPopulation() / (country.getArea() == 0 ? 1 : country.getArea()) == density) {
                return country;
            }
        }
        return null;
    }

    public Country getMostDenseCountry() {
        long largestDensity = Long.MIN_VALUE;
        for (Country country : getHighDensityCountries()) {
            long density = country.getPopulation() / (country.getArea() == 0 ? 1 : country.getArea());
            if (density > largestDensity) {
                largestDensity = density;
            }
        }
        return getCountryByDensity(largestDensity);
    }

    public List<Country> getCountriesForDensity(PopulationDensityLevels densityLevel) {
        List<Country> result = new ArrayList<>();
        for (Country country : this.countries) {
            if (country.getDensity().equals(densityLevel)) {
                result.add(country);
            }
        }
        return result;
    }

    private int getCountryPosition(String countryName) {
        return this.countries.indexOf(getCountryByName(countryName));
    }

    public void makeAdvanced(String countryName, String technology) {
        Country country = getCountryByName(countryName);
        assert country != null;
        Country advancedCountry = new AdvancedCountry(technology, country.getCapital(), country.getPopulation(), country.getArea(), technology);
        this.countries.set(getCountryPosition(countryName), advancedCountry);
    }

    public void printWithTechnology() {
        for (Country country : this.countries) {
            if (country instanceof AdvancedCountry) {
                System.out.println(country);
            }
        }
    }

}
