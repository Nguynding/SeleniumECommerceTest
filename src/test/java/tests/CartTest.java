package tests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InventoryPage;
import pages.LoginPage;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @BeforeEach
    public void setup() {

        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
    }

    @Test
    public void testAddProductToCart() {
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addProductToCart();
        inventoryPage.goToCart();

        // Kiểm tra sản phẩm có trong giỏ hàng không
        WebElement productInCart = driver.findElement(By.className("cart_item"));
        assertNotNull(productInCart);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
