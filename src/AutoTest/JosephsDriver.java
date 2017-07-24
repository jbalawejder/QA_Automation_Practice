package AutoTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by josephbalawejder on 2017-06-22.
 */
public class JosephsDriver extends FirefoxDriver {

    public WebDriver driver;

    public final String SCREENSHOT_DEFAULT_FOLDER = "out/screenshots/";

    protected WebDriver createJosephDriver() {

        WebDriver driver = new JosephsDriver();
        driver.get("http://www.nhl.com/stats/");

        return driver;
    }


    public WebDriver getDriver() {
        WebDriver driver = null;

        driver = createJosephDriver();

        return driver;
    }


    public void getscreenshot(int identifier,WebDriver driver) throws IOException {
        final String newFileNamePath = SCREENSHOT_DEFAULT_FOLDER + "nhlScreenshot" + identifier +  ".jpg";

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File(newFileNamePath));
        }
        catch (Exception e) {
            System.out.print("Oops there was an exception");
        }
    }

}
