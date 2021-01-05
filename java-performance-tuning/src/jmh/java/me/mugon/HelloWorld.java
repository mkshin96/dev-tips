package me.mugon;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode({Mode.AverageTime})
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class HelloWorld {

    @Benchmark
    public void firstBenchMark() {
        Set<String> set = new HashSet();
        String s = "abcdefghijklmnopqrstu";
        for (int i = 0; i < 10000; i++) {
             set.add(s + i);
        }
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder().include(HelloWorld.class.getSimpleName())
                .forks(1)
                 .build();

        new Runner(opt).run();
    }
}
