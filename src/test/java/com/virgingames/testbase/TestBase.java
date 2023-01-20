package com.virgingames.testbase;

import com.virgingames.constants.Path;
import com.virgingames.utils.PropertyReader;
import com.virgingames.utils.TestUtilis;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase extends TestUtilis {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = Path.bingo;
    }
}
