import java.util.*;
public class booking {
    String workName;
    String CollegeName;
    String date;
    private int workshopNo;
    private int count;
    public int getWorkshopNo() {
        return workshopNo;
    }
    public booking(int workshopNo,int count){
        this.workshopNo = workshopNo;
        this.count = count;
    }
    public int Count(){
        return this.count;
    }
    int c=0,price=1,capacity=0;
    public boolean isavailable(ArrayList<CS> workshop,ArrayList<booking> booking){
        for(CS i:workshop){
            if(i.getBooking()==workshopNo){
                capacity = i.getCapacity();
                price=i.getPrice()*count;
            }
        }
        c = count;
        for(booking i:booking){
            if(workshopNo==i.workshopNo){
                c+=i.count;
            }
        }
            return c <= capacity ? true : false;
    }
    public boolean isavailable1(ArrayList<Commerce> workshop,ArrayList<booking> booking){
        for(Commerce i:workshop){
            if(i.getBooking()==workshopNo){
                capacity = i.getCapacity();
                price=i.getPrice()*count;
            }
        }
        c = count;
        for(booking i:booking){
            if(workshopNo==i.workshopNo){
                c+=i.count;
            }
        }
        return c <= capacity ? true : false;
    }
    public boolean isavailable2(ArrayList<management> workshop,ArrayList<booking> booking){
        for(management i:workshop){
            if(i.getBooking()==workshopNo){
                capacity = i.getCapacity();
                price=i.getPrice()*count;
            }
        }
        c = count;
        for(booking i:booking){
            if(workshopNo==i.workshopNo){
                c+=i.count;
            }
        }
        return c <= capacity ? true : false;
    }
    public void bookedDetails(ArrayList<CS> workshop){
        for(CS i:workshop){
            if(i.getBooking()==workshopNo){
                this.workName = i.workName;
                this.CollegeName = i.CollegeName;
                this.date = i.date;
            }
        }
    }
    public void bookedDetails1(ArrayList<Commerce> workshop){
        for(Commerce i:workshop){
            if(i.getBooking()==workshopNo){
                this.workName = i.workName;
                this.CollegeName = i.CollegeName;
                this.date = i.date;
            }
        }
    }
    public void bookedDetails2(ArrayList<management> workshop){
        for(management i:workshop){
            if(i.getBooking()==workshopNo){
                this.workName = i.workName;
                this.CollegeName = i.CollegeName;
                this.date = i.date;
            }
        }
    }

}
