package khl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[1]/a")
    private WebElement newsButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement videoButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement calendarButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[4]/a")
    private WebElement standingsButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[5]/a")
    private WebElement clubsButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[6]/a")
    private WebElement playersButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[7]/a")
    private WebElement refereesButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[8]/a")
    private WebElement statsButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[9]/a")
    private WebElement photoButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[10]/a")
    private WebElement tvButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[11]/a")
    private WebElement ticketsButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[12]/a")
    private WebElement storeButton;

    public NewsPage clickNewsPage(){
        newsButton.click();
        return new NewsPage(webDriver);
    }
    
    public StandingsPage clickStandingsButton(){
        standingsButton.click();
        return new StandingsPage(webDriver);
    }
}
