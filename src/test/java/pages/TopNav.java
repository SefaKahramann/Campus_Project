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

}
