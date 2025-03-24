Create Database NuocGiaiKhat;
go
use NuocGiaiKhat;
go
CREATE TABLE NHACC (
    MaNCC VARCHAR(10) PRIMARY KEY,
    TenNCC VARCHAR(50),
    DiaChiNCC VARCHAR(100),
    DTNCC VARCHAR(15)
);

CREATE TABLE LOAINGK (
    MaLoaiNGK VARCHAR(10) PRIMARY KEY,
    TenLoaiNGK VARCHAR(50),
    MaNCC VARCHAR(10),
    FOREIGN KEY (MaNCC) REFERENCES NHACC(MaNCC)
);

CREATE TABLE NGK (
    MaNGK VARCHAR(10) PRIMARY KEY,
    TenNGK VARCHAR(50),
    Quycach VARCHAR(20),
    MaLoaiNGK VARCHAR(10),
    FOREIGN KEY (MaLoaiNGK) REFERENCES LOAINGK(MaLoaiNGK)
);


CREATE TABLE KH (
    MaKH VARCHAR(10) PRIMARY KEY,
    TenKH VARCHAR(50),
    DCKH VARCHAR(100),
    DTKH VARCHAR(15)
);

CREATE TABLE DDH (
    SoDDH VARCHAR(10) PRIMARY KEY,
    NgayDH DATE,
    MaNCC VARCHAR(10),
    FOREIGN KEY (MaNCC) REFERENCES NHACC(MaNCC)
);

CREATE TABLE CT_DDH (
    SoDDH VARCHAR(10),
    MaNGK VARCHAR(10),
    SLDat INT,
    PRIMARY KEY (SoDDH, MaNGK),
    FOREIGN KEY (SoDDH) REFERENCES DDH(SoDDH),
    FOREIGN KEY (MaNGK) REFERENCES NGK(MaNGK)
);

CREATE TABLE PHIEUGH (
    SoPGH VARCHAR(10) PRIMARY KEY,
    NgayGH DATE,
    SoDDH VARCHAR(10),
    FOREIGN KEY (SoDDH) REFERENCES DDH(SoDDH)
);

CREATE TABLE CT_PGH (
    SoPGH VARCHAR(10),
    MaNGK VARCHAR(10),
    SLGiao INT,
    DGGiao DECIMAL(10,2),
    PRIMARY KEY (SoPGH, MaNGK),
    FOREIGN KEY (SoPGH) REFERENCES PHIEUGH(SoPGH),
    FOREIGN KEY (MaNGK) REFERENCES NGK(MaNGK)
);

CREATE TABLE HOADON (
    SoHD VARCHAR(10) PRIMARY KEY,
    NgaylapHD DATE,
    MaKH VARCHAR(10),
    FOREIGN KEY (MaKH) REFERENCES KH(MaKH)
);

CREATE TABLE CT_HOADON (
    SoHD VARCHAR(10),
    MaNGK VARCHAR(10),
    SLKHMua INT,
    DGBan DECIMAL(10,2),
    PRIMARY KEY (SoHD, MaNGK),
    FOREIGN KEY (SoHD) REFERENCES HOADON(SoHD),
    FOREIGN KEY (MaNGK) REFERENCES NGK(MaNGK)
);

CREATE TABLE PHIEUHEN (
    SoPH VARCHAR(10) PRIMARY KEY,
    NgayLapPH DATE,
    NgayHenGiao DATE,
    MaKH VARCHAR(10),
    FOREIGN KEY (MaKH) REFERENCES KH(MaKH)
);

CREATE TABLE CT_PH (
    SoPH VARCHAR(10),
    MaNGK VARCHAR(10),
    SLHen INT,
    PRIMARY KEY (SoPH, MaNGK),
    FOREIGN KEY (SoPH) REFERENCES PHIEUHEN(SoPH),
    FOREIGN KEY (MaNGK) REFERENCES NGK(MaNGK)
);

CREATE TABLE PHIEUTRANNO (
    SoPTN VARCHAR(10) PRIMARY KEY,
    NgayTra DATE,
    SoTienTra DECIMAL(15,2),
    SoHD VARCHAR(10),
    FOREIGN KEY (SoHD) REFERENCES HOADON(SoHD)
);

--Nhập dữ liệu

INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('CC1', 'Coca Cola', 'Chai', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('CC2', 'Coca Cola', 'Lon', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('PS1', 'Pepsi', 'Chai', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('PS2', 'Pepsi', 'Lon', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('SV1', 'Seven Up', 'Chai', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('SV2', 'Seven Up', 'Lon', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('NO1', 'Number One', 'Chai', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('NO2', 'Number One', 'Lon', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('ST1', 'Sting dâu', 'Chai', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('ST2', 'Sting dâu', 'Lon', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('C2', 'Trà C2', 'Chai', 'NK2');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('OD', 'Trà xanh 0 độ', 'Chai', 'NK2');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('ML1', 'Sữa tươi tiệt trùng', 'Bịch', 'NK1');
INSERT INTO NGK (MaNGK, TenNGK, Quycach, MaLoaiNGK) VALUES ('WT1', 'Nước uống đóng chai', 'Chai', 'NK2');


INSERT INTO LOAINGK (MaLoaiNGK, TenLoaiNGK, MaNCC) VALUES ('NK1', 'Nước ngọt có gas', 'NC1');
INSERT INTO LOAINGK (MaLoaiNGK, TenLoaiNGK, MaNCC) VALUES ('NK2', 'Nước ngọt không gas', 'NC2');
INSERT INTO LOAINGK (MaLoaiNGK, TenLoaiNGK, MaNCC) VALUES ('NK3', 'Trà', 'NC1');
INSERT INTO LOAINGK (MaLoaiNGK, TenLoaiNGK, MaNCC) VALUES ('NK4', 'Sữa', 'NC2');


INSERT INTO NHACC (MaNCC, TenNCC, DiaChiNCC, DTNCC) VALUES ('NC1', 'Công ty NGK quốc tế CocaCola', 'Xa lộ Hà Nội, Thủ Đức, TP.HCM', '088967908');
INSERT INTO NHACC (MaNCC, TenNCC, DiaChiNCC, DTNCC) VALUES ('NC2', 'Công ty NGK quốc tế Pepsi', 'Bên Chương Dương, Quận 1, TP.HCM', '083663366');
INSERT INTO NHACC (MaNCC, TenNCC, DiaChiNCC, DTNCC) VALUES ('NC3', 'Công ty NGK Bên Chương Dương', 'Hàm Tử, Q.5, TP.HCM', '089456677');



INSERT INTO KH (MaKH, TenKH, DCKH, DTKH) VALUES ('KH01', 'Cua hang BT', '144 XVNT', '088405996');
INSERT INTO KH (MaKH, TenKH, DCKH, DTKH) VALUES ('KH02', 'Cua hang Tra', '198/42 NTT', '085974572');
INSERT INTO KH (MaKH, TenKH, DCKH, DTKH) VALUES ('KH03', 'Sieu thi Coop', '24 DTH', '086547888');



INSERT INTO DDH (SoDDH, NgayDH, MaNCC) VALUES ('DDH01', '2011-05-10', 'NC1');
INSERT INTO DDH (SoDDH, NgayDH, MaNCC) VALUES ('DDH02', '2011-05-20', 'NC1');
INSERT INTO DDH (SoDDH, NgayDH, MaNCC) VALUES ('DDH03', '2011-05-26', 'NC2');
INSERT INTO DDH (SoDDH, NgayDH, MaNCC) VALUES ('DDH04', '2011-06-03', 'NC2');


INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH01', 'CC1', 20);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH01', 'CC2', 15);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH01', 'PS1', 18);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH01', 'SV2', 12);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH02', 'CC2', 30);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH02', 'PS2', 10);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH02', 'SV1', 5);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH02', 'ST1', 15);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH02', 'C2', 10);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH03', 'OD', 45);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH04', 'CC1', 8);
INSERT INTO CT_DDH (SoDDH, MaNGK, SLDat) VALUES ('DDH04', 'ST2', 12);



INSERT INTO PHIEUGH (SoPGH, NgayGH, SoDDH) VALUES ('PGH01', '2010-05-12', 'DDH01');
INSERT INTO PHIEUGH (SoPGH, NgayGH, SoDDH) VALUES ('PGH02', '2010-05-15', 'DDH01');
INSERT INTO PHIEUGH (SoPGH, NgayGH, SoDDH) VALUES ('PGH03', '2010-05-21', 'DDH02');
INSERT INTO PHIEUGH (SoPGH, NgayGH, SoDDH) VALUES ('PGH04', '2010-05-22', 'DDH02');
INSERT INTO PHIEUGH (SoPGH, NgayGH, SoDDH) VALUES ('PGH05', '2010-05-28', 'DDH03');



INSERT INTO CT_PGH (SoPGH, MaNGK, SLGiao, DGGiao) VALUES ('PGH01', 'CC1', 15, 5000);
INSERT INTO CT_PGH (SoPGH, MaNGK, SLGiao, DGGiao) VALUES ('PGH01', 'CC2', 15, 4000);
INSERT INTO CT_PGH (SoPGH, MaNGK, SLGiao, DGGiao) VALUES ('PGH01', 'SV2', 10, 4000);
INSERT INTO CT_PGH (SoPGH, MaNGK, SLGiao, DGGiao) VALUES ('PGH02', 'SV2', 2, 4000);
INSERT INTO CT_PGH (SoPGH, MaNGK, SLGiao, DGGiao) VALUES ('PGH03', 'CC2', 30, 5000);
INSERT INTO CT_PGH (SoPGH, MaNGK, SLGiao, DGGiao) VALUES ('PGH03', 'PS2', 10, 4000);
INSERT INTO CT_PGH (SoPGH, MaNGK, SLGiao, DGGiao) VALUES ('PGH03', 'ST1', 15, 9000);
INSERT INTO CT_PGH (SoPGH, MaNGK, SLGiao, DGGiao) VALUES ('PGH03', 'C2', 10, 8000);



INSERT INTO HOADON (SoHD, NgaylapHD, MaKH) VALUES ('HD01', '2010-05-10', 'KH01');
INSERT INTO HOADON (SoHD, NgaylapHD, MaKH) VALUES ('HD02', '2010-05-20', 'KH01');
INSERT INTO HOADON (SoHD, NgaylapHD, MaKH) VALUES ('HD03', '2010-06-05', 'KH02');
INSERT INTO HOADON (SoHD, NgaylapHD, MaKH) VALUES ('HD04', '2010-06-16', 'KH02');
INSERT INTO HOADON (SoHD, NgaylapHD, MaKH) VALUES ('HD05', '2010-06-22', 'KH02');
INSERT INTO HOADON (SoHD, NgaylapHD, MaKH) VALUES ('HD06', '2010-07-08', 'KH03');



INSERT INTO CT_HOADON(SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD01', 'CC1', 20, 6000);
INSERT INTO CT_HOADON (SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD01', 'CC2', 50, 5000);
INSERT INTO CT_HOADON (SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD02', 'ST1', 40, 10000);
INSERT INTO CT_HOADON (SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD03', 'SV2', 60, 5000);
INSERT INTO CT_HOADON (SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD04', 'PS2', 25, 5000);
INSERT INTO CT_HOADON (SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD05', 'CC1', 100, 6000);
INSERT INTO CT_HOADON (SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD05', 'SV1', 12, 8000);
INSERT INTO CT_HOADON (SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD05', 'C2', 80, 9000);
INSERT INTO CT_HOADON (SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD01', 'OD', 55, 1000);
INSERT INTO CT_HOADON (SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD01', 'ST2', 50, 11000);



INSERT INTO PHIEUHEN (SoPH, NgayLapPH, NgayHenGiao, MaKH) VALUES ('PH01', '2010-05-08', '2010-06-09', 'KH01');
INSERT INTO PHIEUHEN (SoPH, NgayLapPH, NgayHenGiao, MaKH) VALUES ('PH02', '2010-05-25', '2010-06-28', 'KH02');
INSERT INTO PHIEUHEN (SoPH, NgayLapPH, NgayHenGiao, MaKH) VALUES ('PH03', '2010-06-01', '2010-06-02', 'KH03');



INSERT INTO CT_PH (SoPH, MaNGK, SLHen) VALUES ('PH01', 'ST2', 10);
INSERT INTO CT_PH (SoPH, MaNGK, SLHen) VALUES ('PH01', 'OD', 8);
INSERT INTO CT_PH (SoPH, MaNGK, SLHen) VALUES ('PH02', 'CC1', 20);
INSERT INTO CT_PH (SoPH, MaNGK, SLHen) VALUES ('PH03', 'ST1', 7);
INSERT INTO CT_PH (SoPH, MaNGK, SLHen) VALUES ('PH03', 'SV2', 12);
INSERT INTO CT_PH (SoPH, MaNGK, SLHen) VALUES ('PH03', 'CC2', 9);
INSERT INTO CT_PH (SoPH, MaNGK, SLHen) VALUES ('PH03', 'PS2', 15);



INSERT INTO PHIEUTRANNO (SoPTN, NgayTra, SoTienTra, SoHD) VALUES ('PTN01', '2010-05-18', 500000, 'HD01');
INSERT INTO PHIEUTRANNO (SoPTN, NgayTra, SoTienTra, SoHD) VALUES ('PTN02', '2010-06-01', 350000, 'HD01');
INSERT INTO PHIEUTRANNO (SoPTN, NgayTra, SoTienTra, SoHD) VALUES ('PTN03', '2010-06-02', 650000, 'HD02');
INSERT INTO PHIEUTRANNO (SoPTN, NgayTra, SoTienTra, SoHD) VALUES ('PTN04', '2010-06-15', 1020000, 'HD03');
INSERT INTO PHIEUTRANNO (SoPTN, NgayTra, SoTienTra, SoHD) VALUES ('PTN05', '2010-07-01', 1080000, 'HD03');

--I
--2
alter table NGK
add GHICHU varchar(50);
--3
alter table HOADON
add KHUYENMAI int;
--4
alter  table NGK
alter column GHICHU varchar(100);
--5
alter table NGK
drop column GHICHU;
--II
--2
 
--3
INSERT INTO CT_HOADON (SoHD, MaNGK, SLKHMua, DGBan) VALUES ('HD01', 'ST1', 20, 60);
--4
UPDATE CT_HOADON SET DGBan = DGBan * 1.05 WHERE MaNGK = 'CC2';
--5
DELETE FROM CT_HOADON WHERE DGBan > 150;
--III
--1
SELECT * FROM NGK WHERE MaLoaiNGK = 'NK1';
--2
SELECT * FROM HOADON WHERE YEAR(NgaylapHD) = 2010;
--3
SELECT * FROM CT_DDH WHERE SLDat < 60;
--4
SELECT * FROM PHIEUTRANNO WHERE SoTienTra > 500000;
--5
SELECT * FROM NGK WHERE Quycach = 'Lon';
--6
SELECT * FROM NGK WHERE MaNGK NOT IN (SELECT DISTINCT MaNGK FROM CT_HOADON);
--7
SELECT NGK.TenNGK, SUM(CT_HOADON.SLKHMua) AS TongSoLuongBan
FROM NGK 
LEFT JOIN CT_HOADON ON NGK.MaNGK = CT_HOADON.MaNGK
GROUP BY NGK.TenNGK;
--8
SELECT NGK.TenNGK, SUM(CT_PGH.SLGiao) AS TongSoLuongDat
FROM NGK 
LEFT JOIN CT_PGH ON NGK.MaNGK = CT_PGH.MaNGK
GROUP BY NGK.TenNGK;
--9
SELECT SoDDH, MaNGK, MAX(SLDat) AS SLnhieunhat
FROM CT_DDH
GROUP BY SoDDH, MaNGK
ORDER BY SLnhieunhat DESC;
--10
select NGK.TenNGK from NGK
left join CT_DDH on NGK.MaNGK = CT_DDH.MaNGK
left join DDH on CT_DDH.SoDDH = DDH.SoDDH
where CT_DDH.MaNGK is null or(month(DDH.NgayDH) != 1 and year(DDH.NgayDH) != 2010);
--11
select NGK.TenNGK from NGK
left join CT_HOADON on NGK.MaNGK = CT_HOADON.MaNGK
left join HOADON on CT_HOADON.SoHD = HOADON.SoHD
where month(HOADON.NgaylapHD) = 6 and year(HOADON.NgaylapHD) = 2010 and CT_HOADON.MaNGK is null;
--12
select count(distinct MaNGK) as SoLuongLoaiNGK
from CT_HOADON;
--13
select MaKH, TenKH, SoLanMua
from(
	select KH.MaKH, KH.TenKH, count(HOADON.SoHD) as SoLanMua,
		rank() over (order by count(HOADON.SoHD) desc) as XepHang
	from HOADON
	inner join KH on HOADON.MaKH = KH.MaKH
	group by KH.MaKH, KH.TenKH
) as XepHangKhachHang
where XepHang = 1;
--14
select sum(TongDoanhThu) as TongDoanhThu2010
from(
	select sum(DGBan*SLKHMua) as TongDoanhThu
	from CT_HOADON
	inner join HOADON on CT_HOADON.SoHD = HOADON.SoHD
	where year(NgaylapHD) = 2010
	group by HOADON.SoHD
) as TongDoanhThuNam2010;
--15
select top 5 NGK.MaNGK, NGK.TenNGK, sum(CT_HOADON.SLKHMua*CT_HOADON.DGBan) as DoanhThu
from CT_HOADON
inner join NGK on CT_HOADON.MaNGK = NGK.MaNGK
inner join HOADON on CT_HOADON.SoHD = HOADON.SoHD
where month(HOADON.NgaylapHD) = 5 and year(HOADON.NgaylapHD) = 2010
group by NGK.MaNGK, NGK.TenNGK
order by DoanhThu desc;
--16
select NGK.MaNGK, NGK.TenNGK, sum(CT_HOADON.SLKHMua) as SLBan
from CT_HOADON
inner join NGK on CT_HOADON.MaNGK = NGK.MaNGK
inner join HOADON on CT_HOADON.SoHD = HOADON.SoHD
where month(HOADON.NgaylapHD) = 5 and year(HOADON.NgaylapHD) = 2010
group by NGK.MaNGK, NGK.TenNGK;
--17
select NGK.MaNGK, NGK.TenNGK, sum(distinct CT_HOADON.SLKHMua) as SoNguoiMua
from CT_HOADON
inner join NGK on CT_HOADON.MaNGK = NGK.MaNGK
group by NGK.MaNGK, NGK.TenNGK
order by SoNguoiMua desc;
--18
select max(NgayGH) as [Ngày nhập hàng gần nhất] from PHIEUGH;
--19
select count(*) as [Số lần mua hàng] from HOADON where MaKH = 'KH01';
--20
select SoHD, sum(SLKHMua*DGBan) as [Tổng tiền] from CT_HOADON group by SoHD;
--21
select HOADON.SoHD, HOADON.NgaylapHD, HOADON.MaKH, KH.TenKH, sum(CT_HOADON.SLKHMua * CT_HOADON.DGBan) as TongGiaTri
from HOADON
inner join KH on HOADON.MaKH = KH.MaKH
inner join CT_HOADON on HOADON.SoHD = CT_HOADON.SoHD
group by HOADON.SoHD, HOADON.NgaylapHD, HOADON.MaKH, KH.TenKH
order by HOADON.NgaylapHD asc, TongGiaTri desc;
--22
select HOADON.SoHD, HOADON.NgaylapHD, sum(CT_HOADON.SLKHMua*CT_HOADON.DGBan) as TongGiaTriHoaDon
from HOADON
inner join CT_HOADON on HOADON.SoHD = CT_HOADON.SoHD
where HOADON.NgaylapHD = '2010-06-08'
group by HOADON.SoHD, HOADON.NgaylapHD
having sum(CT_HOADON.SLKHMua*CT_HOADON.DGBan) > (
	select avg(TongGiaTri)
	from(
		select HOADON.SoHD, sum(CT_HOADON.SLKHMua*CT_HOADON.DGBan) as TongGiaTri
		from HOADON
		inner join CT_HOADON on HOADON.SoHD = CT_HOADON.SoHD
		where HOADON.NgaylapHD = '2010-06-08'
		group by HOADON.SoHD
	) as Temp
);
--23
select month(HOADON.NgaylapHD) as Thang, NGK.MaNGK, NGK.TenNGK, sum(CT_HOADON.SLKHMua) as SoLuongTieuThu
from HOADON
inner join CT_HOADON on HOADON.SoHD = CT_HOADON.SoHD
inner join NGK on CT_HOADON.MaNGK = NGK.MaNGK
where year(HOADON.NgaylapHD) = 2010
group by month(HOADON.NgaylapHD), NGK.MaNGK, NGK.TenNGK
order by Thang, SoLuongTieuThu desc;
--24
select NGK.MaNGK, NGK.TenNGK
from NGK
where NGK.MaNGK not in(
	select distinct CT_HOADON.MaNGK
	from CT_HOADON
	inner join HOADON on CT_HOADON.SoHD = HOADON.SoHD
	where year(HOADON.NgaylapHD) = 2010 and month(HOADON.NgaylapHD) = 9
);
--25
select distinct KH.MaKH, KH.TenKH, KH.DCKH
from KH
inner join HOADON on KH.MaKH = HOADON.MaKH
inner join CT_HOADON on HOADON.SoHD = CT_HOADON.SoHD
where KH.DCKH like '%TP.HCM%' and year(HOADON.NgaylapHD) = 2010 and month(HOADON.NgaylapHD) = 9;
--26
select NGK.MaNGK, NGK.TenNGK, sum(CT_HOADON.SLKHMua) as SoLuongBan
from NGK
inner join CT_HOADON on NGK.MaNGK = CT_HOADON.MaNGK
inner join HOADON on CT_HOADON.SoHD = HOADON.SoHD
where year(HOADON.NgaylapHD) = 2010 and month(HOADON.NgaylapHD) = 10
group by NGK.MaNGK, NGK.TenNGK;
--27
select KH.MaKH, KH.TenKH, NGK.MaNGK, NGK.TenNGK, sum(CT_HOADON.SLKHMua) as [Tổng số lượng]
from KH
inner join HOADON on KH.MaKH = HOADON.MaKH
inner join CT_HOADON on HOADON.SoHD = CT_HOADON.SoHD
inner join NGK on CT_HOADON.MaNGK = NGK.MaNGK
group by  KH.MaKH, KH.TenKH, NGK.MaNGK, NGK.TenNGK;
--28
select KH.MaKH, KH.TenKH, count(PHIEUTRANO.SoPTN) as [Số lần trả nợ]
from KH
inner join HOADON on KH.MaKH = HOADON.MaKH
inner join PHIEUTRANO on HOADON.SoHD = PHIEUTRANO.SoHD
where year(PHIEUTRANO.NgayTra) = 2010
group by KH.MaKH, KH.TenKH
order by count(PHIEUTRANO.SoPTN) desc;
--29
select count(*) as SoLuongHoaDonChuaThanhToan
from HOADON
where SoHD not in (select SoHD from PHIEUTRANO);
--30
select HOADON.SoHD, HOADON.MaKH, KH.TenKH, HOADON.NgaylapHD
from HOADON
inner join KH on HOADON.MaKH = KH.MaKH
left join PHIEUTRANO on HOADON.SoHD = PHIEUTRANO.SoHD
where PHIEUTRANO.SoPTN is null
group by HOADON.SoHD, HOADON.MaKH, KH.TenKH, HOADON.NgaylapHD
having count(*) = 1;
--31
select NGK.MaNGK, NGK.TenNGK, sum(CT_DDH.SLDat) as [Tổng số lượng đặt]
from NGK 
inner join CT_DDH on NGK.MaNGK = CT_DDH.MaNGK
inner join DDH on CT_DDH.SoDDH = DDH.SoDDH
where year(DDH.NgayDH) = 2010
group by NGK.MaNGK, NGK.TenNGK; 
--32
select HOADON.MaKH, KH.TenKH, SUM(CT_HOADON.SLKHMua * CT_HOADON.DGBan) as TongSoTienMua
from HOADON
inner join CT_HOADON on HOADON.SoHD = CT_HOADON.SoHD
inner join KH on HOADON.MaKH = KH.MaKH
where year(HOADON.NgaylapHD) = 2010
group by HOADON.MaKH, KH.TenKH
order by TongSoTienMua desc;

