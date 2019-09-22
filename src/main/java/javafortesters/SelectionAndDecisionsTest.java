package javafortesters;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SelectionAndDecisionsTest {

    public String switchStatement(String shortCode){
        // Declare a variable to receive the value in switch case condition, default is empty
        String nation = "";
        switch (shortCode){
            case "UK":
                nation = "United Kingdom";
                break;
            case "US":
            case "USA":
                nation = "United States";
                break;
            case "FR":
                nation = "France";
                break;
            case "SE":
                nation = "Sweden";
                break;
            default:
                // assign the default value if not match any case
                nation = "Rest of the world";
        }
        return nation;
    }

    @Test
    public void testSwitchStatementMatch() {
        String expected = "United States";

        String actual = switchStatement("US");

        assertEquals("Nation is un-matched", actual, expected);
    }

    @Test
    public void testSwitchStatementUnMatch() {
        String expected = "United States";

        String actual = switchStatement("USB");

        assertEquals("Nation is un-matched", actual, expected);
    }
}
