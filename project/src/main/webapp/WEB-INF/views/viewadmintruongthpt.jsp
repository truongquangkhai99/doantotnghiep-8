<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nguyện Vọng</title>
<link rel="stylesheet" href="<c:url value='/css/bootstrap.css' />" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.11.3/datatables.min.css"/>
<link rel="stylesheet" href="<c:url value='/css/style.css' />" />
</head>
<body>
<security:authorize access = "isAuthenticated()">
<security:authentication property = "principal" var = "user"/>
</security:authorize>
<div class="container-fluid">
<div class="header">
        <nav class="navbar navbar-expand-lg navbar-light bg-light-tu nav-header">
          <a class="navbar-brand" href="#"><img src="../img/logo.png" alt=""></a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
              <li class="nav-item">
                <a class="nav-link active" href="/admin/khoa">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/admin/khoa">Quản Lý Khoa</a>
              </li>
              
              <li class="nav-item">
                <a class="nav-link" href="/admin/nganh">Quản Lý Ngành</a>
              </li>
              
              <li class="nav-item">
                <a class="nav-link" href="/admin/tohopmon">Quản Lý Tổ Hợp Môn</a>
              </li>

              <li class="nav-item">
                <a class="nav-link" href="/admin/truongthpt">Quản Lý Trường Thpt</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/admin/taikhoan">Quản Lý Tài Khoản</a>
              </li>
              <li class="nav-item">
              		<c:if test="${not empty user.username}">
              		 <a class="nav-link" href="/logout">${user.username} (Thoát)</a>
              		</c:if>
              		<c:if test="${empty user.username}">
              		 <a class="nav-link" href="/user/hoso">Đăng Nhập</a>
              		</c:if>
                 
              </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
              <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
          </div>
        </nav>
      </div>
   <!-- main -->
      <main>
      <div class="p-3 mt-3 text-center">
        <h3>Quản Lý Trường THPT</h3>
      </div>
        <form id ="formhoso" class = "border border-primary m-3 p-3">
         <input name = "id" id = "id" type = "hidden"/>
          <div class="row m-3 p-3">
            <div class="col-3">
              <label>Mã Trường</label>
              <input type="text" class="form-control" name="maTruong" placeholder="Mã Tổ Hợp">
            </div>
            <div class="col-3">
              <label>Tên Trường</label>
              <input type="text" class="form-control" name="tenTruong" placeholder="Mã Tổ Hợp">
            </div>
            <div class="col-3">
              <label>Khu Vực Ưu Tiên</label>
              <select class="form-control" id="khuVucUuTien" name="khuVucUuTien">
                <option></option>
                <option value="KV1">KV1</option>
                <option value="KV2">KV2</option>
                <option value="KV2-NT">KV2-NT</option>
                <option value="KV3">KV3</option>
              </select>
            </div>
          </div>

          <div class="row m-3 p-3">
            <div class="col-9">
            </div>
            <div class="col-1">
            </div>
            <div class="col-2">
              <button type="submit" id="btnAddUpdate" class="btn btn-primary form-control">Lưu</button>
            </div>
          
          </div>
           
        </form>
        <div class = "border border-primary m-3 p-3"> 
        <div class="p-3 mt-3 text-center">
        <h5>Danh Sách Trường THPT</h5>
      </div>
        <table id="example" class="display" style="width:100%">
          <thead>
              <tr>
                  <th>Id</th>
                  <th>Mã Trường</th>
                  <th>Tên Trường</th>
                  <th>Khu Vực Ưu Tiên</th>
                  <th>Điểm Ưu Tiên</th>
                  <th></th>>
              </tr>
          </thead>
          
      </table>
        </div>
        
      
      </main>
          
      <!-- footer -->
      <footer class="page-footer row">
        
          <div class="col-md-3 bd">
              <p style="color: #fff;">Bản Đồ</p>
              <a href=""><img src="../img/TLU-map.png" alt="map-thuy-loi" style="width: 90%;"></a>
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
            <li><a href="https://www.facebook.com/daihocthuyloi1959/?fref=ts" class="fb">FB</a></li>
            <li><a href="https://twitter.com/Daihocthuyloihn" class="tw">TW</a></li>
            <li><a href="https://www.youtube.com/user/daihocthuyloi" class="gp">Y</a></li>
        </ul>
      </div>
      </div>
    </div>
</div>
<script type='text/javascript' src='<c:url value="/js/jquery-3.5.1.js" />'></script>
<script type='text/javascript' src='<c:url value="/js/bootstrap.bundle.js" />'></script>
<script type='text/javascript' src='<c:url value="/js/bootstrap.js" />'></script>
<script type='text/javascript' src='<c:url value="/js/jquery.validate.js" />'></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
<script type='text/javascript' src='<c:url value="/js/truongthptadmin.js" />'></script>
</body>
</html>