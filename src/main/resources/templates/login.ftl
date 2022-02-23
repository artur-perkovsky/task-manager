<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>users</title>
</head>
<body>
    <h1>Authorization</h1>
    <form action="/login" method="post">
        <div><label> User Name : <input type="text" name="username"/> </label></div>
        <div><label> Password: <input type="password" name="password"/> </label></div>
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <div><input type="submit" value="Sign In"/></div>
    </form>
</body>
</html>