package me.mugon;

import org.openjdk.jmh.annotations.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode({Mode.AverageTime})
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class HelloWorld {

    final int LOOP_COUNT = 1000;
    Set<String> set;
    String data = "abcdefghijklmnopqrstuvwxyz";

    @Benchmark
    public void addHashSet() {
        set = new HashSet<>();
        for (int i = 0; i < LOOP_COUNT; i++) {
            set.add(data + i);
        }
    }

    @Benchmark
    public void addTreeSet() {
        set = new TreeSet<>();
        for (int i = 0; i < LOOP_COUNT; i++) {
            set.add(data + i);
        }
    }

    @Benchmark
    public void addLinkedHashSet() {
        set = new LinkedHashSet<>();
        for (int i = 0; i < LOOP_COUNT; i++) {
            set.add(data + i);
        }
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.addHashSet();
    }
}
