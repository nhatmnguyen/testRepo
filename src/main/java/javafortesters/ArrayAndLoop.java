package javafortesters;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayAndLoop {

    /*
    Create an array of 3 users with username and password
    Do assert username at their position are correctly
    */
    @Test
    public void Array1() {
        int arrayLength = 5;
        // create a list user with 5 elements, currently all element was empty
        UserClass[] users = new UserClass[arrayLength];
        // declare a variable to get the length of array after creating
        int length = users.length;
        for (int i = 0; i < 5; i++) {
            // assign value for user by index
            users[i] = new UserClass(i, "user" + i, "password" + i);
        }

        // assert
        assertEquals("The length of array is not correct", arrayLength, length);
        // loop through the list user to compare the expected and actual value after assign element in array by constructor
        for (int i = 0; i < users.length; i++) {
            // get user by index
            UserClass user = users[i];
            // assert properties of user by index
            Assert.assertEquals(user.getUsername(), "user" + i);
            Assert.assertEquals(user.getPassword(), "password" + i);
        }

        // the other way to assert user
        int index = 0;
        for (UserClass x : users) {
            Assert.assertEquals(x.getUsername(), "user" + index);
            Assert.assertEquals(x.getPassword(), "password" + index);
            index++;
        }
    }

    /*
    Using your array of three User objects created in the previous exercise.
    Iterate over the array and System.out.println the name of each User
    */
    @Test
    public void Array2() {
        UserClass[] listUser = new UserClass[10];
        for (int i = 0; i < 10; i++) {
            listUser[i] = new UserClass(i, "user" + i, "password");
        }
        for (UserClass x : listUser) {
            System.out.println(x.getUsername());
        }
    }


    /*
    Create an @Test method which instantiates a workdays array, as shown in the examples previously.
    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    Then sort it using Arrays.sort
    Assert that the order of values in the array are as you expect.
    Create another @Test method so that the workdays have mixed case, and assert the result
    i.e. {"monday", "Tuesday", "Wednesday", "thursday", "Friday"}
    */
    @Test
    public void Array3(){
        String[] workdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        String[] sortedWorkdays = { "Friday", "Monday", "Thursday", "Tuesday", "Wednesday" };
        Arrays.sort(workdays);
        for (String i : workdays) {
            System.out.println(i);
        }
        Assert.assertEquals(workdays, sortedWorkdays, "the list is not matched");
    }


    @Test
    public void Array4(){
        String[] workdays = {"monday", "Tuesday", "Wednesday", "thursday", "Friday"};
        String[] sortedWorkdays = {"Friday", "Tuesday", "Wednesday", "monday", "thursday"};
        Arrays.sort(workdays);
        for (String i : workdays) {
            System.out.println(i);
        }
        Assert.assertEquals(workdays,sortedWorkdays);
    }

    /*
    Create an array which can hold 100 user objects.
    Use a for loop to fill the array with User objects having the following username, password combinations
    (e.g user1, password1, user2, password2...)
    Find a way to check the array was created
    For bonus points, write some code to assert that the array was filled properly
    */
    @Test
    public void Array5(){
        List<UserClass> userList = new ArrayList<>();
        for (int i = 0; i < 100 ; i += 1) {
            UserClass user = new UserClass();
            user.setUsername("Hannah" + i);
            user.setPassword("YuanHannah" + i);
            userList.add(user);
            Assert.assertEquals(userList.get(i).getUsername(),"Hannah" + i);
        }

        Assert.assertNotNull(userList,"The array is null");
    }
}
