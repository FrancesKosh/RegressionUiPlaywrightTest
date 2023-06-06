package pages;

//import com.microsoft.playwright.*;
//import com.microsoft.playwright.options.AriaRole;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class CurrencyConversionHubAuditReportPage {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://hub-master.tissl.com/");
            page.navigate("https://hub-master.tissl.com/login?returnUrl=%2Fhome");
            page.getByPlaceholder("Username").click();
            page.getByPlaceholder("Username").fill("Frances");
            page.getByPlaceholder("Username").press("Tab");
            page.getByPlaceholder("Password").fill("Sejlokosh80");
            page.getByPlaceholder("Password").press("Enter");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
            page.locator(".module-report-link").click();
            page.getByText("Hub Audit").click();
            page.getByPlaceholder("yyyy-mm-dd").click();
            page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("25-5-2023")).getByText("25").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Apply")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("View")).click();
            page.close();
            browser.close();
        }
    }
}