package payroll.interactors;

import java.util.Date;

public class DummySession implements Session {
  public Authorizations getAuthorizations() {
    return null;
  }

  public UserID getLoggedInUser() {
    return null;
  }

  public Date getLoginTime() {
    return null;
  }

  public PayrollContext getPayrollContext() {
    return null;
  }
}
