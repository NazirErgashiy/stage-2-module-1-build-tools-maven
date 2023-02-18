import com.epam.demo.Utils;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    @org.junit.jupiter.api.Test
    public void isAllPositiveNumbers1() {
        List<String> args=new ArrayList<String>();
        args.add("2");
        args.add("10");
        args.add("5");
        Assertions.assertEquals(true, Utils.isAllPositiveNumbers(args));
    }

    @org.junit.jupiter.api.Test
    public void isAllPositiveNumbers2() {
        List<String> args=new ArrayList<String>();
        args.add(" ");
        args.add("6");
        args.add("5");
        assertEquals(false,Utils.isAllPositiveNumbers(args));
    }

    @org.junit.jupiter.api.Test
    public void isAllPositiveNumbers3() {
        List<String> args=new ArrayList<String>();
        args.add("-5");
        args.add("6");
        args.add("5");
        assertEquals(false,Utils.isAllPositiveNumbers(args));
    }
}