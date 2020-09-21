package payroll.interactors;

import java.util.Date;

public interface Session {
  public Authorizations getAuthorizations();
  public UserID getLoggedInUser();
  public Date getLoginTime();
  public PayrollContext getPayrollContext();
}
