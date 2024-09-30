public class CS {
    String workName;
    String CollegeName;
    int booking;
    int capacity;
    int price;
    String date;
    public int getPrice() {
        return price;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getBooking() {
        return booking;
    }

    CS(String workName, String CollegeName, int booking, int capacity, int price,String date){
        this.workName = workName;
        this.CollegeName = CollegeName;
        this.booking = booking;
        this.capacity = capacity;
        this.price = price;
        this.date = date;
    }
    public void display(){
        System.out.println("\nWork Shop Number : \""+booking+"\"\tWork Shop Name : \""+workName+"\"\t\nCollege Name : \"" +
                CollegeName + "\"\tWork Shop's Price : \"Rs:"+price +
                "\"\n\tDate : \"" + date + "\""+"\"\tAvailave Capacity : \"" + capacity+"\"");
    }
}
