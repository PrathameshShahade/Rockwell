<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<h1>All Products</h1>
<table class="table table-bordered">
  <tr>
     <th>Product id</th>
     <th>Product name</th>
     <th>price</th>
     <th>action</th>
  </tr>
  
<c:forEach var="p" items="${plist}">
 <tr>
       <td>${p.id}</td>
       <td>${p.name}</td>
       <td>${p.price}</td>
       <td><a href="delete/${p.id}">delete</a><br>
       <a href="#">edit</a></td>
     </tr>
</c:forEach>

</table>

<a href="addproduct">
<button type="button" class="btn btn-primary">Add Product</button>
</a>
</body>
</html>