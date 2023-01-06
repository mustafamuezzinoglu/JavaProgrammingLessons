package day31_Costructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 =new Offer();
        System.out.println(offer1);
        offer1.setInfo("Istanbul", "Trendyol", "QA", 1500, true, true, false, false);
        System.out.println(offer1);

        Offer offer2 =new Offer();
        offer2.setInfo("Ankara", "Getir", "Scrum Master", 2000, false, true, true, false);

        Offer offer3 =new Offer();
        offer3.setInfo("Izmir", "Aliağa", "Senior QA", 2100, false, false, true, true);

        Offer offer4 =new Offer();
        offer4.setInfo("Antalya", "Tav", "BA", 2200, true, true, true, false);

        Offer offer5 =new Offer();
        offer5.setInfo("Istanbul", "Netaş", "Manager", 2500, true, false, true, true);

        Offer offer6 =new Offer();
        offer6.setInfo("Ankara", "Turk Telekom", "SDET", 1500, true, true, true, false);

        Offer offer7 =new Offer();
        offer7.setInfo("Bursa", "Otokar", "Junior QA", 1800, true, true, true, false);

        Offer [] myOffers = { offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList<Offer> fullTimeOffers =new ArrayList<>();
        fullTimeOffers.addAll(Arrays.asList( myOffers));//offer1,offer2,offer3,offer4,offer5,offer6,offer7)C
        fullTimeOffers.removeIf(p-> !p.isFullTime); // removes offer if the offer is  not fulltime
        System.out.println("fullTimeOffers = " + fullTimeOffers);

        ArrayList<Offer> localOffers =new ArrayList<>();
        localOffers.addAll(Arrays.asList( myOffers));
        localOffers.removeIf(p-> !p.location.equals("Istanbul"));
        System.out.println("localOffers = " + localOffers);

        ArrayList<Offer> sdetOffers =new ArrayList<>();
        sdetOffers.addAll(Arrays.asList( myOffers));
        sdetOffers.removeIf(p-> !p.jobTitle.equals("SDET"));
        System.out.println("sdetOffers = " + sdetOffers);
        
     
    }
}
