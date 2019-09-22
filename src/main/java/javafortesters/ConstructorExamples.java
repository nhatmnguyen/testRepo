package javafortesters;

public class ConstructorExamples {
    private String username;
    private String password;

    // This is default constructor
    public ConstructorExamples(){
        username = "hanhtdnguyen";
        password = "P@sSw0rD";
    }

    // This is Parameterized constructor
    public ConstructorExamples(String updatePassword){
        this.username = "hanhtdnguyen";
        this.password = updatePassword;
    }

    // This is Getter methods
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }

    // This is a Setter method
    public void setPassword(String password){
        this.password = password;
    }
}
