package com.maven.raghu.utils;

import com.maven.raghu.diverfactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Components extends DriverFactory {
    @FindBy(css = ".cookie-notice__agree-button")
    private WebElement alert;
    @FindBy(css = ".newsletter__close")
    private WebElement cross;
}
