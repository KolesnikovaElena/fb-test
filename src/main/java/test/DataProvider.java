package test;

import model.UserFB;

public class DataProvider {

    @com.tngtech.java.junit.dataprovider.DataProvider
    public static Object[][] validUser() {
        return new Object[][]{
                {UserFB.newEntity()
                        .withEmail("rehew@it-simple.net")
                        .withPassword("@F+rrL=zJ4kgsA").build()},
                /* ... */
        };
    }

    @com.tngtech.java.junit.dataprovider.DataProvider
    public static Object[][] invalidUser() {
        return new Object[][]{
                {UserFB.newEntity()
                        .withEmail("test@gmail.com")
                        .withPassword("qwerty").build()},
                /* ... */
        };
    }

}
