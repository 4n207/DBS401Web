/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-16 14:19:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/home/anbvhe150476/NetBeansProjects/DBS401Web/build/web/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1686325601265L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Quản trị Admin</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- Main CSS-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"admin/css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("        <!-- or -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("        <!-- Font-icon css-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body onload=\"time()\" class=\"app sidebar-mini rtl\">\n");
      out.write("        <!-- Navbar-->\n");
      out.write("        <header class=\"app-header\">\n");
      out.write("            <!-- Sidebar toggle button--><a class=\"app-sidebar__toggle\" href=\"#\" data-toggle=\"sidebar\"\n");
      out.write("                                            aria-label=\"Hide Sidebar\"></a>\n");
      out.write("            <!-- Navbar Right Menu-->\n");
      out.write("            <ul class=\"app-nav\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- User Menu-->\n");
      out.write("                <li><a class=\"app-nav__item\" href=\"home\"><i class='bx bx-log-out bx-rotate-180'></i> </a>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </header>\n");
      out.write("        <!-- Sidebar menu-->\n");
      out.write("        <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\n");
      out.write("        <aside class=\"app-sidebar\">\n");
      out.write("            <div class=\"app-sidebar__user\"><img class=\"app-sidebar__user-avatar\" src=\"admin/images/user.png\" width=\"50px\"\n");
      out.write("                                                alt=\"User Image\">\n");
      out.write("                <div>\n");
      out.write("                    <p class=\"app-sidebar__user-name\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.user_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</b></p>\n");
      out.write("                    <p class=\"app-sidebar__user-designation\">Welcome back</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <ul class=\"app-menu\">\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"dashboard\"><i class='app-menu__icon bx bx-tachometer'></i><span\n");
      out.write("                            class=\"app-menu__label\">Bảng điều khiển</span></a></li>\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"customermanager\"><i class='app-menu__icon bx bx-user-voice'></i><span\n");
      out.write("                            class=\"app-menu__label\">Quản lý khách hàng</span></a></li>\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"productmanager\"><i\n");
      out.write("                            class='app-menu__icon bx bx-purchase-tag-alt'></i><span class=\"app-menu__label\">Quản lý sản phẩm</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"ordermanager\"><i class='app-menu__icon bx bx-task'></i><span\n");
      out.write("                            class=\"app-menu__label\">Quản lý đơn hàng</span></a></li>\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"https://docs.google.com/spreadsheets/d/1elWy0LYj9ngbmywMGwy8Noe_K7WmyisQ6aHOK6RnXZI\" target=\"_blank\"><i class='app-menu__icon bx bx-task'></i><span\n");
      out.write("                            class=\"app-menu__label\">Kiểm tra phản hồi</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </aside>\n");
      out.write("        <main class=\"app-content\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"app-title\">\n");
      out.write("                        <ul class=\"app-breadcrumb breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\"><b>Bảng điều khiển</b></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div id=\"clock\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 col-lg-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!-- col-6 -->\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"widget-small primary coloured-icon\"><i class='icon bx bxs-user-account fa-3x'></i>\n");
      out.write("                                <div class=\"info\">\n");
      out.write("                                    <h4>Tổng khách hàng</h4>\n");
      out.write("                                    <p><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" khách hàng</b></p>\n");
      out.write("                                    <p class=\"info-tong\">Tổng số khách hàng được quản lý.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- col-6 -->\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"widget-small info coloured-icon\"><i class='icon bx bxs-data fa-3x'></i>\n");
      out.write("                                <div class=\"info\">\n");
      out.write("                                    <h4>Tổng sản phẩm</h4>\n");
      out.write("                                    <p><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.product}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" sản phẩm</b></p>\n");
      out.write("                                    <p class=\"info-tong\">Tổng số sản phẩm được quản lý.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- col-6 -->\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"widget-small warning coloured-icon\"><i class='icon bx bxs-shopping-bags fa-3x'></i>\n");
      out.write("                                <div class=\"info\">\n");
      out.write("                                    <h4>Tổng đơn hàng</h4>\n");
      out.write("                                    <p><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.bill}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" đơn hàng</b></p>\n");
      out.write("                                    <p class=\"info-tong\">Tổng số hóa đơn bán hàng trong tháng.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- col-6 -->\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"widget-small danger coloured-icon\"><i class='icon bx bxs-error-alt fa-3x'></i>\n");
      out.write("                                <div class=\"info\">\n");
      out.write("                                    <h4>Sắp hết hàng</h4>\n");
      out.write("                                    <p><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.low}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" sản phẩm</b></p>\n");
      out.write("                                    <p class=\"info-tong\">Số sản phẩm cảnh báo hết cần nhập thêm.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- col-12 -->\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"tile\">\n");
      out.write("                                <h3 class=\"tile-title\">Đơn hàng hôm nay</h3>\n");
      out.write("                                <div>\n");
      out.write("                                    <table class=\"table table-bordered\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>ID đơn hàng</th>\n");
      out.write("                                                <th>Khách hàng</th>\n");
      out.write("                                                <th>Số điện thoại</th>\n");
      out.write("                                                <th>Địa chỉ</th>\n");
      out.write("                                                <th>Ngày mua</th>\n");
      out.write("                                                <th>Tổng tiền</th>\n");
      out.write("                                                <th>Thanh Toán</th>\n");
      out.write("                                                <th>Chức năng</th>\n");
      out.write("                                                \n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- / div trống-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- / col-12 -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"text-center\" style=\"font-size: 13px\">\n");
      out.write("                <p><b>Copyright\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            document.write(new Date().getFullYear());\n");
      out.write("                        </script> Phần mềm quản lý Website\n");
      out.write("                    </b></p>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <script src=\"admin/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"admin/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/boxicons@latest/dist/boxicons.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"admin/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"admin/js/main.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"admin/js/plugins/pace.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                            var data = {\n");
      out.write("                                labels: [\"Tháng 1\", \"Tháng 2\", \"Tháng 3\", \"Tháng 4\", \"Tháng 5\", \"Tháng 6\"],\n");
      out.write("                                datasets: [{\n");
      out.write("                                        label: \"Dữ liệu đầu tiên\",\n");
      out.write("                                        fillColor: \"rgba(255, 213, 59, 0.767), 212, 59)\",\n");
      out.write("                                        strokeColor: \"rgb(255, 212, 59)\",\n");
      out.write("                                        pointColor: \"rgb(255, 212, 59)\",\n");
      out.write("                                        pointStrokeColor: \"rgb(255, 212, 59)\",\n");
      out.write("                                        pointHighlightFill: \"rgb(255, 212, 59)\",\n");
      out.write("                                        pointHighlightStroke: \"rgb(255, 212, 59)\",\n");
      out.write("                                        data: [20, 59, 90, 51, 56, 100]\n");
      out.write("                                    },\n");
      out.write("                                    {\n");
      out.write("                                        label: \"Dữ liệu kế tiếp\",\n");
      out.write("                                        fillColor: \"rgba(9, 109, 239, 0.651)  \",\n");
      out.write("                                        pointColor: \"rgb(9, 109, 239)\",\n");
      out.write("                                        strokeColor: \"rgb(9, 109, 239)\",\n");
      out.write("                                        pointStrokeColor: \"rgb(9, 109, 239)\",\n");
      out.write("                                        pointHighlightFill: \"rgb(9, 109, 239)\",\n");
      out.write("                                        pointHighlightStroke: \"rgb(9, 109, 239)\",\n");
      out.write("                                        data: [48, 48, 49, 39, 86, 10]\n");
      out.write("                                    }\n");
      out.write("                                ]\n");
      out.write("                            };\n");
      out.write("                            var ctxl = $(\"#lineChartDemo\").get(0).getContext(\"2d\");\n");
      out.write("                            var lineChart = new Chart(ctxl).Line(data);\n");
      out.write("\n");
      out.write("                            var ctxb = $(\"#barChartDemo\").get(0).getContext(\"2d\");\n");
      out.write("                            var barChart = new Chart(ctxb).Bar(data);\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            //Thời Gian\n");
      out.write("            function time() {\n");
      out.write("                var today = new Date();\n");
      out.write("                var weekday = new Array(7);\n");
      out.write("                weekday[0] = \"Chủ Nhật\";\n");
      out.write("                weekday[1] = \"Thứ Hai\";\n");
      out.write("                weekday[2] = \"Thứ Ba\";\n");
      out.write("                weekday[3] = \"Thứ Tư\";\n");
      out.write("                weekday[4] = \"Thứ Năm\";\n");
      out.write("                weekday[5] = \"Thứ Sáu\";\n");
      out.write("                weekday[6] = \"Thứ Bảy\";\n");
      out.write("                var day = weekday[today.getDay()];\n");
      out.write("                var dd = today.getDate();\n");
      out.write("                var mm = today.getMonth() + 1;\n");
      out.write("                var yyyy = today.getFullYear();\n");
      out.write("                var h = today.getHours();\n");
      out.write("                var m = today.getMinutes();\n");
      out.write("                m = checkTime(m);\n");
      out.write("                nowTime = h + \":\" + m + \"\";\n");
      out.write("                if (dd < 10) {\n");
      out.write("                    dd = '0' + dd\n");
      out.write("                }\n");
      out.write("                if (mm < 10) {\n");
      out.write("                    mm = '0' + mm\n");
      out.write("                }\n");
      out.write("                today = day + ', ' + dd + '/' + mm + '/' + yyyy;\n");
      out.write("                tmp = '<span class=\"date\"> ' + today + ' - ' + nowTime +\n");
      out.write("                        '</span>';\n");
      out.write("                document.getElementById(\"clock\").innerHTML = tmp;\n");
      out.write("                clocktime = setTimeout(\"time()\", \"1000\", \"Javascript\");\n");
      out.write("\n");
      out.write("                function checkTime(i) {\n");
      out.write("                    if (i < 10) {\n");
      out.write("                        i = \"0\" + i;\n");
      out.write("                    }\n");
      out.write("                    return i;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /admin/index.jsp(145,44) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/admin/index.jsp(145,44) '${billbyday}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${billbyday}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /admin/index.jsp(145,44) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("b");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                                <tr>\n");
            out.write("                                                    <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.bill_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                                    <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.user.user_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                                    <td>(+84)");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                                    <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                                    <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                                    <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.total}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                                    <td><span class=\"badge bg-success\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.payment}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span></td>                                  \n");
            out.write("                                                    <td><a style=\" color: rgb(245 157 57);background-color: rgb(251 226 197); padding: 5px;border-radius: 5px;\" href=\"ordermanager?action=showdetail&bill_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.bill_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"><i class=\"fa\"></i>Chi tiết đơn hàng</a></td>\n");
            out.write("                                                </tr>\n");
            out.write("                                            ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
