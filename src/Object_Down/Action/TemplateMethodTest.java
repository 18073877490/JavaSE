package Object_Down.Action;

//抽象类的应用：模板方法的设计模式
public class TemplateMethodTest {
    public static void main(String[] args) {
        new DrawMoney().process();
        new ManageMoney().process();
    }
}

abstract class BankTemplateMethod {
    public void takeNumber() {
        System.out.println("排队取号");
    }

    public abstract void transact(); //办理具体业务 // 钩子方法

    public void evaluate() {
        System.out.println("反馈评分");
    }

    //    模板方法，把基本操作组合到一起，子类一般不允许重写
    public final void process() {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}

class DrawMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要取款！");
    }
}

class ManageMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要理财！");
    }
}
