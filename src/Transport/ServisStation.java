package Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServisStation {
    private final Queue<Transport> transports = new ArrayDeque<>();
    private void add(Transport transport){
        transports.offer(transport);
    }
    public void addPassengerCars(PassengerCars passengerCars){
        add(passengerCars);

    }
    public void addTruck(Trucks trucks){
      add(trucks);
    }
    public void servise(){
        if(!transports.isEmpty()){
            Transport transport = transports.poll();
            boolean result = transport.servise();
            if(!result){transport.repair();}
        }
    }
}
