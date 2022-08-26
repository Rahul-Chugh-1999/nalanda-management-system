package Core;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
public class Sql
{
    public static Connection getConnection() throws SQLException
    {
        String url="jdbc:mysql://localhost:3306/nms";
        String uname="root";
        String pass="excalibur";
        Connection conn=DriverManager.getConnection(url,uname,pass);
        return conn;
    }
    public static String[] getIds(String tableName) // Tested
    {
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try
        {
            con=getConnection();
            String query ="select * from "+tableName;
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            ArrayList<String> ids=new ArrayList<>();
            while(rs.next()) ids.add(rs.getString("Id"));
            String[] ans=new String[ids.size()];
            for(int i=0;i<ans.length;i++) ans[i]=ids.get(i);
            rs.close();
            ps.close();
            con.close();
            return ans;
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static String[] getValue(String tableName,String id,String[] colName) // Tested
    {
        String[] values=new String[colName.length];
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try
        {
            con=getConnection();
            String query ="select * from "+tableName+" where Id='"+id+"'";
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            if(!rs.next()) for(int i=0;i<values.length;i++) values[i]=null;
            else for(int i=0;i<values.length;i++) values[i]=rs.getString(colName[i]);
            rs.close();
            ps.close();
            con.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return values;
    } 
    public static void insert(String tableName,String[] colName,String[] values) // Tested
    {
        Connection con;
        Statement stmt;
        try
        {
            con=getConnection();
            String query="insert into "+tableName+" (";
            for(int i=0;i<colName.length;i++) query+=colName[i]+(i==colName.length-1?"":",");
            query+=") values (";
            for(int i=0;i<values.length;i++) query+="'"+values[i]+(i==values.length-1?"'":"',");
            query+=")";
            stmt=con.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            con.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void remove(String tableName,String id) //Tested
    {
        Connection con;
        Statement stmt;
        try
        {
            con=getConnection();
            stmt=con.createStatement();
            String query="delete from "+tableName+" where Id= '"+id+"'";
            stmt.execute(query);
            stmt.close();
            con.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void changePass(String tableName,String id,String pass)
    {
        Connection con;
        Statement stmt;
        try
        {
            con=getConnection();
            stmt=con.createStatement();
            String query="update "+tableName+" set pass= '"+pass+"' where Id= '"+id+"'";
            stmt.execute(query);
            stmt.close();
            con.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void removeLecture()
    {
        Connection con;
        Statement stmt;
        try
        {
            con=getConnection();
            stmt=con.createStatement();
            String query="delete from Lectures";
            stmt.execute(query);
            stmt.close();
            con.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
