//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount user = new BankAccount(0);
        System.out.println("Счет:" + user.getAmount());
        user.deposit(15000);
        System.out.println("Счет:" + user.getAmount());

        while (user.getAmount() != 0) {
            try {
                user.withDraw(6000);
                System.out.println("Счет:" + user.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    user.withDraw((int) e.getRemainingAmount());
                    System.out.println("Остаток на счете: " + user.getAmount());
                } catch (LimitException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}