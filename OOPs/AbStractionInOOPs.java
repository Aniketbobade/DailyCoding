package codes.OOPs;
//we can not create object of abstract class
/*
abstract class include normal methods, abstract methods, one or more methods
if any subclass extends to abstract class then it must have implements the abstract methods in subclass implementation

* */

abstract interface MyInterface {
    public abstract void myMethod();
    public void myOtherMethod();
}

class MyClass implements MyInterface {
    public void myMethod() {
        // implementation of myMethod
        System.out.println("myMethod abstraction in interface");
    }
    public void myOtherMethod() {
        // implementation of myOtherMethod
        System.out.println("normal method");
    }
}


abstract class car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("playing songs");
    }
}

class alto extends car{

    @Override
    public void drive() {
        System.out.println("running fast");
    }
}
public class AbStractionInOOPs {

    public static void main(String[] args) {
//       using class
        alto obj = new alto();
        obj.drive();
        obj.playMusic();

//        using interface
        MyClass obj2 = new MyClass();
        obj2.myMethod();
        obj2.myOtherMethod();
    }
}
