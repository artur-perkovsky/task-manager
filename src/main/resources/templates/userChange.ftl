<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>users</title>
</head>
<body>
<h1>Change User ${user.userName}</h1>
<form method="post">
    <input type="text" name="userName" placeholder="User Name" value="${user.userName}">
    <input type="text" name="password" placeholder="Password" value="${user.password}">
    <input type="text" name="firstName" placeholder="First Name" value="${user.firstName}">
    <input type="text" name="lastName" placeholder="Last Name" value="${user.lastName}">
    <input type="text" name="deportment" placeholder="Deportment" value="${user.deportment}">
    <button type="submit">Change</button>
</form>
</body>
</html>