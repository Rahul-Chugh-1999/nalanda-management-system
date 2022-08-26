package Core;
public class Semester
{
    
    private static String tableName="semester";
    private static String[] colName=new String[]{"Year","Type","Status","Id"};
    private static String id;
    public String year,type,status;
    
    private static void setId()
    {
        id=Sql.getIds(tableName)[0];
    }
    
    public Semester()
    {
        setId();
        String[] values=Sql.getValue(tableName,id,colName);
        year=values[0];
        type=values[1];
        status=values[2];
    }
    
    private void insert()
    {
        Sql.insert(tableName,colName,new String[]{year,type,status,id});
    }
    
    public void delete()
    {
        Sql.remove(tableName,id);
    }
    
    public void update()
    {
        delete(); insert();
    }
    
    public static int slots=40;
}
