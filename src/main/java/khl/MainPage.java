package khl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[2]/ul/li[4]/a")
    private WebElement standingsButton;


    public StandingsPage clickStandingsButton(){
        standingsButton.click();
        return new StandingsPage(webDriver);
    }
}
