public class BlockedState implements State {

    public void spend(Card card, double price) {
        if (card.getBudget() >= -100) {
            card.setState(new CreditState());
            System.out.println("Деньги потрачены");
            card.spendBudget(price);
        }
    }

    public String getName() {
        return "заблокированое состояние";
    }
}
