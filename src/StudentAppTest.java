import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAppTest
{
StudentApp obj = new StudentApp();
    @Test
    void testFindAge()
    {
        assertEquals(12,obj.findAge(111));
        assertEquals(-1,obj.findAge(123));
        assertEquals(-1,obj.findAge(234));
    }

}