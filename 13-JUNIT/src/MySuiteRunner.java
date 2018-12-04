import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestApplication.class,Assertion.class,Parameterization.class})
public class MySuiteRunner {}
