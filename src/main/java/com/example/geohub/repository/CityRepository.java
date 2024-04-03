import com.example.geohub.repository;

import com.example.geohub.City;
import com.example.geohub.Country;

import java.util.ArrayList;

public interface CityRepository {
    ArrayList<City> getCities();

    City getCityById(int cityId);

    City addCityById(City city);

    City updateCity(int cityId, City city);

    void deleteCity(int cityId);

    Country getCity;
}
