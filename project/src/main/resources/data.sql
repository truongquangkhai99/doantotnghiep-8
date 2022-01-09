ALTER TABLE `to_hop_mon` ADD UNIQUE `unique_index`(`id_nganh`, `ma_to_hop_mon`);
ALTER TABLE `nguyen_vong` ADD UNIQUE(`id_ho_so_xet_tuyen`, `id_to_hop_mon`);
CREATE TRIGGER `update_DiemXetTuyen` BEFORE INSERT ON `nguyen_vong` FOR EACH ROW BEGIN SET new.diem_xet_tuyen = new.diemtb_mon_ba + new.diemtb_mon_hai + new.diemtb_mon_mot; END;

/*Data for the table `khoa` */

INSERT  INTO `khoa`(`id`,`ma_khoa`,`mo_ta`,`ten_khoa`) VALUES (1,'CT',NULL,'công trình');
INSERT  INTO `khoa`(`id`,`ma_khoa`,`mo_ta`,`ten_khoa`) VALUES (2,'CNTT',NULL,'Công nghệ thông tin ');
INSERT  INTO `khoa`(`id`,`ma_khoa`,`mo_ta`,`ten_khoa`) VALUES (3,'KT',NULL,'Kinh Tế');

/*Data for the table `nganh` */

INSERT  INTO `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) VALUES (1,'TLA101',NULL,'Kỹ thuật xây dựng công trình thủy',1);
INSERT  INTO `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) VALUES (2,'TLA111',NULL,'Công nghệ kỹ thuật xây dựng',1);
INSERT  INTO `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) VALUES (3,'TLA104',NULL,'Kỹ thuật xây dựng',1);
INSERT  INTO `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) VALUES (4,'TLA106',NULL,'Công nghệ thông tin',2);
INSERT  INTO `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) VALUES (5,'TLA117',NULL,'Kỹ thuật phần mềm',2);
INSERT  INTO `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) VALUES (6,'TLA116',NULL,'Hệ thống thông tin',2);
INSERT  INTO `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) VALUES (7,'TLA401',NULL,'Kinh tế',3);
INSERT  INTO `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) VALUES (8,'TLA402',NULL,'Quản trị kinh doanh',3);
INSERT  INTO `nganh`(`id`,`ma_nganh`,`mo_ta`,`ten_nganh`,`id_khoa`) VALUES (9,'TLA403',NULL,'Kế toán',3);


/*Data for the table `to_hop_mon` */

INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (1,'A00',1);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (2,'A01',1);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (3,'D01',1);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (4,'D07',1);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (9,'A00',2);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (10,'A01',2);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (11,'D01',2);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (12,'D07',2);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (5,'A00',3);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (6,'A01',3);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (7,'D01',3);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (8,'D07',3);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (13,'A00',4);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (14,'A01',4);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (15,'D01',4);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (16,'D07',4);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (17,'A00',5);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (18,'A01',5);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (19,'D01',5);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (20,'D07',5);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (21,'A00',6);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (22,'A01',6);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (23,'D01',6);
INSERT  INTO `to_hop_mon`(`id`,`ma_to_hop_mon`,`id_nganh`) VALUES (24,'D07',6);

/*Data for the table `truong_thpt` */

INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (1,'0','KV3','800','Học ở nước ngoài');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (2,'0','KV3','900','Quân nhân, Công an tại ngũ');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (3,'0','KV3','062','THPT Nguyễn Trãi-Ba Đình');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (4,'0','KV3','066','THPT Phan Đình Phùng');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (5,'0.25','KV2','103','THPT Nguyễn Sinh Sắc');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (6,'0.25','KV2','072','TC Nghề Tân Châu');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (7,'0.25','KV2','013','THPT Tân Châu');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (8,'0.25','KV2','017','PT Phú Tân');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (9,'0.5','KV2-NT','018','THPT Nguyễn Chí Thanh');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (10,'0.5','KV2-NT','046',' THPT Hoà Lạc');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (11,'0.5','KV2-NT','052','THPT Bình Thạnh Đông');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (12,'0.5','KV2-NT','057','TTDN-GDTX Phú Tân');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (13,'0.75','KV1','024','THPT Tịnh Biên');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (14,'0.75','KV1','025','THPT Chi Lăng');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (15,'0.75','KV1','026','THPT Xuân Tô');
INSERT  INTO `truong_thpt`(`id`,`diem_uu_tien`,`khu_vuc_uu_tien`,`ma_truong`,`ten_truong`) VALUES (16,'0.75','KV1','064','TTDN-GDTX Tịnh Biên');

/*Data for the table `tai_khoan` */

INSERT  INTO `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) VALUES (1,'admintlu@gmail.com',TRUE,'admin','123456','0964261480','ROLE_ADMIN');
INSERT  INTO `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) VALUES (2,'btstlu@gmail.com',TRUE,'bts','123456','0964261480','ROLE_BTS');
INSERT  INTO `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) VALUES (3,'hstlu@gmail.com',TRUE,'hs','123456','0964261480','ROLE_USER');
INSERT  INTO `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) VALUES (4,'hst2lu@gmail.com',TRUE,'hs','123456','0964261480','ROLE_USER');
INSERT  INTO `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) VALUES (5,'hst3lu@gmail.com',TRUE,'hs','123456','0964261480','ROLE_USER');
INSERT  INTO `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) VALUES (6,'hst4lu@gmail.com',TRUE,'hs','123456','0964261480','ROLE_USER');
INSERT  INTO `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) VALUES (7,'hst5lu@gmail.com',TRUE,'hs','123456','0964261480','ROLE_USER');
INSERT  INTO `tai_khoan`(`id`,`email`,`enabled`,`name`,`password`,`phone`,`role`) VALUES (8,'hst6lu@gmail.com',TRUE,'hs','123456','0964261480','ROLE_USER');
/*Data for the table `nguyen_vong` */
INSERT  INTO `ho_so_xet_tuyen`(`id`,`cccd`,`dia_chi`,`doi_tuong_uu_tien`,`gioi_tinh`,`ho_ten`,`khu_vuc_uu_tien`,`linkimg1`,`linkimg2`,`linkimg3`,`ngay_sinh`,`so_dien_thoai`,`so_dien_thoai_bo`,`so_dien_thoai_me`,`id_tai_khoan`,`id_truong_thpt10`,`id_truong_thpt11`,`id_truong_thpt12`) VALUES (1,'001099017269','Thôn đoàn xá - Đồng Tiến - Ứng Hòa - Hà Nội','01','nam','Trịnh Văn Tú','KV2',NULL,NULL,NULL,'1999-05-16','0964261480','0964261482','0964261481',3,1,1,1);
INSERT  INTO `nguyen_vong`(`id`,`diem_xet_tuyen`,`diemtb_mon_ba`,`diemtb_mon_hai`,`diemtb_mon_mot`,`id_ho_so_xet_tuyen`,`id_to_hop_mon`) VALUES (1,20,6,8,6,1,13);


