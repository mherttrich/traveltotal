package de.traveltotal.domain;

/**
 * Created by micha on 19.03.15.
 */
public class User {
    private final String firstName; // required
    private final String lastName; // required
    private final String street; // optional
    private final String city; // optional
    private final String zipCode; // optional
    private final String phone; // optional
    private final int age; // optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.street = builder.street;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
        this.age = builder.age;
        this.phone = builder.phone;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String street;
        private String city;
        private String zipCode;
        private String phone;
        private int age;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder street(String street) {
            this.street = street;
            return this;
        }

        public UserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
