package com.bridge.hotelreservation;

public class Hotel {
    public static Integer showRates(String lakewood) {
        Integer rates=HotelReservation.hotelMap.get(lakewood);
        return rates;
    }
}