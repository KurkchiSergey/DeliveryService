import java.util.Objects;

public class Address {
    private String city;
    private String country;

    public Address(String country, String city) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(country, address.country) &&
                Objects.equals(city, address.city);

    }


}

