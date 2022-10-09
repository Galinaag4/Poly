import Transport.*;



public class Main {
    public static void main(String[] args){


        PassengerCars lada = new PassengerCars("Lada ", "Grande ", 1.5, TypeBody.N1);
        PassengerCars audi = new PassengerCars("Audi ", "A8 ", 3.6, TypeBody.N3);
        PassengerCars volvo = new PassengerCars("Volvo ", "XC 60 ", 3.0, TypeBody.N4);
        PassengerCars kia = new PassengerCars("Kia ", "Soul ", 1.5, TypeBody.N3);

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        Trucks kamaz = new Trucks("Камаз ", "А10 ", 10.00, Tonnage.N1);
        Trucks mersedes = new Trucks("Mersedes ", "Тягач ", 15.00, Tonnage.N2);
        Trucks gazel = new Trucks("Газель ", "Бортовая ", 10.75, Tonnage.N3);
        Trucks hyundai = new Trucks("Hyundai ", "Mighty ", 5.00, Tonnage.N1);


        Bus ford = new Bus("Ford ", "Mondeo ", 1.7, Capacyty.Small);
        Bus liaz = new Bus("Liaz ", "Kursor ", 3.5, Capacyty.Medium);
        Bus mersedes1 = new Bus("Mersedes ", "Splinter ", 4.0, Capacyty.Big);
        System.out.println(ford.toString());
        System.out.println(liaz.toString());
        System.out.println(mersedes1.toString());

        lada.PrintType();
        gazel.PrintType();
        liaz.PrintType();
        DriverB vova = new DriverB("Lada ", "Grande ", "Vova ", "B", 10, lada);
        System.out.println("водитель " + vova.getName() + "управляет автомобилем " + lada.getMarka() + " и будет участвовать в заезде");
    }
}