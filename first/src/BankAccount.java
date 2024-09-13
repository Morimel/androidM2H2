public class BankAccount {

    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > this.amount) {
            throw new LimitException("Запрашиваемая сумма больше, чем на счету. Вы запрашиваете " + sum +
                    ", а на счету " + this.amount + ", снимется только оставшаяся на счету сумма.", this.amount);
        } else {
            this.amount -= sum;
        }
    }


}
