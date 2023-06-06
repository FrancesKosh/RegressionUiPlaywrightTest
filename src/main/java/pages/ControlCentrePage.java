package pages;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ControlCentrePage {
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
                page.getByPlaceholder("Username").press("Tab");
                page.getByPlaceholder("Password").fill("testuser1");
                page.getByPlaceholder("Password").press("Enter");
                page.locator(".module-control-link").click();
                page.getByText("View / edit categories").click();
                page.getByLabel("Show active only").check();
                page.getByLabel("Show active only").uncheck();
                page.getByText("Shisha").click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).first().click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
                page.locator("app-main-nav").getByText("View / edit products").click();
                page.getByLabel("Show active only").check();
                page.getByLabel("Show active only").uncheck();
                page.getByLabel("Show combo deal only").check();
                page.getByLabel("Show combo deal only").uncheck();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
                page.getByText("Bulk edit products").click();
                page.getByText("Rib-eye of beef fingerling potatoes pancetta cavolo nero grapes salsa verde").click();
                page.getByText("'Dbl Beluga T'").click();
                page.locator(".custom-card-title > .btn").click();
                page.locator(".custom-card-content > div > div:nth-child(2)").click();
                page.locator("div:nth-child(2) > .d-flex > div:nth-child(2) > .ng-fa-icon > .svg-inline--fa > path").click();
                page.locator(".draggingList").click();
                page.locator(".draggingList > .d-flex > div:nth-child(2) > .ng-fa-icon > .svg-inline--fa > path").click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
                page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^View \\/ edit modifiers$"))).click();
                page.getByText("Beer modifiers").click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Cancel")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
                page.getByText("Menu designer").click();
                page.frameLocator("iframe").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Sale toolbar ▼")).click();
                page.frameLocator("iframe").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Sale toolbar ▼")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
                page.getByText("ControlCentre").click();
                assertThat(page).hasTitle(Pattern.compile("HorizonHUB"));
                page.close();
                browser.close();
                playwright.close();
            }
        }
    }

