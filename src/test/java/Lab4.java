import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lab4 {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement jobTitleInput = driver.findElement(By.id("job-title"));
        lastNameInput.sendKeys("Abdelmoniem");
        jobTitleInput.sendKeys("Engineer");
        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();

    }
    @Test
    public void test2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement jobTitleInput = driver.findElement(By.id("job-title"));
        firstNameInput.sendKeys("Mohamad");
        lastNameInput.sendKeys("Abdelmoniem");
        jobTitleInput.sendKeys("Engineer");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }

    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement jobTitleInput = driver.findElement(By.id("job-title"));
        firstNameInput.sendKeys("Mohamad");
        jobTitleInput.sendKeys("Engineer");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();

    }
    @Test
    public void test4() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement jobTitleInput = driver.findElement(By.id("job-title"));
        firstNameInput.sendKeys("Mohamad");
        jobTitleInput.sendKeys("Engineer");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();

    }

    @Test
    public void test5() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement jobTitleInput = driver.findElement(By.id("job-title"));
        firstNameInput.sendKeys("Mohamad");
        jobTitleInput.sendKeys("Engineer");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();

    }
    @Test
    public void test6() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        firstNameInput.sendKeys("Mohamad");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
    @Test
    public void test7() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement jobTitleInput = driver.findElement(By.id("job-title"));
        jobTitleInput.sendKeys("Engineer");
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
    @Test
    public void test8() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
}