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
        //Manage Employee
        WebElement ManageEmployee = driver.findElement(By.xpath("/html/body/div/a[1]/div"));
        ManageEmployee.click();
        //filter employee
        WebElement employeeID = driver.findElement(By.id("employeeID"));
        employeeID.sendKeys("EMP109");
        WebElement filterbtn1 = driver.findElement(By.className("filterbtn"));
        filterbtn1.click();
        Thread.sleep(5000);
        //Report
        WebElement Report = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/a/span"));
        Report.click();
        Thread.sleep(5000);
        driver.navigate().back();
        WebElement Edit = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[6]/a/span"));
        Edit.click();
        WebElement employeeName = driver.findElement(By.id("employeeName"));
        employeeName.clear();
        employeeName.sendKeys("Sophia Taylor Mel");
        WebElement updateButton = driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[6]/td[2]/input"));
        updateButton.click();
        Thread.sleep(5000);
        //employeeName
        WebElement EmployeeName = driver.findElement(By.id("employeeName"));
        EmployeeName.sendKeys("John Doenk");
        WebElement filterbtn2 = driver.findElement(By.className("filterbtn"));
        filterbtn2.click();
        Thread.sleep(5000);
        //level
        WebElement Level = driver.findElement(By.id("level"));
        Level.sendKeys("Level 3");
        WebElement filterbtn3 = driver.findElement(By.className("filterbtn"));
        filterbtn3.click();
        Thread.sleep(5000);
        //Add New Employee
        WebElement AddNewEmployee = driver.findElement(By.xpath("/html/body/div[2]/a/button"));
        AddNewEmployee.click();
        WebElement EmployeeID = driver.findElement(By.id("employeeID"));
        EmployeeID.sendKeys("EMP209");
        WebElement Employeename = driver.findElement(By.id("employeeName"));
        Employeename.sendKeys("Sanduni Tharaka");
        WebElement Age = driver.findElement(By.id("age"));
        Age.sendKeys("24");
        WebElement level = driver.findElement(By.id("level"));
        level.sendKeys("Level 2");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement AddEmployee = driver.findElement(By.className("btn"));
        AddEmployee.click();
        WebElement NewemployeeID = driver.findElement(By.id("employeeID"));
        NewemployeeID.sendKeys("EMP209");
        WebElement filterbtn4 = driver.findElement(By.className("filterbtn"));
        filterbtn4.click();
        Thread.sleep(5000);
        //back to dashboard
        WebElement BackToDashboard = driver.findElement(By.xpath("/html/body/footer/div/a/button"));
        BackToDashboard.click();
        Thread.sleep(3000);

        



        


    }
}


