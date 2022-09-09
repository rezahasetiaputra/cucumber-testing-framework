package starter.stepdefinitions;

import io.cucumber.java.en.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.w3c.dom.css.CSSValue;
import starter.action.InputTo;
import starter.action.SelectMenuForm;
import starter.action.VerifyFor;
import starter.model.books;
import starter.navigation.NavigateTo;
import starter.navigation.SelectMenuPage;

public class SelectingMenuStepDefinition {
    String optionSelectValue;
    String optionSelectOne;
    String optionOldStyleMenuValue;
    String optionMultiSelectDropDown;

    @Given("{actor} go to {string}")
    public void userGoTo(Actor actor, String url ) {
        actor.attemptsTo(Open.url(url));
    }

    @When("{actor} in {string} page")
    public void userInPage(Actor actor, String pageName) {
      actor.attemptsTo(Ensure.that(By.cssSelector(".main-header")).textContent().isEqualToIgnoringCase(pageName));
    }

    @When("{actor} choose select value {string}")
    public void userChooseSelectValue(Actor actor,String option) {
        actor.attemptsTo(InputTo.selectValueField(option));
        this.optionSelectValue = option;
    }

    @When("{actor} choose select one {string}")
    public void userChooseSelectOne(Actor actor, String option) {
        actor.attemptsTo(InputTo.selectOneField(option));
        this.optionSelectOne = option;
    }

    @When("{actor} choose old style select menu {string}")
    public void userChooseOldSytleSelectMenu(Actor actor, String option) {
      actor.attemptsTo(InputTo.selectOldStyleMenuField(option));
        this.optionOldStyleMenuValue = option;
    }

    @When("{actor} choose multi select drop down {string}")
    public void userChooseMultiSelectDropDown(Actor actor, String option) {
        actor.attemptsTo(InputTo.selectMultiSelectDropDownField(option));
        this.optionMultiSelectDropDown = option;
    }

    @Then("{actor} success input all select menu")
    public void userSuccesInputAllSelectMenu(Actor actor) {
      actor.attemptsTo(VerifyFor.valueOnSelectValueFieldIsVisible(this.optionSelectValue));
      actor.attemptsTo(VerifyFor.valueOnSelectOneFieldIsVisible(this.optionSelectOne));
      actor.attemptsTo(VerifyFor.valueOnSelectOldStyleMenuFieldIsVisible(this.optionOldStyleMenuValue));
      actor.attemptsTo(VerifyFor.valueOnSelectMultiSelectDropDownFieldIsVisible(this.optionMultiSelectDropDown));

    }
}
