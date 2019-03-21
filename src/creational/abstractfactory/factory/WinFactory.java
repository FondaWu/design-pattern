package creational.abstractfactory.factory;

import creational.abstractfactory.control.Button;
import creational.abstractfactory.control.Checkbox;
import creational.abstractfactory.control.WinButton;
import creational.abstractfactory.control.WinCheckbox;

/**
 * Created by fondawu on 2019/3/21.
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
