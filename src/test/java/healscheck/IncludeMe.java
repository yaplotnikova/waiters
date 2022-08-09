package healscheck;

import org.testng.annotations.Test;
import steps.HealsCheckSteps;

public class IncludeMe {
    @Test
    public void mainTest() {
        HealsCheckSteps healsCheckSteps = new HealsCheckSteps();
        healsCheckSteps.parentSetUp();
        healsCheckSteps.enterValidLoginAndPassword();
        healsCheckSteps.enterValidLoginAndInvalidPassword();
        healsCheckSteps.enterInvalidLoginAndValidPassword();
        healsCheckSteps.enterInvalidLoginAndInvalidPassword();


    }
}
