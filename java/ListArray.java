/*import java.util.*;

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
}*/
import java.util.*;

public class ListArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to sharma theaters");

        int paramSundri = 12;
        int stuartLittle = 10;
        int sitaRamam = 8;

        while (true) {
            System.out.println("\n1. Book tickets");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Available Seats");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Thanks for connecting with us!");
                break;
            }

            else if (choice == 1) { 
                System.out.println("Which Movie you want to book?");
                System.out.println("1. Param Sundri (" + paramSundri + " seats left)");
                System.out.println("2. Stuart Little (" + stuartLittle + " seats left)");
                System.out.println("3. Sita Ramam (" + sitaRamam + " seats left)");
                System.out.print("Enter Your Choice: ");
                int movie = sc.nextInt();

                System.out.print("How many tickets you want to book? ");
                int tickets = sc.nextInt();

                if (movie == 1) {
                    if (tickets <= paramSundri) {
                        paramSundri -= tickets;
                        System.out.println("Booked " + tickets + " tickets for Param Sundri!");
                    } else {
                        System.out.println("Only " + paramSundri + " seats available.");
                    }
                } else if (movie == 2) {
                    if (tickets <= stuartLittle) {
                        stuartLittle -= tickets;
                        System.out.println(" Booked " + tickets + " tickets for Stuart Little!");
                    } else {
                        System.out.println(" Only " + stuartLittle + " seats available.");
                    }
                } else if (movie == 3) {
                    if (tickets <= sitaRamam) {
                        sitaRamam -= tickets;
                        System.out.println("Booked " + tickets + " tickets for Sita Ramam!");
                    } else {
                        System.out.println("Only " + sitaRamam + " seats available.");
                    }
                } else {
                    System.out.println("Invalid choice!");
                }
            }

            else if (choice == 2) { 
                System.out.println("For which movie you want to cancel?");
                System.out.println("1. Param Sundri");
                System.out.println("2. Stuart Little");
                System.out.println("3. Sita Ramam");
                System.out.print("Enter Your Choice: ");
                int movie = sc.nextInt();

                System.out.print("How many tickets you want to cancel? ");
                int tickets = sc.nextInt();

                if (movie == 1) {
                    paramSundri += tickets;
                    System.out.println("Cancelled " + tickets + " tickets for Param Sundri.");
                } else if (movie == 2) {
                    stuartLittle += tickets;
                    System.out.println("Cancelled " + tickets + " tickets for Stuart Little.");
                } else if (movie == 3) {
                    sitaRamam += tickets;
                    System.out.println(" Cancelled " + tickets + " tickets for Sita Ramam.");
                } else {
                    System.out.println("Invalid choice!");
                }
            }

            else if (choice == 3) { // View seats
                System.out.println("\n Available Seats:");
                System.out.println("Param Sundri: " + paramSundri);
                System.out.println("Stuart Little: " + stuartLittle);
                System.out.println("Sita Ramam: " + );
            }

            else {
                System.out.println("Please enter a valid choice.");
            }
        }

        sc.close();
    }
}
