import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Admin {
    @Test
    public void Administration() throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/EMS%20final/EMS/");

        //Select Admin Panel
        WebElement AdminButton = driver.findElement(By.xpath("/html/body/div/a[2]/div"));
        AdminButton.click();
        //UserName
        WebElement adminUserName = driver.findElement(By.name("adminUserName"));
        adminUserName.sendKeys("admin");
        //Password
        WebElement adminPassword = driver.findElement(By.name("adminPassword"));
        adminPassword.sendKeys("admin123");
        //login
        WebElement Login = driver.findElement(By.xpath("/html/body/div/div/form/input[3]"));
        Login.click();
        //Calculate Salary
        WebElement Calculate_Salary = driver.findElement(By.xpath("/html/body/div/a[3]/div"));
        Calculate_Salary.click();
        //Set Month
        WebElement Month = driver.findElement(By.id("monthPicker"));
        Month.sendKeys("January");
        WebElement Filter = driver.findElement(By.xpath("/html/body/div[1]/form/input[4]"));
        Filter.click();
        Thread.sleep(3000);
        WebElement Bonus = driver.findElement(By.name("bonus"));
        Bonus.sendKeys("1000");
        WebElement Description = driver.findElement(By.id("description"));
        Description.sendKeys("New Year commission");
        WebElement bonus = driver.findElement(By.className("filterbtn"));
        bonus.click();
        WebElement add_salary = driver.findElement(By.xpath("/html/body/form/input"));
        WebElement addSalary = add_salary;
        addSalary.submit();
        WebElement BacktoDashboard = driver.findElement(By.xpath("/html/body/footer/div/a/button"));
        BacktoDashboard.click();



    }
}
