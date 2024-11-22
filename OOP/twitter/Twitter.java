package CSC1350_Fall24.OOP.twitter;

public class Twitter {
    private String userName;
    private String name;
    private String email;
    private int phoneNumber;

    public Twitter(String userName, String name, String email, int phoneNumber) {
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void print(){
        System.out.println(userName + " " + email);
    }
}
