package myjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class TestCase implements Test {

    private static final Logger logger = LoggerFactory.getLogger(TestCase.class);

    protected String testCaseName;

    public TestCase(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public TestResult run() {
        TestResult testResult = createTestResult();
        run(testResult);

        return testResult;
    }

    @Override
    public void run(TestResult testResult) {
        testResult.startTest();
        before();
        try {
            runTestCase();
        } catch (InvocationTargetException ite) {
            if (isAssertionFailed(ite)) {
                testResult.addFailure(this);
            } else {
                testResult.addError(this, ite);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        after();
    }

    protected void before() {}

    public void runTestCase() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        logger.info("{} execute ", testCaseName);
        Method method  = this.getClass().getMethod(testCaseName, null);
        method.invoke(this, null);
    }

    protected void after() {}

    public TestResult createTestResult() {
        return new TestResult();
    }

    private boolean isAssertionFailed(InvocationTargetException ite) {
        return ite.getTargetException() instanceof AssertionFailedError;
    }
}
