package om.mainacad;

import om.mainacad.service.NumberService;

import java.util.logging.Logger;

public class AppRunner {

    private static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());
    public static void main(String[] args) {
        int number1 = 12345;
        int number2 = 1236;

        LOGGER.info("\n" + NumberService.getMultiplicationDescription(number1, number2));

        LOGGER.info(String.valueOf(NumberService.getMaxAmbigramm()));


    }
}
