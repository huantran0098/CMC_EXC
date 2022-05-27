package BackEnd.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthors;
    private String firstNameAuthor;
    private String lastNameAuthor;
    private int yearOfBirth;
    private String description;
    private String websiteAuthor;
    private String organization;

    public Authors() {
    }

    public Authors(Long idAuthors, String firstNameAuthor, String lastNameAuthor, int yearOfBirth, String description, String websiteAuthor, String organization) {
        this.idAuthors = idAuthors;
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
        this.yearOfBirth = yearOfBirth;
        this.description = description;
        this.websiteAuthor = websiteAuthor;
        this.organization = organization;
    }

    public Long getIdAuthors() {
        return idAuthors;
    }

    public void setIdAuthors(Long idAuthors) {
        this.idAuthors = idAuthors;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public void setFirstNameAuthor(String firstName) {
        this.firstNameAuthor = firstName;
    }

    public String getLastNameAuthor() {
        return lastNameAuthor;
    }

    public void setLastNameAuthor(String lastName) {
        this.lastNameAuthor = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsiteAuthor() {
        return websiteAuthor;
    }

    public void setWebsiteAuthor(String website) {
        this.websiteAuthor = website;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
