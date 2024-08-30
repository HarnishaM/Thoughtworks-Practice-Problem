public class AmazonPrime implements StreamingService {
    final int price=2;
    final int unit=5;
    final String name="AmazonPrime";

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public int getUnit(){
        return unit;
    }
    
}
