public class Apples implements GroceryProduct {

    double price = 3.50;
    @Override
    public void add(){
        System.out.println("Apples: $"+price+"/kg");
    }
}
