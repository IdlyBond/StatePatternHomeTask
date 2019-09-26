public class WorkingState implements State {

    public void spend(Card card, double price) {
        if (card.getBudget() < 0) {
            card.setState(new CreditState());
        }
        System.out.println("Деньги потрачены");
        card.spendBudget(price);
    }

    public String getName() {
        return "рабочее состояние";
    }
}
