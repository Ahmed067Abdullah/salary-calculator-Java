package teachers.salary.calculator;

import java.text.NumberFormat;
import java.util.Locale;

public class Number {
    public String withCommas(int num){
        return NumberFormat.getNumberInstance(Locale.US).format(num);
    }
}
