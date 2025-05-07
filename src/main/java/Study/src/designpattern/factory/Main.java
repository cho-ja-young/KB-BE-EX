package Study.src.designpattern.factory;

import Study.src.designpattern.factory.framework.Factory;
import Study.src.designpattern.factory.framework.Product;
import Study.src.designpattern.factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heunmin Son");
        Product card3 = factory.create("Kane");
        System.out.println();

        card1.use();
        card2.use();
        card3.use();
    }
}
