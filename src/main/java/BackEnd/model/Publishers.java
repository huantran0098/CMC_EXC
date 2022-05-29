package BackEnd.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "publishers")
public class Publishers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPublisher;
    @NotNull
    private String namePublisher;
    private String websitePublisher;
    @NotNull
    private String founderName;
    private int foundedYear;
    @NotNull
    private String addressPublisher;

    public Publishers() {
    }

    public Publishers(Long idPublisher, String namePublisher, String websitePublisher, String founderName, int foundedYear, String addressPublisher) {
        this.idPublisher = idPublisher;
        this.namePublisher = namePublisher;
        this.websitePublisher = websitePublisher;
        this.founderName = founderName;
        this.foundedYear = foundedYear;
        this.addressPublisher = addressPublisher;
    }

    public Long getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(Long idPublisher) {
        this.idPublisher = idPublisher;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    public String getWebsitePublisher() {
        return websitePublisher;
    }

    public void setWebsitePublisher(String websitePublisher) {
        this.websitePublisher = websitePublisher;
    }

    public String getFounderName() {
        return founderName;
    }

    public void setFounderName(String founderName) {
        this.founderName = founderName;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getAddressPublisher() {
        return addressPublisher;
    }

    public void setAddressPublisher(String address) {
        this.addressPublisher = address;
    }
}
