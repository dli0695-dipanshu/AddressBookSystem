public class Contacts
{
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long number;
    String email;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public long getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  public String toString(){
        return firstName+" "+lastName+" "+address+" "+city+" "+state+" "+zip+" "+number+" "+email;

  }



}
