package de.traveltotal.domain;

/**
 * Created by micha on 19.03.15.
 */
public class User {
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String street; // optional
    private final String city; // optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.street = builder.street;
        this.city = builder.city;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getStreet() {
        return street;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String street;
        private String city;
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
