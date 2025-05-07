package Study.src.designpattern.factory.idcard;

import Study.src.designpattern.factory.framework.Factory;
import Study.src.designpattern.factory.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
