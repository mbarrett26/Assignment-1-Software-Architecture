public class FactoryProducer {
    public static AbsrtactFactory getFactory(boolean apple){
        if(apple){
            return new GroceryProductFactory();
        }else{
            return new GroceryProductFactory();
        }

    }
}
