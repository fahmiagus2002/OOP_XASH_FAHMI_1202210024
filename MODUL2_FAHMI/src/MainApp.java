public class MainApp {

    public static void main(String[] args) {
        Kapal Kapal = new Kapal("Kursi", 4);
        System.out.println("");
        Kapal.informasi();
        System.out.println("");

        Sampan sampan = new Handphone("Snapdragon", 4, 1,true);
        Kapal.informasi();
        Kapal.telfon((int)12345);
        Kapal.kirimSMS(232324);
        Kapal.kirimSMS(3333,5555);
        System.out.println("");

        TransportasiAir transportasiair = new TransportasiAir("Intel Ryzen", 12, (float)8.2,false);
        sampan.informasi();
        sampan.bukaGame("Dota 2");
        sampan.kirimEmail("qwerty@gmail.com");
        sampan.kirimEmail("zxcvbn@gmail.com", "bismillah@gmail.com");
        System.out.println("");

        
    
    }
    
}

