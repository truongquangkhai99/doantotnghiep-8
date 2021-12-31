<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@include file="/common/taglib.jsp" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Trang Đăng Nhập</title>
      <link rel="stylesheet" href="<c:url value='/css/bootstrap.css' />" />
      <link rel="stylesheet" href="<c:url value='/css/style.css' />" />
    </head>

    <body>

      <div class="container-fluid">
        <div class="header">
          <nav class="navbar navbar-expand-lg navbar-light bg-light-tu nav-header">
            <a class="navbar-brand" href="#"><img src="./img/logo.png" alt=""></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
              aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                  <a class="nav-link" href="/">Trang Chủ</a>
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
                  <a class="nav-link" href="/user/hoso">Đăng Nhập</a>
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
            <div class=" d-flex align-items-center py-5">
              <div class="container">
                <div class="row">
                  <div class="col-lg-9 col-xl-9 mx-auto">
                    <h2 class="align-items-center text-center">Đăng Nhập Hệ Thống</h2>
                    <br>
                    <!-- /login?error=true -->
                    <c:if test="${param.error == 'true'}">
                      <div style="color:red;margin:10px 0px;">

                        Login Failed!!!<br />
                        Reason : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}

                      </div>
                    </c:if>
                    <form name='f' action="${pageContext.request.contextPath}/formlogin" method='POST'>
                      <div class="form-group mb-3">
                        <input id="inputEmail" type="email" name="email" placeholder="Địa chỉ Email" required=""
                          autofocus="" class="form-control rounded-pill border-0 shadow-sm px-4">
                      </div>
                      <div class="form-group mb-3">
                        <input id="inputPassword" type="password" name="password" placeholder="Mật Khẩu" required=""
                          class="form-control rounded-pill border-0 shadow-sm px-4 text-danger">
                        <br>
                      </div>
                      <div class="custom-control custom-checkbox mb-3">
                        <input id="customCheck1" type="checkbox" checked class="custom-control-input">
                        <label for="customCheck1" class="custom-control-label">Lưu mật khẩu</label>
                      </div>
                      <button type="submit"
                        class="btn btn-danger btn-block text-uppercase mb-2 rounded-pill shadow-sm">Đăng Nhập</button>
                      <div class="text-center d-flex justify-content-between mt-4">
                        <p> Hoặc <a href="<c:url value='/dangky'/>" class="font-italic text-muted"> <u>Tạo Tài
                              Khoản</u></a></p>
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