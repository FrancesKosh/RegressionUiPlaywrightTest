package pages;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.util.*;
import java.util.regex.Pattern;

public class ReportCentrePage {
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
            page.getByText("Electronic journal").click();
            page.getByRole(AriaRole.COMBOBOX).first().selectOption("6: Object");
            page.getByPlaceholder("yyyy-mm-dd").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Today")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yesterday")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("This Week")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Last Week")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("This Month")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Last Month")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Last Quarter")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Today")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Apply")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("View")).click();
            page.getByPlaceholder("yyyy-mm-dd").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Last Week")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Apply")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("View")).click();
            page.getByText("IK-23051").click();
            page.getByRole(AriaRole.DIALOG).click();
            assertThat(page).hasTitle(Pattern.compile("HorizonHUB"));
            page.close();
            browser.close();
            playwright.close();
        }
    }
}
