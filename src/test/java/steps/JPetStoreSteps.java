package steps;

import net.thucydides.core.annotations.Step;
import pages.JPetStorePages;

public class JPetStoreSteps {

    private JPetStorePages jPetStorePages;

    @Step("Given user on Welcome page")
    public void openWelcomePage() {
        jPetStorePages.openPage();
    }

    @Step("When user enters the store")
    public void enterTheStore() {
        jPetStorePages.enterTheStore();
    }

    @Step("And user goes to {0} category")
    public void openCategory(String category) {
        jPetStorePages.openCategory(category);
    }

    @Step("Then user should see available items on {0} Category page")
    public void checkIfCategoryIsOpened(String category) {
        jPetStorePages.checkIfCategoryIsOpened(category);
    }

}
