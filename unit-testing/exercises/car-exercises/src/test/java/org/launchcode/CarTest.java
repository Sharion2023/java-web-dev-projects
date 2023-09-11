package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    @BeforeEach
    public void initCar() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals( 10, test_car.getGasTankLevel(),.001);
    }
    @Test
    public void testGasTankAfterDriving(){
        //TODO: gasTankLevel is accurate after driving within tank range
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(),.001);
    }
    @Test
    public void testGasTankAfterExceedingTankRange(){
        //TODO: gasTankLevel is accurate after attempting to drive past tank range
        test_car.drive(550);
        assertEquals(0,test_car.getGasTankLevel(), .001);
        assertEquals(500, test_car.getOdometer(), .001);
    }
    @Test
    public void testGasOverfillException(){
        //TODO: can't have more gas than tank size, expect an exception
        assertThrows(IllegalArgumentException.class, () -> test_car.addGas(5), "Shouldn't get here," +
                "car cannot have more gas in tank than the size of the tank.");
    }


}