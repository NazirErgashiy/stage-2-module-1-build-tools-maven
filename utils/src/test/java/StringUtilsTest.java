import com.epam.utils.StringUtils;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @org.junit.jupiter.api.Test
    public void isPositiveNumber() {
        assertEquals(true, StringUtils.isPositiveNumber("5"));
        assertEquals(false,StringUtils.isPositiveNumber("-5"));
        assertEquals(false,StringUtils.isPositiveNumber(""));
        assertEquals(false,StringUtils.isPositiveNumber(" "));
        assertEquals(false,StringUtils.isPositiveNumber(null));
    }
}