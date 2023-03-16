package ss4.thucHanh.TH1.model;

import java.util.Date;

public class Employee {

    private String id;

    private String name;

    private String contactNumber;

    private Date birth;

    public Date getBirth() {
        return birth;
    }

    public Employee(String id, String name, String contactNumber, Date birth) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.birth = birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Employee() {
    }

    public Employee(String id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
