package myjunit;

public class TestFailure {

    private TestCase testCase;

    public TestFailure(TestCase testCase) {
        this.testCase = testCase;
    }

    public String getClassName() {
        return testCase.getTestCaseName();
    }
}
