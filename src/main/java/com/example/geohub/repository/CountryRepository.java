import com.example.geohub.repository
import com.example.geohub.Country;

import java.util.ArrayList;

public interface CountryRepository {
    ArrayList<Country> getCountries();
    Country getCountry(int countryId);
    Country addCountry(Country country);
    Country updateCountry(int countryId,Country country);
    void deleteCountry(int countryId);
}

