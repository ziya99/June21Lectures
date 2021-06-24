package az;

public class casting {

    public static void main(String[] args) {


        Object o = new Student();

        Student st =(Student) o;

        method1(new Student());
        method1(new String());
        method1(new StringBuffer());



    }


  public static void method1(Object o){




    }
}