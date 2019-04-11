package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import pnr.PnrdetailDto;


public class PnrdatabaseDAO {
	
	public PnrdetailDto getPnr(PnrdetailDto pdd) throws Exception
	{
		Connection	con	= null;
		Statement	st	= null;
		ResultSet	rs	= null;
		String 		url   ="jdbc:mysql://127.0.0.1:3306/cris";
	    String 		uname ="root";
		String 		pass  ="admin";
		String   	p_no = pdd.getUser_pnr();
		String 		query ="select * from pnrstatus WHERE p_no ="  + p_no + "";
				
				
				
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection(url,uname,pass);
			st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()) {
				
				String name = rs.getString("name");
				String dateStr = rs.getString("d_o_b");
				String address = rs.getString("Address");
				String status = rs.getString("status");
				
				pdd.setName(name);
				pdd.getUser_pnr();
				pdd.getDob();
				pdd.getAddress();
				pdd.getStatus();
				
				System.out.println(name + "\t" + dateStr +
                        "\t" + address + "\t" + status);
			
			
			}
			
		} catch(Exception e) {	// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(con!=null) {
				con.close();
				con=null;
			}
			if(st!=null) {
				st.close();
				st=null;
			}
		}
		return pdd;		
	}



}
