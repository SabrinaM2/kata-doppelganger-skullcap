package info.doubles;
import info.Authorizer;

public class FakeAuthorizer implements Authorizer {
    @Override
    public boolean authorize() {
        return true; //Trigger the bug by returning the false value
    }
}
