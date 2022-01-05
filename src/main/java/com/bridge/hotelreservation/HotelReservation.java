package com.bridge.hotelreservation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelReservation {


    public static Map<String, Integer> hotelMap = new HashMap<>();

    public HotelReservation() {

    }

    public void setRateForRegularCustomers(String hotelType, int rate) {
        hotelMap.put(hotelType, rate);
    }

}


