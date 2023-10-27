package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String email, String password) {
        System.out.println(email + " " + password);
    }

//    @DataProvider(name = "LoginDataProvider")
//    public Object[][] getData() {
//        Object[][] data = {
//                {"abc@gmail.com", "abc"},
//                {"def@gmail.com", "def"},
//                {"ghi@gmail.com", "ghi"}
//        };
//        return data;
//    }
}
