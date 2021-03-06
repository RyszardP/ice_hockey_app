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
            myWriter.write("1. " + standingsPage.getFirstInWestCon() + ", points " + standingsPage.getFirstScoreInWest() + "\n");
            myWriter.write("2. " + standingsPage.getSecondInWestCon() + ", points " + standingsPage.getSecondScoreInWest() + "\n");
            myWriter.write("3. " + standingsPage.getThirdInWestCon() + ", points " + standingsPage.getThirdScoreInWest() + "\n");
            myWriter.write("4. " + standingsPage.getFourthInWestCon() + ", points " + standingsPage.getFourthScoreInWest() + "\n");
            myWriter.write("5. " + standingsPage.getFifthInWestCon() + ", points " + standingsPage.getFifthScoreInWest() + "\n");
            myWriter.write("6. " + standingsPage.getSixthInWestCon() + ", points " + standingsPage.getSixthScoreInWest() + "\n");
            myWriter.write("7. " + standingsPage.getSeventhInWestCon() + ", points " + standingsPage.getSeventhScoreInWest() + "\n");
            myWriter.write("8. " + standingsPage.getEighthInWestCon() + ", points " + standingsPage.getEighthScoreInWest() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
