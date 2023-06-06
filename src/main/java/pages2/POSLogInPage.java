package pages2;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.util.*;
import java.util.regex.Pattern;

public class POSLogInPage {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://pos-staging.tissl.com/#/pos/login");
            page.navigate("https://pos-staging.tissl.com/#/registration");
            page.getByPlaceholder("Username").click();
            page.locator("input[type=\"text\"]").fill("Testuser1");
            page.getByPlaceholder("Password").click();
            page.locator("input[type=\"password\"]").fill("testuser1");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
            page.locator("span").filter(new Locator.FilterOptions().setHasText("Aberdeen Stay GinStay Gin CityStay Gin Home")).click();
            page.locator("#site").selectOption("879c4a06-0661-450d-b604-ccf583999cff");
            page.locator("#receiptPrinter").selectOption("c1874cd5-f315-4be1-b7c4-2486a6d1a77f");
            page.getByPlaceholder("Device Name").click();
            page.getByRole(AriaRole.TEXTBOX).fill("1254125");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.locator("#login span").nth(1).click();
            page.locator("input[type=\"text\"]").fill("Testuser1");
            page.getByPlaceholder("Password").click();
            page.locator("input[type=\"password\"]").fill("testuser1");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            assertThat(page).hasTitle(Pattern.compile("HORIZON"));
            page.close();
            browser.close();
            playwright.close();
        }
    }
}

