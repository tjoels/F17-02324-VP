/**
 * Created by tjc on 2017-03-06.
 */
public class TennisSpiller implements Runnable{
    public static Object ball = new Object();
    private boolean hasBall;

    @Override
    public void run() {
        while (true){
            if (hasBall=true){
                System.out.println(Thread.currentThread().getName() + ": I have the ball!");
                synchronized (ball) {


                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                    hasBall=false;
                    ball.notifyAll();
                }
            } else {
                synchronized (ball){
                    try {
                        ball.wait();
                        synchronized (ball){
                            hasBall=true;
                        }
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public boolean isHasBall() {
        return hasBall;
    }
    public TennisSpiller setHasBall(boolean hasBall) {
        this.hasBall = hasBall;
        return this;
    }

    public static void main(String[] args) {
        new Thread(new TennisSpiller().setHasBall(true)).start();
        new Thread(new TennisSpiller().setHasBall(false)).start();
        new Thread(new TennisSpiller().setHasBall(false)).start();
    }


}
