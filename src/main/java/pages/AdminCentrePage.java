package pages;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.nio.file.Paths;
import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AdminCentrePage {
    public static void main(String[] args) {
//        @TestInstance(TestInstance.Lifecycle.PER_CLASS)
        Playwright playwright = Playwright.create();
        {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false).setSlowMo(50));
            Page page = browser.newPage();
            try {
                page.locator("text=Example").click(new Locator.ClickOptions().setTimeout(100));
            } catch (TimeoutError e) {
                System.out.println("Timeout!");
            }
            page.navigate("https://hub-staging.tissl.com/login");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
            page.getByPlaceholder("Username").click();
            page.getByPlaceholder("Username").fill("Testuser1");
            page.getByPlaceholder("Password").click();
            page.getByPlaceholder("Password").fill("testuser1");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
            page.getByText("Stay Gin").click();
            page.locator(".module-admin-link").click();
            page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Details & Settings$"))).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).first().click();
            page.getByPlaceholder("VAT number:").click();
            page.getByPlaceholder("VAT number:").fill("012345678491");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).nth(1).click();
            page.getByLabel("Enable 6 digit PIN codes").uncheck();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
          //  page.waitForLoadState();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByText("Manage sites").click();
            page.getByText("Aberdeen Stay Gin").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).first().click();
            page.getByPlaceholder("Abbreviated name").click();
            page.getByPlaceholder("Abbreviated name").fill("ASG");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).nth(1).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Cancel")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).nth(2).click();
            page.locator(".setting-preview").first().click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Font colour")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Colour").setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reset")).click();
            page.getByText("Sent", new Page.GetByTextOptions().setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Font colour")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Colour").setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reset")).click();
            page.getByText("Partial Payment").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Font colour")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Colour").setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reset")).click();
            page.locator("div:nth-child(4) > .setting-preview").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Font colour")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Colour").setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reset")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back").setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.locator("app-main-nav").getByText("Zones & places").click();
            page.getByText("Upstairs!").click();
            page.frameLocator("iframe").locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Upstairs!$"))).nth(1).click();
            page.frameLocator("iframe").locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Window$"))).nth(1).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByText("Manage schedules").click();
            page.getByText("BREAKFAST.").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).click();
            page.getByPlaceholder("Schedule name").click();
            page.getByPlaceholder("Schedule name").fill("BREAKFAST");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByText("Order types").click();
            page.getByText("Bar", new Page.GetByTextOptions().setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).click();
            page.getByLabel("Turn off age verification").check();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.locator("app-main-nav").getByText("Payment methods").click();
            page.getByText("Card", new Page.GetByTextOptions().setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit").setExact(true)).click();
            page.getByRole(AriaRole.COMBOBOX).nth(1).selectOption("2: Object");
            page.locator(".custom-card-content > div > div:nth-child(2)").click();
            page.getByText("Payment category Card Payment Cash Payment Other Payment Overpayment rule No cha").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit site payment settings")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Cancel")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.locator("app-main-nav").getByText("Voucher Types").click();
            page.getByText("1234").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).click();
            page.getByPlaceholder("Voucher type name").click();
            page.getByPlaceholder("Voucher type name").fill("12341");
            page.getByPlaceholder("POS display name").click();
            page.getByPlaceholder("POS display name").fill("12341");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByText("Manage adjustments").click();
            page.getByText("Charity", new Page.GetByTextOptions().setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit").setExact(true)).click();
            page.getByLabel("Prompt for adjustment reason").check();
            page.getByLabel("Automatically apply adjustment").check();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByText("Manage devices").click();
            page.getByText("Aberdeen Stay Gin").click();
            page.getByText("ASG Slip Printer").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).click();
            page.getByRole(AriaRole.COMBOBOX).selectOption("0: Object");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByText("Users").click();
            page.locator("app-users").getByText("TestUser1", new Locator.GetByTextOptions().setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).first().click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Cancel")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).nth(1).click();
            page.getByLabel("Read only access to orders list").check();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).nth(1).click();
            page.getByLabel("Read only access to orders list").uncheck();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).nth(2).click();
            page.getByLabel("Access AdminCentre").uncheck();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).nth(2).click();
            page.getByLabel("Access AdminCentre").check();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByText("Manage notifications").click();
            page.getByText("ALLERGY").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back")).click();
            assertThat(page).hasTitle(Pattern.compile("HorizonHUB"));
            page.close();
            browser.close();
            playwright.close();
        }
    }
}

