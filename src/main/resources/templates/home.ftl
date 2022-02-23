<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>users</title>
</head>
<body>
<h1>HOME PAGE</h1>

<form action="/logout" method="post">
    <input type="submit" value="Sign Out"/>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <a href="users/">All users</a>
</form>
</body>
</html>