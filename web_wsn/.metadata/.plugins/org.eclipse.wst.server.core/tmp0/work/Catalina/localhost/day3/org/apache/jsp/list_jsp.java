/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-07 09:02:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("header{\r\n");
      out.write(" border:1px solid black;\r\n");
      out.write(" padding :20px;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("nav{\r\n");
      out.write("	\r\n");
      out.write("	 border:1px solid black;\r\n");
      out.write("	 padding :10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a{\r\n");
      out.write("	text-decoration:none;\r\n");
      out.write("	color:black;\r\n");
      out.write("}\r\n");
      out.write("nav span{\r\n");
      out.write("   padding-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("section {\r\n");
      out.write(" height: 500px;\r\n");
      out.write(" padding:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("footer{\r\n");
      out.write("  border:1px solid black;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  padding:10px;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer  > div{\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("footer > div:nth-child(1) {	 \r\n");
      out.write("	 width:20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("footer > div:nth-child(2) {	 \r\n");
      out.write("	 width:60%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("footer > div:nth-child(3) {\r\n");
      out.write("	 \r\n");
      out.write("	 width:20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table{\r\n");
      out.write("	 width:400px;\r\n");
      out.write("	 border:1px solid black;\r\n");
      out.write("	 margin:0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td{\r\n");
      out.write(" border:1px solid black;\r\n");
      out.write(" text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("<h2>HY대학교 수강신청 프로그램</h2>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("	<span> <a href=\"list.jsp\"> 참가자 조회</a></span>\r\n");
      out.write("	<span> <a href=\"#\"> 참가자 등록</a></span>\r\n");
      out.write("	<span> <a href=\"#\"> 참가자 조회</a></span>\r\n");
      out.write("	<span> <a href=\"#\"> 참가자 조회</a></span>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("  <h2>  강사조회 </h2>\r\n");
      out.write("  <table>\r\n");
      out.write("  \r\n");
      out.write("  <!--  제목줄 -->\r\n");
      out.write("  	<tr>\r\n");
      out.write("  	  <td>강사번호</td>\r\n");
      out.write("  	  <td>강사이름</td>\r\n");
      out.write(" 	  <td>전공</td>\r\n");
      out.write("  	  <td>연구분야</td>	    	  \r\n");
      out.write("  	</tr>  	  	\r\n");
      out.write("  	\r\n");
      out.write("  	\r\n");
      out.write(" ");
 Connection con=null;
	Statement st = null;
	ResultSet rs = null;
	try{ 
		//데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		 //1. 오라클드라이버 로딩
		Class.forName(driver); 
		 //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password);
		 
		if( con == null) {  System.out.println(" 연결실패");} 
		 //3. statement 얻어오기
		st = con.createStatement();
		 //4. 필요한 sql 작성
		String sql =" select  * from  tbl_lecturer_300"; //5. 최종적으로 실행
		rs = st.executeQuery( sql) ;
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		while( rs.next() ) { 
		
      out.write(" 	  	 \r\n");
      out.write("	  	 <tr>\r\n");
      out.write("	  	  <td>");
      out.print(rs.getString(1));
      out.write("</td>	  	 \r\n");
      out.write("	  	  <td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("	 	  <td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("	  	  <td>");
      out.print(rs.getString(4));
      out.write("</td>	    	  \r\n");
      out.write("	  	</tr>  	\r\n");
      out.write("  	 ");

  		}
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( rs!= null) rs.close();
		if( st != null) st.close();
		if( con != null) con.close();
	}

      out.write("\r\n");
      out.write("  	\r\n");
      out.write("  </table>\r\n");
      out.write(" \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("	<div>ACORN</div>\r\n");
      out.write("	<div>회사소개인재채용제휴제안이용약관개인정보처리방침청소년보호정책네이버 정책고객센터ⓒ NAVER Corp.</div>\r\n");
      out.write("	<div>기업 사이트</div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}