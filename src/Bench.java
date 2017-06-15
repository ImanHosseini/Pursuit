import Lib.StdRandom;

import java.util.ArrayList;

/**
 * Created by L i o n on 7/23/2016.
 */
public class Bench {
    public static void main(String[] args){
        int n=3;
        Prey prey=new Prey(new double[]{0.5,0.5});
        ArrayList<Player> players= new ArrayList<>();
        players.add(prey);
        for(int i=0;i<10;i++){
            players.add(new Hunter(new double[]{StdRandom.uniform(0.0,1.0),StdRandom.uniform(0.0,1.0)}));
        }
        while(true){
            for(Player pl : players){
                pl.Draw();
                pl.NextMove=pl.CalcNextMove(new Status(players,prey));
            }
            for(Player pl : players){
            pl.DoMove();
            }
            if(prey.position[0]>1.0 || prey.position[0]<0.0 || prey.position[1]>1.0 || prey.position[1]<0.0){
                break;
            }

        }

    }
}
