package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.action.SelectMenuForm;

import java.util.Collection;

public class SelectedForm {
    public static Question<Collection<String>> displayed() {
        return Text.ofEach(SelectMenuForm.LIST_SELECTED_COLOR_FROM_MULTISELECT_DROP_DOWN).describedAs("the colors selected");
    }
    public static Question<Integer> AllCount() {
        return Text.of(SelectMenuForm.LIST_SELECTED_COLOR_FROM_MULTISELECT_DROP_DOWN)
                .describedAs("the number of items left")
                .asInteger();
    }
}
