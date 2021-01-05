package org.openjdk.jmh.it.times.jmh_generated;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.runner.InfraControl;
import org.openjdk.jmh.infra.ThreadParams;
import org.openjdk.jmh.results.BenchmarkTaskResult;
import org.openjdk.jmh.results.Result;
import org.openjdk.jmh.results.ThroughputResult;
import org.openjdk.jmh.results.AverageTimeResult;
import org.openjdk.jmh.results.SampleTimeResult;
import org.openjdk.jmh.results.SingleShotResult;
import org.openjdk.jmh.util.SampleBuffer;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.results.RawResults;
import org.openjdk.jmh.results.ResultRole;
import java.lang.reflect.Field;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.IterationParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.infra.Control;
import org.openjdk.jmh.results.ScalarResult;
import org.openjdk.jmh.results.AggregationPolicy;
import org.openjdk.jmh.runner.FailureAssistException;

import org.openjdk.jmh.it.times.jmh_generated.GroupThreadStateHelperTimesTest_jmhType;
import org.openjdk.jmh.it.times.jmh_generated.GroupThreadStateHelperTimesTest_State1_jmhType;
import org.openjdk.jmh.it.times.jmh_generated.GroupThreadStateHelperTimesTest_State2_jmhType;
public final class GroupThreadStateHelperTimesTest_T_jmhTest {

    byte p000, p001, p002, p003, p004, p005, p006, p007, p008, p009, p010, p011, p012, p013, p014, p015;
    byte p016, p017, p018, p019, p020, p021, p022, p023, p024, p025, p026, p027, p028, p029, p030, p031;
    byte p032, p033, p034, p035, p036, p037, p038, p039, p040, p041, p042, p043, p044, p045, p046, p047;
    byte p048, p049, p050, p051, p052, p053, p054, p055, p056, p057, p058, p059, p060, p061, p062, p063;
    byte p064, p065, p066, p067, p068, p069, p070, p071, p072, p073, p074, p075, p076, p077, p078, p079;
    byte p080, p081, p082, p083, p084, p085, p086, p087, p088, p089, p090, p091, p092, p093, p094, p095;
    byte p096, p097, p098, p099, p100, p101, p102, p103, p104, p105, p106, p107, p108, p109, p110, p111;
    byte p112, p113, p114, p115, p116, p117, p118, p119, p120, p121, p122, p123, p124, p125, p126, p127;
    byte p128, p129, p130, p131, p132, p133, p134, p135, p136, p137, p138, p139, p140, p141, p142, p143;
    byte p144, p145, p146, p147, p148, p149, p150, p151, p152, p153, p154, p155, p156, p157, p158, p159;
    byte p160, p161, p162, p163, p164, p165, p166, p167, p168, p169, p170, p171, p172, p173, p174, p175;
    byte p176, p177, p178, p179, p180, p181, p182, p183, p184, p185, p186, p187, p188, p189, p190, p191;
    byte p192, p193, p194, p195, p196, p197, p198, p199, p200, p201, p202, p203, p204, p205, p206, p207;
    byte p208, p209, p210, p211, p212, p213, p214, p215, p216, p217, p218, p219, p220, p221, p222, p223;
    byte p224, p225, p226, p227, p228, p229, p230, p231, p232, p233, p234, p235, p236, p237, p238, p239;
    byte p240, p241, p242, p243, p244, p245, p246, p247, p248, p249, p250, p251, p252, p253, p254, p255;
    int startRndMask;
    BenchmarkParams benchmarkParams;
    IterationParams iterationParams;
    ThreadParams threadParams;
    Blackhole blackhole;
    Control notifyControl;

    public BenchmarkTaskResult T_Throughput(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G = _jmh_tryInit_f_groupthreadstatehelpertimestest0_G(control);
            GroupThreadStateHelperTimesTest_State1_jmhType l_state11_0 = _jmh_tryInit_f_state11_0(control);

            control.preSetup();


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_groupthreadstatehelpertimestest0_G.test1(l_state11_0);
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            test1_thrpt_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, l_state11_0, l_groupthreadstatehelpertimestest0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_groupthreadstatehelpertimestest0_G.test1(l_state11_0);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }

            if (control.isLastIteration()) {
                if (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.compareAndSet(l_groupthreadstatehelpertimestest0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_groupthreadstatehelpertimestest0_G.readyTrial) {
                            l_groupthreadstatehelpertimestest0_G.verify();
                            l_groupthreadstatehelpertimestest0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.set(l_groupthreadstatehelpertimestest0_G, 0);
                    }
                } else {
                    long l_groupthreadstatehelpertimestest0_G_backoff = 1;
                    while (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.get(l_groupthreadstatehelpertimestest0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_groupthreadstatehelpertimestest0_G_backoff);
                        l_groupthreadstatehelpertimestest0_G_backoff = Math.max(1024, l_groupthreadstatehelpertimestest0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_groupthreadstatehelpertimestest0_G = null;
                }
                f_state11_0 = null;
            }
            res.allOps += res.measuredOps;
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new ThroughputResult(ResultRole.PRIMARY, "T", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            results.add(new ThroughputResult(ResultRole.SECONDARY, "test1", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            RawResults res = new RawResults();
            GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G = _jmh_tryInit_f_groupthreadstatehelpertimestest0_G(control);
            GroupThreadStateHelperTimesTest_State2_jmhType l_state22_1 = _jmh_tryInit_f_state22_1(control);

            control.preSetup();


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_groupthreadstatehelpertimestest0_G.test2(l_state22_1);
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            test2_thrpt_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, l_state22_1, l_groupthreadstatehelpertimestest0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_groupthreadstatehelpertimestest0_G.test2(l_state22_1);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }

            if (control.isLastIteration()) {
                if (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.compareAndSet(l_groupthreadstatehelpertimestest0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_groupthreadstatehelpertimestest0_G.readyTrial) {
                            l_groupthreadstatehelpertimestest0_G.verify();
                            l_groupthreadstatehelpertimestest0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.set(l_groupthreadstatehelpertimestest0_G, 0);
                    }
                } else {
                    long l_groupthreadstatehelpertimestest0_G_backoff = 1;
                    while (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.get(l_groupthreadstatehelpertimestest0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_groupthreadstatehelpertimestest0_G_backoff);
                        l_groupthreadstatehelpertimestest0_G_backoff = Math.max(1024, l_groupthreadstatehelpertimestest0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_groupthreadstatehelpertimestest0_G = null;
                }
                f_state22_1 = null;
            }
            res.allOps += res.measuredOps;
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new ThroughputResult(ResultRole.PRIMARY, "T", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            results.add(new ThroughputResult(ResultRole.SECONDARY, "test2", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void test1_thrpt_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, GroupThreadStateHelperTimesTest_State1_jmhType l_state11_0, GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_groupthreadstatehelpertimestest0_G.test1(l_state11_0);
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }

    public static void test2_thrpt_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, GroupThreadStateHelperTimesTest_State2_jmhType l_state22_1, GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_groupthreadstatehelpertimestest0_G.test2(l_state22_1);
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult T_AverageTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G = _jmh_tryInit_f_groupthreadstatehelpertimestest0_G(control);
            GroupThreadStateHelperTimesTest_State1_jmhType l_state11_0 = _jmh_tryInit_f_state11_0(control);

            control.preSetup();


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_groupthreadstatehelpertimestest0_G.test1(l_state11_0);
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            test1_avgt_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, l_state11_0, l_groupthreadstatehelpertimestest0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_groupthreadstatehelpertimestest0_G.test1(l_state11_0);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }

            if (control.isLastIteration()) {
                if (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.compareAndSet(l_groupthreadstatehelpertimestest0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_groupthreadstatehelpertimestest0_G.readyTrial) {
                            l_groupthreadstatehelpertimestest0_G.verify();
                            l_groupthreadstatehelpertimestest0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.set(l_groupthreadstatehelpertimestest0_G, 0);
                    }
                } else {
                    long l_groupthreadstatehelpertimestest0_G_backoff = 1;
                    while (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.get(l_groupthreadstatehelpertimestest0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_groupthreadstatehelpertimestest0_G_backoff);
                        l_groupthreadstatehelpertimestest0_G_backoff = Math.max(1024, l_groupthreadstatehelpertimestest0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_groupthreadstatehelpertimestest0_G = null;
                }
                f_state11_0 = null;
            }
            res.allOps += res.measuredOps;
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new AverageTimeResult(ResultRole.PRIMARY, "T", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            results.add(new AverageTimeResult(ResultRole.SECONDARY, "test1", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            RawResults res = new RawResults();
            GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G = _jmh_tryInit_f_groupthreadstatehelpertimestest0_G(control);
            GroupThreadStateHelperTimesTest_State2_jmhType l_state22_1 = _jmh_tryInit_f_state22_1(control);

            control.preSetup();


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_groupthreadstatehelpertimestest0_G.test2(l_state22_1);
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            test2_avgt_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, l_state22_1, l_groupthreadstatehelpertimestest0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_groupthreadstatehelpertimestest0_G.test2(l_state22_1);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }

            if (control.isLastIteration()) {
                if (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.compareAndSet(l_groupthreadstatehelpertimestest0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_groupthreadstatehelpertimestest0_G.readyTrial) {
                            l_groupthreadstatehelpertimestest0_G.verify();
                            l_groupthreadstatehelpertimestest0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.set(l_groupthreadstatehelpertimestest0_G, 0);
                    }
                } else {
                    long l_groupthreadstatehelpertimestest0_G_backoff = 1;
                    while (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.get(l_groupthreadstatehelpertimestest0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_groupthreadstatehelpertimestest0_G_backoff);
                        l_groupthreadstatehelpertimestest0_G_backoff = Math.max(1024, l_groupthreadstatehelpertimestest0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_groupthreadstatehelpertimestest0_G = null;
                }
                f_state22_1 = null;
            }
            res.allOps += res.measuredOps;
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new AverageTimeResult(ResultRole.PRIMARY, "T", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            results.add(new AverageTimeResult(ResultRole.SECONDARY, "test2", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void test1_avgt_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, GroupThreadStateHelperTimesTest_State1_jmhType l_state11_0, GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_groupthreadstatehelpertimestest0_G.test1(l_state11_0);
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }

    public static void test2_avgt_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, GroupThreadStateHelperTimesTest_State2_jmhType l_state22_1, GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_groupthreadstatehelpertimestest0_G.test2(l_state22_1);
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult T_SampleTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G = _jmh_tryInit_f_groupthreadstatehelpertimestest0_G(control);
            GroupThreadStateHelperTimesTest_State1_jmhType l_state11_0 = _jmh_tryInit_f_state11_0(control);

            control.preSetup();


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_groupthreadstatehelpertimestest0_G.test1(l_state11_0);
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            int targetSamples = (int) (control.getDuration(TimeUnit.MILLISECONDS) * 20); // at max, 20 timestamps per millisecond
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            SampleBuffer buffer = new SampleBuffer();
            test1_sample_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, buffer, targetSamples, opsPerInv, batchSize, l_state11_0, l_groupthreadstatehelpertimestest0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_groupthreadstatehelpertimestest0_G.test1(l_state11_0);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }

            if (control.isLastIteration()) {
                if (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.compareAndSet(l_groupthreadstatehelpertimestest0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_groupthreadstatehelpertimestest0_G.readyTrial) {
                            l_groupthreadstatehelpertimestest0_G.verify();
                            l_groupthreadstatehelpertimestest0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.set(l_groupthreadstatehelpertimestest0_G, 0);
                    }
                } else {
                    long l_groupthreadstatehelpertimestest0_G_backoff = 1;
                    while (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.get(l_groupthreadstatehelpertimestest0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_groupthreadstatehelpertimestest0_G_backoff);
                        l_groupthreadstatehelpertimestest0_G_backoff = Math.max(1024, l_groupthreadstatehelpertimestest0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_groupthreadstatehelpertimestest0_G = null;
                }
                f_state11_0 = null;
            }
            res.allOps += res.measuredOps * batchSize;
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new SampleTimeResult(ResultRole.PRIMARY, "T", buffer, benchmarkParams.getTimeUnit()));
            results.add(new SampleTimeResult(ResultRole.SECONDARY, "test1", buffer, benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            RawResults res = new RawResults();
            GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G = _jmh_tryInit_f_groupthreadstatehelpertimestest0_G(control);
            GroupThreadStateHelperTimesTest_State2_jmhType l_state22_1 = _jmh_tryInit_f_state22_1(control);

            control.preSetup();


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_groupthreadstatehelpertimestest0_G.test2(l_state22_1);
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            int targetSamples = (int) (control.getDuration(TimeUnit.MILLISECONDS) * 20); // at max, 20 timestamps per millisecond
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            SampleBuffer buffer = new SampleBuffer();
            test2_sample_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, buffer, targetSamples, opsPerInv, batchSize, l_state22_1, l_groupthreadstatehelpertimestest0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_groupthreadstatehelpertimestest0_G.test2(l_state22_1);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }

            if (control.isLastIteration()) {
                if (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.compareAndSet(l_groupthreadstatehelpertimestest0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_groupthreadstatehelpertimestest0_G.readyTrial) {
                            l_groupthreadstatehelpertimestest0_G.verify();
                            l_groupthreadstatehelpertimestest0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.set(l_groupthreadstatehelpertimestest0_G, 0);
                    }
                } else {
                    long l_groupthreadstatehelpertimestest0_G_backoff = 1;
                    while (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.get(l_groupthreadstatehelpertimestest0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_groupthreadstatehelpertimestest0_G_backoff);
                        l_groupthreadstatehelpertimestest0_G_backoff = Math.max(1024, l_groupthreadstatehelpertimestest0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_groupthreadstatehelpertimestest0_G = null;
                }
                f_state22_1 = null;
            }
            res.allOps += res.measuredOps * batchSize;
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new SampleTimeResult(ResultRole.PRIMARY, "T", buffer, benchmarkParams.getTimeUnit()));
            results.add(new SampleTimeResult(ResultRole.SECONDARY, "test2", buffer, benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void test1_sample_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, SampleBuffer buffer, int targetSamples, long opsPerInv, int batchSize, GroupThreadStateHelperTimesTest_State1_jmhType l_state11_0, GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G) throws Throwable {
        long realTime = 0;
        long operations = 0;
        int rnd = (int)System.nanoTime();
        int rndMask = startRndMask;
        long time = 0;
        int currentStride = 0;
        do {
            rnd = (rnd * 1664525 + 1013904223);
            boolean sample = (rnd & rndMask) == 0;
            if (sample) {
                time = System.nanoTime();
            }
            for (int b = 0; b < batchSize; b++) {
                if (control.volatileSpoiler) return;
                l_groupthreadstatehelpertimestest0_G.test1(l_state11_0);
            }
            if (sample) {
                buffer.add((System.nanoTime() - time) / opsPerInv);
                if (currentStride++ > targetSamples) {
                    buffer.half();
                    currentStride = 0;
                    rndMask = (rndMask << 1) + 1;
                }
            }
            operations++;
        } while(!control.isDone);
        startRndMask = Math.max(startRndMask, rndMask);
        result.realTime = realTime;
        result.measuredOps = operations;
    }

    public static void test2_sample_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, SampleBuffer buffer, int targetSamples, long opsPerInv, int batchSize, GroupThreadStateHelperTimesTest_State2_jmhType l_state22_1, GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G) throws Throwable {
        long realTime = 0;
        long operations = 0;
        int rnd = (int)System.nanoTime();
        int rndMask = startRndMask;
        long time = 0;
        int currentStride = 0;
        do {
            rnd = (rnd * 1664525 + 1013904223);
            boolean sample = (rnd & rndMask) == 0;
            if (sample) {
                time = System.nanoTime();
            }
            for (int b = 0; b < batchSize; b++) {
                if (control.volatileSpoiler) return;
                l_groupthreadstatehelpertimestest0_G.test2(l_state22_1);
            }
            if (sample) {
                buffer.add((System.nanoTime() - time) / opsPerInv);
                if (currentStride++ > targetSamples) {
                    buffer.half();
                    currentStride = 0;
                    rndMask = (rndMask << 1) + 1;
                }
            }
            operations++;
        } while(!control.isDone);
        startRndMask = Math.max(startRndMask, rndMask);
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult T_SingleShotTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G = _jmh_tryInit_f_groupthreadstatehelpertimestest0_G(control);
            GroupThreadStateHelperTimesTest_State1_jmhType l_state11_0 = _jmh_tryInit_f_state11_0(control);

            control.preSetup();


            notifyControl.startMeasurement = true;
            RawResults res = new RawResults();
            int batchSize = iterationParams.getBatchSize();
            test1_ss_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, batchSize, l_state11_0, l_groupthreadstatehelpertimestest0_G);
            control.preTearDown();

            if (control.isLastIteration()) {
                if (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.compareAndSet(l_groupthreadstatehelpertimestest0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_groupthreadstatehelpertimestest0_G.readyTrial) {
                            l_groupthreadstatehelpertimestest0_G.verify();
                            l_groupthreadstatehelpertimestest0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.set(l_groupthreadstatehelpertimestest0_G, 0);
                    }
                } else {
                    long l_groupthreadstatehelpertimestest0_G_backoff = 1;
                    while (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.get(l_groupthreadstatehelpertimestest0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_groupthreadstatehelpertimestest0_G_backoff);
                        l_groupthreadstatehelpertimestest0_G_backoff = Math.max(1024, l_groupthreadstatehelpertimestest0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_groupthreadstatehelpertimestest0_G = null;
                }
                f_state11_0 = null;
            }
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            long totalOps = opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(totalOps, totalOps);
            results.add(new SingleShotResult(ResultRole.PRIMARY, "T", res.getTime(), benchmarkParams.getTimeUnit()));
            results.add(new SingleShotResult(ResultRole.SECONDARY, "test1", res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G = _jmh_tryInit_f_groupthreadstatehelpertimestest0_G(control);
            GroupThreadStateHelperTimesTest_State2_jmhType l_state22_1 = _jmh_tryInit_f_state22_1(control);

            control.preSetup();


            notifyControl.startMeasurement = true;
            RawResults res = new RawResults();
            int batchSize = iterationParams.getBatchSize();
            test2_ss_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, batchSize, l_state22_1, l_groupthreadstatehelpertimestest0_G);
            control.preTearDown();

            if (control.isLastIteration()) {
                if (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.compareAndSet(l_groupthreadstatehelpertimestest0_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_groupthreadstatehelpertimestest0_G.readyTrial) {
                            l_groupthreadstatehelpertimestest0_G.verify();
                            l_groupthreadstatehelpertimestest0_G.readyTrial = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.set(l_groupthreadstatehelpertimestest0_G, 0);
                    }
                } else {
                    long l_groupthreadstatehelpertimestest0_G_backoff = 1;
                    while (GroupThreadStateHelperTimesTest_jmhType.tearTrialMutexUpdater.get(l_groupthreadstatehelpertimestest0_G) == 1) {
                        TimeUnit.MILLISECONDS.sleep(l_groupthreadstatehelpertimestest0_G_backoff);
                        l_groupthreadstatehelpertimestest0_G_backoff = Math.max(1024, l_groupthreadstatehelpertimestest0_G_backoff * 2);
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                synchronized(this.getClass()) {
                    f_groupthreadstatehelpertimestest0_G = null;
                }
                f_state22_1 = null;
            }
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            long totalOps = opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(totalOps, totalOps);
            results.add(new SingleShotResult(ResultRole.PRIMARY, "T", res.getTime(), benchmarkParams.getTimeUnit()));
            results.add(new SingleShotResult(ResultRole.SECONDARY, "test2", res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void test1_ss_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, int batchSize, GroupThreadStateHelperTimesTest_State1_jmhType l_state11_0, GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G) throws Throwable {
        long realTime = 0;
        result.startTime = System.nanoTime();
        for (int b = 0; b < batchSize; b++) {
            if (control.volatileSpoiler) return;
            l_groupthreadstatehelpertimestest0_G.test1(l_state11_0);
        }
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
    }

    public static void test2_ss_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, int batchSize, GroupThreadStateHelperTimesTest_State2_jmhType l_state22_1, GroupThreadStateHelperTimesTest_jmhType l_groupthreadstatehelpertimestest0_G) throws Throwable {
        long realTime = 0;
        result.startTime = System.nanoTime();
        for (int b = 0; b < batchSize; b++) {
            if (control.volatileSpoiler) return;
            l_groupthreadstatehelpertimestest0_G.test2(l_state22_1);
        }
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
    }

    
    static volatile GroupThreadStateHelperTimesTest_jmhType f_groupthreadstatehelpertimestest0_G;
    
    GroupThreadStateHelperTimesTest_jmhType _jmh_tryInit_f_groupthreadstatehelpertimestest0_G(InfraControl control) throws Throwable {
        GroupThreadStateHelperTimesTest_jmhType val = f_groupthreadstatehelpertimestest0_G;
        if (val != null) {
            return val;
        }
        synchronized(this.getClass()) {
            try {
            if (control.isFailing) throw new FailureAssistException();
            val = f_groupthreadstatehelpertimestest0_G;
            if (val != null) {
                return val;
            }
            val = new GroupThreadStateHelperTimesTest_jmhType();
            val.reset();
            val.readyTrial = true;
            f_groupthreadstatehelpertimestest0_G = val;
            } catch (Throwable t) {
                control.isFailing = true;
                throw t;
            }
        }
        return val;
    }
    
    GroupThreadStateHelperTimesTest_State1_jmhType f_state11_0;
    
    GroupThreadStateHelperTimesTest_State1_jmhType _jmh_tryInit_f_state11_0(InfraControl control) throws Throwable {
        if (control.isFailing) throw new FailureAssistException();
        GroupThreadStateHelperTimesTest_State1_jmhType val = f_state11_0;
        if (val == null) {
            val = new GroupThreadStateHelperTimesTest_State1_jmhType();
            val.setup();
            val.tearDown();
            f_state11_0 = val;
        }
        return val;
    }
    
    GroupThreadStateHelperTimesTest_State2_jmhType f_state22_1;
    
    GroupThreadStateHelperTimesTest_State2_jmhType _jmh_tryInit_f_state22_1(InfraControl control) throws Throwable {
        if (control.isFailing) throw new FailureAssistException();
        GroupThreadStateHelperTimesTest_State2_jmhType val = f_state22_1;
        if (val == null) {
            val = new GroupThreadStateHelperTimesTest_State2_jmhType();
            val.setup();
            val.tearDown();
            f_state22_1 = val;
        }
        return val;
    }


}

