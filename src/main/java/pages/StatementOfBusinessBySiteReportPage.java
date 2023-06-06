package pages;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.util.regex.Pattern;

public class StatementOfBusinessBySiteReportPage {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create(); {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://hub-staging.tissl.com/");
            page.navigate("https://hub-staging.tissl.com/login?returnUrl=%2Fhome");
            page.getByPlaceholder("Username").click();
            page.getByPlaceholder("Username").fill("Testuser1");
            page.getByPlaceholder("Password").click();
            page.getByPlaceholder("Password").fill("testuser1");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
            page.locator(".module-report-link").click();
            page.getByText("Statement of business by site").click();
            page.getByPlaceholder("yyyy-mm-dd").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Apply")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("View")).click();
            assertThat(page).hasTitle(Pattern.compile("HorizonHUB"));
            page.close();
            browser.close();
            playwright.close();
        }
    }
}



