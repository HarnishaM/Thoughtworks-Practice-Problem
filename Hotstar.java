public class Hotstar implements StreamingService {
    final int price=1;
    final int unit=5;
    final String name="Hotstar";

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
