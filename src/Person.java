public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String number;
    private String cnic;
    private String email;
    private Address address;

    public Person(String firstName, String lastName, int age, String gender, String number, String cnic, String email,
            Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.cnic = cnic;
        this.email = email;
        this.number = number;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCnic() {
        return cnic;
    }

    public String getEmail() {
        return email;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + ", Gender: " + gender
                + ", Number: " + number + ", Address: " + address + "]";
    }
}
