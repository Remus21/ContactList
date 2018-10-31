import java.util.Set;

public class Contact {

    private String firstName;
    private String lastName;
    private Set<PhoneNumber> contacts;

    public Contact(String firstName, String lastName, Set<PhoneNumber> contacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contacts = contacts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<PhoneNumber> getContacts() {
        return contacts;
    }
}
