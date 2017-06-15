/**
 * Created by L i o n on 7/23/2016.
 */
 public class Hunter extends Player {
    @Override
    public Move CalcNextMove(Status stat) {
        double fasele=Player.distance(this,stat.prey);
        double[] delta=new double[2];
        if(/*fasele>maxSpeed*/ true) {
            delta[0] = ((stat.prey.position[0] - this.position[0]) / fasele) * maxSpeed;
            delta[1] = ((stat.prey.position[1] - this.position[1]) / fasele) * maxSpeed;
            return new Move(delta);
        }else{

        }

        return null;
    }
    public Hunter(){
        this.isPrey=false;
        this.NextMove=new Move();
    }
    public Hunter(double[] position){
        this.isPrey=false;
        this.NextMove=new Move();
        this.position=position;
    }
}
