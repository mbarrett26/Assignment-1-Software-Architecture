public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbsrtactFactory groceryProductFactory = FactoryProducer.getFactory(false);

        GroceryProduct product1 = groceryProductFactory.getProduct("Apple");
        product1.add();

        GroceryProduct product2 = groceryProductFactory.getProduct("Banana");
        product2.add();
    }
}
