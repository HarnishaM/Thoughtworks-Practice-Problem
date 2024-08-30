import java.util.*;

public class Customer {
     final Map <StreamingService, Integer> map=new HashMap<>();

    public void addServices(StreamingService service, int hours){
        if(hours% service.getUnit()!=0){
            System.out.println(service.getName()+" allows viewing hours in multiples of "+ service.getUnit());
        }
        else{
            map.put(service, hours);
        }
    }
    public int calculateCost(){
        int total=0;
        for(Map.Entry<StreamingService, Integer> entry: map.entrySet()){
            StreamingService service=entry.getKey();
            int hours=entry.getValue();
            int price=(hours/service.getUnit())*service.getPrice();
            total+=price;
        }
        return total;
    }

    
}
