public class Address {
    private String street;
    private String number;
    private String postalCode;
    private String city;
    private String country;

    public Address(String st, String no, String pc, String ci, String co)
    {
        street = st;
        number = no;
        postalCode = pc;
        city = ci;
        country = co;
    }

    public void setAddress(String st, String no, String pc, String ci, String co)
    {
        street = st;
        number = no;
        postalCode = pc;
        city = ci;
        country = co;
    }

    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getNumber() {
        return number;
    }
    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String toString()
    {
        return street + " " + number + " " + postalCode + " " + city + " " + country;
    }
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Address))
        {
            return false;
        }
        else
        {
            Address other = (Address) obj;
            return other.equals(street) &&
                    other.equals(number) &&
                    other.equals(postalCode) &&
                    other.equals(city) &&
                    other.equals(country);

        }
    }
}
