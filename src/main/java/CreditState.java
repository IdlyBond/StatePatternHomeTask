public class CreditState implements State {

    public void spend(Card card, double price) {
        if (card.getBudget() < -100) {
            card.setState(new BlockedState());
            return;
        } else if (card.getBudget() >= 0) card.setState(new WorkingState());
        System.out.println("Деньги потрачены");
        card.spendBudget(price);
    }

    public String getName() {
        return "кредитное состояние";
    }
}
