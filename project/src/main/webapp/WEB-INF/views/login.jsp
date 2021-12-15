<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/css/bootstrap.css' />" />
<style type="text/css">
.login,
.image {
    min-height: 100vh
}

.bg-image {
    background-image: url('<c:url value='/img/dhtl.jpg' />');
    background-size: cover;
    background-position: center center
}
.container-fluid {
    width: 100%;
    padding-right: 0px;
    padding-left: 0px;
    margin-right: auto;
    margin-left: auto;
}

/*header*/
.navbar-light .navbar-nav .nav-link {
    color: #fff;
}
.navbar-light .navbar-nav .nav-link:hover {
    color: blue;
}
.bg-light-tu{
    background-color:#56a4fe !important;
}
.header{
    height: auto;
    background-color:rgb(233, 225, 206);
}

.header nav a img{
    width: 80px;
}
.btn-outline-success {
    color: rgb(53, 79, 196);
    background-color: transparent;
    background-image: none;
    border-color: #000;
}
.btn-outline-success:hover {
    color: #000;
    background-color: transparent;
    background-image: none;
    border-color: #000;
}
/* chinh font-size chu*/
.font-size-a a {
    font-size: 12px;
}
.font-size-a ul h4{
    font-size: 16px;
}

/*footer*/
.copyandmxh{
    display: flex;
    height: auto;
    background-color:#134b8a;
}
.bd{
    color: #fff;display: block;
    border-right: 1px solid #fff;
    padding: 20px;
}
.dc{
    padding-top: 20px;
    text-align: center;
    color: #FFFFFF;
    font-size: 15px;
}
.page-footer{
    display: flex;
    height: auto;
    background-color:#56a4fe;

}
.nav-footer  ul li{
    list-style: none;
    text-align: center;
}
.mxh ul li{
    list-style: none;
    display: inline;
    text-align: center;
}
.nav-footer p{
    color: #fff;
}
.nav-footer ul li a{
    color: #fff;
}
.nav-footer ul li a:hover{
    color: blue;
}
.nav-footer{
    padding-top: 20px;
    border-right: 1px solid #fff;
}

.mxh a{
    display: inline-block;
	width: 40px;
	height: 40px;
	background: #000;
	color: #fff;
	text-align: center;
	border-radius: 50%;
	line-height: 40px;
}
.copy{
    display: inline-block;
    text-align: left;
    margin: auto;
}
.copy p{
    font-size: 16px;
    color: #FFFFFF;
    padding-top: 12px;
}
.mxh{
padding-top: 20px !important;
}

.label,.value{
    display: block;
    float: left;
    margin-left: 10px;
}
</style>
</head>
<body>

<div class="container-fluid">
<div class="header">
        <nav class="navbar navbar-expand-lg navbar-light bg-light-tu nav-header">
          <a class="navbar-brand" href="#"><img src="./img/logo.png" alt=""></a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
        
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
              <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Giới Thiệu</a>
              </li>
              
              <li class="nav-item">
                  <a class="nav-link" href="#">Phản Hồi</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link" href="#">Liên Hệ</a>
              </li>
              <li class="nav-item active">
                  <a class="nav-link" href="/login">Đăng Nhập</a>
              </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
              <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
          </div>
        </nav>
      </div>
    <div class="row no-gutter bg-image" style="padding: 100px"> 
        <div class="col-md-3 d-none d-md-flex "></div>
        <div class="col-md-6 bg-light">
            <div class=" d-flex align-items-center py-5" >
                <div class="container">
                    <div class="row">
                        <div class="col-lg-7 col-xl-6 mx-auto border" >
                            <h5 class = "align-items-center">Đăng Nhập Hệ Thống</h5> <br>
                            <form >
                                <div class="form-group mb-3"> 
                                    <input id="inputEmail" type="email" placeholder="Email address" required="" autofocus="" class="form-control rounded-pill border-0 shadow-sm px-4"> 
                                </div>
                                <div class="form-group mb-3"> 
                                    <input id="inputPassword" type="password" placeholder="Password" required="" class="form-control rounded-pill border-0 shadow-sm px-4 text-danger">
                                    <br> 
                                </div>
                                <div class="custom-control custom-checkbox mb-3"> 
                                    <input id="customCheck1" type="checkbox" checked class="custom-control-input"> 
                                    <label for="customCheck1" class="custom-control-label">Quên mật khẩu</label> 
                                </div> 
                                        <button type="submit" class="btn btn-danger btn-block text-uppercase mb-2 rounded-pill shadow-sm">Đăng Nhập</button>
                                <div class="text-center d-flex justify-content-between mt-4">
                                    <p> Hoặc &nbsp<a href="<c:url value='/dangky'/>" class="font-italic text-muted"> <u>Tạo Tài Khoản</u></a></p>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
          
      <!-- footer -->
      <footer class="page-footer row">
        
          <div class="col-md-3 bd">
              <p style="color: #fff;">Bản Đồ</p>
              <a href=""><img src="./img/TLU-map.png" alt="map-thuy-loi" style="width: 90%;"></a>
          </div>
          <div class="font-size-a nav-footer col-md-3">
              <ul>
                  <h4 style="text-align: center;">ĐẠI HỌC THỦY LỢI</h4>
                  <li><a href="">TUYỂN SINH</a></li>
                  <li><a href="">ĐÀO TẠO</a></li>
                  <li><a href="">KHOA HỌC CÔNG NGHỆ</a></li>
                  <li><a href="">SINH VIÊN</a></li>
                  <li><a href="">ĐỐI Ngoại</a></li>
              </ul>
          </div>
          <div class="font-size-a nav-footer col-md-3">
              <ul>
                  <h4 style="text-align: center;">TIN TỨC-THÔNG BÁO</h4>
                  <li><a href="">TIN TỨC</a></li>
                  <li><a href="">THÔNG BÁO</a></li>
                  <li><a href="">TIN VIDEO</a></li>
              </ul>
          </div>
          <div class="col-md-3 dc">
            <p>TRƯỜNG ĐẠI HỌC THỦY LỢI <br>
            Địa chỉ : 175 TÂY SƠN, ĐỐNG ĐA, HÀ NỘI.<br>
            Điện thoại: (024) 3852 2201 - Fax: (024) 3563 3351<br>
            Email: phonghcth@tlu.edu.vn<br>
            </p>
          </div>
      </footer>
      <div class="row copyandmxh">
        <div class="col-md-9 copy">
          <p>@2017. Bản quyền thuộc về trường Đại học Thủy Lợi</p>
        </div>
      <div class="mxh col-md-3">
        <ul>
            <li><a href="#" class="fb">FB</a></li>
            <li><a href="#" class="tw">TW</a></li>
            <li><a href="#" class="gp">GB</a></li>
        </ul>
      </div>
      </div>
    </div>
</div>



<script type='text/javascript' src='<c:url value="/js/jquery-3.5.1.js" />'></script>
<script type='text/javascript' src='<c:url value="/js/bootstrap.bundle.js" />'></script>
<script type='text/javascript' src='<c:url value="/js/bootstrap.js" />'></script>
</body>
</html>