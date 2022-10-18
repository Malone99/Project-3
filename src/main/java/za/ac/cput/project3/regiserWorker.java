
package za.ac.cput.project3;


public class regiserWorker {
    
    private int    StudentNumber;
    private String firstName;
    private String lastname;
    private String Email;
    private String Password;
    private String Mobile;
    private String gender;
    private String address;  
    private String country;  

    public regiserWorker( String firstName, String lastname, String Email, String Password, String Mobile, String gender, String address, String country) {
        this.StudentNumber = StudentNumber;
        this.firstName = firstName;
        this.lastname = lastname;
        this.Email = Email;
        this.Password = Password;
        this.Mobile = Mobile;
        this.gender = gender;
        this.address = address;
        this.country = country;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "regiserWorker{" + "StudentNumber=" + StudentNumber + ", firstName=" + firstName + ", lastname=" + lastname + ", Email=" + Email + ", Password=" + Password + ", Mobile=" + Mobile + ", gender=" + gender + ", address=" + address + ", country=" + country + '}';
    }
    
}
