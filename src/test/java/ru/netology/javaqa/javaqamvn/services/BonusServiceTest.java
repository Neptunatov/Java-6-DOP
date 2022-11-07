package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void calcBonus(String ignoredTest, int amount, boolean isRegistered, int expected) {
        BonusService service = new BonusService();
        int actual = service.calcBonus(amount, isRegistered);
        Assertions.assertEquals(expected, actual);
    }
}



    // public void testRegisteredUnderLimit() {
     //   BonusService service = new BonusService();

       // int expected = 150;
        //int actual = service.calcBonus(5_000, true);

  //      Assertions.assertEquals(expected, actual);
//    }

    //@Test
    //public void testUnregisteredUnderLimit() {
      //  BonusService service = new BonusService();

       // int expected = 50;
        //int actual = service.calcBonus(5_000, false);

        //Assertions.assertEquals(expected, actual);
    //}
