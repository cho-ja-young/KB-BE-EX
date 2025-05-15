package Study.src.designpattern.Prototype.framework;

public interface Product extends Cloneable{
    void use(String s);
    Product createCopy();
}
