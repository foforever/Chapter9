
public class StopWatch9_6{
	private long startTime, endTime;

    public StopWatch9_6(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElaspsedTime(){
        return this.endTime - this.startTime;
    }

}
