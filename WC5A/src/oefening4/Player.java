package oefening4;

import java.util.Random;

public class Player {


    public Player( ) {
        System.out.println( this + " speelt mee.");

    }

    public void go() throws BallException {
        if (new Random().nextBoolean()) {
            Player player = new Player();
            try {
                player.go();
            } catch (HeavyBallException e) {
                System.out.println("zware bal niet opgevangen door " + this
                        + " !");

            } catch (BallException e2) {
                System.out.println("bal opgevangen door " + this
                        + " !");
            }
        } else {
            if (new Random().nextBoolean()) {
                System.out.println(this + "gooit de bal");
                throw new BallException();
            } else {
                System.out.println(this + "gooit zware bal");
                throw new HeavyBallException();
            }
        }
    }
}
