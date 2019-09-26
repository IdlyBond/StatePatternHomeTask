public class Card {

    private double budget = 10.0;

    private State state = new WorkingState();

    public void setState(State state) {
        System.out.println("Состояние карты изменено на " + state.getName());
        this.state = state;
    }

    public void spend(double cost){
        state.spend(this, cost);
    }

    public void spendBudget(double budget) {
        this.budget -= budget;
    }

    public double getBudget() {
        return budget;
    }

    public State getState() {
        return state;
    }
}
