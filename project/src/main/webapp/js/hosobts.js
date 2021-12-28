var dataTable = [];
$(document).ready(function () {
    $.ajax({
        url: "/hosos",
        type: "GET",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data) {
            dataTable = data;
            $('#example').DataTable({
                dom: 'Bfrtip',
                buttons: [
                    'copy', 'csv', 'excel', 'pdf', 'print'
                ],
                "scrollX": true,
                data: dataTable,
                columns: [
                    { "data": "id" },
                    { "data": "idTaiKhoan" },
                    { "data": "cccd" },
                    { "data": "hoTen" },
                    { "data": "ngaySinh" },
                    { "data": "gioiTinh" },
                    { "data": "soDienThoai" },
                    { "data": "diaChi" },
                    { "data": "idTruongThpt10" },
                    { "data": "idTruongThpt10Obj.tenTruong" },
                    { "data": "idTruongThpt11" },
                    { "data": "idTruongThpt11Obj.tenTruong" },
                    { "data": "idTruongThpt12" },
                    { "data": "idTruongThpt12Obj.tenTruong" },
                    { "data": "soDienThoaiBo" },
                    { "data": "soDienThoaiMe" },
                    { "data": "linkimg1" },
                    { "data": "doiTuongUuTien" },
                    { "data": "khuVucUuTien" },
                    { "data": "idNganh" },
                    { "data": "tenNganh" },
                    { "data": "idToHopMon" },
                    { "data": "maToHopMon" },
                    { "data": "diemtbMonMot" },
                    { "data": "diemtbMonHai" },
                    { "data": "diemtbMonBa" },
                    { "data": "diemXetTuyen" },
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
            $("select[name^=" + key + "] option[value=" + value + "]").attr("selected", "selected");
        }
        $("#btnAddUpdate").html('Cập Nhập');
    });

    $('#example').on('click', 'tbody button', function () {
        var data = $('#example').DataTable().row($(this).parents('tr')).data();
        if (confirm('Bạn Có Muốn Xóa Khoa Có Id là : ' + data.id)) {
            var data = { "id": data.id };
            $.ajax({
                url: "/hoso",
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
                tenKhoa: {
                    required: true,
                    maxlength : 60
                },
                maKhoa: {
                    required: true,
                    maxlength : 60
                },

            },
            messages: {
                tenKhoa: {
                    maxlength: "Nhập tối đa 60 ký tự",
                },
                maKhoa: {
                    maxlength: "Nhập tối đa 60 ký tự",
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
                        url: "/hoso",
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
                        url: "/hoso",
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
