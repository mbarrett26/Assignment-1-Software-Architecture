public class Bananas implements GroceryProduct {

    double price = 1.75;
    @Override
    public void add(){
        System.out.println("Bananas: $"+price+"/kg");
    }
}
