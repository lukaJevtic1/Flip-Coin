public class Coin {

    boolean coin;
    Man man;
    public Coin(int number)
    {
        flipCoin();
        this.man = new Man(number);
    }
    public boolean getCoin()
    {
        return coin;
    }


    public void flipCoin() {
        if(Math.random() < 0.5)
            coin = true; // coin is head
        else
            coin = false; // coin is tail
    }
    public String lose()
    {
        return  "I AM LOSE "+toString();
    }
    public String win()
    {
        return  "I AM WIN "+toString();
    }
    public String toString() {
        String coinS;
        if(coin)
            coinS = "GLAVA";
        else
            coinS = "PISMO";
        return "I am a man "+ man.getNumberOfMan()+" with coin = " + coinS;
    }

}
