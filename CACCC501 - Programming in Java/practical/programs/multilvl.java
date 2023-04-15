class A_class {
  void disp_A () {
    System.out.println("Display Grandparent");
  }
}
class B_class {
  void disp_B () {
    System.out.println("Display Parent");
  }
}
class C_class {
  void disp_C () {
    System.out.println("Display child");
  }
}

public class multilvl {
  public static void main(String[] args) {
    C_class c = new C_class();
    c.disp_A();
    c.disp_B();
    c.disp_C();
  }
}
