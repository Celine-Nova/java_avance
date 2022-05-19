package jdbc;

public class Clients {

    private int id;
    private String companyName;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private int ZicCopde;
    private String city;
    private  String Country;
    private byte state;



    public Clients(int id, String companyName, String firstName, String lastName, String email,String phone, String address, int zicCopde, String city, String country, byte state) {
        this.id = id;
        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.ZicCopde = zicCopde;
        this.city = city;
        this.Country = country;
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddresse() {
        return address;
    }

    public void setAddresse(String addresse) {
        this.address = addresse;
    }

    public int getZicCopde() {
        return ZicCopde;
    }

    public void setZicCopde(int zicCopde) {
        ZicCopde = zicCopde;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", ZicCopde=" + ZicCopde +
                ", city='" + city + '\'' +
                ", Country='" + Country + '\'' +
                ", state=" + state +
                '}';
    }
}
