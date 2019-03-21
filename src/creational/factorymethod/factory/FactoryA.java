package creational.factorymethod.factory;

import creational.factorymethod.product.IProduct;
import creational.factorymethod.product.ProductA;

/**
 * Created by fondawu on 2019/3/21.
 */
public class FactoryA implements IFactory{
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}
