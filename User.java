import java.util.Date;

public class User {
    private Date birthdate;
    private int size;
    private Photo[] photos;
    private Address address; 

    public User(Date birthdate, int size, Photo[] photos, Address adress) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

    public Date getDate() {return birthdate;}
    public void setDate(Date birthdate) {this.birthdate = birthdate;}

    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}

    public Photo[] getPhoto() {return photos;}
    public void setPhoto(Photo[] photos) {this.photos = photos;}

    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}
}
