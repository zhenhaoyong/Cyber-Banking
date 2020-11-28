package tag.simpleTag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import dao.client.BalanceQuiry;
import dao.impl.BalanceQuiryImpl;


public class BalanceSimpleTag extends SimpleTagSupport {
	
	BalanceQuiry bq = new BalanceQuiryImpl();
	
	@Override
	public void doTag() throws JspException, IOException {
		
		JspWriter out = getJspContext().getOut();
		String phoneNo = (String)((PageContext)getJspContext()).getSession().getAttribute("phoneNo");
		//System.out.println(bq.banlance(phoneNo));
		out.write("" + bq.banlance(phoneNo));
	}
}
