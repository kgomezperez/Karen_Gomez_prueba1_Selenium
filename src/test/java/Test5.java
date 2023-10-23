import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        String rutaDriver = "D:\\SELENIUM\\Primera_evaluacion_selenium\\src\\test\\resources\\drivers\\chromedriver.exe";

        //Enlazar el driver como property de windows para el manejo
        //Del navegador
        System.setProperty("webdriver.chrome.driver", rutaDriver);

        //Instanciar un objeto de tipo driver de chrome
        WebDriver driver = new ChromeDriver();

        // Paso 1: Abrir Google
        driver.get("https://www.bancoconsorcio.cl/");

        // Espera (simplificada, en la práctica se debería usar WebDriverWait)
        sleep(2000);

        driver.findElement(By.cssSelector("a[href='/nuestro-banco']")).click();

        sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"contenido\"]/div[3]/div/div/div/div/div[1]/p/a")).click();


        sleep(2000);

        assertTrue(driver.findElement(By.xpath("//*[@id=\"contenido\"]/div[1]/div/div[1]/div/div/h1")).getText().contains("Misión / Visión / Valores"));

        sleep(2000);

        driver.quit();
    }
}
