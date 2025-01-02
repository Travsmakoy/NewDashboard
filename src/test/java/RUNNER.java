import org.testng.TestNG;
import java.util.Collections;

public class RUNNER {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("src/test/java/ProjectReady.xml"));
        int iterations = 5; // Number of times to run the suite

        for (int i = 0; i < iterations; i++) {
            System.out.println("Running TestNG suite - iteration: " + (i + 2));
            testng.run();
        }
    }
}
