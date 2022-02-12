package furama.models;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;

    public Employee(int id, String name, String dayOfBirth, String gender, String idCard, double phoneNumber, String email, String level, String position, int salary) {
        super(id, name, dayOfBirth, gender, idCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
                this.getLevel() + "," +
                this.getPosition() + "," +
                this.getSalary();
    }
}
