package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JPetStorePages extends PageObject {

    @FindBy(css = "h3[data-autotest-title='loseYourConfirmMail']")
    private WebElement confirmationPopup;

    public void openPage() {
        this.openAt("https://yktomcat.azurewebsites.net/jpetstore/");
    }

    public boolean isPageOpened() {
        return true;
    }


    public void enterTheStore() {
        getDriver().findElement(By.cssSelector("a[href*='Catalog']")).click();
    }

    public void openCategory(String category) {
        getDriver()
                .findElement(By.cssSelector("#SidebarContent a[href*='" + category.toUpperCase() + "']"))
                .click();
    }

    public void checkIfCategoryIsOpened(String category) {
        getDriver()
                .findElement(By.xpath("//h2[text() = '" + category + "']"))
                .isDisplayed();
    }

}
