package creational.factorymethod.factory;

import creational.factorymethod.product.IProduct;
import creational.factorymethod.product.ProductB;

/**
 * Created by fondawu on 2019/3/21.
 */
public class FactoryB implements IFactory{
    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}
