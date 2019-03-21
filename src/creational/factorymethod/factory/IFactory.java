package creational.factorymethod.factory;

import creational.factorymethod.product.IProduct;

/**
 * Created by fondawu on 2019/3/21.
 */
public interface IFactory {
    IProduct createProduct();
}
