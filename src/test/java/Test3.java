import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test3 { //Servicio a clientes: Sucursales, encuentra sucursal
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

        driver.findElement(By.cssSelector("a[href='/servicio-a-clientes']")).click();

        sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"contenido\"]/div[2]/div/div[1]/div/a")).click();

        sleep(2000);

        assertTrue(driver.findElement(By.xpath("//*[@id=\"main-layout\"]/div[1]/div/div[1]/h1")).getText().contains("Nuestras Sucursales"));

        sleep(2000);

        driver.quit();
    }
}

