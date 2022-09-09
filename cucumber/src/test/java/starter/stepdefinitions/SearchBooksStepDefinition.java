package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import starter.model.books;

public class SearchBooksStepDefinition {
    starter.model.books books = new books();
    @When("{actor} search book {string}")
    public void userSearchBook(Actor actor, String bookTitle) {
        actor.attemptsTo(Enter.theValue(bookTitle)
                .into(By.cssSelector("#searchBox"))
                .thenHit(Keys.ENTER));
    }

    @When("{actor} click book {string}")
    public void userClickBook(Actor actor, String bookname){
        WaitUntil.the(By.linkText(bookname),WebElementStateMatchers.isVisible());
        String title = actor.asksFor(Text.of(By.xpath("//*[@class='rt-tbody'][1]/div[1]//*[@class='rt-td'][2]//a")));
        String author = actor.asksFor(Text.of(By.xpath("//*[@class='rt-tbody'][1]/div[1]//*[@class='rt-td'][3]")));
        String publisher = actor.asksFor(Text.of(By.xpath("//*[@class='rt-tbody'][1]/div[1]//*[@class='rt-td'][4]")));
        books.setTitle(title);
        books.setAuthor(author);
        books.setPublisher(publisher);
        actor.attemptsTo(Click.on(By.linkText(bookname)));
    }

    @Then("{actor} see {string}")
    public void UserSee(Actor actor, String text){
        if(books.getTitle()!=null){
            WaitUntil.the(By.xpath("//*[@id='title-wrapper']//*[@id='userName-value']"), WebElementStateMatchers.isVisible());
            actor.attemptsTo(Ensure.that(By.xpath("//*[@id='title-wrapper']//*[@id='userName-value']")).textContent().isEqualToIgnoringCase(books.getTitle()));
            actor.attemptsTo(Ensure.that(By.xpath("//*[@id='author-wrapper']//*[@id='userName-value']")).textContent().isEqualToIgnoringCase(books.getAuthor()));
            actor.attemptsTo(Ensure.that(By.xpath("//*[@id='publisher-wrapper']//*[@id='userName-value']")).textContent().isEqualToIgnoringCase(books.getPublisher()));
        }
        else{
            actor.attemptsTo(Ensure.that(By.xpath("//*[text()='"+text+"']")).textContent().isEqualToIgnoringCase(text));
        }
    }
}
