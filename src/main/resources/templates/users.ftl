<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>users</title>
    </head>
    <body>
    <h1>All users</h1>
    <p>search user</p>
        <form action="filter" method="post" >
            <input type="text" name="userName" placeholder="User Name">
            <input type="hidden" name="_csrf" value="${_csrf.token}">
            <button type="submit">Search</button>
        </form>
            <#list users as user>
                <div><label>id: </label>${user.id}</div>
                <div><label>login: </label>${user.userName}</div>
                <div><label>firstName: </label>${user.firstName}</div>
                <div><label>lastName: </label>${user.lastName}</div>
                <a href="more/${user.id}">more</a>
                <br>
                <br>
            </#list>
        <div>
            <a href="registration">Add new user</a>
        </div>
    </body>
</html>