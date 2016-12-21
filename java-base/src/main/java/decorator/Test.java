package decorator;

/**
 * Created by liuhang on 2016/12/15.
 */
public class Test {

    public static void main(String[] args) {
        Component component, decoratorA;

        component = new ConcreteComponent();
        decoratorA = new ConcreteDecoratorA(component);//对原有具体构件component进行装饰

        component.operation();
        System.out.println("\n装饰一次后:");
        decoratorA.operation();

        System.out.println("\n二次装饰");
        Component decoratorB;
        decoratorB = new ConcreteDecoratorB(decoratorA);// 如果需要对原有构件对象装饰后的decoratorA对象上进行再次装饰
        decoratorB.operation();
    }

}
