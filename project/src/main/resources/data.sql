ALTER TABLE `to_hop_mon` ADD UNIQUE `unique_index`(`id_nganh`, `ma_to_hop_mon`);

CREATE TRIGGER `update_DiemXetTuyen` BEFORE INSERT ON `nguyen_vong` FOR EACH ROW BEGIN SET new.diem_xet_tuyen = new.diemtb_mon_ba + new.diemtb_mon_hai + new.diemtb_mon_mot; END;
--INSERT INTO `tai_khoan` (`id`, `email`, `enabled`, `name`, `password`, `phone`, `role`) VALUES(1, 'trinhtu16051999@gmail.com', b'1', 'trinhtu', '123456', NULL, 'ROLE_ADMIN');
--INSERT INTO `tai_khoan` (`id`, `email`, `enabled`, `name`, `password`, `phone`, `role`) VALUES(2, 'tvtu165@gmail.com', b'1', 'tu', '123456', NULL, 'ROLE_USER');
--
--
--INSERT INTO `truong_thpt` (`id`, `diem_uu_tien`, `khu_vuc_uu_tien`, `ma_truong`, `ten_truong`) VALUES(1, '0.75', 'KV1', '01', '01-Thpt Ung Hoa A');
--INSERT INTO `truong_thpt` (`id`, `diem_uu_tien`, `khu_vuc_uu_tien`, `ma_truong`, `ten_truong`) VALUES(4, '.25', 'KV2', '02', '02-Thpt á»¨ng HÃ²a B');
--INSERT INTO `truong_thpt` (`id`, `diem_uu_tien`, `khu_vuc_uu_tien`, `ma_truong`, `ten_truong`) VALUES(5, '0.5', 'KV2-NT', '03', '03-Thpt á»¨ng HÃ²a C');
--INSERT INTO `truong_thpt` (`id`, `diem_uu_tien`, `khu_vuc_uu_tien`, `ma_truong`, `ten_truong`) VALUES(6, '0', 'KV3', '04', '04-Thpt TDN');
--
--INSERT INTO `ho_so_xet_tuyen` (`id`, `cccd`, `dia_chi`, `doi_tuong_uu_tien`, `gioi_tinh`, `ho_ten`, `khu_vuc_uu_tien`, `linkimg1`, `linkimg2`, `linkimg3`, `ngay_sinh`, `so_dien_thoai`, `so_dien_thoai_bo`, `so_dien_thoai_me`, `id_tai_khoan`, `id_truong_thpt10`, `id_truong_thpt11`, `id_truong_thpt12`) VALUES(1, '111111111111', 'dssdf', '01', 'nam', 'a', 'KV1', NULL, NULL, NULL, '1111-11-11', '1111111111', '1111111111', '1111111111', 1, 1, 1, 4);
--INSERT INTO `ho_so_xet_tuyen` (`id`, `cccd`, `dia_chi`, `doi_tuong_uu_tien`, `gioi_tinh`, `ho_ten`, `khu_vuc_uu_tien`, `linkimg1`, `linkimg2`, `linkimg3`, `ngay_sinh`, `so_dien_thoai`, `so_dien_thoai_bo`, `so_dien_thoai_me`, `id_tai_khoan`, `id_truong_thpt10`, `id_truong_thpt11`, `id_truong_thpt12`) VALUES(2, '111111111111', 'dssdf', '01', 'nam', 'a', 'KV1', NULL, NULL, NULL, '1111-11-11', '1111111111', '1111111111', '1111111111', 1, 1, 1, 4);
--INSERT INTO `ho_so_xet_tuyen` (`id`, `cccd`, `dia_chi`, `doi_tuong_uu_tien`, `gioi_tinh`, `ho_ten`, `khu_vuc_uu_tien`, `linkimg1`, `linkimg2`, `linkimg3`, `ngay_sinh`, `so_dien_thoai`, `so_dien_thoai_bo`, `so_dien_thoai_me`, `id_tai_khoan`, `id_truong_thpt10`, `id_truong_thpt11`, `id_truong_thpt12`) VALUES(3, '111111111111', 'dssdf', '01', 'nam', 'a', 'KV1', NULL, NULL, NULL, '1111-11-11', '1111111111', '1111111111', '1111111111', 1, 1, 1, 4);
--INSERT INTO `ho_so_xet_tuyen` (`id`, `cccd`, `dia_chi`, `doi_tuong_uu_tien`, `gioi_tinh`, `ho_ten`, `khu_vuc_uu_tien`, `linkimg1`, `linkimg2`, `linkimg3`, `ngay_sinh`, `so_dien_thoai`, `so_dien_thoai_bo`, `so_dien_thoai_me`, `id_tai_khoan`, `id_truong_thpt10`, `id_truong_thpt11`, `id_truong_thpt12`) VALUES(4, '111111111111', 'dssdf', '01', 'nam', 'a', 'KV2-NT', NULL, NULL, NULL, '0111-11-11', '1111111111', '1111111111', '1111111111', 2, 1, 1, 4);
--INSERT INTO `ho_so_xet_tuyen` (`id`, `cccd`, `dia_chi`, `doi_tuong_uu_tien`, `gioi_tinh`, `ho_ten`, `khu_vuc_uu_tien`, `linkimg1`, `linkimg2`, `linkimg3`, `ngay_sinh`, `so_dien_thoai`, `so_dien_thoai_bo`, `so_dien_thoai_me`, `id_tai_khoan`, `id_truong_thpt10`, `id_truong_thpt11`, `id_truong_thpt12`) VALUES(5, '111111111111', 'dssdf', '01', 'nam', 'a', 'KV2-NT', NULL, NULL, NULL, '0111-11-11', '1111111111', '1111111111', '1111111111', 2, 1, 1, 4);
--
--INSERT INTO `khoa` (`id`, `ma_khoa`, `mo_ta`, `ten_khoa`) VALUES(1, 'CNTT', NULL, 'CÃ´ng Nghá»‡ ThÃ´ng Tin');
--INSERT INTO `khoa` (`id`, `ma_khoa`, `mo_ta`, `ten_khoa`) VALUES(2, 'KT', NULL, 'Kinh Táº¿');
--
--INSERT INTO `nganh` (`id`, `ma_nganh`, `mo_ta`, `ten_nganh`, `id_khoa`) VALUES(1, 'CNTT', NULL, 'CÃ´ng Nghá»‡ ThÃ´ng Tin', 1);
--INSERT INTO `nganh` (`id`, `ma_nganh`, `mo_ta`, `ten_nganh`, `id_khoa`) VALUES(2, 'HTTT', NULL, 'Há»‡ Thá»‘ng ThÃ´ng Tin', 1);
--INSERT INTO `nganh` (`id`, `ma_nganh`, `mo_ta`, `ten_nganh`, `id_khoa`) VALUES(3, 'KT01', NULL, 'Kinh Táº¿ 01', 2);
--INSERT INTO `nganh` (`id`, `ma_nganh`, `mo_ta`, `ten_nganh`, `id_khoa`) VALUES(4, 'KT02', NULL, 'Kinh Táº¿ 02', 2);
--
--
--INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(1, 'A01', 1);
--INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(2, 'A', 1);
--INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(3, 'D', 1);
--INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(9, 'A01', 2);
--INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(10, 'A', 2);
--INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(11, 'A', 3);
--INSERT INTO `to_hop_mon` (`id`, `ma_to_hop_mon`, `id_nganh`) VALUES(12, 'D', 4);
--
--INSERT INTO `nguyen_vong` (`id`, `diemtb_mon_ba`, `diemtb_mon_hai`, `diemtb_mon_mot`, `id_ho_so_xet_tuyen`, `id_to_hop_mon`) VALUES(1, 4, 2, 2, 2, 1);
--INSERT INTO `nguyen_vong` (`id`, `diemtb_mon_ba`, `diemtb_mon_hai`, `diemtb_mon_mot`, `id_ho_so_xet_tuyen`, `id_to_hop_mon`) VALUES(2, 3, 3, 4, 2, 10);
--INSERT INTO `nguyen_vong` (`id`, `diemtb_mon_ba`, `diemtb_mon_hai`, `diemtb_mon_mot`, `id_ho_so_xet_tuyen`, `id_to_hop_mon`) VALUES(3, 3, 3, 4, 2, 2);
--
--INSERT INTO `users` (`id`, `avatar`, `created_at`, `email`, `email_verified_at`, `password`, `remember_token`, `reset_token`, `updated_at`) VALUES(1, '1.jpg', '2021-12-21 23:00:25', 'datnt@2nf.com.vn', NULL, '12345678', NULL, NULL, NULL);


/*Data for the table `khoa` */

insert  into `khoa`(`id`,`ma_khoa`,`mo_ta`,`ten_khoa`) values (1,'CT',NULL,'công trình');
insert  into `khoa`(`id`,`ma_khoa`,`mo_ta`,`ten_khoa`) values (2,'CNTT',NULL,'Công nghệ thông tin ');
insert  into `khoa`(`id`,`ma_khoa`,`mo_ta`,`ten_khoa`) values (3,'KT',NULL,'Kinh Tế');

/*Data for the table `nganh` */

insert  into `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) values (1,'TLA101',NULL,'Kỹ thuật xây dựng công trình thủy',1);
insert  into `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) values (2,'TLA111',NULL,'Công nghệ kỹ thuật xây dựng',1);
insert  into `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) values (3,'TLA104',NULL,'Kỹ thuật xây dựng',1);
insert  into `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) values (4,'TLA106',NULL,'Công nghệ thông tin',2);
insert  into `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) values (5,'TLA117',NULL,'Kỹ thuật phần mềm',2);
insert  into `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) values (6,'TLA116',NULL,'Hệ thống thông tin',2);
insert  into `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) values (7,'TLA401',NULL,'Kinh tế',3);
insert  into `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) values (8,'TLA402',NULL,'Quản trị kinh doanh',3);
insert  into `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) values (9,'TLA403',NULL,'Kế toán',3);


/*Data for the table `to_hop_mon` */

insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (1,'A00',1);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (2,'A01',1);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (3,'D01',1);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (4,'D07',1);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (9,'A00',2);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (10,'A01',2);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (11,'D01',2);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (12,'D07',2);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (5,'A00',3);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (6,'A01',3);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (7,'D01',3);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (8,'D07',3);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (13,'A00',4);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (14,'A01',4);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (15,'D01',4);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (16,'D07',4);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (17,'A00',5);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (18,'A01',5);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (19,'D01',5);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (20,'D07',5);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (21,'A00',6);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (22,'A01',6);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (23,'D01',6);
insert  into `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) values (24,'D07',6);

/*Data for the table `truong_thpt` */

insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (1,'0','KV3','800','Học ở nước ngoài');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (2,'0','KV3','900','Quân nhân, Công an tại ngũ');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (3,'0','KV3','062','THPT Nguyễn Trãi-Ba Đình');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (4,'0','KV3','066','THPT Phan Đình Phùng');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (5,'0.25','KV2','103','THPT Nguyễn Sinh Sắc');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (6,'0.25','KV2','072','TC Nghề Tân Châu');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (7,'0.25','KV2','013','THPT Tân Châu');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (8,'0.25','KV2','017','PT Phú Tân');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (9,'0.5','KV2-NT','018','THPT Nguyễn Chí Thanh');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (10,'0.5','KV2-NT','046',' THPT Hoà Lạc');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (11,'0.5','KV2-NT','052','THPT Bình Thạnh Đông');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (12,'0.5','KV2-NT','057','TTDN-GDTX Phú Tân');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (13,'0.75','KV1','024','THPT Tịnh Biên');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (14,'0.75','KV1','025','THPT Chi Lăng');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (15,'0.75','KV1','026','THPT Xuân Tô');
insert  into `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) values (16,'0.75','KV1','064','TTDN-GDTX Tịnh Biên');

/*Data for the table `tai_khoan` */

insert  into `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) values (1,'admintlu@gmail.com','','admin','123456','0964261480','ROLE_ADMIN');
insert  into `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) values (2,'btstlu@gmail.com','','bts','123456','0964261480','ROLE_BTS');
insert  into `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) values (3,'hstlu@gmail.com','','hs','123456','0964261480','ROLE_USER');
insert  into `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) values (4,'hst2lu@gmail.com','','hs','123456','0964261480','ROLE_USER');
insert  into `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) values (5,'hst3lu@gmail.com','','hs','123456','0964261480','ROLE_USER');
insert  into `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) values (6,'hst4lu@gmail.com','','hs','123456','0964261480','ROLE_USER');
insert  into `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) values (7,'hst5lu@gmail.com','','hs','123456','0964261480','ROLE_USER');
insert  into `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) values (8,'hst6lu@gmail.com','','hs','123456','0964261480','ROLE_USER');
/*Data for the table `nguyen_vong` */
insert  into `ho_so_xet_tuyen`(`id`,`cccd`,`dia_chi`,`doi_tuong_uu_tien`,`gioi_tinh`,`ho_ten`,`khu_vuc_uu_tien`,`linkimg1`,`linkimg2`,`linkimg3`,`ngay_sinh`,`so_dien_thoai`,`so_dien_thoai_bo`,`so_dien_thoai_me`,`id_tai_khoan`,`id_truong_thpt10`,`id_truong_thpt11`,`id_truong_thpt12`) values (1,'001099017269','Thôn đoàn xá - Đồng Tiến - Ứng Hòa - Hà Nội','01','nam','Trịnh Văn Tú','KV2',NULL,NULL,NULL,'1999-05-16','0964261480','0964261482','0964261481',3,1,1,1);
insert  into `nguyen_vong`(`id`,`diem_xet_tuyen`,`diemtb_mon_ba`,`diemtb_mon_hai`,`diemtb_mon_mot`,`id_ho_so_xet_tuyen`,`id_to_hop_mon`) values (1,20,6,8,6,1,13);


