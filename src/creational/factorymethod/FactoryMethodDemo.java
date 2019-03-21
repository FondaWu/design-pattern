package creational.factorymethod;

import creational.factorymethod.factory.FactoryA;
import creational.factorymethod.factory.FactoryB;

/**
 * Created by fondawu on 2019/3/21.
 */
public class FactoryMethodDemo {

    public static void main(String[] args){
        //客户要产品A
        FactoryA factoryA = new FactoryA();
        factoryA.createProduct().feature();

        //客户要产品B
        FactoryB factoryB = new FactoryB();
        factoryB.createProduct().feature();
    }

}
