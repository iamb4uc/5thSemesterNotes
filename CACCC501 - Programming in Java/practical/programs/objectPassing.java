// What is object in Java? How object are passed to a method? Also, show how objects can be return to class.

class obj {
  int a;
  void get_a() {
    a=10;
  }
  obj calc(obj m){ //object as argument {
    obj x=new obj();
    x.a=m.a;
    return x; //returning object
  }
  void put_a() {
    System.out.pintln("a="+a);
  }
}

public class objectPassing {
  public static void main(String[] args)
    {
    obj o=new obj();
    o.get_a();
    System.out.println("Value of o object");
    o.put_a();
    obj o1=new obj();
    o1=o1.calc(o);
    System.out.println("Value of o1 object");
    o1.put_a();
  }
}
