public class Netflix implements StreamingService {
    final int price=10;
    final int unit=10;
    final String name="Netflix";

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
