package pages;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;



public class TimeAndAttendanceReportPage {
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
            page.getByPlaceholder("Password").click();
            page.getByPlaceholder("Password").fill("Sejlokosh80");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
            page.locator(".module-admin-link").click();
            page.getByText("Time and Attendance").click();
            page.getByText("6pin guy").click();
            page.getByPlaceholder("yyyy-mm-dd").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Previous month")).click();
            page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("4-4-2023").setExact(true)).getByText("4").click();
            page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("11-4-2023")).getByText("11").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Apply")).click();
            page.close();
            browser.close();
            playwright.close();
        }
    }

}
