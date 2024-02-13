package org.example.designPatterns.creationalDesignPatterns.Builder;

public class Employer {
    private String firstName;
    private String lastName;
    private int entreeDate;
    private int departureDate;
    private int birthDate;
    private String department;
    private float salary;

    public Employer(String firstName, String lastName, int entreeDate, int departureDate, int birthDate, String department, float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.entreeDate = entreeDate;
        this.departureDate = departureDate;
        this.birthDate = birthDate;
        this.department = department;
        this.salary = salary;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int entreeDate;
        private int departureDate;
        private int birthDate;
        private String department;
        private float salary;

        public Builder() {
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder entreeDate(int entreeDate) {
            this.entreeDate = entreeDate;
            return this;
        }

        public Builder departureDate(int departureDate) {
            this.departureDate = departureDate;
            return this;
        }

        public Builder birthDate(int birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder salary(float salary) {
            this.salary = salary;
            return this;
        }

        public Employer build() {
            return new Employer(firstName, lastName, entreeDate, departureDate, birthDate, department, salary);
        }
    }


    // 1st Create Builder class
    // 2nd Create Setter of attributes
    // 3rd Create a constructor
    // 4th Create build method
}

