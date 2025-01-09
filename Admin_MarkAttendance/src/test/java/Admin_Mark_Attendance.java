import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Admin_Mark_Attendance {
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

        //Mark Attendance
        WebElement MarkAttendance = driver.findElement(By.xpath("/html/body/div/a[2]/div"));
        MarkAttendance.click();
        //Set Date
        WebElement Set_Date = driver.findElement(By.id("attenDate"));
        Set_Date.sendKeys("01/05/2025");
        Thread.sleep(3000);
        WebElement Set_Date_Button = driver.findElement(By.xpath("/html/body/form[2]/input[2]"));
        Set_Date_Button.click();
        Thread.sleep(3000);
        //add workin hours of all the employees
        WebElement All_Employees = driver.findElement(By.id("commonHour"));
        All_Employees.sendKeys("8");
        Thread.sleep(3000);
        WebElement Add_Common_Hour_Button = driver.findElement(By.id("addCommonHourBtn"));
        Add_Common_Hour_Button.click();
        Thread.sleep(3000);
        WebElement OverTime = driver.findElement(By.id("overTimeHour"));
        OverTime.clear();
        OverTime.sendKeys("2");
        Thread.sleep(3000);
        WebElement Update_Attendance = driver.findElement(By.xpath("/html/body/form[3]/footer/div/button"));
        Update_Attendance.click();
        Thread.sleep(3000);
        WebElement Backtodashboard = driver.findElement(By.xpath("/html/body/form[3]/footer/form/div/a/button"));
        Backtodashboard.click();




    }
}
