package steps;

import net.thucydides.core.annotations.Step;
import pages.JPetStorePages;

public class JPetStoreSteps {

    private JPetStorePages jPetStorePages;

    @Step("Open Welcome page")
    public void openWelcomePage() {
        jPetStorePages.openPage();
    }

    @Step("EnterTheStore")
    public void enterTheStore() {
        jPetStorePages.enterTheStore();
    }

    @Step("Open {0} category")
    public void openCategory(String category) {
        jPetStorePages.openCategory(category);
    }

    @Step("Check that {0} category is opened")
    public void checkIfCategoryIsOpened(String category) {
        jPetStorePages.checkIfCategoryIsOpened(category);
    }

}
