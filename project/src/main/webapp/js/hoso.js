function myFunction(){
	$(".form-control").prop('disabled', false);
}
function myCancel(){
	$(".form-control").prop('disabled', true);
}
$(document).ready(function() {	
	
	function loadData(){
		$.ajax({
			url: "/hoso",
			type: "GET",
			contentType:"application/json; charset=utf-8",
			dataType:"json",
			success: function (data) {
				if (data.id != null) {
					for (const [key, value] of Object.entries(data)) {
						
						$("input[name='"+ key +"']").val(value);
						//$("option[name='"+ key +"']").val(value);
						$("select[name^="+ key +"] option[value="+ value +"]").attr("selected","selected");
					}
					
					$("input[name='ngaySinh']").val(new Date(data.ngaySinh + (3600 * 1000 * 24)).toJSON().split('T')[0]);
					$(".form-control").prop('disabled', true);
				}
				
				// for (const x in data) {
				// 	text += data[x] + ", ";
				// 	$("input[name='']").val("your value");
				//   }
			}
		  	});
	};
	loadData();
	$("#formhoso").extend(jQuery.validator.messages, {
		required: "Trường Không được bỏ trống. Vui lòng Điền Chính Xác Giá Trị",
	});

	$("#formhoso").submit(function(e) {
	    e.preventDefault();
	}).validate({
		onfocusout: false,
		onkeyup: false,
		onclick: false,
		rules: {
			"hoTen": {
				required: true,
				maxlength: 60,
			},
			"cccd": {
				required: true,
				maxlength: 12,
				minlength: 12
			},
			"ngaySinh": {
				required: true
			},
			"gioiTinh": {
				required: true
			},
			"soDienThoai": {
				required: true,
				maxlength: 10,
				minlength: 10
			},
			"diaChi": {
				required: true
			},
			"soDienThoaiBo": {
				required: true,
				maxlength: 10,
				minlength: 10
			},
			"soDienThoaiMe": {
				required: true,
				maxlength: 10,
				minlength: 10
			},
			"doiTuongUuTien": {
				required: true
			},
			"khuVucUuTien": {
				required: true
			},
			"idTruongTpht10": {
				required: true
			},
			"idTruongTpht11": {
				required: true
			},
			"idTruongTpht12": {
				required: true
			},
		},
		messages: {
			"hoTen": {
				required: "Bắt buộc nhập username",
				maxlength: "Hãy nhập tối đa 15 ký tự"
			},
			"cccd": {
				required: "Bắt buộc nhập cccd",
				minlength: "Nhập đúng số cccd 12 chữ số",
				maxlength: "Nhập đúng số cccd 12 chữ số"
			},
			"soDienThoai": {
				required: "Vui Lòng Nhập Đúng Số Điện Thoại",
				maxlength: "Vui Lòng Nhập Đúng Số Điện Thoại Của Bạn",
				minlength: "Vui Lòng Nhập Đúng Số Điện Thoại Của Bạn",
			},
			"soDienThoaiBo": {
				required: "Vui Lòng Nhập Đúng Số Điện Thoại",
				maxlength: "Vui Lòng Nhập Đúng Số Điện Thoại",
				minlength: "Vui Lòng Nhập Đúng Số Điện Thoại",
			},
			"soDienThoaiMe": {
				required: "Vui Lòng Nhập Đúng Số Điện Thoại",
				maxlength: "Vui Lòng Nhập Đúng Số Điện Thoại",
				minlength: "Vui Lòng Nhập Đúng Số Điện Thoại",
			}
			
		},
		submitHandler: function(form) {
			 var formdata = $("#formhoso").serializeArray();
			  var data = {};
			  $(formdata ).each(function(index, obj){
			      data[obj.name] = obj.value;
			  });
			$.ajax({
				url: "/hoso",
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