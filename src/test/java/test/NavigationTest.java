package test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static utils.TestData.*;


public final class NavigationTest extends BaseTest {
    @Test
    public void TestBaseUrlLanding() {
        getPage().navigate(BASE_URL);

        assertThat(getPage()).hasURL(HOME_END_POINT);
    }

    @Test
    public void testWomenNavigatesToKidsPage() {
        if (getIsOnHomePage()) {

            getPage().locator("div.brand > button[aria-label='open the menu'] >.btn-icon > span").click();
            getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(WOMEN).setExact(true)).click();
            assertThat(getPage()).hasURL(BASE_URL + SHOP + WOMEN_END_POINT);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testWomenNavigatesToWomenPage() {
        if (getIsOnHomePage()) {

            getPage().locator("div.brand > button[aria-label='open the menu'] >.btn-icon > span").click();
            getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(KIDS).setExact(true)).click();
            assertThat(getPage()).hasURL(BASE_URL + SHOP + KIDS_END_POINT);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testWomenNavigatesToMenPage() {
        if (getIsOnHomePage()) {

            getPage().locator("div.brand > button[aria-label='open the menu'] >.btn-icon > span").click();
            getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(MEN).setExact(true)).click();
            assertThat(getPage()).hasURL(BASE_URL + SHOP + MEN_END_POINT);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testWomenNavigatesToHikingPage() {
        if (getIsOnHomePage()) {

            getPage().locator("div.brand > button[aria-label='open the menu'] >.btn-icon > span").click();
            getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(HIKING).setExact(true)).click();
            assertThat(getPage()).hasURL(BASE_URL + SHOP + HIKING_END_POINT);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testWomenNavigatesToRunnersPage() {
        if (getIsOnHomePage()) {

            getPage().locator("div.brand > button[aria-label='open the menu'] >.btn-icon > span").click();
            getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(RUNNER).setExact(true)).click();
            assertThat(getPage()).hasURL(BASE_URL + SHOP + RUNNERS_END_POINT);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testAboutNavigatesToContactUsPage() {
        getPage().navigate(BASE_URL);
        getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CONTACT_US).setExact(true)).first().click();

        assertThat(getPage()).hasURL(BASE_URL + CONTACT);
    }

    @Test
    public void testAboutNavigatesToSellWithUsPage() {
        getPage().navigate(BASE_URL);
        getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SELL_WITH_US).setExact(true)).first().click();

        assertThat(getPage()).hasURL(BASE_URL + SELL);
    }

    @Test
    public void testAboutNavigatesToShippingPage() {
        getPage().navigate(BASE_URL);
        getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SHOPPING).setExact(true)).first().click();

        assertThat(getPage()).hasURL(BASE_URL + SHIPPING);
    }
}
