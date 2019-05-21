package season_3.XayDungLopStopWatch;

import java.util.Date;

public class StopWatch {
    private Date starTime;
    private Date endTime;

    public StopWatch(){
        starTime = new Date();
    }

    public void start(){
        starTime = new Date();
    }

    public void stop(){
        endTime = new Date();
    }

    public Date getStarTime() {
        return starTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public long getElapsedTime(){
        return endTime.getTime() - starTime.getTime();
    }

}
