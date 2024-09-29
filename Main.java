import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<CS> workshop = new ArrayList<CS>();
        ArrayList<booking> booking = new ArrayList<booking>();
        ArrayList<Commerce> workshop1 = new ArrayList<Commerce>();
        ArrayList<management> workshop2 = new ArrayList<management>();
        workshop.add(new CS("All About Windows","Karpagam Academy Of Higher Education",201,21,299,"12/09/2024"));
        workshop.add(new CS("UI/UX Designing","PSG Arts and Science College",202,32,499,"12/09/2024"));
        workshop.add(new CS("Frontend Developement","Sri Krishna Arts and Science college",203,26,349,"12/09/2024"));
        workshop.add(new CS("Programming in Java","PSGR Krishnammal Arts and Science College",204,22,499,"12/09/2024"));
        workshop.add(new CS("Data Structures & Algorithm","Karpagam Academy Of Higher Education",205,11,799,"12/09/2024"));
        workshop1.add(new Commerce("Basics to Stock Market","Sri Krishna Arts and Science college",203,29,349,"12/09/2024"));
        workshop1.add(new Commerce("All About Tally & Excel","Karpagam Academy Of Higher Education",201,21,299,"12/09/2024"));
        workshop1.add(new Commerce("Basics of Commerce","PSG Arts and Science College",202,66,499,"12/09/2024"));
        workshop1.add(new Commerce("Spectrum A complete Guide","Sri Krishna Arts and Science college",204,17,349,"12/09/2024"));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\"EPIQ Workshop Ticket Booker\"\t\t\t\t\t\t\t\t\t\t\t");
        String name = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        name = s.next();
        String x = "YES";
        while(x.equalsIgnoreCase("yes")) {
                System.out.println("Hello " + name + "! Welcome to EPIQ Workshop Ticket Booker");
                System.out.println("Choose the Streams availabe with us : " +
                        "\n\t1)Computer Science and Information Technology" +
                        "\n\t2)Commerce and Accounting " +
                        "\n\t3)Management");
                System.out.print("Enter the Stream : ");
                int stream = s.nextInt();
                if (stream == 1) {
                    for (CS i : workshop) {
                        i.display();
                    }
                    booking book = new booking();
                    if (book.isavailable(workshop, booking)) {
                        booking.add(book);
                        System.out.println("Your Booking is Comfirmed");
                    } else {
                        System.out.println("Sorry,You could not book the tickets");
                    }
                }else if(stream==2){
                    for (Commerce i : workshop1) {
                        i.display();
                    }
                    booking book = new booking();
                    if (book.isavailable1(workshop1, booking)) {
                        booking.add(book);
                        System.out.println("Your Booking is Comfirmed");
                    } else {
                        System.out.println("Sorry,You could not book the tickets");
                    }
                }
            System.out.print("Would you like to book extra workshop tickets (Yes/No) : ");
            x = s.next();
            if (x.equalsIgnoreCase("yes")) {
                x = "yes";
            }else if(x.equalsIgnoreCase("no")){
                System.out.println("Thanks for using EPIQ Workshop Ticket booker!");
                return;
            }else{
                System.out.print("Please choose (Yes/No) : ");
                x = "yes";
            }
        }
    }
}