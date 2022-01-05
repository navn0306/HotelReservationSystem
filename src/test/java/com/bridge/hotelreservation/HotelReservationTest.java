package com.bridge.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    @Test
    public void givenHotelName_whenNameAndRate_shouldRerunRate() {
        HotelReservation hotelReservation=new HotelReservation();
        Integer actualResult= Hotel.showRates("Lakewood");
        Integer expectedResult=90;
        Assert.assertEquals(actualResult,expectedResult);
    }
}
