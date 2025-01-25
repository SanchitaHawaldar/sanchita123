//Program to demonstrate type of constructor
clss Emp
{
  int eid;
  String ename;
  float esal;
  
  public Emp()
  

  {
     eid=1;
     ename="tom";
     esal=20000;
  }
  public Emp(int id,String name,float sal)
  {
     eid=id;
     ename=name;
     esal=sal;

  }
  public void display()
  

  System.out.println("eid="+eid);
  System.out.println("ename="+ename);
  System.out.println("esal="+esal);
  }
}

public class p4{
       
   public static void main(String[]args){
         
        Emp e1=new Emp();
        Emp e2=new Emp(2,"sachin",20000);
        e1.display();
        e2.display();
  }
}