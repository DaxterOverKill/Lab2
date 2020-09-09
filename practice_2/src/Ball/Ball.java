package Ball;

public class Ball {
    private double x;
    private double y;
    public Ball(double x, double y){
    }
    public Ball(){}
    public double GetX(){
    return x;
    }
    public double GetY(){
        return y;
    }
    public void SetX(double x){
        this.x = x;
    }
    public void SetY(double y){
        this.y = y;
    }
    public void SetXY(double y, double x){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    public String toString(){
        return "Ball ("+this.x+", "+this.y+").";
    }
}
