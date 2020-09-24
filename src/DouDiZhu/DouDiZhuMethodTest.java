package DouDiZhu;

import javax.xml.crypto.dom.DOMCryptoContext;

public class DouDiZhuMethodTest
{
    public static void main(String[] args)
    {
        DouDiZhuMethod douDiZhuMethod = new DouDiZhuMethod();
        douDiZhuMethod.makePoke();
        douDiZhuMethod.shufflePoke();
        douDiZhuMethod.takePoke();

        System.out.println("player1:"+douDiZhuMethod.getPlayer1());
        System.out.println("player2:"+douDiZhuMethod.getPlayer2());
        System.out.println("player3:"+douDiZhuMethod.getPlayer3());
        System.out.println("lastPoke:"+douDiZhuMethod.getLastPoke());
    }
}
