package pages;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.util.regex.Pattern;

public class ModifierEditScrollPage {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create(); {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://hub-master.tissl.com/");
            page.navigate("https://hub-master.tissl.com/login?returnUrl=%2Fhome");
            page.getByPlaceholder("Username").click();
            page.getByPlaceholder("Username").fill("Testuser1");
            page.getByPlaceholder("Username").press("Tab");
            page.getByPlaceholder("Password").fill("Testuser1");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
            page.getByPlaceholder("Username").click();
            page.getByPlaceholder("Username").fill("Frances");
            page.getByPlaceholder("Password").click();
            page.getByPlaceholder("Password").fill("Sejlokosh80");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
            page.locator(".module-control-link").click();
            page.getByText("View / edit modifiers").click();
            page.getByText("Breakfast").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit site modifier settings")).click();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("1site")).getByPlaceholder("Price").first().click();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("1site")).getByPlaceholder("Price").first().dblclick();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("1site")).getByPlaceholder("Price").first().dblclick();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("1site")).getByPlaceholder("Price").first().dblclick();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("1site")).getByPlaceholder("Price").first().click();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("1site")).getByPlaceholder("Price").first().click();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("1site")).getByPlaceholder("Price").first().fill("1.00");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit site modifier settings")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Modifier name Avocado PriceMax countpcs$"))).getByPlaceholder("Price").click();
            page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Modifier name Avocado PriceMax countpcs$"))).getByPlaceholder("Price").fill("2.00");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit site modifier settings")).click();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Frances site")).getByPlaceholder("Price").first().click();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Frances site")).getByPlaceholder("Price").first().click();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Frances site")).getByPlaceholder("Price").first().fill("1.00");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).click();
            page.close();
            browser.close();
            playwright.close();
        }
    }
}
