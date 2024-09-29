import java.util.*;
public class booking {
    private int workshopNo;
    private int count;
    public int getWorkshopNo() {
        return workshopNo;
    }
    Scanner sa = new Scanner(System.in);
    public booking(){
        System.out.print("Enter the workshop number : ");
        workshopNo = sa.nextInt();
        System.out.print("Enter the members Count : ");
        count = sa.nextInt();
    }
    int c=0,price=1,capacity=0;
    public boolean isavailable(ArrayList<CS> workshop,ArrayList<booking> booking){
        for(CS i:workshop){
            if(i.getBooking()==workshopNo){
                capacity = i.getCapacity();
                price=i.getPrice()*count;
            }
        }
        for(booking i:booking){
            if(workshopNo==workshopNo){
                c++;
            }
        }
        System.out.println("The Total price : Rs:"+price);
        System.out.print("Would you like to book the tickets (Yes/No) : ");
        String book = sa.next();
        if(book.equalsIgnoreCase("yes")) {
            return c+count <= capacity ? true : false;
        }else{
            return false;
        }
    }
    public boolean isavailable1(ArrayList<Commerce> workshop,ArrayList<booking> booking){
        for(Commerce i:workshop){
            if(i.getBooking()==workshopNo){
                capacity = i.getCapacity();
                price=i.getPrice()*count;
            }
        }
        for(booking i:booking){
            if(workshopNo==workshopNo){
                c++;
            }
        }
        System.out.println("The Total price : Rs:"+price);
        System.out.print("Would you like to book the tickets (Yes/No) : ");
        String book = sa.next();
        if(book.equalsIgnoreCase("yes")) {
            return c+count <= capacity ? true : false;
        }else{
            return false;
        }
    }

}
