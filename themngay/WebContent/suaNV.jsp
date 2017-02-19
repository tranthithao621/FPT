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
    <title>Thêm sinh viên</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3>Sua</h3>
    <br>
	<html:form action="/sua.do" method="post">
        <div class="row form-group">
            <label class="col-lg-2">Mã SV</label>
            <div class="col-lg-3">
            	<html:text property="manv" styleClass="form-control"></html:text>
            	
            </div>
        </div>
        <div class="row form-group">
            <label class="col-lg-2">Ngay Sinh:(yyyy-MM-dd)</label>
            <div class="col-lg-3">
            	<html:text property="ngaysinh" styleClass="form-control"></html:text>
            	
            </div>
        </div>
        
        <div class="row form-group">
            <div class="col-lg-3 col-lg-offset-2">
            	<html:submit styleClass="btn btn-primary" property="submit" value="submit">Thêm mới</html:submit>
                <button class="btn btn-primary" onclick="history.go(-1);">Quay lại</button>
            </div>
        </div>
    </html:form>
    <br>
</div>
</body>
</html>