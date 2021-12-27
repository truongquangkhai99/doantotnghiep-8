ALTER TABLE `to_hop_mon` ADD UNIQUE `unique_index`(`id_nganh`, `ma_to_hop_mon`);

INSERT INTO `tai_khoan` (`id`, `email`, `enabled`, `name`, `password`, `phone`, `role`) VALUES(1, 'trinhtu16051999@gmail.com', b'1', 'trinhtu', '123456', NULL, 'ROLE_ADMIN');
INSERT INTO `tai_khoan` (`id`, `email`, `enabled`, `name`, `password`, `phone`, `role`) VALUES(2, 'tvtu165@gmail.com', b'1', 'tu', '123456', NULL, 'ROLE_USER');


INSERT INTO `truong_thpt` (`id`, `diem_uu_tien`, `khu_vuc_uu_tien`, `ma_truong`, `ten_truong`) VALUES(1, '0.75', 'KV1', '01', '01-Thpt Ung Hoa A');
INSERT INTO `truong_thpt` (`id`, `diem_uu_tien`, `khu_vuc_uu_tien`, `ma_truong`, `ten_truong`) VALUES(4, '.25', 'KV2', '02', '02-Thpt Ứng Hòa B');
INSERT INTO `truong_thpt` (`id`, `diem_uu_tien`, `khu_vuc_uu_tien`, `ma_truong`, `ten_truong`) VALUES(5, '0.5', 'KV2-NT', '03', '03-Thpt Ứng Hòa C');
INSERT INTO `truong_thpt` (`id`, `diem_uu_tien`, `khu_vuc_uu_tien`, `ma_truong`, `ten_truong`) VALUES(6, '0', 'KV3', '04', '04-Thpt TDN');

INSERT INTO `ho_so_xet_tuyen` (`id`, `cccd`, `dia_chi`, `doi_tuong_uu_tien`, `gioi_tinh`, `ho_ten`, `khu_vuc_uu_tien`, `linkimg1`, `linkimg2`, `linkimg3`, `ngay_sinh`, `so_dien_thoai`, `so_dien_thoai_bo`, `so_dien_thoai_me`, `id_tai_khoan`, `id_truong_thpt10`, `id_truong_thpt11`, `id_truong_thpt12`) VALUES(1, '111111111111', 'dssdf', '01', 'nam', 'a', 'KV1', NULL, NULL, NULL, '1111-11-11', '1111111111', '1111111111', '1111111111', 1, 1, 1, 4);
INSERT INTO `ho_so_xet_tuyen` (`id`, `cccd`, `dia_chi`, `doi_tuong_uu_tien`, `gioi_tinh`, `ho_ten`, `khu_vuc_uu_tien`, `linkimg1`, `linkimg2`, `linkimg3`, `ngay_sinh`, `so_dien_thoai`, `so_dien_thoai_bo`, `so_dien_thoai_me`, `id_tai_khoan`, `id_truong_thpt10`, `id_truong_thpt11`, `id_truong_thpt12`) VALUES(2, '111111111111', 'dssdf', '01', 'nam', 'a', 'KV1', NULL, NULL, NULL, '1111-11-11', '1111111111', '1111111111', '1111111111', 1, 1, 1, 4);
INSERT INTO `ho_so_xet_tuyen` (`id`, `cccd`, `dia_chi`, `doi_tuong_uu_tien`, `gioi_tinh`, `ho_ten`, `khu_vuc_uu_tien`, `linkimg1`, `linkimg2`, `linkimg3`, `ngay_sinh`, `so_dien_thoai`, `so_dien_thoai_bo`, `so_dien_thoai_me`, `id_tai_khoan`, `id_truong_thpt10`, `id_truong_thpt11`, `id_truong_thpt12`) VALUES(3, '111111111111', 'dssdf', '01', 'nam', 'a', 'KV1', NULL, NULL, NULL, '1111-11-11', '1111111111', '1111111111', '1111111111', 1, 1, 1, 4);
INSERT INTO `ho_so_xet_tuyen` (`id`, `cccd`, `dia_chi`, `doi_tuong_uu_tien`, `gioi_tinh`, `ho_ten`, `khu_vuc_uu_tien`, `linkimg1`, `linkimg2`, `linkimg3`, `ngay_sinh`, `so_dien_thoai`, `so_dien_thoai_bo`, `so_dien_thoai_me`, `id_tai_khoan`, `id_truong_thpt10`, `id_truong_thpt11`, `id_truong_thpt12`) VALUES(4, '111111111111', 'dssdf', '01', 'nam', 'a', 'KV2-NT', NULL, NULL, NULL, '0111-11-11', '1111111111', '1111111111', '1111111111', 2, 1, 1, 4);
INSERT INTO `ho_so_xet_tuyen` (`id`, `cccd`, `dia_chi`, `doi_tuong_uu_tien`, `gioi_tinh`, `ho_ten`, `khu_vuc_uu_tien`, `linkimg1`, `linkimg2`, `linkimg3`, `ngay_sinh`, `so_dien_thoai`, `so_dien_thoai_bo`, `so_dien_thoai_me`, `id_tai_khoan`, `id_truong_thpt10`, `id_truong_thpt11`, `id_truong_thpt12`) VALUES(5, '111111111111', 'dssdf', '01', 'nam', 'a', 'KV2-NT', NULL, NULL, NULL, '0111-11-11', '1111111111', '1111111111', '1111111111', 2, 1, 1, 4);

INSERT INTO `khoa` (`id`, `ma_khoa`, `mo_ta`, `ten_khoa`) VALUES(1, 'CNTT', NULL, 'Công Nghệ Thông Tin');
INSERT INTO `khoa` (`id`, `ma_khoa`, `mo_ta`, `ten_khoa`) VALUES(2, 'KT', NULL, 'Kinh Tế');

INSERT INTO `nganh` (`id`, `ma_nganh`, `mo_ta`, `ten_nganh`, `id_khoa`) VALUES(1, 'CNTT', NULL, 'Công Nghệ Thông Tin', 1);
INSERT INTO `nganh` (`id`, `ma_nganh`, `mo_ta`, `ten_nganh`, `id_khoa`) VALUES(2, 'HTTT', NULL, 'Hệ Thống Thông Tin', 1);
INSERT INTO `nganh` (`id`, `ma_nganh`, `mo_ta`, `ten_nganh`, `id_khoa`) VALUES(3, 'KT01', NULL, 'Kinh Tế 01', 2);
INSERT INTO `nganh` (`id`, `ma_nganh`, `mo_ta`, `ten_nganh`, `id_khoa`) VALUES(4, 'KT02', NULL, 'Kinh Tế 02', 2);


INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(1, 'A01', 1);
INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(2, 'A', 1);
INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(3, 'D', 1);
INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(9, 'A01', 2);
INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(10, 'A', 2);
INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(11, 'A', 3);
INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(12, 'D', 4);

INSERT INTO `nguyen_vong` (`id`, `diemtb_mon_ba`, `diemtb_mon_hai`, `diemtb_mon_mot`, `id_ho_so_xet_tuyen`, `id_to_hop_mon`) VALUES(1, 4, 2, 2, 2, 1);
INSERT INTO `nguyen_vong` (`id`, `diemtb_mon_ba`, `diemtb_mon_hai`, `diemtb_mon_mot`, `id_ho_so_xet_tuyen`, `id_to_hop_mon`) VALUES(2, 3, 3, 4, 2, 10);
INSERT INTO `nguyen_vong` (`id`, `diemtb_mon_ba`, `diemtb_mon_hai`, `diemtb_mon_mot`, `id_ho_so_xet_tuyen`, `id_to_hop_mon`) VALUES(3, 3, 3, 4, 2, 2);

INSERT INTO `users` (`id`, `avatar`, `created_at`, `email`, `email_verified_at`, `password`, `remember_token`, `reset_token`, `updated_at`) VALUES(1, '1.jpg', '2021-12-21 23:00:25', 'datnt@2nf.com.vn', NULL, '12345678', NULL, NULL, NULL);