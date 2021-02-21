package me.mugon.interrupt;

public class InfinitThread extends Thread {
    int value = Integer.MIN_VALUE;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            value++;
            if (value == Integer.MAX_VALUE) {
                value = Integer.MIN_VALUE;
                System.out.println("MAX_VALUE reached !!! ");
            }

            try {
                /* infinitThread 스레드 중단 방법2 */
                Thread.sleep(0, 1);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
