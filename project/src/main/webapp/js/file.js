$.ajax({
    url: "/hoso",
    type: "GET",
    contentType: "application/json; charset=utf-8",
    dataType: "json",
    success: function (data) {
      if (data.linkimg1 != null) {
        $("#my_image").attr("src", "../imghoso/"+data.linkimg1);
        $("#btnAddUpdate").html('Tải lại file(sẽ xóa file cũ)');
      }
    },
  });