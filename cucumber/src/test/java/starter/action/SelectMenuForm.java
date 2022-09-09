package starter.action;

import net.serenitybdd.screenplay.targets.Target;


public class SelectMenuForm {
    static Target SELECT_VALUE_FIELD = Target.the("Select Value field").locatedBy("#react-select-2-input");
    static Target SELECT_VALUE_TEXT_FIELD = Target.the("Select Value Text field").locatedBy("//*[@id='withOptGroup']//*[@class=' css-1uccc91-singleValue']");
    static Target SELECT_ONE_FIELD = Target.the("Select One field").locatedBy("#react-select-3-input");
    static Target SELECT_ONE_TEXT_FIELD = Target.the("Select One Text field").locatedBy("//*[@id='selectOne']//*[@class=' css-1uccc91-singleValue']");
    static Target OLD_STYLE_SELECT_MENU_FIELD = Target.the("Old Style Select Menu field").locatedBy("#oldSelectMenu");
    static Target MULTISELECT_DROP_DOWN_TEXT_FIELD = Target.the("Multiselect Drop Down Text field").locatedBy("#react-select-4-input");
    static Target MULTISELECT_DROP_DOWN_COLOR_FIELD = Target.the("{0} on Multiselect Drop Down field").locatedBy("#react-select-4-option-{0}");
    static Target MULTISELECT_DROP_DOWN_FIELD = Target.the("Multiselect Drop Down field").locatedBy("//*[text()='Select...']");
    public static final Target LIST_SELECTED_COLOR_FROM_MULTISELECT_DROP_DOWN = Target.the("List Selected Color").locatedBy(".css-12jo7m5");

}
