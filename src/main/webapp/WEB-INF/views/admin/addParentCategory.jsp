<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Buy</title>
</head>

<body>

	<form class="form-signin" action="/Admin/SaveCategoryParent" method="POST">
		<h3 class="form-signin-heading">新增父類別</h3>
		<input type="text" name="categoryName" class="input-block-level span3" placeholder="類別名稱"><br>
		<input type="submit" class="btn btn-primary" value="送出">
	</form>

</body>
</html>