<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>users</title>
</head>
<body>
<h1> More User ${user.userName}</h1>
    <div><label>id: </label>${user.id}</div>
    <div><label>login: </label>${user.userName}</div>
    <div><label>firstName: </label>${user.firstName}</div>
    <div><label>lastName: </label>${user.lastName}</div>
    <div><label>deportment: </label>${user.deportment}</div>
    <a href="userChange/${user.id}">change</a>
</body>
</html>