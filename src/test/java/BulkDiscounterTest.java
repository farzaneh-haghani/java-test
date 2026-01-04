import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BulkDiscounterTest {

    @Test
    public void getVolumeDiscount_1000Balloons_ReturnsCorrectDiscountedPrice() {
        // arrange
        BalloonOrder order1 = new BalloonOrder(1000);
        BalloonOrder order2 = new BalloonOrder("RED", 1000);
        BalloonOrder order3 = new BalloonOrder("GREEN", 1000);
        double expected = 2250;

        // act
        double cost1 = BulkDiscounter.getVolumeDiscount(order1);
        double cost2 = BulkDiscounter.getVolumeDiscount(order2);
        double cost3 = BulkDiscounter.getVolumeDiscount(order3);

        // assert
        assertTrue(cost1 == expected);
        assertTrue(cost2 == expected);
        assertTrue(cost3 == expected);
    }

    // @Ignore("Remove to run test")
    @Test
    public void getVolumeDiscount_2500Balloons_ReturnsCorrectDiscountedPrice() {
        // arrange
        BalloonOrder order1 = new BalloonOrder(2500);
        BalloonOrder order2 = new BalloonOrder("RED", 2500);
        BalloonOrder order3 = new BalloonOrder("GREEN", 2500);
        double expected = 5250;

        // act
        double cost1 = BulkDiscounter.getVolumeDiscount(order1);
        double cost2 = BulkDiscounter.getVolumeDiscount(order2);
        double cost3 = BulkDiscounter.getVolumeDiscount(order3);

        // assert
        assertTrue(cost1 == expected);
        assertTrue(cost2 == expected);
        assertTrue(cost3 == expected);
    }

    // @Ignore("Remove to run test")
    @Test
    public void getVolumeDiscount_4000RedBalloons_ReturnsCorrectDiscountedPrice() {
        // arrange
        BalloonOrder order = new BalloonOrder("RED", 4000);
        double expected = 7750;

        // act
        double cost = BulkDiscounter.getVolumeDiscount(order);

        // assert
        assertTrue(cost == expected);
    }

    // @Ignore("Remove to run test")
    @Test
    public void getVolumeDiscount_4000GreenBalloons_ReturnsCorrectDiscountedPrice() {
        // arrange
        BalloonOrder order = new BalloonOrder("GREEN", 4000);
        double expected = 7550;

        // act
        double cost = BulkDiscounter.getVolumeDiscount(order);

        // assert
        assertTrue(cost == expected);
    }

    // @Ignore("Remove to run test")
    @Test
    public void getVolumeDiscount_4000GreenLowercaseBalloons_ReturnsCorrectDiscountedPrice() {
        // arrange
        BalloonOrder order = new BalloonOrder("green", 4000);
        double expected = 7550;

        // act
        double cost = BulkDiscounter.getVolumeDiscount(order);

        // assert
        assertTrue(cost == expected);
    }

    // @Ignore("Remove to run test")
    @Test
    public void getVolumeDiscount_1000NullColourBalloons_ReturnsCorrectDiscountedPriceForRedBalloons() {
        // arrange
        BalloonOrder order = new BalloonOrder(null, 1000);
        double expected = 2250;

        // act
        double cost = BulkDiscounter.getVolumeDiscount(order);

        // assert
        assertTrue(cost == expected);
    }

    // @Ignore("Remove to run test")
    @Test
    public void getVolumeDiscount_1000InvalidColourBalloons_ReturnsCorrectDiscountedPriceForRedBalloons() {
        // arrange
        BalloonOrder order = new BalloonOrder("YELLOW", 1000);
        double expected = 2250;

        // act
        double cost = BulkDiscounter.getVolumeDiscount(order);

        // assert
        assertTrue(cost == expected);
    }

}