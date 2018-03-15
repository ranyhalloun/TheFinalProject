


public class User {

    private String UID;
    private String email;
    private String password;
    private String userName;
    private String location;



//    public void User(String UID){
//        this.UID = UID;
//    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }

    public String getPassword() {
        return password;
    }

    public String getUID() {
        return UID;
    }

    public String getUserName() {
        return userName;
    }

}

