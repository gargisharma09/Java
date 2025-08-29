import java.util.*;

public class ListArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to LPU Ticket booking system!!");
        int ticket=12;
        while (true) {
            
            System.out.println("1.Book tickets\n2.Cancel Ticket\n3.View Available Seats\n4.exit");
            System.out.print("Enter your choice: ");
            int userInput= sc.nextInt();
            if(userInput==4){
                System.out.println("Thanks for Connecting with us!");
                break;
            }
            else if(userInput==1){
                System.out.println("Which Movie you want to book ?\n1.Param Sundri\n2.Stuart Little\n3.Sita Ramam");
                System.out.print("Enter Your Choice: ");
                int userMovie=sc.nextInt();
                if(userMovie==1){
                    System.out.print("You choose Param Sundri movie\nHow many tickets you want to book?");
                    int userTicket = sc.nextInt();
                    if(userTicket<ticket){
                        ticket-=userTicket;
                        System.out.println("You Booked "+userTicket+" tickets ");
                    }
                    else {
                        System.out.println("Enter right number of tickets ! Tickets left are: "+ticket);
                    }
                }
                else if(userMovie==2){
                    System.out.print("You choose Stuart Little movie\nHow many tickets you want to book?");
                    int userTicket = sc.nextInt();
                    if(userTicket<ticket){
                        ticket-=userTicket;
                        System.out.println("You Booked "+userTicket+" tickets ");
                    }
                    else {
                        System.out.println("Enter right number of tickets ! Tickets left are: "+ticket);
                    }
                }
                else if(userMovie==3){
                    System.out.print("You choose Sita Ramam movie\nHow many tickets you want to book?");
                    int userTicket = sc.nextInt();
                    if(userTicket<ticket){
                        ticket-=userTicket;
                        System.out.println("You Booked "+userTicket+" tickets ");
                    }
                    else {
                        System.out.println("Enter right number of tickets ! Tickets left are: "+ticket);
                    }
                }
                
            }
        }


    }
}