package pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;
import java.util.regex.Pattern;

public class HubLoginPage {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        {
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(false)
            );
            Page page = browser.newPage();
            page.navigate("https://hub-staging.tissl.com/login");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
            page.getByPlaceholder("Username").click();
            page.getByPlaceholder("Username").fill("Testuser1");
            page.getByPlaceholder("Password").click();
            page.getByPlaceholder("Password").fill("testuser1");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
            page.getByText("Stay Gin").click();
            assertThat(page).hasTitle(Pattern.compile("HorizonHUB"));
            page.close();
            browser.close();
            playwright.close();
        }
    }
}
