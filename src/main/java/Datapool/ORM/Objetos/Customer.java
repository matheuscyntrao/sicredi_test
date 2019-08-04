package Datapool.ORM.Objetos;

public class Customer {

    private String Name, LastName, ContactFirstName, Phone,
            AddressLine1, AddressLine2, City, State, PostalCode,
            Country, FromEmployeer;
    private int CreditLimit;

    public Customer(String name, String lastName, String contactFirstName, String phone, String addressLine1, String addressLine2, String city, String state, String postalCode, String country, String fromEmployeer, int creditLimit) {
        Name = name;
        LastName = lastName;
        ContactFirstName = contactFirstName;
        Phone = phone;
        AddressLine1 = addressLine1;
        AddressLine2 = addressLine2;
        City = city;
        State = state;
        PostalCode = postalCode;
        Country = country;
        FromEmployeer = fromEmployeer;
        CreditLimit = creditLimit;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getContactFirstName() {
        return ContactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        ContactFirstName = contactFirstName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getFromEmployeer() {
        return FromEmployeer;
    }

    public void setFromEmployeer(String fromEmployeer) {
        FromEmployeer = fromEmployeer;
    }

    public int getCreditLimit() {
        return CreditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        CreditLimit = creditLimit;
    }
}
