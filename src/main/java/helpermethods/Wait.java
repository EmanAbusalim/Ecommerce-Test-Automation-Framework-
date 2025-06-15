package helpermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static sun.jvm.hotspot.code.CompressedStream.L;

public class Wait {
    public static void customWait(WebDriver driver,int x){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(x* 1000));

    }



}
