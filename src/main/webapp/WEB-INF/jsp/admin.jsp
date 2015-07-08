<!DOCTYPE html>
<%@include file="taglib.jsp" %>
<html>
<head>
<title>Administrator</title>
<link rel="stylesheet" href='<spring:url value="resources/bootstrap/css/bootstrap.min.css"/>' />

<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css">
<link rel="stylesheet" href='<spring:url value="resources/css/styles.css"/>' />

<script type="text/javascript">

</script>
</head>
<body>


<div class="container">
	<div class="row">
		<h2>Catalogue</h2>
		<div class="btn-group btn-breadcrumb">
			<a href="#" class="btn btn-primary"><i class="glyphicon glyphicon-home"></i></a>
			<a href="#" class="btn btn-primary">Snippets</a>
			<a href="#" class="btn btn-primary">Breadcrumbs</a>
			<a href="#" class="btn btn-primary">Primary</a>
		</div>
	</div>



</div>

	<h2>Administrator Home Page</h2>
	<p>	<a href="${rootURL}welcome">Home</a></p>
	<p>	<a href="${rootURL}logout">Logout</a></p>

<script type="text/javascript" src='<spring:url value="resources/jquery/jquery-1.10.2.js"/>'></script>
<script type="text/javascript" src='<spring:url value="resources/bootstrap/js/bootstrap.min.js"/>'></script>
<script type="text/javascript" src='<spring:url value="resources/js/app.js"/>'></script>

</body>
</html>