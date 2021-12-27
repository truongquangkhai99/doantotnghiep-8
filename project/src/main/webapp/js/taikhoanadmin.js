var dataTable = [];
$(document).ready(function () {
    $.ajax({
        url: "/taikhoans",
        type: "GET",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data) {
            dataTable = data;
            $('#example').DataTable({
                data: dataTable,
                columns: [
                    { "data": "id" },
                    { "data": "email" },
                    { "data": "name" },
                    { "data": "password" },
                    { "data": "phone","defaultContent": "" },
                    { "data": "role" },
                    { "data": "enabled" },
                    {
                        "data": null,
                        "defaultContent": "<button>Xóa</button>"
                    }
                ]
            });
        },
    });

    $('#example').on('click', 'tbody tr', function () {
        var data = $('#example').DataTable().row(this).data();
        console.log(data);
        for (const [key, value] of Object.entries(data)) {
            $("input[name='" + key + "']").val(value);
            if (key == "role" ||key == "enabled" ) {
                $("select[name^=" + key + "] option[value=" + value + "]").attr("selected", "selected");
            } else {
                
            }
        }
        $("#btnAddUpdate").html('Cập Nhập');
    });

    $('#example').on('click', 'tbody button', function () {
        var data = $('#example').DataTable().row($(this).parents('tr')).data();
        if (confirm('Bạn Có Muốn Xóa Tài Khoản Có Id là : ' + data.id)) {
            var data = { "id": data.id };
            $.ajax({
                url: "/taikhoan",
                type: "DELETE",
                data: JSON.stringify(data),
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data) {
                    console.log("SUCCESS : ", data.kq);
                    if (data.kq == "ok") {
                        location.reload();
                    } else {

                    }
                },
            });

        } else {

            console.log('Hủy');
        }
        // alert(data.id);
    });

    $("#formhoso").extend(jQuery.validator.messages, {
        required: "Trường Không được bỏ trống. Vui lòng Điền Chính Xác Giá Trị",
    });

    $("#formhoso")
        .submit(function (e) {
            e.preventDefault();
        })
        .validate({
            onfocusout: false,
            onkeyup: false,
            onclick: false,
            rules: {
                email: {
                    required: true,
                },
                name: {
                    required: true,
                },
                password: {
                    required: true,
                },
                phone: {
                    required: true,
                },
                role: {
                    required: true,
                },
                enabled: {
                    required: true,
                },
            },
            submitHandler: function (form) {
                var formdata = $("#formhoso").serializeArray();
                var data = {};
                $(formdata).each(function (index, obj) {
                    data[obj.name] = obj.value;
                });

                if (data.id == "") {
                    $.ajax({
                        url: "/taikhoan",
                        type: "POST",
                        data: JSON.stringify(data),
                        contentType: "application/json; charset=utf-8",
                        dataType: "json",
                        success: function (data) {
                            console.log("SUCCESS : ", data.kq);
                            if (data.kq == "ok") {
                                alert("Bạn lưu thành công");
                                location.reload();
                            } else {
                                alert("Bạn lưu không thành công");
                            }
                        },
                        error: function (e) {
                            console.log("ERROR : ", e);
                        },
                    });

                } else {
                    $.ajax({
                        url: "/taikhoan",
                        type: "PUT",
                        data: JSON.stringify(data),
                        contentType: "application/json; charset=utf-8",
                        dataType: "json",
                        success: function (data) {
                            console.log("SUCCESS : ", data.kq);
                            if (data.kq == "ok") {
                                alert("Bạn cập nhập thành công");
                                location.reload();
                            } else {
                                alert("Bạn cập nhập không thành công");
                            }
                        },
                        error: function (e) {
                            console.log("ERROR : ", e);
                        },
                    });

                }
                return false;
            },
        });
});
