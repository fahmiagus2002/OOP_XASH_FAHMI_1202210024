public class TransportasiAir extends Sampan {
    

    TransportasiAir( int jumlahKursi, int biaya){
        super(jumlahKursi, biaya);
        
    }


    public void informasi(){
       
            System.out.println("TransportasiAir jenis tidak diketahui dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar "+biaya+" GB dan processor secepat "+processor+"Ghz. Selain itu handphone ini memiliki Fingerprint");
        
               
    }
    
    public void berlayar(){
        System.out.println("TransportasiAir dengan jenis tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
            System.out.println("TransportasiAir dengan jenis tidak diketahui");
    }