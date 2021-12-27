<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Đăng Nhập</title>
<link rel="stylesheet" href="<c:url value='/css/bootstrap.css' />" />
<link rel="stylesheet" href="<c:url value='/css/style.css' />" />
</head>
<body>
<security:authorize access = "isAuthenticated()">
<security:authentication property = "principal" var = "user"/>
</security:authorize>
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
                <a class="nav-link active" href="/">Home</a>
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
          <div class="row" style="margin-top: 30px;">
              <div class="main-l col-md-3">
                  <div class="dm">
                    <h5 style="padding: 5px;">Danh Mục Chính</h5>
                    <ul class="menu">
                      <li><a href="index.php" class="active"><span>Home</span></a></li>
                      <li><a href=""><span>Tuyển sinh</span></a></li>
                      <li><a href=""><span>Tin Tức</span></a></li>
                      <li><a href=""><span>Chương Trình Đào Tạo</span></a></li>
                    </ul>	   
                  </div>
                  <!-- box check -->
                  <div class="box-check">
                    <h5>Điều tra nguyện vọng đăng ký</h5>
                    <div style="PADDING-LEFT:10px;text-align:left;">			
                        Bạn đã có nguyện vọng, mong muốn của mình chưa chưa?
                      <table>
                        <tr>
                          <td><input type="radio" name="check" value="Đã Có"><label for="ctl02_rbl1_0">Đã Có</label></td>
                        </tr>
                        <tr>
                          <td><input type="radio" name="check" value="Chưa Có"><label for="ctl02_rbl1_1">Chưa Có</label></td>
                        </tr>
                      </table>                      
                        <input type="submit" name="Save" value="Đồng ý" class="btn-primary">
                        <input type="submit" name="Cancel" value="Hủy" class="btn-primary">
                        <input type="submit" name="Result" value="Thống kê" class="btn-primary">
                      </div>
                  </div>
                  
              </div>
              <div class="main-r col-md-9">
                <div class="daumuc">
                  <a href="">
                    <h3>Tin Tức Tuyển Sinh</h3>
                  </a>
                </div>
                <ul>
                    <li>
                      <a href="http://ts.tlu.edu.vn/tuyen-sinh-dai-hoc/truong-dai-hoc-thuy-loi-thong-bao-tuyen-11002">Trường Đại học Thủy lợi thông báo Tuyển sinh đại học hệ chính quy năm 2020</a>
                    </li>
                    <li>
                      <a href="http://ts.tlu.edu.vn/tuyen-sinh-dai-hoc/huong-dan-nhap-hoc-truc-tuyen-14845">Hướng dẫn nhập học trực tuyến</a>
                    </li>
                    <li><a href="http://ts.tlu.edu.vn/tuyen-sinh-dai-hoc/huong-dan-thi-sinh-kiem-tra-ho-so-dang-13167">Hướng dẫn thí sinh kiểm tra hồ sơ đăng ký xét tuyển online</a></li>
                    <li><a href="http://ts.tlu.edu.vn/tuyen-sinh-dai-hoc/thong-bao-diem-chuan-dai-hoc-he-chinh-13250">Thông báo điểm chuẩn đại học hệ chính quy năm 2020 theo phương thức xét tuyển học bạ đợt 1</a></li>
                    <li><a href="http://ts.tlu.edu.vn/tuyen-sinh-dai-hoc/thong-bao-ve-viec-xac-nhan-nhap-hoc-va-14854">Thông báo về việc xác nhận nhập học và nhập học đối với thí sinh trúng tuyển theo phương thức xét điểm thi THPT năm 2021</a></li>
                    <li><a href="http://ts.tlu.edu.vn/tuyen-sinh-dai-hoc/thong-bao-ke-hoach-nhap-hoc-he-dai-hoc-14840">Thông báo kế hoạch nhập học hệ Đại học chính quy năm 2021</a></li>
                    
                </ul>
                  
              </div>
          </div>
      </main>
          
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
            <li><a href="https://www.facebook.com/daihocthuyloi1959/?fref=ts" class="fb">FB</a></li>
            <li><a href="https://twitter.com/Daihocthuyloihn" class="tw">TW</a></li>
            <li><a href="https://www.youtube.com/user/daihocthuyloi" class="gp">Y</a></li>
        </ul>
      </div>
      </div>
    </div>
</div>
<!--Start of Tawk.to Script-->
<script type="text/javascript">
var Tawk_API=Tawk_API||{}, Tawk_LoadStart=new Date();
(function(){
var s1=document.createElement("script"),s0=document.getElementsByTagName("script")[0];
s1.async=true;
s1.src='https://embed.tawk.to/61c98d3080b2296cfdd3ee30/1fntkv1o2';
s1.charset='UTF-8';
s1.setAttribute('crossorigin','*');
s0.parentNode.insertBefore(s1,s0);
})();
</script>
<!--End of Tawk.to Script-->
<script type='text/javascript' src='<c:url value="/js/jquery-3.5.1.js" />'></script>
<script type='text/javascript' src='<c:url value="/js/bootstrap.bundle.js" />'></script>
<script type='text/javascript' src='<c:url value="/js/bootstrap.js" />'></script>

</body>
</html>