package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable SelectMenuPage(){
        return Task.where("{0} Opens Select Menu Page",Open.browserOn().the(SelectMenuPage.class));
    }

}
