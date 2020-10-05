package th.ac.ku.bankaccount.model;


public class Money {
    private double money;


    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Money{" +
                "money=" + money +
                '}';
    }

    public double getMoney() {
        return money;
    }

}
