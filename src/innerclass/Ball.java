package innerclass;

public class Ball { //Outer Class
    private String ballName;
    private int ballSize;

    public void setupBall(){
            new orangeBall().setUpOrangeBall();
        System.out.println(ballName + ", " + ballSize);
    }

    //inner class
    class orangeBall{
        public void setUpOrangeBall(){
            ballName = "Inside Inner Class Ball";
            ballSize = 23;
        }
    }
}
