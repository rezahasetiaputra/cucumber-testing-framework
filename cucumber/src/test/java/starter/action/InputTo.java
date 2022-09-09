package starter.action;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class InputTo {
    public static Performable selectValueField(String value) {
        return Task.where("{0} Type '" + value + "' and enter",
                Enter.theValue(value)
                        .into(SelectMenuForm.SELECT_VALUE_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable selectOneField(String value) {
        return Task.where("{0} Type '" + value + "'and enter",
                Enter.theValue(value)
                        .into(SelectMenuForm.SELECT_ONE_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable selectOldStyleMenuField(String value) {
        return Task.where("{0} Choose '" + value + "' From Select Old Style Menu Field",
                SelectFromOptions.byVisibleText(value).from(SelectMenuForm.OLD_STYLE_SELECT_MENU_FIELD)
        );
    }

    public static Performable selectMultiSelectDropDownField(String value) {
        if(value.equals("All Color")){
            return Task.where("{0} Select All Color",
                    Scroll.to(SelectMenuForm.MULTISELECT_DROP_DOWN_FIELD).andAlignToTop(),
                    Click.on(SelectMenuForm.MULTISELECT_DROP_DOWN_FIELD),
                    Click.on(SelectMenuForm.MULTISELECT_DROP_DOWN_COLOR_FIELD.of("0")),
                    Click.on(SelectMenuForm.MULTISELECT_DROP_DOWN_COLOR_FIELD.of("1")),
                    Click.on(SelectMenuForm.MULTISELECT_DROP_DOWN_COLOR_FIELD.of("2")),
                    Click.on(SelectMenuForm.MULTISELECT_DROP_DOWN_COLOR_FIELD.of("3"))
            );
        }
        else{
            return Task.where("{0} Type '" + value + "'and enter",
                    Enter.theValue(value)
                            .into(SelectMenuForm.MULTISELECT_DROP_DOWN_TEXT_FIELD)
                            .thenHit(Keys.ENTER)
            );
        }

    }

}
