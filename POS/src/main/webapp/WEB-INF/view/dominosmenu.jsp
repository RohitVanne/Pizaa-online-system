<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="cartheader.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style= "text-align: center">Domino's Menu</h1>
<div class="card mb-3" style="max-width: 640px;">
  <div class="row g-0">
    <div class="col-md-4">
      <img src="ChicPep.jfif" class="img-fluid rounded-start" alt="...">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">Chicken Pepperoni Pizza</h5>
        <p class="card-text">Chicken meat mixed together and seasoned with paprika or other chilli pepper.</p>
       <form:form action="/Sizes" method="Get" modelAttribute="sizes">
        
        <select class="form-select" aria-label="Default select example">
  			<option selected>Sizes</option>
  			<option value="1">Small</option>
  			<option value="2">Regular</option>
  			<option value="3">Large</option>
		</select>
		</form:form>
		<!--  <div class="mb-3">
				<form:select path="sizes" class="form-control">
					<form:option value="small" label="Small" />
					<form:option value="regular" label="Regular" />
					<form:option value="large" label="Large" />
				</form:select>
			</div>-->
		
		<p class="card-text font-weight-bold">Price: </p>
      </div>
    </div>
  </div>
</div>
<div class="card mb-3" style="max-width: 640px;">
  <div class="row g-0">
    <div class="col-md-4">
      <img src="VegLoad.jpg" class="img-fluid rounded-start" alt="...">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">Veg Loaded Pizza</h5>
        <p class="card-text">Fresh tomatoes, onions, arugula, kale, eggplants, bell peppers, spinach, zucchini, mushrooms and more.</p>
       <form:form action="/Sizes" method="Get" modelAttribute="sizes">
        
        <select class="form-select" aria-label="Default select example">
  			<option selected>Sizes</option>
  			<option value="1">Small</option>
  			<option value="2">Regular</option>
  			<option value="3">Large</option>
		</select>
		</form:form>
		<p class="card-text font-weight-bold">Price: </p>
      </div>
    </div>
  </div>
</div>
<div class="card mb-3" style="max-width: 640px;">
  <div class="row g-0">
    <div class="col-md-4">
      <img src="BbqC.jpg" class="img-fluid rounded-start" alt="...">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">BBQ Chicken Pizza</h5>
        <p class="card-text">Chicken parts or entire chickens that are barbecued, grilled or smoked.</p>
       <form:form action="/Sizes" method="Get" modelAttribute="sizes">
        
        <select class="form-select" aria-label="Default select example">
  			<option selected>Sizes</option>
  			<option value="1">Small</option>
  			<option value="2">Regular</option>
  			<option value="3">Large</option>
		</select>
		</form:form>
		<!--  <div class="mb-3">
				<form:select path="sizes" class="form-control">
					<form:option value="small" label="Small" />
					<form:option value="regular" label="Regular" />
					<form:option value="large" label="Large" />
				</form:select>
			</div>-->
		
		<p class="card-text font-weight-bold">Price: </p>
      </div>
    </div>
  </div>
</div>
</body>
</html>