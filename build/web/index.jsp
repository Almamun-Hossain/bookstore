
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="include/header.jsp" %>
        <title>Home|BookStore</title>
    </head>
    <body>
        <%@include file="include/navigation.jsp" %>
        <section class="book-container my-3">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-4 col-sm-6">
                        <div class="single-book">
                            <div class="card">
                                <img src="./images/book/Learn-Java.jpeg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <h5 class="card-title"><a href="#">Head First Java</a></h5>
                                    <p class="card-text">Price: 25$</p>
                                    <a href="#" class="btn btn-primary">Buy Now</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <%@include file="include/footer.jsp" %>
    </body>
</html>
