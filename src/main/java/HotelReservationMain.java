import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservationMain {
     private static List<HotelCheck> hotelList = new ArrayList<HotelCheck>();
    public static void main(String[] args) {
        System.out.println("Welcome To The Hotel Reservation System");
        HotelCheck lakeWood = new HotelCheck("Lakewood",120);
        HotelCheck bridgeWood = new HotelCheck("Bridgewood", 140);
        hotelList.add(lakeWood);
        hotelList.add(bridgeWood);
    }
}