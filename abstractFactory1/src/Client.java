/**
 * Created by lchon on 19/2/2017.
 */
public class Client {
    private AbstractProductA _abstractProductA;
    private AbstractProductB _abstractProductB;

    public Client(AbstractFactory factory){
        _abstractProductA = factory.createProductA();
        _abstractProductB = factory.createProductB();
    }

    public void run(){
        _abstractProductB.Interact(_abstractProductA);
    }
}
