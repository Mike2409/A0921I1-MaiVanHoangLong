package furama.models;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public Customer(int id, String name, String dayOfBirth, String gender, String idCard, double phoneNumber, String email, String typeCustomer, String address) {
        super(id, name, dayOfBirth, gender, idCard, phoneNumber, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.getId() + "," +
                this.getName() + "," +
                this.getDayOfBirth() + "," +
                this.getGender() + "," +
                this.getIdCard() + "," +
                this.getPhoneNumber() + "," +
                this.getEmail() + "," +
                this.getTypeCustomer() + "," +
                this.getAddress();
    }
}
