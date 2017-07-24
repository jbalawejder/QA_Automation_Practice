package AutoTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;


/**
 * Created by josephbalawejder on 2017-06-22.
 */

public class FireFoxDriverTest extends JosephsDriver {

    @Test
    public void takeScreenshot() throws Exception {

        WebDriver driver = getDriver();

        HomePage home = new HomePage(driver);

        home.getscreenshot(1, driver);

        driver.quit();

    }

    @Test
    public void testTeams() throws Exception {

        WebDriver driver = getDriver();

        HomePage home = new HomePage(driver);

        home.navigateToTeams();

        TeamPage teamPage = new TeamPage(driver);

        teamPage.selectTeam("Toronto Maple Leafs");

        teamPage.getscreenshot(1, driver);

        driver.quit();
    }

}
