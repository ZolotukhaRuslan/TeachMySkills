<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<body >
<p ><strong>Выберите необходимое действие</strong>
<form action="/search">
	<p><input type="submit" value="Найти запись по id" name=Search></p>
</form>
<form action="/delete">
	<p><input type="submit" value="Удалить запись по id" name=Delete></p>
</form>
<form action="/newName">
	<p><input type="submit" value="Внести новую запись" name=NewName></p>
</form>
<form action="/edit">
	<p><input type="submit" value="Редактировать данные по id" name=Edit></p>
</form>
</body>
</html>
