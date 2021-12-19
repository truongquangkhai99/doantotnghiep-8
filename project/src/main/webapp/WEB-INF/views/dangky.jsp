<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Đăng Ký</title>
<link rel="stylesheet" href="<c:url value='/css/bootstrap.css' />" />
<link rel="stylesheet" href="<c:url value='/css/style.css' />" />
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
        <div class="col-md-4 bg-light">
            <div class=" d-flex align-items-center py-5" >
                <div class="container">
                    <div class="row">
                        <div class="col-lg-9 col-xl-9 mx-auto" >
                            <h2 class = "align-items-center text-center">Đăng Ký Tài Khoản</h2> 
                            <br>
                            <form id="formdangky" name="formdangky">
                                <div class="form-group mb-3"> 
                                    <input id="name" type="text" name = "name" placeholder="Tên Người Dùng" required class="form-control rounded-pill border-0 shadow-sm px-4 text-danger">
                                    <br> 
                                </div> 
                                <div class="form-group mb-3"> 
                                    <input id="email" type="email" name = "email" placeholder="Địa chỉ Email" required autofocus="" class="form-control rounded-pill border-0 shadow-sm px-4"> 
                                </div>
                                <div class="form-group mb-3"> 
                                    <input id="password" type="password" name = "password" placeholder="Mật Khẩu" required class="form-control rounded-pill border-0 shadow-sm px-4 text-danger">
                                    <br> 
                                </div> 
                                <div class="form-group mb-3"> 
                                    <input id="rePassword" type="password" name = "rePassword" placeholder="Nhập lại Mật Khẩu" required class="form-control rounded-pill border-0 shadow-sm px-4 text-danger">
                                    <br> 
                                </div>                  
                                        <input type="submit" value = "Đăng Ký" class="btn btn-danger btn-block text-uppercase mb-2 rounded-pill shadow-sm">
                                <div class="text-center d-flex justify-content-between mt-4">
                                    <p> Hoặc nếu đã có tài khoản <a href="<c:url value='/login'/>" class="font-italic text-muted"> <u>Đăng nhập</u></a></p>
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
<script type='text/javascript' src='<c:url value="/js/jquery.validate.js" />'></script>
<script type="text/javascript">


$(document).ready(function() {		
	$("#formdangky").submit(function(e) {
	    e.preventDefault();
	}).validate({
		onfocusout: false,
		onkeyup: false,
		onclick: false,
		rules: {
			"email": {
				required: true,
				maxlength: 255
			},
			"password": {
				required: true,
				minlength: 6
			},
			"rePassword": {
				equalTo: "#password",
				minlength: 6
				
			}
		},
		messages: {
			"email": {
				required: "Bắt buộc nhập username",
				maxlength: "Hãy nhập tối đa 15 ký tự"
			},
			"password": {
				required: "Bắt buộc nhập password",
				minlength: "Hãy nhập ít nhất 6 ký tự"
			},
			"rePassword": {
				equalTo: "Hai password phải giống nhau",
				minlength: "Hãy nhập ít nhất 6 ký tự"
			}
		},
		submitHandler: function(form) {
			 var formdata = $("#formdangky").serializeArray();
			  var data = {};
			  $(formdata ).each(function(index, obj){
			      data[obj.name] = obj.value;
			  });
			$.ajax({
				url: "/dangkysubmit",
	          	type: "POST",
			    data: JSON.stringify(data),
			    contentType:"application/json; charset=utf-8",
			    dataType:"json",
			    success: function (data) {
			          console.log("SUCCESS : ", data.kq);
			          if(data.kq == "ok"){
                  alert("Bạn đã đăng ký thành công. Vui lòng kiểm tra email để kích hoạt tài khoản");
                }
                else if(data.kq == "chuaxacthuc"){
                  alert("Bạn đã đăng ký tài khoản trước đấy nhưng chưa xác thực. Vui lòng kiểm tra email và xác thực tài khoản");
                }
                else{
                  alert("Email đã được đăng ký một tài khoản khác");
                }
			      },
			      error: function (e) {
			          console.log("ERROR : ", e);
			      }
			  });
		    return false;
		  }
	});
});
 </script>
                        
</body>
</html>