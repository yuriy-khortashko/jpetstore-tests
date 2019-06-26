package tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.JPetStoreSteps;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
@Concurrent
public class JPetStoreTests {

    private String category;

    public JPetStoreTests(String category) {
        this.category = category;
    }

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(
                new Object[][]{{"Fish"}, {"Dogs"}, {"Reptiles"}, {"Cats"}, {"Birds"}});
    }

    @Managed(driver = "chrome")
    WebDriver chromeDriver;

    @Steps
    JPetStoreSteps jPetStoreSteps;

    @Test
    public void testCategory() {
        jPetStoreSteps.openWelcomePage();
        jPetStoreSteps.enterTheStore();
        jPetStoreSteps.openCategory(category);
        jPetStoreSteps.checkIfCategoryIsOpened(category);
    }

}
