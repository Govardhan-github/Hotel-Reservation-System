public class HotelCheck {
    private String hotelName;
    private int rateForCustomer;
    public HotelCheck(String hotelName, int rateForCustomer) {
        super();
        this.hotelName = hotelName;
        this.rateForCustomer = rateForCustomer;
    }
    public String getName() {
        return hotelName;
    }
    public void setName(String hotelName) {
        this.hotelName = hotelName;
    }
    public int getRate() {
        return rateForCustomer;
    }
    public void setRate(int rateForCustomer) {
        this.rateForCustomer = rateForCustomer;
    }
    @Override
    public String toString() {
        return "HotelCheck{" +
                "hotelName='" + hotelName + '\'' +
                ", rateForCustomer=" + rateForCustomer +
                '}';
    }
}
