import com.example.geohub.model;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class country{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "countryid")
    private int countryId;
    @Column(name = "countryname")
    private String countryName;
    @Column(name = "currency")
    private String currency;
    @Column(name = "population")
    private long population;
    @Column(name = "latitude")
    private String latitude;
    @Column(name = "longitude")
    private String longitude;

    public Country(){}

    public int getCountryId(){
        return countryId;
    }
    public void setCountryId(int countryId){
        this.countryId = countryId;
    }

    public String getCountryName(){
        return countryName;
    }
    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public String getCurrency(){
        return currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }
    public long getPopulation(){
        return population;
    }
    public void setPopulation(long population){
        this.population = population;
    }

    public String getLatitude(){
        return latitude;
    }
    public void setLatitude(String latitude){
        this.latitude = latitude;
    }

    public String getLongtitude(){
        return longitude;
    }
    public setLongitude(String longitude){
        this.longitude = longitude;
        
    }
}