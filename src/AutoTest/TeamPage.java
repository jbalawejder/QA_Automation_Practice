package AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by josephbalawejder on 2017-07-20.
 */
public class TeamPage extends JosephsDriver{

    public final WebDriver driver;

    private final By teamDropdown = By.cssSelector("#stats-page-body > div.stats-toolbar > div:nth-child(1) > div:nth-child(2) > div.select-component-container.filter.filter--team > select");
    private final By goButtoon = By.cssSelector("#stats-page-body > div.stats-toolbar > div:nth-child(1) > div:nth-child(2) > button.toolbar-button.go > span");

    public TeamPage (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public TeamPage clickTeamDropdown() {

        driver.findElement(teamDropdown).click();

        return new TeamPage(getDriver());

    }

    public TeamPage selectTeam(String team) {

        Select dropdown = new Select(driver.findElement(By.id("select-component-dropdown")));

        dropdown.selectByVisibleText(team);

        return new TeamPage(getDriver());

    }

    public TeamPage clickGo() {
        driver.findElement(goButtoon).click();
        return new TeamPage(getDriver());
    }

}
