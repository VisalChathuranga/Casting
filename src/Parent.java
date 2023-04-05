public class Parent {
    String name;
    void display(){
        System.out.println("Super class is Running!");
    }

}
class Child extends Parent{
    int age;
    void display(){
        System.out.println("Sub class is Running!");
    }
}
class Downcasting{
    public static void main(String[] args) {
        Parent p = new Child();
        p.name = "Gawesh";
        Child c = (Child) p;
        c.age=25;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }
}