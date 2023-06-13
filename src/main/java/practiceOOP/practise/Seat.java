package practiceOOP.practise;

public class Seat {
    String seatID, eventID, seatStatus;
    int seatNumber;

    public void createSeat(){

    }
    public void updateSeatStatus(){

    }
    public void displaySeatStatus(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Seat info: " +
                "seatID='" + seatID + '\'' +
                ", eventID='" + eventID + '\'' +
                ", seatStatus='" + seatStatus + '\'' +
                ", seatNumber=" + seatNumber;
    }

}
