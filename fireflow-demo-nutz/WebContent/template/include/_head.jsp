<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/shiro.tld" prefix="shiro" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link media="screen" type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/common.css">

<link media="screen" type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/lib/jquery-ui-1.10.4/css/trontastic/jquery-ui-1.10.4.custom.css">
<link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/static/lib/jtable-2.4.0/themes/jqueryui/jtable_jqueryui.customize.css" />
<link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/static/lib/easytree-1.0.0/skin-win7/ui.easytree.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/lib/jquery.wk.toolbar-1.0.0/css/jquery-wk.toolbar-eclipse.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/lib/jquery-contextmenu-1.6.6/jquery.contextMenu.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/lib/validationEngine/validationEngine.jquery.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/lib/ztree/zTreeStyle/zTreeStyle.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/lib/jquery-chosen-1.1/chosen.css"/>


<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery-1.11.1/jquery-1.11.1.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery-ui-1.10.4/js/jquery-ui-1.10.4.custom.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jtable-2.4.0/jquery.jtable.customize.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jtable-2.4.0/localization/jquery.jtable.zh-CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/easytree-1.0.0/jquery.easytree.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery-form-3.51.0/jquery.form.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery.wk.toolbar-1.0.0/js/jquery.wk.toolbar-1.0.0.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery-contextmenu-1.6.6/jquery.contextMenu.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery-cookie-1.4.1/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/validationEngine/jquery.validationEngine-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/validationEngine/jquery.validationEngine.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/oj.cmn.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/ztree/jquery.ztree.core-3.5.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/ztree/jquery.ztree.excheck-3.5.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery-number-master/jquery.number.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery-chosen-1.1/chosen.jquery.js"></script>
<!-- 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery.ba-resize.js"></script>
 -->
${requestScope.theScriptElements}
<title>${requestScope.thePageTitle}</title>
</head>
<body>
<div id="bodyDiv" style="overflow:hidden;width:100%;height:99%" >
	<table width="100%" border="0" cellspacing="0" cellpadding="0">

		<tr>
			<td 
				background="${pageContext.request.contextPath}/static/images/green/main_07.gif"><table
					width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="282" height="52">&nbsp;<img width="125" height="36"
							src="${pageContext.request.contextPath}/static/images/fireflow_logo_small.png" />
						</td>
						<td><table width="100%" border="0" cellspacing="0"
								cellpadding="0">
								<tr>
									<td><span class="STYLE1"></span> <span class="STYLE4"></span>
									</td>
								</tr>
							</table></td>
						<td 
							background="${pageContext.request.contextPath}/static/images/green/main_08.gif">&nbsp;</td>
						<td width="200"
							background="${pageContext.request.contextPath}/static/images/green/main_09.gif" style="padding-right:10px">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td align="right" colspan="2" height="28px">
											<span class="STYLE2">
												当前登录用户：<shiro:principal property="name" /> 
											</span>
									</td>
								</tr>
								<tr>
									<td align="right"> <span class="STYLE4"><a
											href="${pageContext.request.contextPath}/module/User/logout"
											target="_top">退出系统</a> </span></td>
									<td align="right" width="60px"><span class="STYLE1"> </span> <span class="STYLE4"><a
											href="${pageContext.request.contextPath}/module/User/resetSelfPwd"
											target="mainFrame">修改密码</a> </span></td>
								</tr>

							</table></td>
					</tr>
				</table></td>
		</tr>
	</table>
<table id="MainFrameTable" width="100%"   border="0" cellpadding="0" cellspacing="0" style="table-layout:fixed;">
  <tr>
    <td style="width:4px; background-image:url(${pageContext.request.contextPath}/static/images/green/main_16.gif)">&nbsp;</td>  
    <td id="navTd" style="width:173px" noWrap align="center" valign="top">
		<jsp:include page="/template/include/_left_navigator.jsp"></jsp:include>
	</td>
    <td id="navControlTd" width="8" valign="middle" background="${pageContext.request.contextPath}/static/images/green/main_12.gif" id=""><span class="navPoint"><img src="${pageContext.request.contextPath}/static/images/green/main_18.gif" name="img1" width=8 height=52 id=img1></span></td>
    <td id="workSpaceTd" align="center" valign="top">
    	<div id="WorkspaceDiv">



	
	


