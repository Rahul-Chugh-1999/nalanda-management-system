package Core;
public class Course
{
    
    public String name,type,dept,prof,year,hours,id;
    private String oldId;
    private static String tableName="courses";
    private static String[] colName=new String[]{"Name","Type","Dept","Prof","Year","Hours","Id"};
    
    public Course(String id)
    {
        String[] values=Sql.getValue(tableName,id,colName);
        name=values[0];
        type=values[1];
        dept=values[2];
        prof=values[3];
        year=values[4];
        hours=values[5];
        this.id=values[6];
        oldId=this.id;
    }
    
    public boolean valid()
    {
        return oldId!=null;
    }
    
    public boolean insert()
    {
        if(new Course(this.id).valid()) return false;
        Sql.insert(tableName,colName,new String[]{name,type,dept,prof,year,hours,id});
        return true;
    }
    
    public void delete()
    {
        Sql.remove(tableName,oldId);
    }
    
    public boolean update()
    {
        if(new Course(this.id).valid()&&(oldId == null ? id != null : !oldId.equals(id))) return false;
        delete(); insert();
        return true;
    }
    
    public static String[] list()
    {
        return Sql.getIds(tableName);
    }
    
}