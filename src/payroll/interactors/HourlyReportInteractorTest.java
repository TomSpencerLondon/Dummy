package payroll.interactors;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;

public class HourlyReportInteractorTest {

  private HourlyReportInteractor interactor;

  @Before
  public void setupHourlyReportInteractor() {
    interactor = new HourlyReportInteractor();
  }

  @Test(expected = HourlyReportInteractor.InvalidDate.class)
  public void testInvalidDate() throws Exception {
    Date reportDate = null;
    Session session = new DummySession();
    interactor.generateReport(reportDate, session);
  }
}
