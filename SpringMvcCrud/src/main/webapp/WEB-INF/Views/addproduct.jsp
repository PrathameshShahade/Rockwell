<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<form action="addp" method="post">
  <div class="form-row align-items-center">
    <div class="col-sm-3 my-1">
      <label class="sr-only" for="inlineFormInputName">Product Id</label>
      <input type="text" class="form-control" id="inlineFormInputName" placeholder="Product Id" name="pid">
    </div>
    
        <div class="col-sm-3 my-1">
      <label class="sr-only" for="inlineFormInputName">Product Name</label>
      <input type="text" class="form-control" id="inlineFormInputName" placeholder="Product Id" name="pname">
    </div>
    
        <div class="col-sm-3 my-1">
      <label class="sr-only" for="inlineFormInputName">Product Price</label>
      <input type="text" class="form-control" id="inlineFormInputName" placeholder="Product Id" name="price">
    </div>

    <div class="col-auto my-1">
      <button type="submit" class="btn btn-primary">ADD</button>
    </div>
  </div>
</form>
</body>
</html>