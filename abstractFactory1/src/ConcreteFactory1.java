/**
 * Created by lchon on 19/2/2017.
 */
 class ConcreteFactory1 extends AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
