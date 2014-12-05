<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Buy</title>
</head>

<body>

	<form class="form-signin" action="/Admin/SaveCategoryChild" method="POST">
		<h3 class="form-signin-heading">新增子類別</h3>
		<select name="parent">
			<option value="-1">請選擇</option>
			<c:forEach var="category" items="${parentList}">
				<option value="${category.id}">${category.name}</option>
			</c:forEach>
		</select><br>
		<input type="text" name="categoryName" class="input-block-level span3" placeholder="類別名稱"><br>
		<input type="submit" class="btn btn-primary" value="送出">
	</form>

</body>
</html>