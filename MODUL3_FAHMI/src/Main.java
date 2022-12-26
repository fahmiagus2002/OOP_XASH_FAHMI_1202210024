public class Main {
    public static void main(String[] args) {
        Calculation h = new Calculation();
        Thread thread = new Thread(h);
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;

 do{       
    try {
        int menu = sc.nextInt();
        System.out.println();
        switch (menu) {
        case 1:
            System.out.print("Enter the length of the side of the square : ");
            double side = sc.nextDouble();

            h.setSquare(side);
            thread.start();
            thread.join();

            System.out.println("\nThe calculation result: " + h.getSquare