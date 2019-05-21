package season_3.XayDungLopStopWatch;

public class Test {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stopWatch.stop();
        long time = stopWatch.getElapsedTime();
        System.out.println(time);
    }
}
