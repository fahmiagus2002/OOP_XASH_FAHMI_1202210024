public class MainApp {

    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Jets", 7, 6);
        System.out.println("");
        perangkat.informasi();
        System.out.println("");

        Handphone handphone = new Handphone("Snapdragon", 4, 1,true);
        handphone.informasi();
        handphone.telfon((int)12345);
        handphone.kirimSMS(232324);
        handphone.kirimSMS(3333,5555);
        System.out.println("");

        Laptop laptop = new Laptop("Intel Ryzen", 12, (float)8.2,false);
        laptop.informasi();
        laptop.bukaGame("Dota 2");
        laptop.kirimEmail("qwerty@gmail.com");
        laptop.kirimEmail("zxcvbn@gmail.com", "bismillah@gmail.com");
        System.out.println("");

        
    
    }
    
}
