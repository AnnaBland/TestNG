
import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTests {

    @Test(description = "testNotRectangle")
    public void testNotRectangle() {
        Rectangle e = new Rectangle(2, 4);
        Assert.assertNotEquals(e.area(), 16);
    }

    @Test
    public void testRectangle() {
        Rectangle e = new Rectangle(2, 4);
        Assert.assertEquals(e.area(), 8);
    }
}
