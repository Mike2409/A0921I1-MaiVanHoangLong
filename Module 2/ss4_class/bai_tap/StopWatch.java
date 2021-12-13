package ss4_class.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public StopWatch(){
        this.startTime=System.currentTimeMillis();
        //trả về một số nguyên tính từ năm 1970 đến thời điểm hiện tại
    }
    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return getEndTime()-getStartTime();
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();

        watch.start();
        System.out.println("Thời gian bắt đầu:" + watch.getStartTime());

        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(100000 * Math.random());
        }

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        watch.stop();
        System.out.println("Thời gian kết thúc:" + watch.getEndTime());

        long elapsedtime = watch.getElapsedTime();
        System.out.println("Tổng thời gian: " + elapsedtime + " millisecond");
    }
}
