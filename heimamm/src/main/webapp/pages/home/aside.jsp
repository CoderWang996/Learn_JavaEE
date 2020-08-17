<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../base.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${ctx}/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p> ${sessionScope.user.userName}</p>
                <a href="#">${sessionScope.user.deptName}</a>
            </div>
        </div>

        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-cube"></i> <span>平台系统管理</span>
                    <span class="pull-right-container">
                   <i class="fa fa-angle-left pull-right"></i>
               </span>
                </a>
                <ul class="treeview-menu">
                    <li id="sys-dept">
                        <a href="${ctx}/system/dept/findAll" onclick="setSidebarActive(this)" target="iframe">
                            <i class="fa fa-circle-o"></i>部门管理
                        </a>
                    </li>
                    <li id="sys-user">
                        <a href="${ctx}/pages/system/user/list.jsp" onclick="setSidebarActive(this)" target="iframe">
                            <i class="fa fa-circle-o"></i>用户管理
                        </a>
                    </li>
                    <li id="sys-role">
                        <a href="${ctx}/system/role?operation=list" onclick="setSidebarActive(this)" target="iframe">
                            <i class="fa fa-circle-o"></i>角色管理
                        </a>
                    </li>
                    <li id="module-manager">
                        <a href="${ctx}/system/module?operation=list" onclick="setSidebarActive(this)" target="iframe">
                            <i class="fa fa-circle-o"></i>模块管理
                        </a>
                    </li>
                    <li id="sys-log">
                        <a href="${ctx}/system/sysLog?operation=list" onclick="setSidebarActive(this)" target="iframe">
                            <i class="fa fa-circle-o"></i>系统日志管理
                        </a>
                    </li>
                </ul>
            </li>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-cube"></i> <span>题库管理</span>
                    <span class="pull-right-container">
                 <i class="fa fa-angle-left pull-right"></i>
             </span>
                </a>
                <ul class="treeview-menu">
                    <li id="course-manager">
                        <a href="${ctx}/store/course?operation=list" onclick="setSidebarActive(this)"
                           target="iframe">
                            <i class="fa fa-circle-o"></i>题目学科管理
                        </a>
                    </li>
                    <li id="catalog-manager">
                        <a href="${ctx}/store/catalog?operation=list" onclick="setSidebarActive(this)"
                           target="iframe">
                            <i class="fa fa-circle-o"></i>题目类型管理
                        </a>
                    </li>
                    <li id="company-manager">
                        <a href="${ctx}/store/company/findAll" onclick="setSidebarActive(this)" target="iframe">
                            <i class="fa fa-circle-o"></i>企业管理
                        </a>
                    </li>
                    <li id="question-manager">
                        <a href="${ctx}/store/question?operation=list" onclick="setSidebarActive(this)"
                           target="iframe">
                            <i class="fa fa-circle-o"></i>题目管理
                        </a>
                    </li>
                    <li id="question-examine-manager">
                        <a href="${ctx}/store/examineLog?operation=list" onclick="setSidebarActive(this)"
                           target="iframe">
                            <i class="fa fa-circle-o"></i>题目审核日志管理
                        </a>
                    </li>
                </ul>
            </li>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-cube"></i> <span>会员管理</span>
                    <span class="pull-right-container">
                 <i class="fa fa-angle-left pull-right"></i>
             </span>
                </a>
                <ul class="treeview-menu">
                    <li id="member-manager">
                        <a href="${ctx}/front/member?operation=list" onclick="setSidebarActive(this)"
                           target="iframe">
                            <i class="fa fa-circle-o"></i>会员账号管理
                        </a>
                    </li>
                    <li id="member-anwser">
                        <a href="${ctx}/front/memberQuestion?operation=list" onclick="setSidebarActive(this)"
                           target="iframe">
                            <i class="fa fa-circle-o"></i>会员答题管理
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
