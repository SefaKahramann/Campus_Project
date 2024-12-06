package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import pages.TopNav;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.List;

public class FinanceSubmenuAccess {
    DialogContent dialogContentElement=new DialogContent();
    TopNav topNavElement=new TopNav();

    @And("The user clicks on the Hamburger menu")
    public void theUserClicksOnTheHamburgerMenu() {
        topNavElement.myClick(topNavElement.hamburgerMenu);
    }

    @Then("The user views the submenus in the Hamburger menu")
    public void theUserViewsTheSubmenusInTheHamburgerMenu() {
        List<WebElement> menuItems = topNavElement.hamburgerMenuSubmenus;

        for (WebElement menuItem : menuItems) {
            if (menuItem.isDisplayed()) {
                System.out.println(menuItem.getText());
            }
        }
    }

    @And("The user hovers over the Finance button in the Hamburger menu")
    public void theUserHoversOverTheFinanceButtonInTheHamburgerMenu() {
        dialogContentElement.hoverOver(topNavElement.financeButton);
    }

    @Then("The user views the My Finance submenu")
    public void theUserViewsTheMyFinanceSubmenu() {
        Assert.assertTrue(topNavElement.myFinanceButton.isDisplayed());
    }

    @When("The user clicks the My Finance button")
    public void theUserClicksTheMyFinanceButton() {
        topNavElement.wait.until(ExpectedConditions.elementToBeClickable(topNavElement.myFinanceButton));
        topNavElement.myClick(topNavElement.myFinanceButton);
    }

    @Then("The user checks that they are redirected to the My Finance page")
    public void theUserChecksThatTheyAreRedirectedToTheMyFinancePage() {
        dialogContentElement.wait.until(ExpectedConditions.urlToBe(ConfigReader.getProperty("myFinanceURL")));
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("myFinanceURL")));
    }
}