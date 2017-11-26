package ExcelDemo;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Excel {
    private static void Test(int a)
    {
        a=10;
    }
    private static void FindHeaderSqlDemo(){
        String sql="select COLUMN_NAME from information_schema.COLUMNS where table_name = 'demo' and table_schema = 'bddb';";
        System.out.println("连接到数据库");
        try{
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //链接到数据库
            Connection ss = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddb", "root","1234");
            //获取对象
            PreparedStatement ps=ss.prepareStatement(sql);
            //插入记录到数据库中
//            String sqlstr = "create table studentmanager(id int(1),name varchar(20));";
            ArrayList<String> headers=new ArrayList<String>();
            ps = ss.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                headers.add(rs.getString(1));
            }
            rs.close();
            ps.close();

            for(int i=0;i<headers.size();i++)
            {
                System.out.print(headers.get(i));
            }
            System.out.println("创建成功！");
            ps.close();
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println("创建失败！或已经存在该表格"+e);
            e.printStackTrace();
        }

    }//获取表头
    private static void SelectAllDemo(){
        String sql = "select * from demo;";
        System.out.println("连接到数据库");
        try{
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //链接到数据库
            Connection ss = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddb", "root","1234");
            //获取对象
            PreparedStatement ps=ss.prepareStatement(sql);
            //插入记录到数据库中
//            String sqlstr = "create table studentmanager(id int(1),name varchar(20));";
            ArrayList<String> headers=new ArrayList<String>();
            ps = ss.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                headers.add(rs.getString(1));
                headers.add(rs.getString(2));
                headers.add(rs.getString(3));
                headers.add(rs.getString(4));
                headers.add(rs.getString(5));
                headers.add(rs.getString(6));
                headers.add(rs.getString(7));
            }
            rs.close();
            ps.close();

            for(int i=0;i<headers.size();i++)
            {
                System.out.print(headers.get(i));
            }
            System.out.println("创建成功！");
            ps.close();
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println("创建失败！或已经存在该表格"+e);
            e.printStackTrace();
        }

    }//获取所有信息
    private static void FindHeadersCountTable(){
        String sql = "select count(*) from information_schema.`COLUMNS` where TABLE_SCHEMA='bddb' and TABLE_NAME='demo';";
        System.out.println("连接到数据库");
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //链接到数据库
            Connection ss = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddb", "root", "1234");
            //获取对象
            PreparedStatement ps = ss.prepareStatement(sql);
            //插入记录到数据库中
//            String sqlstr = "create table studentmanager(id int(1),name varchar(20));";
            ArrayList<String> headers = new ArrayList<String>();
            ps = ss.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                headers.add(rs.getString(1));
            }
            rs.close();
            ps.close();

            for (int i = 0; i < headers.size(); i++) {
                System.out.print(headers.get(i));
            }
            System.out.println("创建成功！");
            ps.close();
            ss.close();
        }
             catch(Exception e)
            {
                System.out.println("创建失败！或已经存在该表格"+e);
                e.printStackTrace();
            }
    }
    //获取字段数量
    public static void main(String[] args) {
       int a=0;
      Excel excel=new Excel();
      Test(a);
      System.out.print(a);

//        FileInputStream filein=null;
//        try {
//            filein=new FileInputStream("G:\\大数据项目\\Demo.xlsx");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        Workbook wb=null;
//        try {
//            wb=new XSSFWorkbook(filein);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Sheet sheet1=wb.getSheetAt(0);
//        int num=sheet1.getRow(0).getLastCellNum();
//        String result=null;
//        String sql="create table";
//        String tablename=" Demo";
//        sql=sql+tablename+"(";
//        sql+="id int(4) primary key not null auto_increment,";
//        for(int i=0;i<num;i++)
//        {
//            if(i==num-1)
//            {
//                sql+=sheet1.getRow(0).getCell(i).getStringCellValue();
//                sql+=" varchar(20)";
//            }
//            else {
//                sql += sheet1.getRow(0).getCell(i).getStringCellValue();
//                sql += " varchar(20),";
//            }
//        }
//        sql+=");";
//        String sql="select COLUMN_NAME from information_schema.COLUMNS where table_name = 'demo' and table_schema = 'bddb';";
//        System.out.println("连接到数据库");
//        try{
//            //加载驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //链接到数据库
//            Connection ss = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddb", "root","1234");
//            //获取对象
//            PreparedStatement ps=ss.prepareStatement(sql);
//            //插入记录到数据库中
////            String sqlstr = "create table studentmanager(id int(1),name varchar(20));";
//            ArrayList<String> headers=new ArrayList<String>();
//            ps = ss.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                headers.add(rs.getString(1));
//            }
//            rs.close();
//            ps.close();
//
//            for(int i=0;i<headers.size();i++)
//            {
//                System.out.print(headers.get(i));
//            }
//            System.out.println("创建成功！");
//            ps.close();
//            ss.close();
//        }
//        catch(Exception e)
//        {
//            System.out.println("创建失败！或已经存在该表格"+e);
//            e.printStackTrace();
//        }
        FindHeaderSqlDemo();
       SelectAllDemo();
        FindHeadersCountTable();
    }
}
