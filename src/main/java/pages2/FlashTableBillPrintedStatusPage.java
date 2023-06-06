package pages2;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import java.util.regex.Pattern;

public class FlashTableBillPrintedStatusPage {
        public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
                BrowserContext context = browser.newContext();
                Page page = context.newPage();
                page.navigate("https://pos-master.tissl.com/");
                page.navigate("https://pos-master.tissl.com/#/registration");
                page.getByPlaceholder("Username").click();
                page.locator("input[type=\"text\"]").fill("Frances");
                page.getByPlaceholder("Password").click();
                page.locator("input[type=\"password\"]").fill("Sejlokosh80");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
                page.locator("#site").selectOption("1e058bef-2ef1-4be4-a4a3-ec816984e618");
                page.locator("#receiptPrinter").selectOption("8ebb8504-eb10-44cc-9f7b-0f7c7f40d1c2");
                page.getByPlaceholder("Device Name").click();
                page.getByRole(AriaRole.TEXTBOX).fill("01");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
                page.getByRole(AriaRole.TEXTBOX).click();
                page.getByRole(AriaRole.TEXTBOX).fill("010123");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
                page.getByPlaceholder("Username").click();
                page.locator("input[type=\"text\"]").fill("Frances");
                page.getByPlaceholder("Password").click();
                page.locator("input[type=\"password\"]").fill("Sejlokosh80");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
                page.navigate("https://pos-master.tissl.com/#/pos/ORDER/STANDARD");
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Admin")).click();
                page.locator("div").filter(new Locator.FilterOptions().setHasText("Important Message End of day can not be done because you have: 1 active cash dra")).nth(1).click();
                page.navigate("https://pos-master.tissl.com/#/pos/ORDER/STANDARD");
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Admin")).click();
                page.locator("div:nth-child(4) > .finaliseBtnIcon").click();
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" New Sale")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Re-open trading session")).click();
                page.navigate("https://pos-master.tissl.com/#/pos/ORDER/STANDARD;orderID=816c0aba-0c3e-4632-901c-d01ab0badd7b");
                page.getByPlaceholder("Enter customer name").click();
                page.getByPlaceholder("Enter customer name").fill("Jerry");
                page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Select Area to Expand Modifiers Order ActivityBar$"))).locator("i").first().click();
                page.getByText("Print Bill").click();
                page.locator("span").filter(new Locator.FilterOptions().setHasText("Place")).locator("path").click();
                page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("Alternate Text")).click();
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Zones")).click();
                page.getByText("Status key").click();
                page.getByText("Status key").click();
                page.locator("chs-zones-toolbars svg").nth(3).click();
                page.locator("chs-zones-toolbars path").nth(3).click();
                page.close();
                browser.close();
            }
        }
    }

