import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.MonthNumberCalc;

// Тестирование на тестовых данных в Cvs-источнике
public class ServiceTestCSVSource {
    @ParameterizedTest
    @CsvSource({
            "20000, 5000, 30000, 4",
//тестовые данные из примеров:
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"})
//тестовая функция:
    void NumberOfMonthsToBeOffCases(int income, int expenses, int threshold, int expected) {
        MonthNumberCalc calc = new MonthNumberCalc();
        int actual = calc.calculation(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
