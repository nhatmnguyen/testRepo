package javafortesters;

public class UserClass {
    // declare the properties of UserClass: id, username, password
    private int id;
    private String username;
    private String password;

    // due to all properties of UserClass was private so can not get/set value from the outside
    // the next functions were declared to get/set value for them
    // get the username
    public String getUsername() {
        return username;
    }

    // set the username
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()<7){
            throw new IllegalArgumentException("Password must be > 6 chars");
        }
        /*
        Add the regular expression checks to the setPassword method on User so that an IllegalPassword
        exception is thrown if the password does not contain a digit, or does not contain an upper case letter.
         */
        String pattern = "((?=.*[A-Z])(?=.*\\d).*)";
        if (password.matches(pattern)) {
            this.password = password;
        }
        else {
            throw new IllegalArgumentException("Password must contain at least 1 upper case letter and 1 digit");
        }
    }

    public int getId() {
        return id;
    }

    public void setAge(int id) {
        this.id = id;
    }

    // Constructor to create a new user without params
    public UserClass(){
        this.id = 100;
        this.username = "auto";
        this.password = "auto";
    }

    // Constructor to create a new user with params
    public UserClass(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

}
