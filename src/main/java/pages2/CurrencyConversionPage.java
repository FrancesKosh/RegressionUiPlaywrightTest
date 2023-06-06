package pages2;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class CurrencyConversionPage {
            public static void main(String[] args){
            Playwright playwright = Playwright.create(); {
                Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
                BrowserContext context = browser.newContext();
                Page page = context.newPage();
                page.navigate("https://pos-master.tissl.com/");
                page.navigate("https://pos-master.tissl.com/#/registration");
                page.getByPlaceholder("Username").click();
                page.locator("input[type=\"text\"]").fill("Frances");
                page.locator("input[type=\"text\"]").press("Tab");
                page.locator("input[type=\"password\"]").fill("Sejlokosh80");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
                page.locator("#site").selectOption("1e058bef-2ef1-4be4-a4a3-ec816984e618");
                page.locator("#receiptPrinter").selectOption("8ebb8504-eb10-44cc-9f7b-0f7c7f40d1c2");
                page.getByPlaceholder("Device Name").click();
                page.getByRole(AriaRole.TEXTBOX).fill("5241");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
                page.getByPlaceholder("Username").click();
                page.locator("input[type=\"text\"]").fill("Frances");
                page.locator("input[type=\"text\"]").press("Tab");
                page.locator("input[type=\"password\"]").fill("Sejlokosh80");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Done")).click();
                page.navigate("https://pos-master.tissl.com/#/pos/ORDER/STANDARD");
                page.navigate("https://pos-master.tissl.com/#/pos/ORDER/STANDARD;orderID=a69e3fbe-bb96-4715-bb10-267ff7c2d923");
                page.getByText("Macchiato Premium").click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("AED AED0.00")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Apply")).click();
                page.locator("#numbers_pad").getByText("£11.81").click();
            }
        }
}