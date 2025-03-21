package utils;
import org.openqa.selenium.By;

public class Google_OR {
    public static final By searchBox = By.name("q");
    public static final By searchButton = By.name("btnK");
    public static final By luckyButton = By.name("btnI");
    public static final By suggestionsList = By.cssSelector(".erkvQe li");
    public static final By nextPageButton = By.id("pnnext");
    public static final By voiceSearchButton = By.cssSelector("[aria-label='Search by voice']");
    public static final By clearButton = By.cssSelector("[aria-label='Clear']");
}
