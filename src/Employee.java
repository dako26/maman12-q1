public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final DateOfBirth dateOfBirth;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, DateOfBirth dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dateOfBirth = dateOfBirth;
    }

    // return first name
    public String getFirstName() {
        return firstName;
    }

    // return last name
    public String getLastName() {
        return lastName;
    }

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s \ndate of birth: %s", getFirstName(), getLastName(), getSocialSecurityNumber(), dateOfBirth);
    }

    public abstract double earnings();
}
