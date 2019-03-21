package creational.abstractfactory.control;

/**
 * Created by fondawu on 2019/3/21.
 */
public class MacCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Paint a mac style checkbox");
    }
}
