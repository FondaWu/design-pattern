package creational.abstractfactory.factory;

import creational.abstractfactory.control.*;

/**
 * Created by fondawu on 2019/3/21.
 */
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
