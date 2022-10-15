import Transport.*;

import java.util.List;


public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        boolean success = Data.validate("test","test","test");
        if (success) {
            System.out.println("Данные валидны");
        }else{
            System.out.println("Данные не валидны");
        }

        Mechanic<PassengerCars> petr= new Mechanic<PassengerCars>("Petr","Petrov","FDC");
        Sponsor ivan = new Sponsor("Ivan",200000);
        Sponsor michlen = new Sponsor("Michlen",200000);
        Mechanic<Trucks> leva= new Mechanic<Trucks>("Leva","Шишов","KJH");
        Sponsor zhora = new Sponsor("Zhora",200000);
        Mechanic<Bus> ira= new Mechanic<Bus>("Ira","Petrova","PIU");
        Sponsor lukoil = new Sponsor("Lukoil",200000);


        PassengerCars lada = new PassengerCars("Lada ", "Grande ", 1.5, TypeBody.N1);
        PassengerCars audi = new PassengerCars("Audi ", "A8 ", 3.6, TypeBody.N3);
        PassengerCars volvo = new PassengerCars("Volvo ", "XC 60 ", 3.0, TypeBody.N4);
        PassengerCars kia = new PassengerCars("Kia ", "Soul ", 1.5, TypeBody.N3);
        kia.addDriver(new DriverB("Kia ", "Soul ", "Vova ", "B", 10, kia));
        kia.addMechanic(petr);
        kia.addSponsor(ivan,michlen);

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        Trucks kamaz = new Trucks("Камаз ", "А10 ", 10.00, Tonnage.N1);
        kamaz.addDriver(new DriverD("Камаз ", "А10 ", "Игорь ", "D", 10, kamaz));
        kamaz.addMechanic(leva);
        kamaz.addSponsor(zhora,michlen);
        Trucks mersedes = new Trucks("Mersedes ", "Тягач ", 15.00, Tonnage.N2);
        Trucks gazel = new Trucks("Газель ", "Бортовая ", 10.75, Tonnage.N3);
        Trucks hyundai = new Trucks("Hyundai ", "Mighty ", 5.00, Tonnage.N1);


        Bus ford = new Bus("Ford ", "Mondeo ", 1.7, Capacyty.SMALL);
        ford.addDriver(new DriverC("Ford ", "Mondeo ", "Sasha ", "C", 10, ford));
        ford.addMechanic(ira);
        ford.addSponsor(lukoil,michlen);
        Bus liaz = new Bus("Liaz ", "Kursor ", 3.5, Capacyty.MEDIUM);
        Bus mersedes1 = new Bus("Mersedes ", "Splinter ", 4.0, Capacyty.BIG);
        System.out.println(ford.toString());
        System.out.println(liaz.toString());
        System.out.println(mersedes1.toString());

        servise(lada,kamaz,ford,liaz,mersedes1);
        List<Transport> transports= List.of(kia,kamaz,ford);
        ServisStation servisStation = new ServisStation();
        servisStation.addPassengerCars(kia);
        servisStation.addTruck(kamaz);
        servisStation.servise();
        servisStation.servise();


        for(Transport transport: transports){
            printInfo(transport);
        }





        lada.printType();
        gazel.printType();
        liaz.printType();
        DriverB vova = new DriverB("Lada ", "Grande ", "Vova ", "B", 10, lada);
        System.out.println("водитель " + vova.getName() + "управляет автомобилем " + lada.getMarka() + " и будет участвовать в заезде");



    }

    private static void servise(Transport... transports){
        for (int i = 0; i < transports.length ; i++) {
            if(!transports[i].servise());{
            try{
            throw new RuntimeException("Автомобиль"+transports[i].getMarka()+transports[i].getModel() + " не прошел проверку");}
            catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }
    }
    private static void printInfo(Transport transport){
        System.out.println("Информация по авто"+transport.getModel()+transport.getMarka());
        System.out.println("Водители:");
        for (Driver<?> driver: transport.getDrivers()){
            System.out.println(driver.getName());
        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor: transport.getSponsors()){
            System.out.println(sponsor.getName());

        }
        System.out.println("Механики:");
        for (Mechanic<?> mechanic: transport.getMechanics()){
            System.out.println(mechanic.getName()+mechanic.getSername());
        }
        System.out.println();



    }
}