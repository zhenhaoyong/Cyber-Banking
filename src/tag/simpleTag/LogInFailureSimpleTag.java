package tag.simpleTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class LogInFailureSimpleTag extends SimpleTagSupport {
	
	@Override
	public void doTag() throws JspException {
		
		try {
			/**
			 * authencate failed return note
			 */
			JspWriter out = getJspContext().getOut();
			String fail = (String)((PageContext)getJspContext()).getSession().getAttribute("false");
			if (fail != null  && fail.equals("Y")) {
				out.write("<span style=\"color:red\">Wrong Name or PassWord or Identity</span>");
			}
			
			((PageContext)getJspContext()).getSession().removeAttribute("false");
		} catch (java.io.IOException e) {
			throw new JspTagException(e.getMessage());
		}	
	}

}
