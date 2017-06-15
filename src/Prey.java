import Lib.StdRandom;

/**
 * Created by L i o n on 7/23/2016.
 */
public class Prey extends Player {
    double prob=0.1;
    boolean turbo=false;
    static int cooldown=6;
    int cyet=0;

    @Override
    public Move CalcNextMove(Status stat) {
       if(StdRandom.bernoulli(prob) && !turbo){
           turbo=true;
           cyet=cooldown;
           this.maxSpeed*=2.0;
       }
        if(cyet>0) cyet--;
        if(cyet==0 && turbo){
            turbo=false;
            this.maxSpeed/=2.0;
        }
        double min=100.0;
        Player dude=null;
    for(Player guy : stat.players){
        if(guy.isPrey) continue;
        double d=Player.distance(this,guy);
        if(d<min) {
            min=d;
            dude=guy;
        }
    }
        double distV=Math.min((1.0-this.position[0]),this.position[0]);
        double distH=Math.min((1.0-this.position[1]),this.position[1]);
        double[] delta=new double[2];
        if(min<distV && min<distH){
            double fasele=Player.distance(this,dude);


            delta[0] = -((dude.position[0] - this.position[0]) / fasele) * maxSpeed;
            delta[1] = -((dude.position[1] - this.position[1]) / fasele) * maxSpeed;
            return new Move(delta);
        }else if(distH<distV){
            if(this.position[1]<0.5){
                delta[0]=0.0;
                delta[1]=this.maxSpeed;
            }else{
                delta[0]=0.0;
                delta[1]=-this.maxSpeed;
            }
        }else{
            if(this.position[0]<0.5){
                delta[1]=0.0;
                delta[0]=this.maxSpeed;
            }else{
                delta[1]=0.0;
                delta[0]=-this.maxSpeed;
            }
        }

return new Move(delta);
    }
    public Prey(){
        this.isPrey=true;
        this.NextMove=new Move();
        this.maxSpeed*=4.0;

    }
    public Prey(double[] position){
        this.isPrey=true;
        this.NextMove=new Move();
        this.position=position;
    }
}
