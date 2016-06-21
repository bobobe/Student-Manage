<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<body>success
<s:property value="flag"/>
<s:if test="flag=='success'">
       登陆成功
</s:if>
</body>