package Core;
public class Room
{
    
    private static String[] colName=new String[]{"Id"};
    private static String tableName="rooms";
    public String id;
    private String oldId;
    
    public Room(String id)
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
        if(new Room(this.id).valid()) return false;
        Sql.insert(tableName,colName,new String[]{this.id});
        return true;
    }
    
    public void delete()
    {
        Sql.remove(tableName,oldId);
    }
    
    public boolean update()
    {
        if(new Room(this.id).valid()&&(this.id == null ? this.oldId != null : !this.id.equals(this.oldId))) return false;
        delete(); insert();
        return true;
    }
    
    public static String[] list()
    {
        return Sql.getIds(tableName);
    }
    
}
