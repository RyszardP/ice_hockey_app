package khl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver webDriver;

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.khl.ru/");
        MainPage mainPage = PageFactory.initElements(webDriver, MainPage.class);
        StandingsPage standingsPage = PageFactory.initElements(webDriver, StandingsPage.class);
        mainPage.clickStandingsButton();

        try {
            FileWriter myWriter = new FileWriter("khl.txt");
            myWriter.write("East");
            myWriter.write("1. " + standingsPage.getFirstInWestCon() + ", points " + standingsPage.getFirstScoreInWest());
            myWriter.write("2. " + standingsPage.getSecondInWestCon() + ", points " + standingsPage.getSecondScoreInWest());
            myWriter.write("3. " + standingsPage.getThirdInWestCon() + ", points " + standingsPage.getThirdScoreInWest());
            myWriter.write("4. " + standingsPage.getFourthInWestCon() + ", points " + standingsPage.getFourthScoreInWest());
            myWriter.write("5. " + standingsPage.getFifthInWestCon() + ", points " + standingsPage.getFifthScoreInWest());
            myWriter.write("6. " + standingsPage.getSixthInWestCon() + ", points " + standingsPage.getSixthScoreInWest());
            myWriter.write("7. " + standingsPage.getSeventhInWestCon() + ", points " + standingsPage.getSeventhScoreInWest());
            myWriter.write("8. " + standingsPage.getEighthInWestCon() + ", points " + standingsPage.getEighthScoreInWest());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
