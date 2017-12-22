<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>


<html>
<head>
<title>King's Land</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<jsp:include page="WEB-INF/header.jsp"></jsp:include>
<h2>King's Land</h2>
<div class="container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>


 <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img class = "img-responsive center block" src="E:\\Images\\1490299332.jpg" alt="A">
    </div>

    <div class="item">
      <img class = "img-responsive center block" src="E:\\Images\\1490355442.jpg" alt="B">
    </div>

    <div class="item">
      <img class = "img-responsive center block" src="E:\\Images\\jgbFbWR.jpg" alt="C">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
	
	</div>

</div>
</body>
</html>
