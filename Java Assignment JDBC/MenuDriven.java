import java.sql.*;
import java.util.Scanner;
class MenuDriven{
    static Scanner s=new Scanner(System.in);
    public void displayRecords(Connection cn) throws SQLException{
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("Select * FROM students");
        while(rs.next()){
            System.out.println("Roll: "+rs.getInt(1)+"\tName: "+rs.getString(2)+"\tFaculty: "+rs.getString(3)+"\tName: "+rs.getInt(4));
        }
    }
    public void closeConnection(Connection cn) throws SQLException{
        cn.close();
        System.out.println("Connection closed");
    }
    public void noOfRecords(Connection cn) throws SQLException{
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("Select * FROM students");
        int count=0;
        while(rs.next()){
            count=count+1;
        }
        System.out.println("Number of records present in the table is: "+count);
    }
    public void specificRecords(Connection cn) throws SQLException{
        System.out.println("Enter any name to get information of: ");
        String name=s.next();
        PreparedStatement st=cn.prepareStatement("Select count(roll) FROM students where name=?");
        st.setString(1,name);
        ResultSet rs=st.executeQuery();
        rs.next();
        System.out.println("Total no of records found for name "+name+" is: "+rs.getInt(1));
    }
    public void avgMarks(Connection cn) throws SQLException{
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("Select avg(marks) FROM students");
        rs.next();
        System.out.println("Average marks present in the table is: "+rs.getFloat(1));
    }
    public void facultyAvgMarks(Connection cn) throws SQLException{
        System.out.println("Enter any faculty to get get average marks of: ");
        String f=s.next();
        PreparedStatement st=cn.prepareStatement("Select avg(marks) FROM students where faculty=?");
        st.setString(1, f);
        ResultSet rs=st.executeQuery();
        rs.next();
        System.out.println("Average marks of"+f+" present in the table is: "+rs.getFloat(1));
    }
    public void showMenu(){
        System.out.println("*****MENU*****\n1. Display records\n2. Display total no of records\n3. Display record of given name\n4. Display average marks\n5.Display average marks of given faculty");
    }
    public static void main(String [] args){
        try{
            String url="jdbc:mysql://localhost:3306/ncit";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection(url, "root", "Berlin3^2");
            int choice;
            MenuDriven md=new MenuDriven();
            md.showMenu();
            do{
                System.out.println("Enter a choice: ");
                choice=s.nextInt();
                switch(choice){
                    case 1: md.displayRecords(cn);
                            break;
                    case 2: md.noOfRecords(cn);
                            break;
                    case 3: md.specificRecords(cn);
                            break;
                    case 4: md.avgMarks(cn);
                            break;
                    case 5: md.facultyAvgMarks(cn);
                            break;
                    case 6: md.closeConnection(cn);
                            break;
                    default: md.showMenu();

                }
            }while(choice!=6);
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}