<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base.jsp"%>
<!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>黑马面面管理系统</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!-- 页面meta /-->
    <script src="${ctx}/plugins/jQuery/jquery-2.2.3.min.js"></script>
</head>
<script>
    function deleteById() {
        let id = getCheckId();
        if(id.length>0) {
            if(confirm("你确认要删除这些记录吗？")) {
                location.href="${ctx}/store/company/deleteByIds?ids="+id;
            }
        }else{
            alert("请勾选待处理的记录，至少勾选一个");
        }
    }
</script>
<body>
<div id="frameContent" class="content-wrapper" style="margin-left:0px;">
<section class="content-header">
    <h1>
        企业管理
        <small>企业列表</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> 首页</a></li>
    </ol>
</section>
<!-- 内容头部 /-->

<!-- 正文区域 -->
<section class="content">

    <!-- .box-body -->
    <div class="box box-primary">
        <div class="box-header with-border">
            <h3 class="box-title">列表</h3>
        </div>

        <div class="box-body">

            <!-- 数据表格 -->
            <div class="table-box">

                <!--工具栏-->
                <div class="pull-left">
                    <div class="form-group form-inline">
                        <div class="btn-group">
                            <button type="button" class="btn btn-default" title="新建" onclick='location.href="${ctx}/pages/store/company/add.jsp"'><i class="fa fa-file-o"></i> 新建</button>
                            <button type="button" class="btn btn-default" title="删除" onclick='deleteById()'><i class="fa fa-trash-o"></i> 删除</button>
                            <button type="button" class="btn btn-default" title="刷新" onclick="window.location.reload();"><i class="fa fa-refresh"></i> 刷新</button>
                        </div>
                    </div>
                </div>
                <div class="box-tools pull-right">
                    <div class="has-feedback">
                        <input type="text" class="form-control input-sm" placeholder="搜索">
                        <span class="glyphicon glyphicon-search form-control-feedback"></span>
                    </div>
                </div>
                <!--工具栏/-->

                <!--数据列表-->
                <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
                    <thead>
                    <tr>
                        <th class="" style="padding-right:0px;">

                        </th>
                        <th class="sorting">企业名称</th>
                        <th class="sorting">所在地</th>
                        <th class="sorting">地址</th>
                        <th class="sorting">企业法人</th>
                        <th class="sorting">联系方式</th>
                        <th class="sorting">所属行业</th>
                        <th class="sorting">状态</th>
                        <th class="text-center">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${page.list}" var="item">
                    <tr>
                        <td><input name="ids" value="${item.id}" type="checkbox"></td>
                        <td>
                            ${item.name}
                        </td>
                        <td>${item.city}</td>
                        <td>${item.address}</td>
                        <td>${item.representative}</td>
                        <td>${item.phone}</td>
                        <td>${item.industry}</td>
                        <td>${item.state ==0?'未审核':'已审核'}</td>
                        <td class="text-center">
                            <button type="button" class="btn bg-olive btn-xs" onclick='location.href="${ctx}/store/company/toUpdate?id=${item.id}"'>编辑</button>
                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>

         <div class="box-footer">
             <%--当页面加载到此处时，会加载page.jsp页面--%>
                 <%--设置参数及值
                       pageUrl：${ctx}/store/company/findAll
                    --%>
             <jsp:include page="../../common/page.jsp">
                 <jsp:param value="${ctx}/store/company/findAll" name="pageUrl"/>
             </jsp:include>
         </div>
    </div>
</section>
</div>
</body>

</html>