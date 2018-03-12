public class Customer extends Rider implements IRide{
    private int wallet;
    public Customer(String name, PersonType personType, int height, int wallet) {
        super(name, personType, height);
        this.wallet = wallet;
    }

    // GETTERS
    public int getWallet() {
        return this.wallet;
    }

    // SETTERS

    public int giveMoney(int fee) {
        this.wallet -= fee;
        return this.getWallet();
    }
}
