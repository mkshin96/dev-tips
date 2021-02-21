package me.mugon.interrupt;

public class InterruptSample {
    public static void main(String[] args) throws InterruptedException {
        InfinitThread infinitThread = new InfinitThread();
        infinitThread.start();

        /* interrupt 메소드를 호출한다고 해당 스레드가 반드시 중단되는 것은 아니다 -> 해당 스레드가 block 되거나 특정 상태여야 한다. */
        Thread.sleep(2000);
        System.out.println("isInterrupted = " + infinitThread.isInterrupted());
        infinitThread.interrupt();
        System.out.println("isInterrupted = " + infinitThread.isInterrupted());

        /* infinitThread 스레드 중단 방법1 */
//        infinitThread.setFlag(false);
    }
}
