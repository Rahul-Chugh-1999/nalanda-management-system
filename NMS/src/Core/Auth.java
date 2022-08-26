package Core;
import java.util.ArrayList;

public class Auth extends User
{
    
    public Auth(String id)
    {
        super(id,"auth");
    }
    
    public Student[] getStuList(String dept,String year)
    {
        String[] ids=Student.list();
        ArrayList<Student> al=new ArrayList<>();
        for(String st:ids)
        {
            Student s=new Student(st);
            if((s.dept == null ? dept == null : s.dept.equals(dept))&&(s.year == null ? year == null : s.year.equals(year)))
            al.add(s);
        }
        Student[] slist=new Student[al.size()];
        for(int i=0;i<slist.length;i++) slist[i]=al.get(i);
        return slist;
    }
    public boolean updateStu(Student s)
    {
        return s.update();
    }
    public void removeStu(Student s)
    {
        s.delete();
    }
    public boolean insertStu(Student s)
    {
        return s.insert();
    }
    
    public Course[] getCourseList(String dept,String year,String type)
    {
        ArrayList<Course> courses=new ArrayList<>();
        String[] all=Course.list();
        for(String s:all)
        {
            Course c=new Course(s);
            if(c.dept == null ? dept != null : !c.dept.equals(dept)) continue;
            if(c.year == null ? year != null : !c.year.equals(year)) continue;
            if(c.type == null ? type != null : !c.type.equals(type)) continue;
            courses.add(c);
        }
        Course[] ans=new Course[courses.size()];
        for(int i=0;i<ans.length;i++) ans[i]=courses.get(i);
        return ans;
    }
    public boolean insertCourse(Course c)
    {
        return c.insert();
    }
    public boolean updateCourse(Course c)
    {
        return c.update();
    }
    public void removeCourse(Course c)
    {
        c.delete();
    }
    
    public Prof[] getProfList(String dept)
    {
        String[] ids=Prof.list();
        ArrayList<Prof> al=new ArrayList<>();
        for(String pf: ids)
        {
            Prof p=new Prof(pf);
            if(p.dept == null ? dept == null : p.dept.equals(dept)) al.add(p);
        }
        Prof[] plist=new Prof[al.size()];
        for(int i=0;i<plist.length;i++) plist[i]=al.get(i);
        return plist;
    }
    public boolean updateProf(Prof p)
    {
        String profOldId=p.oldId;
        if(!p.update()) return false;
        String[] crs=Course.list();
        for(String c:crs)
        {
            Course course=new Course(c);
            if(course.prof == null ? profOldId == null : course.prof.equals(profOldId))
            {
                course.prof=p.id;
                course.update();
            }
        }
        return true;
    }
    public boolean insertProf(Prof p)
    {
        return p.insert();
    }
    public void removeProf(Prof p)
    {
        String profOldId=p.oldId;
        p.delete();
        String[] crs=Course.list();
        for(String c:crs)
        {
            Course course=new Course(c);
            if(course.prof == null ? profOldId == null : course.prof.equals(profOldId))
                course.delete();
        }
    }
    
    
    public Dept[] getDeptList()
    {
        String[] ids=Dept.list();
        Dept[] depts=new Dept[ids.length];
        for(int i=0;i<ids.length;i++) depts[i]=new Dept(ids[i]);
        return depts;
    }
    public boolean updateDept(Dept d)
    {
        String oldDeptid=d.oldId;
        if(!d.update()) return false;
        String[] crs=Course.list();
        for(String c:crs)
        {
            Course course=new Course(c);
            if(course.dept == null ? oldDeptid == null : course.dept.equals(oldDeptid))
            {
                course.dept=d.id;
                course.update();
            }
        }
        String[] sts=Student.list();
        for(String stu:sts)
        {
            Student student=new Student(stu);
            if(student.dept == null ? oldDeptid == null : student.dept.equals(oldDeptid))
            {
                student.dept=d.id;
                student.update();
            }
        }
        String[] prfs=Prof.list();
        for(String pro:prfs)
        {
            Prof prof=new Prof(pro);
            if(prof.dept == null ? oldDeptid == null : prof.dept.equals(oldDeptid))
            {
                prof.dept=d.id;
                prof.update();
            }
        }
        return true;
    }
    public boolean insertDept(Dept d)
    {
        return d.insert();
    }
    public void removeDept(Dept d)
    {
        String oldDeptid=d.oldId;
        String[] crs=Course.list();
        for(String c:crs)
        {
            Course course=new Course(c);
            if(course.dept == null ? oldDeptid == null : course.dept.equals(oldDeptid))
                course.delete();
        }
        String[] sts=Student.list();
        for(String stu:sts)
        {
            Student student=new Student(stu);
            if(student.dept == null ? oldDeptid == null : student.dept.equals(oldDeptid))
                student.delete();
        }
        String[] prfs=Prof.list();
        for(String pro:prfs)
        {
            Prof prof=new Prof(pro);
            if(prof.dept == null ? oldDeptid == null : prof.dept.equals(oldDeptid))
                prof.delete();
        }
        d.delete();
    }
    
    public Room[] getRoomList()
    {
        String[] ids=Room.list();
        Room[] rooms=new Room[ids.length];
        for(int i=0;i<ids.length;i++) rooms[i]=new Room(ids[i]);
        return rooms;
    }
    public boolean updateRoom(Room r)
    {
        return r.update();
    }
    public boolean insertRoom(Room r)
    {
        return r.insert();
    }
    public void removeRoom(Room r)
    {
        r.delete();
    }
    
    public Semester getSemester()
    {
        return new Semester();
    }
    public void updateSemester(Semester s)
    {
        String[] sList=Student.list();
        for(String stu:sList)
        {
            Student student=new Student(stu);
            student.addStatus="Open";
            student.update();
        }
        s.update();
    }
    public boolean genTT(String semType)
    {
        ArrayList<Course> ids=new ArrayList<>();
        String[] all=Course.list();
        for(String s:all)
        {
            Course course=new Course(s);
            if(course.type == null ? semType == null : course.type.equals(semType)) ids.add(course);
        }
        Course[] ans=new Course[ids.size()];
        for(int i=0;i<ans.length;i++) ans[i]=ids.get(i);
        return Lecture.genLectures(ans, Room.list());
    }
    public void freezeSemester()
    {
        Semester sem=getSemester();
        sem.status="Frozen";
        String[] sList=Student.list();
        for(String stu:sList)
        {
            Student student=new Student(stu);
            if(!"Accept".equals(student.addStatus)) student.addStatus="Reject";
            student.update();
        }
        sem.update();
    }
}
