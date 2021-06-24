public class Vegetable {

    String color ="red";
    boolean isOrganicallyGrown;
    int calories;

public static void m1(){
    System.out.println("Vegetable");

}

private void m2(){
    System.out.println("Veggie");
}
    public void grow(){

        System.out.println("Generic Grow");

    }

    public void consume(){

        System.out.println("Generic consuming");

    }

    public void consume(int amount){

        System.out.println("Generic consuming" + "aq");

    }


    @Override
    public String toString() {
        return "Vegetable{" +
                "color='" + color + '\'' +
                ", isOrganicallyGrown=" + isOrganicallyGrown +
                ", calories=" + calories +
                '}';
    }
}

