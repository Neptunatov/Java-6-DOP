import ru.netology.javaqa.javaqamvn.services.BonusService;

public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int amount = 150;
        boolean isRegistered=true;

        int bonus= service.calcBonus(amount,isRegistered);
        System.out.println(bonus);

    }
}