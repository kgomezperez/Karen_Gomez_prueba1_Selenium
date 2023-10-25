import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        String rutaDriver = "D:\\SELENIUM\\Primera_evaluacion_selenium\\src\\test\\resources\\drivers\\chromedriver.exe";

        //Enlazar el driver como property de windows para el manejo
        //Del navegador
        System.setProperty("webdriver.chrome.driver", rutaDriver);

        //Instanciar un objeto de tipo driver de chrome
        WebDriver driver = new ChromeDriver();

        // Paso 1: Abrir página
        driver.get("https://www.bancoconsorcio.cl/");

        // Espera (simplificada, en la práctica se debería usar WebDriverWait)
        sleep(2000);

        // Paso 2: buscar palabra
        driver.findElement(By.name("q")).sendKeys("credito");

        sleep(2000);

        driver.findElement(By.className("icon-search")).click();

        // Espera
        sleep(2000);

        // Paso 3: Verificar que aparece lo que decidí buscar
        assertTrue(driver.findElement(By.className("word")).getText().contains("Términos de búsqueda"));

        sleep(2000);

        driver.quit();
    }
}// Se sube al Git
