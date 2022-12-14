import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        ArrayList<HotelGuests> hotelGuests = new ArrayList<>();




        while (true){
            System.out.println("Main Menu");
            System.out.println("1. Insert Data");
            System.out.println("2. Print Data");
            System.out.println("3. Print names and price of particular city");
            System.out.print("Choose an option: "); choice = scanner.nextInt();
            switch (choice){
                case 1:
                    hotelGuests.add(insertData(hotelGuests));
                    break;
                case 2:
                    PrintData(hotelGuests);
                    break;
                case 3:
                    printHotelGuestsFromParticularCity(hotelGuests);
                    break;
                default:
            }
        }
    }

    public static void PrintData(ArrayList<HotelGuests> hotelGuests){
        for(HotelGuests h : hotelGuests){
            System.out.println(h.toString());
        }
    }


    public static HotelGuests insertData(ArrayList<HotelGuests> hotels) {
        HotelGuests hotelGuests1 = new HotelGuests();
        String nothing = scanner.nextLine();
        String HotelName;
        String egn;
        int nights;
        int priceBed;
        String country;
        int FamilyStatus;
        System.out.println(nothing);
        System.out.println();
        System.out.print("Name: "); HotelName = scanner.nextLine();
        System.out.println();
        System.out.print("Egn: "); egn = scanner.nextLine();
        System.out.println();
        System.out.print("Nights: "); nights = scanner.nextInt();
        System.out.println();
        System.out.print("PriceBed: "); priceBed = scanner.nextInt();
        System.out.println(); nothing = scanner.nextLine();
        System.out.print("Country: "); country = scanner.nextLine();
        System.out.println();
        System.out.print("Single or engaged (type 1 for single or 2 for engaged: "); FamilyStatus = scanner.nextInt();
    return new HotelGuests(HotelName, egn,nights, priceBed, country, FamilyStatus);
    }
    public static void printHotelGuestsFromParticularCity(ArrayList<HotelGuests> hotelGuests) {

        int totalPrice = 0;
        ArrayList<HotelGuests> newStudents = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Enter a city: ");
        String city = sc.nextLine();

        for (HotelGuests h : hotelGuests) {
            if(h.country.equals(city)) {
                newStudents.add(h);
                totalPrice += h.priceBed;
            }
        }

        System.out.println();
        for (HotelGuests h : newStudents) {
            System.out.println("Guest name: " + h.HotelName);
        }

        System.out.println("Total price for beds of the beds: " + totalPrice);
        System.out.println();
    }
}