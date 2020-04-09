import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownmenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownmenu.click();

        WebElement autocompleteitem = driver.findElement(By.id("autocomplete"));
        autocompleteitem.click();



        driver.quit();
    }
}
