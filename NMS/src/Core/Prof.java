package Core;

import java.util.ArrayList;

public class Prof extends User
{
    public String name,dept,year,age,contactNo;
    private static String tableName="prof";
    private static String[] colName=new String[]{"Name","Id","Pass","Dept","Year","Age","ContactNo"};
    public Prof(String id)
    {
        super("-1","prof");
        String[] values=Sql.getValue(tableName,id,colName);
        name=values[0];
        this.id=values[1];
        pass=values[2];
        dept=values[3];
        year=values[4];
        age=values[5];
        oldId=this.id;
        contactNo=values[6];
    }
    public boolean valid()
    {
        return oldId!=null;
    }
    public boolean insert()
    {
        if(new Prof(this.id).valid()) return false;
        Sql.insert(tableName,colName,new String[]{name,id,pass,dept,year,age,contactNo});
        return true;
    }
    public void delete()
    {
        Sql.remove(tableName,oldId);
    }
    public boolean update()
    {
        if(new Prof(this.id).valid()&&(oldId == null ? id != null : !oldId.equals(id))) return false;
        delete(); insert();
        return true;
    }
    public static String[] list()
    {
        return Sql.getIds(tableName);
    }
    
    public Course[] courseList()
    {
        ArrayList<Course> ids=new ArrayList<>();
        String[] all=Course.list();
        for(String s:all)
        {
            Course c=new Course(s);
            if(c.prof == null ? id!= null : !c.prof.equals(id)) continue;
            if(!c.type.equals(new Semester().type)) continue;
            ids.add(c);
        }
        Course[] ans=new Course[ids.size()];
        for(int i=0;i<ans.length;i++) ans[i]=ids.get(i);
        return ans;
    }
    
    public Lecture[] getTT()
    {
        return Lecture.getTT(courseList(),Lecture.allLectures());
    }
    
    public Student[] additonalRequests(String courseId)
    {
        String[] list=Student.list();
        ArrayList<Student> aList=new ArrayList<>();
        for(String stu:list)
        {
            Student student=new Student(stu);
            if("Waiting".equals(student.addStatus)&&(student.addId == null ? courseId == null : student.addId.equals(courseId)))
                    aList.add(student);
        }
        Student[] sList=new Student[aList.size()];
        for(int i=0;i<sList.length;i++) sList[i]=aList.get(i);
        return sList;
    }
    
    public void acceptAdditional(Student s)
    {
        s.addStatus="Accept";
        s.update();
    }
    
    public void rejectAdditional(Student s)
    {
        s.addStatus="Reject";
        s.update();
    }
    
}
