import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test4 { //Banca Empresas: Olvidaste tu clave, recuperar clave
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

        driver.findElement(By.xpath("//*[@id=\"default\"]/header/div[2]/div[1]/table/tbody/tr/td[3]")).click();

        sleep(2000);

        driver.findElement(By.xpath("/html/body/ui-view/div[2]/div[1]/div[1]/div[2]/div/section[1]/form/div[3]/div[1]/a")).click();


        sleep(2000);

        assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]")).getText().contains("Recuperar clave"));

        sleep(2000);

        driver.quit();
    }
}
