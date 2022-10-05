import Transport.*;
public class Main {
    public static void main(String[] args) {


        PassengerCars lada = new PassengerCars("Lada ","Grande ",1.5);
        PassengerCars audi = new PassengerCars("Audi ","A8 ",3.6);
        PassengerCars volvo = new PassengerCars("Volvo ","XC 60 ",3.0);
        PassengerCars kia = new PassengerCars("Kia ","Soul ",1.5);

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        Trucks kamaz = new Trucks("Камаз ","А10 ",10.00);
        Trucks mersedes = new Trucks("Mersedes ","Тягач ",15.00);
        Trucks gazel = new Trucks("Газель ","Бортовая ",10.75);
        Trucks hyundai = new Trucks("Hyundai ","Mighty ",5.00);




        Bus ford = new Bus("Ford ","Mondeo ",1.7);
        Bus liaz = new Bus("Liaz ","Kursor ",3.5);
        Bus mersedes1 = new Bus("Mersedes ", "Splinter ", 4.0);
        System.out.println(ford.toString());
        System.out.println(liaz.toString());
        System.out.println(mersedes1.toString());
        B<PassengerCars>vova = new B("Vova ","B ",10);
        vova.B(lada);

    }
}