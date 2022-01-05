package com.bridge.hotelreservation;

import java.util.Comparator;
import java.util.List;

public class HotelReservation {


    public static void getCheaper(List<Hotel> hotelList, int dateCount) {

        Hotel minRateHotel=hotelList.stream().min(Comparator.comparing(Hotel::getRate)).get();
        System.out.println("Cheapest hotel :");
        System.out.println("Hotel name "+minRateHotel.getHotelName()+", Total Rates : $"+minRateHotel.getRate()*dateCount);

    }

}


