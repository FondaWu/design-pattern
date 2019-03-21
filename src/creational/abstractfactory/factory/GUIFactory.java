package creational.abstractfactory.factory;

import creational.abstractfactory.control.Button;
import creational.abstractfactory.control.Checkbox;

/**
 * Created by fondawu on 2019/3/21.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
