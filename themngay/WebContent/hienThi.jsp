<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Danh sách sinh viên</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="bs-example">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Ma NV</th>
                <th>Ngay Sinh</th>
            </tr>
            </thead>
            <tbody>
            <logic:iterate name="hienThiForm" property="lst" id="sv">
            	<tr>
                <th scope="row">
                	<bean:write name="sv" property="manv"/>
				</th>
                <td>
                	<bean:write name="sv" property="ngaysinh"/>
                </td>
				<td>
                	<bean:define id="msv" name="sv" property="manv"></bean:define>
                	<html:link action="/sua?manv=${msv}">
                		<span class="glyphicon glyphicon-edit"></span>
                	</html:link>
                	<%-- <html:link action="/xoaSV?msv=${msv}" style="margin-left: 30px;">
                		<span class="glyphicon glyphicon-trash"></span>
                	</html:link> --%>
                </td>
            </tr>
            </logic:iterate>
            </tbody>
        </table>
    </div>
</body>
</html>