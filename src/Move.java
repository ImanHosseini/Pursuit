/**
 * Created by L i o n on 7/23/2016.
 */
public class Move {
    public double[] displacement;
    public Move(double[] delta){
        displacement=delta;
    }
    public Move(){
        this.displacement=new double[2];
        this.displacement[0]=0.0;
        this.displacement[1]=0.0;
    }

}
