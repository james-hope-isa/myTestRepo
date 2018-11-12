package pl.infoshare.Quatro;

import java.time.LocalDate;

public class Pracownik {

    private LocalDate dateOfBirth;
    private String name;
    private String lastName;
    private String department;

    public Pracownik(LocalDate dateOfBirth, String name, String lastName, String department) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }
}
