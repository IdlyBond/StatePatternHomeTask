public interface State {

    void spend(Card card, double price);

    String getName();
}
