package Core;
import java.util.ArrayList;

public class Student extends User
{

    public String name,dept,year,rollNo,age,addId,addStatus,contactNo;
    private static String tableName="student";
    private static String[] colName=new String[]{"Name","Dept","Year","RollNo","Id","Pass","Age","AddId","AddStatus","ContactNo"};

    public Student(String id)
    {
        super("-1",tableName);
        String[] values=Sql.getValue(tableName,id,colName);
        name=values[0];
        dept=values[1];
        year=values[2];
        rollNo=values[3];
        this.id=values[4];
        oldId=this.id;
        pass=values[5];
        age=values[6];
        addId=values[7];
        addStatus=values[8];
        contactNo=values[9];
    }

    public boolean valid()
    {
        return oldId!=null;
    }

    public boolean insert()
    {
        if(addId==null) addId="";
        if(addStatus==null) addStatus="Open";
        if(new Student(this.id).valid()) return false;
        Sql.insert(tableName,colName,new String[]{name,dept,year,rollNo,id,pass,age,addId,addStatus,contactNo});
        return true;
    }

    public void delete()
    {
        Sql.remove(tableName,oldId);
    }

    public boolean update()
    {
        if(new Student(this.id).valid()&&(id == null ? oldId != null : !id.equals(oldId))) return false;
        delete(); insert();
        return true;
    }

    public static String[] list()
    {
        return Sql.getIds(tableName);
    }
    
    public Course[] courseList()
    {
        ArrayList<Course> courses=new ArrayList<>();
        String[] all=Course.list();
        for(String s:all)
        {
            Course c=new Course(s);
            if(c.dept == null ? dept != null : !c.dept.equals(dept)) continue;
            if(Integer.valueOf(c.year)+Integer.valueOf(year)-1!=Integer.valueOf(new Semester().year)) continue;
            if(c.type == null ? type != null : !c.type.equals(new Semester().type)) continue;
            courses.add(c);
        }
        if("Accept".equals(addStatus))
            courses.add(new Course(addId));
        Course[] ans=new Course[courses.size()];
        for(int i=0;i<ans.length;i++) ans[i]=courses.get(i);
        return ans;
    }
    
    private static boolean clash(Course[] tt,Course b,Lecture[] lecList)
    {
        Lecture[] tT=Lecture.getTT(tt,lecList);
        Lecture[] add=Lecture.getTT(new Course[]{b},lecList);
        for(int i=0;i<tT.length;i++)
        {
            if(tT[i]!=null&&add[i]!=null) return true;
        }
        return false;
    }
    
    public Lecture[] getTT()
    {
        return Lecture.getTT(courseList(),Lecture.allLectures());
    }
    
    public Course[] additionalList()
    {
        ArrayList<Course> courses=new ArrayList<>();
        String[] all=Course.list();
        Course[] cur=courseList();
        String semType=new Semester().type;
        Lecture[] lecList=Lecture.allLectures();
        for(String pos:all)
        {
            Course course=new Course(pos);
            if(course.type == null ? semType != null : !course.type.equals(semType)) continue;
            if(!Student.clash(cur, course,lecList)) courses.add(course);
        }
        Course[] ans=new Course[courses.size()];
        for(int i=0;i<ans.length;i++) ans[i]=courses.get(i);
        return ans;
    }
    
    public void chooseAdditional(String subject)
    {
        addStatus="Waiting";
        addId=subject;
        update();
    }
}