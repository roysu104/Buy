<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Buy</title>

    <link href="/resources/bootstrap/bootstrap.css" rel="stylesheet">
    <link href="/resources/css/sitemesh/basic.css" rel="stylesheet">
    <link href="/resources/bootstrap/bootstrap-responsive.css" rel="stylesheet">
</head>

<body>

	<%@include file="/WEB-INF/views/common/menu.jsp"%>

    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span3">
				<%@include file="/WEB-INF/views/common/sidebar.jsp"%>
            </div>
            <div class="span9">
				<decorator:body/>
            </div>
    
			<%@include file="/WEB-INF/views/common/footer.jsp"%>
			
        </div>
    </div>
    
    <script src="/resources/bootstrap/bootstrap.js"></script>

</body>
</html>