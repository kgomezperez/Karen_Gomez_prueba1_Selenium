
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test2 { //Banca Plus: Hazte cliente
    public static void main(String[] args) throws InterruptedException {
        // string ruta del driver
        String rutaDriver = "D:\\SELENIUM\\Primera_evaluacion_selenium\\src\\test\\resources\\drivers\\chromedriver.exe";


        System.setProperty("webdriver.chrome.driver", rutaDriver);

        //Instanciar un objeto de tipo driver de chrome
        WebDriver driver = new ChromeDriver();

        // Paso 1: Abrir página
        driver.get("https://www.bancoconsorcio.cl/");

        // Espera (simplificada, en la práctica se debería usar WebDriverWait)
        sleep(2000);

        driver.findElement(By.className("item-576")).click();

        sleep(2000);

        driver.findElement(By.id("banner_landing_cuenta-plus_hazte_cliente")).click();


        sleep(2000);

        driver.findElement(By.id("nombre")).sendKeys("Karen Gomez");

        sleep(2000);

        driver.findElement(By.id("rut")).sendKeys("265045103");

        sleep(2000);

        driver.findElement(By.id("birthday")).sendKeys("18/06/1985");

        sleep(2000);

        driver.findElement(By.className("cns-selector--container")).click();

        sleep(2000);
        driver.findElement(By.xpath("//div[@class='cns-selector--container--box--items--item comuna']//span[text()='Putre']")).click();

        sleep(2000);

        driver.findElement(By.id("telefono")).sendKeys("67351412");

        sleep(2000);

        driver.findElement(By.xpath("//input[@name='mail']")).sendKeys("correovalido@algo.com");

        sleep(2000);

        driver.findElement(By.id("renta")).sendKeys("1200000");

        sleep(2000);

        driver.findElement(By.id("btn-submit")).click();

        sleep(2000);

        // Verificar que aparece un mensaje de error
        List<WebElement> botones =  driver.findElements (By.xpath("//button[@class= 'cns-button__content__text' and text ()='Finalizar']"));
        //assertTrue(driver.findElement(By.className("cns-button__content__text")).getText().contains("Finalizar"));

        assertTrue(!botones.isEmpty(), "El boton 'Finalizar' no fue encontrado");

        driver.quit();
    }
}