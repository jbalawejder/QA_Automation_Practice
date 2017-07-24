package AutoTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by josephbalawejder on 2017-07-20.
 */
public class HomePage extends JosephsDriver {

    public final WebDriver driver;

    private final By LeadersNavSelector = By.cssSelector("#leaders");
    private final By PlayersNavSelector = By.cssSelector("#player");
    private final By TeamsNavSelector = By.cssSelector("#team");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage navigateToLeaders() {

        driver.findElement(LeadersNavSelector).click();

        return new HomePage(getDriver());

    }
    public HomePage navigateToPlayers() {

        driver.findElement(PlayersNavSelector).click();

        return new HomePage(getDriver());

    }
    public HomePage navigateToTeams() {

        driver.findElement(TeamsNavSelector).click();

        return new HomePage(getDriver());

    }
}
