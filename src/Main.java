import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static boolean pickCoinSide()
    {
        return Math.random() < 0.5;
    }
    public static void main(String[] args) {

        List<Coin> coins = new ArrayList<>();
        boolean mainCoin;
        int numberOfPlayer = 1000;
        String[] rounds = {"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth","Ninth","Tenth"};



        for (int i = 0; i < 1000; i++)
            coins.add(new Coin(i+1));

        System.out.println("****** Numer of players "+numberOfPlayer +" **********");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            mainCoin = pickCoinSide();
            numberOfPlayer = 0;
            System.out.println("******** "+rounds[i]+" round ************");

            if(!rounds[i].equals("Tenth")) {
                if (mainCoin)
                    System.out.println("It was decided that the main coin is  GLAVA");
                else
                    System.out.println("It was decided that the main coin is  PISMO");
            }


            Iterator<Coin> iterator = coins.iterator();
            while(iterator.hasNext())
            {
                Coin coin = iterator.next();
                if(mainCoin == coin.getCoin()) {
                    numberOfPlayer++;
                    //flip Coin
                    coin.flipCoin();
                }
                else {
                    iterator.remove();
                }
            }
            if(numberOfPlayer == 0) {
                System.out.println("Niko nije pobedio BYEEEEE");
                System.exit(0);
            }

            System.out.println("******** After "+rounds[i]+" round - number of player is - "+numberOfPlayer+" ************");
            if(numberOfPlayer < 15) {
                System.out.println("There are less than 15 players left, congratulations, your names will be on the window");
                Iterator<Coin> coinIterator = coins.iterator();
                while(coinIterator.hasNext()) {


                    Coin coin = coinIterator.next();
                    System.out.println(coin.toString());
                }
            }

            System.out.println("");
            System.out.println("Beginning break, time out of 2 sek");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        }
    }
