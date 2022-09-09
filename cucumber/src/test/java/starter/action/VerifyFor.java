package starter.action;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VerifyFor {

    public static Performable valueOnSelectValueFieldIsVisible(String value) {
        return Task.where("{0} See '" + value + "' Is visible",
                Ensure.that(SelectMenuForm.SELECT_VALUE_TEXT_FIELD).text().isEqualTo(value)
        );
    }

    public static Performable valueOnSelectOneFieldIsVisible(String value) {
        return Task.where("{0} See '" + value + "' Is visible",
                Ensure.that(SelectMenuForm.SELECT_ONE_TEXT_FIELD).text().isEqualTo(value)
        );
    }

    public static Performable valueOnSelectOldStyleMenuFieldIsVisible(String value) {
        return Task.where("{0} See '" + value + "' Is visible",
                Ensure.that(SelectMenuForm.OLD_STYLE_SELECT_MENU_FIELD).selectedVisibleText().isEqualTo(value)
        );
    }

    public static Performable valueOnSelectMultiSelectDropDownFieldIsVisible(String value) {
        if (value.equals("All Color")) {
            return Task.where("{0} See All Color Are Visible",
                    Ensure.thatAmongst(SelectMenuForm.LIST_SELECTED_COLOR_FROM_MULTISELECT_DROP_DOWN).hasSize(4)
            );
        } else {
            return Task.where("{0} See '" + value + "' Is visible",
                    Ensure.that(SelectMenuForm.LIST_SELECTED_COLOR_FROM_MULTISELECT_DROP_DOWN).text().isEqualTo(value)
            );
        }
    }
}
