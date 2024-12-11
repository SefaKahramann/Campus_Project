package stepDefinitions;

import io.cucumber.java.en.*;
import pages.DialogContent;
import pages.TopNav;

public class CalendarFeature {
    DialogContent dialogContentElement = new DialogContent();
    TopNav topNavElement = new TopNav();

    @When("The user clicks on the Calendar button on the top navigation bar")
    public void theUserClicksOnTheCalendarButtonOnTheTopNavigationBar() {
    }

    @Then("The user views today's date and the Weekly Course Plan by default")
    public void theUserViewsTodaySDateAndTheWeeklyCoursePlanByDefault() {
    }

    @Then("The user views the icons \\(P,S,E,C) and descriptions of the scheduled lessons")
    public void theUserViewsTheIconsPSECAndDescriptionsOfTheScheduledLessons() {
    }

    @Given("The user is on the Calendar page")
    public void theUserIsOnTheCalendarPage() {
    }

    @Then("The user should view two links to navigate to the Weekly Course Plan and Calendar pages")
    public void theUserShouldViewTwoLinksToNavigateToTheWeeklyCoursePlanAndCalendarPages() {
    }

    @When("The user clicks on these links")
    public void theUserClicksOnTheseLinks() {
    }

    @Then("The user should be redirected to the respective page")
    public void theUserShouldBeRedirectedToTheRespectivePage() {
    }

    @Given("The user is on the Weekly Course Plan page")
    public void theUserIsOnTheWeeklyCoursePlanPage() {
    }

    @Then("The user should view icons to navigate forward and backward \\(Previous, Today, Next) on the page")
    public void theUserShouldViewIconsToNavigateForwardAndBackwardPreviousTodayNextOnThePage() {
    }

    @When("The user clicks on these icons")
    public void theUserClicksOnTheseIcons() {
    }

    @Then("The user should be redirected to the corresponding date on the calendar")
    public void theUserShouldBeRedirectedToTheCorrespondingDateOnTheCalendar() {
    }

    @Then("The user should view the courses they are responsible for")
    public void theUserShouldViewTheCoursesTheyAreResponsibleFor() {
    }

    @When("The user clicks on a course")
    public void theUserClicksOnACourse() {
    }

    @Then("The user should view the details of that course")
    public void theUserShouldViewTheDetailsOfThatCourse() {
    }
}
