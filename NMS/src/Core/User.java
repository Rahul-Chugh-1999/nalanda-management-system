package Core;
import java.util.ArrayList;
public class User
{
    public String id,pass,type;
    protected String oldId;
    
    public boolean confirmPassword(String password)
    {
        return (password== null ? this.pass == null : password.equals(this.pass));
    }
    
    public User(String id,String type)
    {
        String[] values=Sql.getValue(type,id,new String[]{"Id","Pass"});
        this.type=type;
        pass=values[1];
        this.id=values[0];
    }
    
    public void changePassword(String pass)
    {
        this.pass=pass;
        Sql.changePass(type, id, pass);
    }
    
    public Lecture[] getCentralTimeTable(String slot)
    {
        ArrayList<Lecture> ids=new ArrayList<>();
        String[] list=Lecture.list();
        for(String lec:list)
        {    
            Lecture l=new Lecture(lec);
            if(l.slot == null ? ""+slot == null : l.slot.equals(""+slot))
                ids.add(l);
        }
        Lecture[] ans=new Lecture[ids.size()];
        for(int i=0;i<ans.length;i++) ans[i]=ids.get(i);
        return ans;
    }
    
    public String getProfName(String profId)
    {
        return new Prof(profId).name;
    }
    
    public String getProfDept(String profId)
    {
        return new Prof(profId).dept;
    }
    
    public Course getCourseFromLecture(Lecture lec)
    {
        return new Course(lec.courseId);
    }
    
}