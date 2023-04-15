class covld 
{
  int a;
  covld(int x)
  {
      a=x;
    }
  covld(covld m, covld n)
  {
      int h;
      h=m.a+n.a;
      System.out.println("The result is "+h);
    }
}

/**
 * contruc_obj
 */
public class contruc_obj {

  public static void main(String[] args) {
    covld a1=new covld(12);
    covld a2=new covld(13);
    covld a3=new covld(a1, a2);
  }
}
