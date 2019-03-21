package creational.abstractfactory;

import creational.abstractfactory.factory.GUIFactory;
import creational.abstractfactory.factory.MacFactory;
import creational.abstractfactory.factory.WinFactory;

/**
 * Created by fondawu on 2019/3/21.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) throws Exception {
        String osName = System.getProperty("os.name");
        GUIFactory guiFactory;

        if(osName.toLowerCase().startsWith("win")){
            guiFactory = new WinFactory();
        }else if (osName.toLowerCase().startsWith("mac") ) {
            guiFactory = new MacFactory();
        } else {
            throw new Exception("不支持此操作系统:" + osName);
        }

        UIApplication application = new UIApplication(guiFactory);
        application.paint();
    }
}
