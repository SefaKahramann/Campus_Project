package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import pages.TopNav;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class FinancePayment {
    DialogContent dialogContentElement = new DialogContent();
    TopNav topNavElement = new TopNav();

    @When("The user hovers over the Hamburger Menu and clicks on My Finance")
    public void the_user_hovers_over_the_hamburger_menu_and_clicks_on_my_finance() {
        topNavElement.wait.until(ExpectedConditions.visibilityOf(topNavElement.hamburgerMenuBtn));
        topNavElement.myClick(topNavElement.hamburgerMenuBtn);

        topNavElement.wait.until(ExpectedConditions.visibilityOf(topNavElement.financeButton));
        topNavElement.hoverOver(topNavElement.financeButton);

        topNavElement.wait.until((ExpectedConditions.visibilityOf(topNavElement.myFinance)));
        topNavElement.myClick(topNavElement.myFinance);
    }

    @When("The user clicks their name and is redirected to the payment page")
    public void the_user_clicks_their_name_and_is_redirected_to_the_payment_page() {
        topNavElement.myClick(topNavElement.studentBtn);
        topNavElement.verifyContainsText(topNavElement.studentBtn, topNavElement.studentBtn.getText());
    }

    @When("The user enters the amount and clicks the pay button")
    public void the_user_enters_the_amount_and_clicks_the_pay_button() {
        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.stripeBtn));
        dialogContentElement.myClick(dialogContentElement.stripeBtn);

        dialogContentElement.wait.until(ExpectedConditions.elementToBeClickable(dialogContentElement.payCtrl));
        topNavElement.myClick(dialogContentElement.payBtn);

        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.payOption));
        topNavElement.myClick(dialogContentElement.payOption);

        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.amountBox));
        dialogContentElement.mySendKeys(dialogContentElement.amountBox, ConfigReader.getProperty("amount"));

        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.unactivePayButton));
        dialogContentElement.myClick(dialogContentElement.unactivePayButton);

        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.payButton));
        dialogContentElement.myClick(dialogContentElement.payButton);
    }

    @When("The user enters their card details")
    public void the_user_enters_their_card_details() {
        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.iframe));
        GWD.getDriver().switchTo().frame(dialogContentElement.iframe);

        dialogContentElement.wait.until(ExpectedConditions.elementToBeClickable(dialogContentElement.cardNumberBox));
        dialogContentElement.mySendKeys(dialogContentElement.cardNumberBox, ConfigReader.getProperty("cardNumber"));

        int randomMonth = dialogContentElement.randomGenerator(11) + 1;
        int randomYear = dialogContentElement.randomGenerator(12) + 25;
        String expireDate = Integer.toString(randomMonth) + randomYear;
        dialogContentElement.mySendKeys(dialogContentElement.expirationDateBox, expireDate);
        int randomCVV = dialogContentElement.randomGenerator(900) + 100;
        dialogContentElement.mySendKeys(dialogContentElement.securityCodeBox, Integer.toString(randomCVV));

        GWD.getDriver().switchTo().parentFrame();
    }

    @When("The user confirms the payment")
    public void the_user_confirms_the_payment() {
        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.stripePaymentsButton));
        dialogContentElement.myClick(dialogContentElement.stripePaymentsButton);
    }

    @Then("The user displays a confirmation message payment successfully")
    public void the_user_displays_a_confirmation_message_payment_successfully() {
        dialogContentElement.verifyContainsText(dialogContentElement.successPaymentMsg, "successfully");
        Assert.assertTrue(dialogContentElement.successPaymentMsg.isDisplayed());

        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.feeBalanceButton));
        dialogContentElement.myClick(dialogContentElement.feeBalanceButton);

        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.fileBalanceDetailText));
        dialogContentElement.scrollToElement(dialogContentElement.fileBalanceDetailText);

        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.studentFeesBtn));
        dialogContentElement.jsClick(dialogContentElement.studentFeesBtn);

        topNavElement.wait.until(ExpectedConditions.visibilityOf(topNavElement.newMessageIcon));
        topNavElement.jsClick(topNavElement.newMessageIcon);

        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.viewIconBtn));
        dialogContentElement.jsClick(dialogContentElement.viewIconBtn);

        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.paymentCompletedText));
        dialogContentElement.verifyContainsText(dialogContentElement.paymentCompletedText, "completed");
        Assert.assertTrue(dialogContentElement.paymentCompletedText.isDisplayed());

        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.newMessagesCloseBtn));
        dialogContentElement.myClick(dialogContentElement.newMessagesCloseBtn);
    }
}