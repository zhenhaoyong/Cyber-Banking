package tag.simpleTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ModifySimpleTag extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		String res = (String)((PageContext)getJspContext()).getSession().getAttribute("modify");
		
		if (res == null) {
			return;
		}
		
		out.write("<script>alert(\""+res+"\")</script>");	
		((PageContext)getJspContext()).getSession().removeAttribute("modify");
	}

	
}
