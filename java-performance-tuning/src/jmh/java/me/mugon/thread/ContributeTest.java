package me.mugon.thread;

public class ContributeTest {
    public static void main(String[] args) {
        int contributorCount = 10;
        Contributor[] crs = new Contributor[contributorCount];
        Contribution group = new Contribution();
        for (int i = 0; i < contributorCount; i++) {
            crs[i] = new Contributor(group, " Contributor" + i);
        }

        for (int i = 0; i < contributorCount; i++) {
            crs[i].start();
        }
     }
}
