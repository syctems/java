package DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhuMethod
{

    private ArrayList<String> poke = new ArrayList<String>();
    private ArrayList<String> huaSe = new ArrayList<String>();
    private ArrayList<String> num = new ArrayList<String>();

    private ArrayList<String> player1 = new ArrayList<String>();
    private ArrayList<String> player2 = new ArrayList<String>();
    private ArrayList<String> player3 = new ArrayList<String>();
    private ArrayList<String> lastPoke = new ArrayList<String>();

    public ArrayList<String> getPlayer1() {
        return player1;
    }

    public void setPlayer1(ArrayList<String> player1) {
        this.player1 = player1;
    }

    public ArrayList<String> getPlayer2() {
        return player2;
    }

    public void setPlayer2(ArrayList<String> player2) {
        this.player2 = player2;
    }

    public ArrayList<String> getPlayer3() {
        return player3;
    }

    public void setPlayer3(ArrayList<String> player3) {
        this.player3 = player3;
    }

    public ArrayList<String> getLastPoke() {
        return lastPoke;
    }

    public void setLastPoke(ArrayList<String> lastPoke) {
        this.lastPoke = lastPoke;
    }


    private void addNum()
    {

        num.add("J");
        num.add("Q");
        num.add("K");
        num.add("A");
        for (int i =2; i<=10; i++)
        {
            num.add(i+"");
        }
    }

    private void addHuaSe()
    {
        huaSe.add("♥");
        huaSe.add("♦");
        huaSe.add("♠");
        huaSe.add("♣");
    }

    private void addPoke()
    {
        for (int i=0; i<huaSe.size();i++)
        {
            for (int j=0;j<num.size();j++)
            {
                String p = huaSe.get(i) + num.get(j);
                poke.add(p);
            }
        }
        poke.add("大王");
        poke.add("小王");
    }

    public void makePoke()
    {
        addNum();
        addHuaSe();
        addPoke();
    }

    public void shufflePoke()
    {
        Collections.shuffle(poke);
    }

    public void takePoke()
    {
        int i = 0;
        while (i < 51)
        {
            if(i%3 == 0)
            {
                player1.add(poke.get(i));
            }else if(i%3 == 1){
                player2.add(poke.get(i));
            }else {
                player3.add(poke.get(i));
            }
            i++;
        }

        lastPoke.add(poke.get(51));
        lastPoke.add(poke.get(52));
        lastPoke.add(poke.get(53));
    }
}
