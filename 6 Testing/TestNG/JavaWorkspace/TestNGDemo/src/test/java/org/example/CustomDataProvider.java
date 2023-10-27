package org.example;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {
                {"abc@gmail.com", "abc"},
                {"def@gmail.com", "def"},
                {"ghi@gmail.com", "ghi"}
        };
        return data;
    }
}
