package me.mugon.thread;

public class Contributor extends Thread {

    private Contribution myContribution;
    private String myName;

    public Contributor(Contribution contribution, String myName) {
        this.myContribution = contribution;
        this.myName = myName;
    }

    @Override
    public void run() {
        for (int loop = 0; loop < 1000l; loop++) {
            myContribution.donate();
        }
        System.out.format("%s total = %d\n", myName, myContribution.getTotal());
    }
}
