package payroll.interactors;

import java.util.Date;

public class HourlyReportInteractor {
  public void generateReport(Date reportDate, Session session) {
    if (!isValidReportDate(reportDate))
      throw new InvalidDate();
    //...
  }

  private boolean isValidReportDate(Date reportDate) {
    //...
    return false;
  }

  public class InvalidDate extends RuntimeException {
  }
}
