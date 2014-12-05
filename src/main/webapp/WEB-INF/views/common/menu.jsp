<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="brand" href="/">Buy</a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li class="active"><a href="/">首頁</a></li>
                    <li><a href="/Register/Form">註冊</a></li>
                    <li><a href="/Admin/Home">管理後台</a></li>
                </ul>
                
                <c:choose>
                	<c:when test="${empty sessionScope.validUser}">
		                <form action="/User/Login" method="POST" class="navbar-form pull-right">
		                    <input class="span2" type="text" name="account" placeholder="帳號">
		                    <input class="span2" type="password" name="password" placeholder="密碼">
		                    <button type="submit" class="btn">登入</button>
		                </form>
                	</c:when>
                	<c:otherwise>
		                <form action="/User/Logout" method="POST" class="navbar-form pull-right">
		                    <button type="submit" class="btn">登出</button>
		                </form>
                	</c:otherwise>
                </c:choose>
                
            </div>
        </div>
    </div>
</div>