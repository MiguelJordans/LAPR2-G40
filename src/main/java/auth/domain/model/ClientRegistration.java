package auth.domain.model;

public class ClientRegistration {

    String name, email, sex, birthdate;
    long citizenCardNumber, phoneNumber, TINNumber, NHSNumber;

    public String getName() {
        return name;
    }

    public long getCitizenCardNumber() {
        return citizenCardNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public long getTINNumber() {
        return TINNumber;
    }

    public long getNHSNumber() {
        return NHSNumber;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

}
