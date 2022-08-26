package Core;
public class Dept
{
    private static String[] colName=new String[]{"Id"};
    private static String tableName="depts";
    public String id;
    String oldId;
    
    public Dept(String id)
    {
        String[] values=Sql.getValue(tableName,id,colName);
        this.id=values[0];
        this.oldId=values[0];
    }
    
    public boolean valid()
    {
        return oldId!=null;
    }
    
    public boolean insert()
    {
        if(new Dept(this.id).valid()) return false;
        Sql.insert(tableName,colName,new String[]{this.id});
        return true;
    }
    
    public void delete()
    {
        Sql.remove(tableName,oldId);
    }
    
    public boolean update()
    {
        if(new Dept(this.id).valid()&&(this.id == null ? this.oldId != null : !this.id.equals(this.oldId))) return false;
        delete(); insert();
        return true;
    }
    
    public static String[] list()
    {
        return Sql.getIds(tableName);
    }
    
}
