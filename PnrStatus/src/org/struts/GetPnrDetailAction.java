package org.struts;
import com.opensymphony.xwork2.ActionSupport;

import db.PnrdatabaseDAO;
import pnr.PnrdetailDto;


public class GetPnrDetailAction extends ActionSupport{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 4036169760317456530L;
	private PnrdetailDto pdd;
	
	
	public PnrdetailDto getPdd() {
		return pdd;
	}

	public void setPdd(PnrdetailDto pdd) {
		this.pdd = pdd;
	}


	public String execute() 
	{
		PnrdatabaseDAO p2 = new PnrdatabaseDAO();
		try {
			p2.getPnr(pdd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "success";
	}
      

	
}