import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.MonthNumberCalc;

// Тестирование на данных в Cvs-файле
public class ServiceTestCSVFileSource {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/TestData.csv")
    void NumberOfMonthsToBeOffCases(int income, int expenses, int threshold, int expected) {
        MonthNumberCalc calc = new MonthNumberCalc();

        // Расчет количества свободных месяцев
        int actual = calc.calculation(income, expenses, threshold);

        // Использоваение метода Assertions для сравнения ожидаемого значения и расчетного
        Assertions.assertEquals(expected, actual);
    }
}