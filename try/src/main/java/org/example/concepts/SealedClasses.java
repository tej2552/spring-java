package org.example.concepts;


//Sealed classes are the classes which are used when you want to permit only few classes to inherit a class and not all the classes.
public class SealedClasses {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        b.add();
        c.sub();

    }
}

sealed class A permits B {
    int a = 5;
    int b = 4;
}
final class B extends A{
    int sum;
    public void add(){
        sum = a + b;
        System.out.println(sum);
    }

}
class C{
    int diff, a=5, b=10;
    public void sub(){
        diff = a - b;
        System.out.println(diff);
    }
}