import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SphereTest {
        
    @Test
    public void getVolume_PositiveRadiusOneHundred_ReturnsCorrectVolume() {
        //arrange
        double radius = 100;
        double expected = 4176200.00;
        
        //act
        double volume = Sphere.getVolume(radius);

        //assert
        assertTrue(volume == expected);
    }

    // @Ignore("Remove to run test")
    @Test
    public void getVolume_RadiusTenPointFive_ReturnsCorrectVolumeToTwoDecimalPlaces() {
        //arrange
        double radius = 10.5;
        double expected = 4834.47;
        
        //act
        double volume = Sphere.getVolume(radius);

        //assert
        assertTrue(volume == expected);
    }

    // @Ignore("Remove to run test")
    @Test
    public void getVolume_PositiveRadiusGreaterThan1000_ReturnsZeroVolume() {
        //hint: this tests an arbitary rule - radius > 1000 should return 0

        //arrange
        double radius = 1100;
        double expected = 0;
        
        //act
        double volume = Sphere.getVolume(radius);

        //assert
        assertTrue(volume == expected);
    }

    // @Ignore("Remove to run test")
    @Test
    public void getVolume_ZeroRadius_ReturnsZeroVolume() {
        //arrange
        double radius = 0;
        double expected = 0;
        
        //act
        double volume = Sphere.getVolume(radius);

        //assert
        assertTrue(volume == expected);
    }    

    // @Ignore("Remove to run test")
    @Test(expected = IllegalArgumentException.class)
    public void getVolume_NegativeRadius_ThrowsIllegalArgumentException() {
        //arrange
        double radius = -100;

        //act
        double volume = Sphere.getVolume(radius);
    }    
}