/**
 * Created by student on 08.04.2015.
 */
public class Address {
    private String name;
    private String phone;
    private String email;

    public Address(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", Phone=" + phone + ", E-mail = " + email;
    }
}
