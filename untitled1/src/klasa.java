
 class A {
    static int i = 5;
    void f() {
        System.out.print(" A" + (i++));        }
        void g() {
        this.f();
    }
}
class B extends A {
    void f() {
        System.out.print(" B" + (i--));
    }
    void h() {
        super.f();
    } } class C extends B {
    void f() {
        System.out.print(" C" + (++i));
        this.h();
    }
    void g() {
        super.f();
    }
}
class Test1 {
    public static void main(String[] args) {
        A a = new A(); a.f(); a.g();
        B b = new B(); b.f(); b.g(); b.h();
        C c = new C(); c.f(); c.g(); c.h();
    }
}