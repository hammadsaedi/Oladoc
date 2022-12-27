public class Address {
    private int houseNo;
    private int streetNo;
    private String area;
    private String city;
    private String country;

    public Address(int houseNo, int streetNo, String area, String city, String country) {
        this.houseNo = houseNo;
        this.streetNo = streetNo;
        this.area = area;
        this.city = city;
        this.country = country;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [House No: " + houseNo + ", Street No: " + streetNo + ", Area: " + area + ", City: " + city
                + ", Country: " + country + "]";
    }
}
