package javafortesters;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotSame;

public class ConstructorExamplesTest {

    @Test
    public void TestConstructorMatch() {
        String expectedUsername = "hanhtdnguyen";
        String expectedPass = "P@sSw0rD";

        // create an object as actualUser by constructor with default value
        ConstructorExamples actualUser = new ConstructorExamples();

        // user the function get defined in ConstructorExamples the get the value of user/password
        assertEquals("Username is not correct", expectedUsername, actualUser.getUsername());
        assertEquals("Password is not correct", expectedPass, actualUser.getPassword());
    }

    @Test
    public void TestConstructorUnMatch() {
        String expectedUsername = "hanhtdnguyen1";
        String expectedPass = "P@sSw0rD1";

        ConstructorExamples actualUser = new ConstructorExamples();

        assertEquals("Username is not correct", expectedUsername, actualUser.getUsername());
        assertEquals("Password is not correct", expectedPass, actualUser.getPassword());
    }

    @Test
    public void TestConstructorUnMatchAll() {
        String expectedUsername = "hanhtdnguyen";
        String expectedPass = "P@sSw0rD1";

        ConstructorExamples actualUser = new ConstructorExamples();

        assertEquals("Username is not correct", expectedUsername, actualUser.getUsername());
        assertEquals("Password is not correct", expectedPass, actualUser.getPassword());
    }

    @Test
    public void TestConstructorUnMatchAll1() {
        String expectedUsername = "hanhtdnguyen";
        String expectedPass = "P@sSw0rD1";

        ConstructorExamples actualUser = new ConstructorExamples();

        assertEquals("Username is not correct", expectedUsername, actualUser.getUsername());
        assertNotSame("Password is correct", expectedPass, actualUser.getPassword());
    }

    @Test
    public void TestConstructorWithParams() {
        String expectedUsername = "hanhtdnguyen";
        String expectedPass = "123";

        // create an object as actualUser by constructor with default value
        ConstructorExamples actualUser = new ConstructorExamples(expectedPass);

        // user the function get defined in ConstructorExamples the get the value of user/password
        assertEquals("Username is not correct", expectedUsername, actualUser.getUsername());
        assertEquals("Password is not correct", expectedPass, actualUser.getPassword());
    }
}
