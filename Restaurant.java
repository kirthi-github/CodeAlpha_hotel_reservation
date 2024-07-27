import java.util.Scanner;
public class Restaurant {

    static String name;
    static int roomno;
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int i;
        boolean[] rooms={true,false,true,false,false,true,true,false,true,false,true,true,true,false,false};
        System.out.println("!!WELCOME!!");
        System.out.println("Please enter your name: ");
        name = Scan.nextLine();
        System.out.println("Categories of rooms : \nStandard : 1 - 5 -> Charges per day : 1000\nDeluxe : 6 - 10 -> Charges per day : 5000\nSuite : 11 - 15 -> Charges per day : 20000\n");
        System.out.println("Please enter your choice\n1.Standard\n2.Deluxe\n3.Suite");
        char ch = ' ';
        ch = Scan.next().charAt(0);
        switch (ch) {
            case '1': System.out.println("Avaliable rooms: ");
            for(i=0;i<5;i++){
                if(!rooms[i]){
                    System.out.println(i+1+" ");
                }
            }
            System.out.println();
            System.out.println("please select the room no from the available rooms");
            roomno = Scan.nextInt();
            System.out.println("Please wait while the payment is being processed");
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("booking is confirmed");
            rooms[roomno-1]=true;
                break;
            case '2':System.out.println("Avaliable rooms: ");
            for(i=5;i<10;i++){
                System.out.println(i+1+" ");
            }
            System.out.println();
            System.out.println("please select the room no from the available rooms");
            roomno = Scan.nextInt();
            System.out.println("Please wait while the payment is being processed");
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("booking is confirmed");
            rooms[roomno-1]=true;
                break;
                case '3':System.out.println("Avaliable rooms: ");
                for(i=10;i<15;i++){
                    System.out.println(i+1+" ");
                }
                System.out.println();
                System.out.println("please select the room no from the available rooms");
                roomno = Scan.nextInt();
                System.out.println("Please wait while the payment is being processed");
                try{
                    Thread.sleep(5000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println("booking is confirmed");
                rooms[roomno-1]=true;
                    break;
            default:System.out.println("Irrelevent choice");
                break;
        }
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println();
        viewDetails();
        System.out.println("Thank You. Have a wonderfull stay");
    }
    public static void viewDetails(){
        System.out.println("Booking Details: ");
        System.out.println("Booking id: "+(int)(Math.random()*15)+1);
        System.out.println("Name: "+name);
        System.out.println("Room Number: "+roomno);
        if(roomno>=1 && roomno<=5){
            System.out.println("Room catagory: Standard");
        }
        else if(roomno>=6 && roomno<=10){
            System.out.println("Room catagory: Double ");
        }
        else if (roomno>=11 && roomno<=15) {
            System.out.println("Room catagory: Suite");
        }
        System.out.println();
    }
}
