//load Nganh
$.ajax({
    url: "/nganhs",
    type: "GET",
    contentType: "application/json; charset=utf-8",
    dataType: "json",
    success: function (data) {
        for (const x in data) {
            $("#idnganh").append(new Option(data[x].tenNganh, data[x].id));
        }
    },
});

//let data1 = { "idNganh": 1 };
$.ajax({
    //url: "/tohopmonnganh",
    url: "/tohopmons",
    type: "GET",
    //data: JSON.stringify(data1),
    contentType: "application/json; charset=utf-8",
    dataType: "json",
    success: function (data) {
        for (const x in data) {
            $("#idToHopMon").append(new Option(data[x].maToHopMon, data[x].id));
        }
    },
});
var dataTable = [];
$(document).ready(function () {
    function getmaToHopMon(idToHopMon) {
        var data = { "id": idToHopMon };
        $.ajax({
            url: "/tohopmon",
            type: "GET",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (data) {
                return data.maToHopMon;
            },
        });
    }

    $.ajax({
        url: "/nguyenvongs",
        type: "GET",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data) {
            dataTable = data;
            $('#example').DataTable({
                data: dataTable,
                columns: [
                    { "data": "id" },
                    { "data": "idNganhObj.id" },
                    { "data": "idNganhObj.tenNganh" },
                    { "data": "idToHopMon" },
                    { "data": "idToHopMonObj.maToHopMon" },
                    { "data": "diemtbMonMot" },
                    { "data": "diemtbMonHai" },
                    { "data": "diemtbMonBa" },
                    {
                        "data": null,
                        "defaultContent": "<strong>Sửa</strong>"
                    },
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
            if(key=="idToHopMon"){
                $("select[name^=" + key + "] option[value=" + value + "]").attr("selected", "selected");
            }
            if(key=="idNganhObj"){
                $("#idnganh option[value=" + value.id + "]").attr("selected", "selected");
            }
            
        }
        $("#btnAddUpdate").html('Cập Nhập');
    });

    $('#example').on('click', 'tbody button', function () {
        var data = $('#example').DataTable().row($(this).parents('tr')).data();
        if (confirm('Bạn Có Muốn Xóa Nguyện Vọng Có Id là : ' + data.id)) {
            var data = { "id": data.id };
            $.ajax({
                url: "/nguyenvong",
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

    $('#idnganh').on('change', function () {
        $("#idToHopMon option").remove();
        var data = { "idNganh": this.value };
        $.ajax({
            url: "/tohopmonnganh",
            type: "POST",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (data) {
                for (const x in data) {
                    $("#idToHopMon").append(new Option(data[x].maToHopMon, data[x].id));
                }
            },
        });
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
                diemtbMonMot: {
                    required: true,
                    min: 0,
                    max: 10,
                },
                diemtbMonHai: {
                    required: true,
                    min: 0,
                    max: 10,
                },
                diemtbMonBa: {
                    required: true,
                    min: 0,
                    max: 10,
                },
                idToHopMon: {
                    required: true,
                }

            },
            messages: {
                diemtbMonMot: {
                    required: "Bắt buộc nhập điểm",
                    min: "Điểm nhập trong khoảng từ 0 - 10đ",
                    max: "Điểm nhập trong khoảng từ 0 - 10đ",
                },
                diemtbMonHai: {
                    required: "Bắt buộc nhập điểm",
                    min: "Điểm nhập trong khoảng từ 0 - 10đ",
                    max: "Điểm nhập trong khoảng từ 0 - 10đ",
                },
                diemtbMonBa: {
                    required: "Bắt buộc nhập điểm",
                    min: "Điểm nhập trong khoảng từ 0 - 10đ",
                    max: "Điểm nhập trong khoảng từ 0 - 10đ",
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
                        url: "/nguyenvong",
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
                        url: "/nguyenvong",
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
