package khl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StandingsPage {
    private WebDriver webDriver;

    public StandingsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]")
    private WebElement firstInWestConf;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[2]")
    private WebElement secondInWestConf;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div[2]/div/table/tbody/tr[3]/td[2]")
    private WebElement thirdInWestConf;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div[2]/div/table/tbody/tr[4]/td[2]")
    private WebElement fourthInWestConf;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div[2]/div/table/tbody/tr[5]/td[2]")
    private WebElement fifthInWestConf;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div[2]/div/table/tbody/tr[6]/td[2]")
    private WebElement sixthInWestConf;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div[2]/div/table/tbody/tr[7]/td[2]")
    private WebElement seventhInWestConf;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div[2]/div/table/tbody/tr[8]/td[2]")
    private WebElement eighthInWestConf;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div[2]/table/tbody/tr[1]/td[11]/b")
    private WebElement firstScoreInWest;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div[2]/table/tbody/tr[2]/td[11]/b")
    private WebElement secondScoreInWest;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div[2]/table/tbody/tr[3]/td[11]/b")
    private WebElement thirdScoreInWest;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div[2]/table/tbody/tr[4]/td[11]/b")
    private WebElement fourthScoreInWest;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div[2]/table/tbody/tr[5]/td[11]/b")
    private WebElement  fifthScoreInWest;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div[2]/table/tbody/tr[6]/td[11]/b")
    private WebElement  sixthScoreInWest;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div[2]/table/tbody/tr[7]/td[11]/b")
    private WebElement  seventhScoreInWest;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div[2]/table/tbody/tr[8]/td[11]/b")
    private WebElement  eighthScoreInWest;

    public String getFirstInWestCon() {
        return firstInWestConf.getText();
    }

    public String getSecondInWestCon() {
        return secondInWestConf.getText();
    }

    public String getThirdInWestCon() {
        return thirdInWestConf.getText();
    }

    public String getFourthInWestCon() {
        return fourthInWestConf.getText();
    }

    public String getFifthInWestCon() {
        return fifthInWestConf.getText();
    }

    public String getSixthInWestCon() {
        return sixthInWestConf.getText();
    }

    public String getSeventhInWestCon() {
        return seventhInWestConf.getText();
    }

    public String getEighthInWestCon() {
        return eighthInWestConf.getText();
    }

    public String getFirstScoreInWest(){
        return firstScoreInWest.getText();
    }

    public String getSecondScoreInWest(){
        return secondScoreInWest.getText();
    }

    public String getThirdScoreInWest(){
        return thirdScoreInWest.getText();
    }

    public String getFourthScoreInWest(){
        return fourthScoreInWest.getText();
    }

    public String getFifthScoreInWest(){
        return fifthScoreInWest.getText();
    }

    public String getSixthScoreInWest(){
        return sixthScoreInWest.getText();
    }

    public String getSeventhScoreInWest(){
        return seventhScoreInWest.getText();
    }

    public String getEighthScoreInWest(){
        return eighthScoreInWest.getText();
    }

}
