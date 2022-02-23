<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>users</title>
</head>
<body>
    <h1>Registrations new User</h1>
    <form action="registration" method="post" >
        <input type="text" name="userName" placeholder="User Name">
        <input type="text" name="password" placeholder="Password">
        <input type="text" name="firstName" placeholder="First Name">
        <input type="text" name="lastName" placeholder="Last Name">
        <input type="text" name="deportment" placeholder="Deportment">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <button type="submit" >ADD</button>
    </form>
</body>
</html>