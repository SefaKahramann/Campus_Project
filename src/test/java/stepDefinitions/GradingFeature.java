package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import pages.TopNav;

import java.util.List;

public class GradingFeature {
    DialogContent dialogContentElement = new DialogContent();
    TopNav topNavElement = new TopNav();

    @When("The user clicks on the Grading button on the top navigation bar")
    public void theUserClicksOnTheGradingButtonOnTheTopNavigationBar(DataTable gradingBtn) {
        List<String> gradingButton = gradingBtn.asList();

        for (int i = 0; i < gradingButton.size(); i++) {
            topNavElement.wait.until(ExpectedConditions.visibilityOf(topNavElement.gradingButton));
            topNavElement.myClick(topNavElement.getWebElement(gradingButton.get(i)));
        }
    }

    @Then("The user navigates to the Grading homepage")
    public void theUserNavigatesToTheGradingHomepageAndViewsTheButtons() {
        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.gradingPageVerify));
        dialogContentElement.verifyContainsText(dialogContentElement.gradingPageVerify, "Grading");
    }

    @When("The user clicks on the Course Grade button")
    public void theUserClicksOnTheCourseGradeButton(DataTable courseGradeBtn) {
        List<String> courseGradeButton = courseGradeBtn.asList();

        for (int i = 0; i < courseGradeButton.size(); i++) {
            dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.courseGradeButton));
            dialogContentElement.myClick(dialogContentElement.getWebElement(courseGradeButton.get(i)));
        }
    }

    @Then("The user views the Course Grade table on the page")
    public void theUserViewsTheCourseGradeTableOnThePage() {
        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.courseGradeTableVerify));
        Assert.assertTrue(dialogContentElement.courseGradeTableVerify.isDisplayed());
    }

    @When("The user clicks on the Student Transcript button")
    public void theUserClicksOnTheStudentTranscriptButton(DataTable studentTranscriptBtn) {
        List<String> studentTranscriptButton = studentTranscriptBtn.asList();

        for (int i = 0; i < studentTranscriptButton.size(); i++) {
            dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.studentTranscriptBtn));
            dialogContentElement.myClick(dialogContentElement.getWebElement(studentTranscriptButton.get(i)));
        }
    }

    @Then("The user views the Student Transcript table on the page")
    public void theUserViewsTheStudentTranscriptTableOnThePage() {
        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.studentTranscriptVerify));
        Assert.assertTrue(dialogContentElement.studentTranscriptVerify.isDisplayed());
    }

    @When("The user clicks on the Transcript By Subject button")
    public void theUserClicksOnTheTranscriptBySubjectButton(DataTable transcriptBySbjtBtn) {
        List<String> transcriptBySubjectButton = transcriptBySbjtBtn.asList();

        for (int i = 0; i < transcriptBySubjectButton.size(); i++) {
            dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.transcriptBySubjectBtn));
            dialogContentElement.myClick(dialogContentElement.getWebElement(transcriptBySubjectButton.get(i)));
        }
    }

    @Then("The user views the Transcript By Subject table on the page")
    public void theUserViewsTheTranscriptBySubjectTableOnThePage() {
        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.transcriptBySubjectVerify));
        Assert.assertTrue(dialogContentElement.transcriptBySubjectVerify.isDisplayed());
    }
}