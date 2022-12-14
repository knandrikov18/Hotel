public class HotelGuests {
    public String HotelName;
    String egn;
    int nights;
    int priceBed;
    String country;
    int FamilyStatus;

    public HotelGuests(String hotelName, String egn, int nights, int priceBed, String country, int FamilyStatus) {
        HotelName = hotelName;
        this.egn = egn;
        this.nights = nights;
        this.priceBed = priceBed;
        this.country = country;
        this.FamilyStatus = FamilyStatus;
    }

    public HotelGuests() {

    }

    public String getHotelName() {
        return HotelName;
    }

    public String getEgn() {
        return egn;
    }

    public int getNights() {
        return nights;
    }

    public int getPriceBed() {
        return priceBed;
    }

    public String getCountry() {
        return country;
    }

    public int getFamilyStatus() {
        return FamilyStatus;
    }

    @Override
    public String toString() {
        return "HotelGuests{" +
                "HotelName='" + HotelName + '\'' +
                ", egn='" + egn + '\'' +
                ", nights=" + nights +
                ", priceBed=" + priceBed +
                ", country='" + country + '\'' +
                ", FamilyStatus=" + FamilyStatus +
                '}';
    }
}
