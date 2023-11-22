public class FalseAuthorizer implements Authorizer{
    @Override
    public boolean authorize() {
        return true; //Trigger the bug by returning the false value
    }
}
