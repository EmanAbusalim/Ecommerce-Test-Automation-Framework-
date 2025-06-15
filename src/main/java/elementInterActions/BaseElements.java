package elementInterActions;

import org.openqa.selenium.WebElement;

public abstract class BaseElements {
    WebElement e;
    public BaseElements( ) {

    }
  /*  public BaseElements(WebElement e) {
        this.e= e;
    }*/

    public abstract  void interact();
}
