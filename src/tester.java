public class tester {


    public static void main(String[] args) {

//        Object o = new Carrot();
//        System.out.println(o.toString());


        Vegetable veggie = new Carrot();
        veggie.consume(20);
        veggie.consume();
        System.out.println(veggie.color);
        veggie.m1();



    }
}
