package tag.simpleTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TransferSimpleTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		
		JspWriter out = getJspContext().getOut();
		String trans = (String)((PageContext)getJspContext()).getSession().getAttribute("trans");
		
		if(trans == null) {
			return;
		}
		
		if (trans.equals("success")) {
			out.write("<script>alert(\"success\")</script>");
		}
		
		if (trans.equals("notEnough")) {
			out.write("<script>alert(\"balance not enough\")</script>");
		}
		
		if (trans.equals("noClient")) {
			out.write("<script>alert(\"no such client\")</script>");
		}
		
		((PageContext)getJspContext()).getSession().removeAttribute("trans");
	}
	
}
