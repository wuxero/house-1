package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class First_005fDemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  \t\t<form action=\"user/insert_user.action\" method=\"post\">\r\n");
      out.write("  \t\t\t<table>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>用户名:</td>\r\n");
      out.write("  \t\t\t\t\t<td><input type=\"text\" name=\"info.username\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>密码</td>\r\n");
      out.write("  \t\t\t\t\t<td><input type=\"text\"name=\"info.password\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>性别:</td>\r\n");
      out.write("  \t\t\t\t\t<td>男<input type=\"radio\" name=\"info.sex\" value=\"1\"/>女<input type=\"radio\" name=\"info.sex\" value=\"0\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>真实姓名:</td>\r\n");
      out.write("  \t\t\t\t\t<td><input type=\"text\" name=\"info.realname\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>籍贯:</td>\r\n");
      out.write("  \t\t\t\t\t<td><input type=\"text\" name=\"info.city\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>身份证号码:</td>\r\n");
      out.write("  \t\t\t\t\t<td><input type=\"text\" name=\"info.cardnum\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>电话号码:</td>\r\n");
      out.write("  \t\t\t\t\t<td><input type=\"text\" name=\"info.phoneno\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>电子邮件:</td>\r\n");
      out.write("  \t\t\t\t\t<td><input type=\"text\" name=\"info.email\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>手机:</td>\r\n");
      out.write("  \t\t\t\t\t<td><input type=\"text\" name=\"info.mbphone\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>住址:</td>\r\n");
      out.write("  \t\t\t\t\t<td><input type=\"text\" name=\"info.address\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>结婚:</td>\r\n");
      out.write("  \t\t\t\t\t<td>是<input type=\"radio\" name=\"info.marry\" value=\"yes\"/>否<input type=\"radio\" name=\"info.marry\" value=\"no\"/></td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>\r\n");
      out.write("  \t\t\t\t\t\t<input type=\"submit\" value=\"提交\"/>\r\n");
      out.write("  \t\t\t\t\t</td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t</table>\r\n");
      out.write("  \t\t</form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
