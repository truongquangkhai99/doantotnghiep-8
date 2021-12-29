// $('#example').DataTable({
//   dom: 'Bfrtip',

var dataTable = [];

$(document).ready(function () {
  $.ajax({
    url: "/hosos",
    type: "GET",
    contentType: "application/json; charset=utf-8",
    dataType: "json",
    success: function (data) {
      dataTable = data;
      var table = $("#example").DataTable({
        dom: "PBfrtip",
        buttons: [
          {
            extend: "csv",
            text: "Export csv",
            charset: "utf-8",
            extension: ".csv",
            fieldSeparator: ";",
            fieldBoundary: "",
            filename: "export",
            bom: true,
          },
          {
            extend: "excel",
            text: "Export excel",
            charset: "utf-8",
          },
          "print",
        ],
        scrollX: true,
        data: dataTable,
        columns: [
          { data: "id" },
          { data: "idTaiKhoan" },
          { data: "cccd" },
          { data: "hoTen" },
          { data: "ngaySinh" },
          { data: "gioiTinh" },
          { data: "soDienThoai" },
          { data: "diaChi" },
          { data: "idTruongThpt10" },
          { data: "idTruongThpt10Obj.tenTruong" },
          { data: "idTruongThpt11" },
          { data: "idTruongThpt11Obj.tenTruong" },
          { data: "idTruongThpt12" },
          { data: "idTruongThpt12Obj.tenTruong" },
          { data: "soDienThoaiBo" },
          { data: "soDienThoaiMe" },
          { data: "linkimg1" },
          { data: "doiTuongUuTien" },
          { data: "khuVucUuTien" },
          { data: "idNganh" },
          { data: "tenNganh" },
          { data: "idToHopMon" },
          { data: "maToHopMon" },
          { data: "diemtbMonMot" },
          { data: "diemtbMonHai" },
          { data: "diemtbMonBa" },
          { data: "diemXetTuyen" },
          //   {
          //     data: null,
          //     defaultContent: "<button>Xóa</button>",
          //   },
        ],
      });
      // Create the chart with initial data
      var container = $("<div/>").insertBefore(table.table().container());

      var chart = Highcharts.chart(container[0], {
        chart: {
          type: "pie",
        },
        title: {
          text: "Số Lượng Nguyện Vọng Đăng Ký Vào Các Ngành",
        },
        series: [
          {
            data: chartData(table),
          },
        ],
      });

      // On each draw, update the data in the chart
      table.on("draw", function () {
        chart.series[0].setData(chartData(table));
      });
    },
  });
});
function chartData(table) {
  var counts = {};

  // Count the number of entries for each position
  table
    .column(20, { search: "applied" })
    .data()
    .each(function (val) {
      if (counts[val]) {
        counts[val] += 1;
      } else {
        counts[val] = 1;
      }
    });

  // And map it to the format highcharts uses
  return $.map(counts, function (val, key) {
    return {
      name: key,
      y: val,
    };
  });
}
