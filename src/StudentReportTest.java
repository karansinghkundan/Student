import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentReportTest {
    StudentReport st1 = new StudentReport(444,18,"Ujjwal",56);
    StudentReport st2 = new StudentReport(445,19,"jwal",98);
    @Test
    void testIsPass()
    {
        assertTrue(st1.Ispass());
        assertTrue(st2.Ispass());
    }


}