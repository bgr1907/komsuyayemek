<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<head>
<title>Anasayfa</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />" />
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/css/bootstrap.min.css" />" />
<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
</head>

<body>
	<div class="container">
		<div class="row">
			<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
				<a class="navbar-brand" href="#">Komşuya Yemek</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><a class="nav-link" href="#">Anasayfa
								<span class="sr-only">(current)</span>
						</a></li>
						<li class="nav-item"></li>
						<li class="nav-item"><a class="nav-link" href="#"></a></li>
					</ul>
					<form class="form-inline my-2 my-lg-0">
						<input class="form-control mr-sm-2" type="text"
							placeholder="Arama" aria-label="Search">
						<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Arama</button>
					</form>
				</div>
			</nav>
		</div>

		<div class="row">
			<div class="col-md-3" id="left_div">
				Kullanıcı Adı / E-posta <input type="text" class="form-control"></input><br>
				Şifre<br> <input type="text" class="form-control"></input><br>
				<button type="button" class="btn btn-success">Üye Girişi</button>
				<br>
				<button type="button" class="btn btn-light">Şifremi
					Unuttum</button>
				<button type="button" class="btn btn-light">Üyeliğiniz
					yok mu ? Yeni Üyelik</button>
			</div>
			<div class="col-md-9" id="main-div">
				<div class="row">
					<div class="section-one">
						<img class="main-img"
							src="https://www.webtekno.com/images/editor/default/0001/54/4d739831c12ff0b84434f0400a98868ed535308a.jpeg"
							alt="">

					</div>
					<div class="section-two">
						<select class="form-control">
							<option value="" disabled selected>İl</option>
						</select> <select class="form-control">
							<option value="" disabled selected>İlçe</option>
						</select> <select class="form-control">
							<option value="" disabled selected>Mahalle</option>
						</select><br>
						<button type="button" class="btn btn-warning">Ara</button>
					</div>
					<div class="section-three">
						<table id="dtBasicExample"
							class="table table-striped table-bordered" cellspacing="0"
							width="100%">
							<thead>
								<tr>
									<th class="th-sm">Name</th>
									<th class="th-sm">Position</th>
									<th class="th-sm">Office</th>
									<th class="th-sm">Age</th>
									<th class="th-sm">Start date</th>
									<th class="th-sm">Salary</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>Tiger Nixon</td>
									<td>System Architect</td>
									<td>Edinburgh</td>
									<td>61</td>
									<td>2011/04/25</td>
									<td>$320,800</td>
								</tr>
								<tr>
									<td>Garrett Winters</td>
									<td>Accountant</td>
									<td>Tokyo</td>
									<td>63</td>
									<td>2011/07/25</td>
									<td>$170,750</td>
								</tr>
								<tr>
									<td>Ashton Cox</td>
									<td>Junior Technical Author</td>
									<td>San Francisco</td>
									<td>66</td>
									<td>2009/01/12</td>
									<td>$86,000</td>
								</tr>
								<tr>
									<td>Cedric Kelly</td>
									<td>Senior Javascript Developer</td>
									<td>Edinburgh</td>
									<td>22</td>
									<td>2012/03/29</td>
									<td>$433,060</td>
								</tr>
								<tr>
									<td>Airi Satou</td>
									<td>Accountant</td>
									<td>Tokyo</td>
									<td>33</td>
									<td>2008/11/28</td>
									<td>$162,700</td>
								</tr>
								<tr>
									<td>Brielle Williamson</td>
									<td>Integration Specialist</td>
									<td>New York</td>
									<td>61</td>
									<td>2012/12/02</td>
									<td>$372,000</td>
								</tr>
								<tr>
									<td>Herrod Chandler</td>
									<td>Sales Assistant</td>
									<td>San Francisco</td>
									<td>59</td>
									<td>2012/08/06</td>
									<td>$137,500</td>
								</tr>
								<tr>
									<td>Rhona Davidson</td>
									<td>Integration Specialist</td>
									<td>Tokyo</td>
									<td>55</td>
									<td>2010/10/14</td>
									<td>$327,900</td>
								</tr>
								<tr>
									<td>Colleen Hurst</td>
									<td>Javascript Developer</td>
									<td>San Francisco</td>
									<td>39</td>
									<td>2009/09/15</td>
									<td>$205,500</td>
								</tr>

							</tbody>

						</table>
					</div>
				</div>

			</div>
		</div>
		<!-- Footer -->
		<footer class="page-footer font-small blue">

			<!-- Copyright -->
			<div class="footer-copyright text-center py-3">
				© 2018 Copyright: <a href="#">Komşuya Yemek</a>
			</div>
			<!-- Copyright -->

		</footer>
		<!-- Footer -->

	</div>

</body>

</html>