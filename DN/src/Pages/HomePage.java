package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);}

    By homePage = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[1]/a/img");   
    By womanButton = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a");
    By dressesButton = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a");
    By tshirtsButton = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a");
    By popularButton = By.xpath("/html/body/div/div[2]/div/div[2]/div/ul/li[1]/a");
    By bestSellersButton = By.xpath("/html/body/div/div[2]/div/div[2]/div/ul/li[2]/a");
    By numberOfPopular = By.cssSelector("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[1]/div/a[1]");
    By numberOfBestSellers = By.cssSelector("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[2]/li[2]/div/div[1]/div/a[1]");

/// ovo je provera da sam na pravom sajtu

    public HomePage clickOnHomePage(){
        click(homePage);
        return this;}
    public HomePage womanButton(){
        click(womanButton);
        return this;} 
    public HomePage dressesButton(){
        click(dressesButton);
        return this;} 
    public HomePage tshirtsButton(){
        click(tshirtsButton);
        return this;} 
/// kraj

/// brojanje produkata na "popular" i "best sellers"
///popular
    public HomePage selectPopularButton(){
        click(popularButton);
        return this;
}
     public HomePage numberPopular(int expectedNumberOfProducts){
        int actualNumberOfProducts = countItems(numberOfPopular);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }
///best sellers
public HomePage selectBestSellersButton(){
    click(bestSellersButton);
    return this;
}
    public HomePage numberBestSellers(int expectedNumberOfProducts){
       int actualNumberOfProducts = countItems(numberOfBestSellers);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
       return this;
    }
    /// kraj
}
