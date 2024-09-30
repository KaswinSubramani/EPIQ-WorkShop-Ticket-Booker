public class booking {
    private int workshopNo;
    private int count;
    public int getWorkshopNo() {
        return workshopNo;
    }
    public booking(int workshopNo,int count){
        this.workshopNo = workshopNo;
        this.count = count;
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

}
