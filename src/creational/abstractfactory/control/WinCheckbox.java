package creational.abstractfactory.control;

/**
 * Created by fondawu on 2019/3/21.
 */
public class WinCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Paint a windows style checkbox");
    }
}
