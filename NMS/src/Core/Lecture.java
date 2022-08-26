package Core;
import java.util.ArrayList;
import java.util.Random;
public class Lecture
{
    public String id,room,slot,courseId;
    private static String tableName="Lectures";
    private static String[] colName=new String[]{"Id","Room","Slot","CourseId"};
    public static Lecture[] allLectures()
    {
        String[] lectures=list();
        Lecture[] allLectures=new Lecture[lectures.length];
        for(int i=0;i<allLectures.length;i++) allLectures[i]=new Lecture(lectures[i]);
        return allLectures;
    }
    
    private static boolean clash(Course x,Course y)
    {
        if(x.prof == null ? y.prof == null : x.prof.equals(y.prof)) return true;
        if((x.dept == null ? y.dept == null : x.dept.equals(y.dept))&&(x.year == null ? y.year == null : x.year.equals(y.year)))
                return true;
        return false;
    }
    
    public Lecture(String id)
    {
        if(!"-1".equals(id))
        {
            String[] values=Sql.getValue(tableName,id,colName);
            this.id=id;
            room=values[1];
            slot=values[2];
            courseId=values[3];
        }
    }
    
    private void insert()
    {
        Sql.insert(tableName,colName,new String[]{id,room,slot,courseId});
    }
    
    private void delete()
    {
        Sql.remove(tableName,id);
    }
    
    public static String[] list()
    {
        String[] list=Sql.getIds(tableName);
        return list;
    }
    
    private static Lecture[] singleTry(Course[] courses,String[] rooms) 
    {
        Random rand=new Random();
        Course[][] tt=new Course[Semester.slots][rooms.length];
        int[] ptr=new int[Semester.slots];
        for (Course course : courses)
        {
            int done,tries;
            for (tries=0; tries<350; tries++)
            {
                done=1;
                int j=rand.nextInt(Semester.slots);
                if(ptr[j]==rooms.length) continue;
                for (int k = 0; k<ptr[j]; k++) if(clash(tt[j][k],course)) done=0;
                if(done==0) continue;
                tt[j][ptr[j]] = course;
                ptr[j]++;
                break;
            }
            if(tries==350) return null;
        }
        Lecture[] a=new Lecture[courses.length];
        int k=0;
        for(int i=0;i<a.length;i++) a[i]=new Lecture("-1");
        for(int i=0;i<40;i++)
        {
            for(int j=0;j<ptr[i];j++)
            {
                a[k].courseId=tt[i][j].id;
                a[k].room=rooms[j];
                a[k].slot=String.valueOf(i);
                a[k].id=k+"";
                k++;
            }
        }
        return a;
    }
    
    public static boolean genLectures(Course[] courses,String[] rooms)
    {
        ArrayList<Course> temp=new ArrayList<>();
        for (Course course : courses)
        {
            for(int i=0;i<Integer.valueOf(course.hours);i++)
                temp.add(course);
        }
        Course[] finalCourses=new Course[temp.size()];
        for(int i=0;i<temp.size();i++)
            finalCourses[i]=temp.get(i);
        for(int i=0;i<500;i++)
        {
            Lecture[] a=singleTry(finalCourses, rooms);
            if(a==null) continue;
            Sql.removeLecture();
            for(Lecture lec:a) lec.insert();
            return true;
        }
        return false;
    }
    
    public static Lecture[] getTT(Course[] courses,Lecture[] allLectures)
    {
        Lecture[] ans=new Lecture[Semester.slots];
        for(Lecture l:allLectures)
        {
            for(Course c: courses) if(l.courseId == null ? c.id == null : l.courseId.equals(c.id)) ans[Integer.valueOf(l.slot)]=l;
        }
        return ans;
    }
    
}