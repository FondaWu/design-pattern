package creational.abstractfactory;

import creational.abstractfactory.control.Button;
import creational.abstractfactory.control.Checkbox;
import creational.abstractfactory.factory.GUIFactory;

/**
 * Created by fondawu on 2019/3/21.
 */
public class UIApplication {
    private GUIFactory guiFactory;
    private Button button;
    private Checkbox checkbox;

    public UIApplication(GUIFactory guiFactory){
        this.guiFactory = guiFactory;
        button = this.guiFactory.createButton();
        checkbox = this.guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();;
        checkbox.paint();
    }

}
