public class StudentApp {
    StudentReport st[] =


            {new StudentReport(111, 12, "vipul", 23), new StudentReport(213, 19, "karan", 23)
            };


    public int findAge(int no)
    {
        for(int i=0;i<st.length;i++)
            if(no==st[i].getNo())
                return st[i].getAge();
            return -1;
    }
    public char findGrade(String name)
    {
        for(int i=0;i<st.length;i++)
            if(name.equalsIgnoreCase(st[i].getName()))
                return st[i].getGrade();
            return '0';

    }
    public Boolean IsFound(String name)
    {
        for(int i=0;i<st.length;i++)
            if(name.equalsIgnoreCase(st[i].getName()))
                return true;
            return false;

    }
    public String findName(int no)
    {
        for(int i=0;i<st.length;i++)
            if(no==st[i].getNo())
                return st[i].getName();
            return null;

    }



    }


