public class GroceryProductFactory extends AbsrtactFactory {
    @Override
    public GroceryProduct getProduct(String productType){
        if (productType.equalsIgnoreCase("Apple")){
            return new Apples();
        } else if (productType.equalsIgnoreCase("Banana")){
            return new Bananas();
        }
        return null;
    }
}
