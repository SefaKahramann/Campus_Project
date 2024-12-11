package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;
import utilities.ReusableMethods;

import java.util.List;

public class TopNav extends ReusableMethods {

    public TopNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='ng-star-inserted']/button")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messagingBtn;

    @FindBy(xpath = "(//div[@class='cdk-overlay-pane'])[2]//button")
    public List<WebElement> msgSubMenuList;

    @FindBy(xpath = "//span[text()='Send Message']")
    public WebElement sendMsgBtn;

    @FindBy(xpath = "//div[@fxlayout='row']/div/img")
    public WebElement homepageLogo;

    @FindBy(xpath = "//div[@role='menu']/div/button")
    public List<WebElement> hamburgerMenuSubmenus;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeButton;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceButton;

    @FindBy(xpath = "//span[text()='Finance']")
    public WebElement financeBtn;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outboxBtn;

    @FindBy(xpath = "//user-message-bell/button")
    public WebElement  newMessageIcon;

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[6]")
    public WebElement hamburgerMenuBtn;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinance;

    @FindBy(xpath = "(//span[text()=' Student_6 11A'])[1]")
    public WebElement studentBtn;

    @FindBy(xpath = "//div[@class='StripeElement']")
    public WebElement stripeButton;

    @FindBy(xpath = "(//span[@class='mdc-tab__content'])[2]")
    public WebElement balanceDetail;

    @FindBy(xpath = "//td[text()=' 235 $ ']")
    public WebElement balanceDetailTextCtrl;

    @FindBy(xpath = "//student-layout[@class='ng-star-inserted']")
    public List<WebElement> tabMenu;

    @FindBy(xpath = "(//span[text()='Courses'])[1]")
    public WebElement coursesMenu;

    @FindBy(xpath = "(//span[text()='Calendar'])[2]")
    public WebElement calendarMenu;

    @FindBy(xpath = "//span[text()='Attendance']")
    public WebElement attendanceMenu;

    @FindBy(xpath = "//span[text()='Assignments']")
    public WebElement assignmentsMenu;

    @FindBy(xpath = "(//span[text()='Grading'])[1]")
    public WebElement gradingMenu;

    @FindBy(xpath = "//div[@role='menu']/div/button")
    public WebElement hamburgerMenuButton;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messagingButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeMenu;

    @FindBy(xpath = "//span[text()='Education']")
    public WebElement educationMenu;

    @FindBy(xpath = "//span[text()='Video Conference']")
    public WebElement videoConference;

    @FindBy(xpath = "//span[text()='Surveys']")
    public WebElement surveysMenu;

    @FindBy(xpath = "(//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple'])[1]")
    public WebElement announcementsBtn;

    @FindBy(xpath = "(//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple'])[2]")
    public WebElement messagesBtn;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    public WebElement announcementCloseBtn;

    @FindBy(xpath = "//span[text()='My Certificates']")
    public WebElement myCertificates;

    @FindBy(xpath = "//span[text()='My Files']")
    public WebElement myFiles;

    @FindBy(xpath = "//span[text()='Change Password']")
    public WebElement changePassword;







    @FindBy(xpath = "//*[@icon='analytics']/button")
    public WebElement gradingButton;

    public WebElement getWebElement(String strElementName) {

        switch (strElementName) {
            case "sendMessage": return this.sendMsgBtn;
            case "outboxMessage": return this.outboxBtn;
            case "newMessageIcon": return this.newMessageIcon;
            case "gradingButton": return this.gradingButton;
        }
        return null;
    }
}