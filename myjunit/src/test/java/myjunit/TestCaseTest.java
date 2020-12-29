package myjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCaseTest extends TestCase {

    private static final Logger logger = LoggerFactory.getLogger(TestCaseTest.class);

    private static int base;

    public TestCaseTest(String testCaseName) {
        super(testCaseName);
    }

    @Override
    protected void before() {
        base = 10;
    }

    @DisplayName("Assert클래스의 assertTrue 테스트")
    public void runTest() {
        int sum = 10 + base;
        Assert.assertTrue(sum == 20);
    }

    @DisplayName("Assert클래스의 assertTrue 테스트")
    public void runTestMinus() {
        int minus = 100 - base;
        Assert.assertTrue(minus == 90);
    }

    @DisplayName("실패할 테스트")
    public void failedTest() {
        int minus = 10 - base;
        Assert.assertTrue(minus == -10);
    }


    public static void main(String[] args) {
        TestSuite testSuite = new TestSuite();

        testSuite.addTestCase(new TestCaseTest("runTest"));
        testSuite.addTestCase(new TestCaseTest("runTestMinus"));
        testSuite.addTestCase(new TestCaseTest("failedTest"));

        TestResult testResult = new TestResult();
        testSuite.run(testResult);

        testResult.printCount();
    }
}
