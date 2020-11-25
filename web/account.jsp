

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="include/header.jsp" %>
        <title>Account|BookStore</title>
    </head>
    <body>
        <%@include file="include/navigation.jsp" %>

        <section class="admin-login">
            <div class="container">
                <div class="w-50 mx-auto">
                    <div class="card">
                        <div class="card-header text-center">
                            <h2>Admin Login</h2>
                        </div>
                        <div class="p-5">
                            <form action="BookCrudServlet" method="POST">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1">
                                </div>
                                <div class="text-center">
                                    <button type="submit" class="btn btn-primary btn-lg">Login</button>
                                </div>
                            </form>
                        </div>

                    </div>
                </div>
            </div>
        </section>

        <%@include file="include/footer.jsp" %>
    </body>
</html>
