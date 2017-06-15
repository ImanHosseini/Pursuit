import Lib.StdDraw;

import java.awt.*;

/**
 * Created by L i o n on 7/23/2016.
 */
abstract public class Player {
    public double[] position={0.5,0.5};
    public double maxSpeed=0.001;
    public boolean isPrey;
    public Move NextMove;
    abstract public Move CalcNextMove(Status stat);
    public void Draw(){
        if(isPrey) StdDraw.setPenColor(Color.RED);
        else StdDraw.setPenColor(Color.BLUE);
        StdDraw.filledCircle(position[0],position[1],0.001);
    }
    static double distance(Player A,Player B){
        return Math.sqrt(((A.position[0]-B.position[0])*(A.position[0]-B.position[0]))+((A.position[1]-B.position[1])*(A.position[1]-B.position[1])));
    }
    public void DoMove(){
        //System.out.print(NextMove.displacement[0]);
        this.position[0]+=this.NextMove.displacement[0];
        this.position[1]+=this.NextMove.displacement[1];
    }
}

