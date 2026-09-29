package JDBCLearning;

import java.sql.*;

public class JDBC001 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        JDBCUtilities jdbcUtilities = new JDBCUtilities();
        try {
            //Connection establish
            connection = jdbcUtilities.getConnection();
            //Create the statement.
            statement = connection.createStatement();
            //Execute the Query.
            String query ="select e.eid,e.ename,e.esal,c.cname from employee e join city c on c.cid = e.ecity order by e.eid;";
            rs = statement.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt(1)+" -- "+rs.getString(2)+" -- "+rs.getString(3)+" -- "+rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                //Close the resources.
                rs.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}
