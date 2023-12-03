CREATE DATABASE BinhDuNhietG3
--Use master
--Drop database BinhDuNhietG3
Go
USE BinhDuNhietG3
CREATE TABLE MauSac(
    Id INT IDENTITY PRIMARY KEY NOT NULL,
    MaMauSac VARCHAR(10),
    Ten NVARCHAR(20),
)

CREATE TABLE KHUYENMAI
(
    Id int IDENTITY PRIMARY KEY,
    MaKhuyenMai VARCHAR(10),
    GiaTri INT,
    NgayBatDau datetime2,
    NgayKetThuc datetime2,
    KieuGiamGia int,
    TrangThai int
)


CREATE TABLE ThuongHieu(
Id int IDENTITY PRIMARY KEY,
MaThuongHieu VARCHAR(10),
Ten nvarchar(50),
)

CREATE TABLE ChatLieu(
Id int IDENTITY PRIMARY KEY,
MaChatLieu VARCHAR(10),
Ten nvarchar(50)
)

CREATE TABLE KhachHang(
    Id int IDENTITY PRIMARY KEY,
    MaKhachHang VARCHAR(10),
    TenKhachHang    NVARCHAR(50),
    NgaySinh        date,
    SoDienThoai     NVARCHAR(10),
    Email          NVARCHAR(50),
    DiaChi         NVARCHAR(50),
)

CREATE TABLE NhanVien(
Id int IDENTITY PRIMARY KEY,
ChucVu bit,
MaNhanVien nvarchar(50),
Ten nvarchar(50),
NgaySinh date,
SoDienThoai nvarchar(10),
Email  nvarchar(50),
MatKhau  nvarchar(32),
GioiTinh bit,
DiaChi nvarchar(50),
TrangThai bit,
)

CREATE TABLE BinhGiuNhiet(
Id int IDENTITY PRIMARY KEY,
IdThuongHieu int,
IdChatLieu int,
NamSanXuat int,
MaBinhGiuNhiet nvarchar(10),
DungTich int,
Ten nvarchar(50),
UrlAnh varchar(200),
FOREIGN KEY (IdThuongHieu) REFERENCES ThuongHieu(Id),
FOREIGN KEY (IdChatLieu) REFERENCES ChatLieu(Id),
)

CREATE TABLE BinhGiuNhietChiTiet(
Id int IDENTITY PRIMARY KEY,
IdBinhGiuNhiet int,
IdMauSac int,
SoLuong int,
GiaNhap Decimal,
GiaBan Decimal,
TrangThai bit,
FOREIGN KEY (IdBinhGiuNhiet) REFERENCES BinhGiuNhiet(Id),
FOREIGN KEY (IdMauSac) REFERENCES MauSac(Id),
)

CREATE TABLE GioHang(
    Id int IDENTITY PRIMARY KEY,
    MaGioHang VARCHAR(10),
    NgayTao DATETIME2,
    TrangThai BIT,
    IdKhachHang INT,
    FOREIGN KEY (IdKhachHang) REFERENCES KhachHang(Id),
)

CREATE TABLE ChiTietGioHang(
    Id             int IDENTITY PRIMARY KEY,
    IdGioHang      int,
    SoLuong        int,
    IdBinhGiuNhietChiTiet int,
    FOREIGN KEY (IdGioHang) REFERENCES GioHang(Id),
    FOREIGN KEY (IdBinhGiuNhietChiTiet) REFERENCES BinhGiuNhietChiTiet(Id),
)

CREATE TABLE HoaDon(
Id int IDENTITY  PRIMARY KEY,
IdKhachHang int,
IdNhanVien int,
IdkhuyenMai int,
MaDoaDon VARCHAR(10),
TienSauGiamGia DECIMAL,
ThanhTien DECIMAL,
PhuongThucThanhToan bit,
NgayThanhToan datetime2,
FOREIGN KEY (IdKhachHang) REFERENCES KhachHang(Id),
FOREIGN KEY (IdNhanVien) REFERENCES NhanVien(Id),
FOREIGN KEY (IdkhuyenMai) REFERENCES khuyenMai(Id),
)

CREATE TABLE HOADONCHITIET
(
    Id int IDENTITY PRIMARY KEY,
    IdHoaHon int ,
    IdChiTietSanPham int,
    SoLuong int,
    DonGia DECIMAL,
    FOREIGN KEY (IdHoaHon) REFERENCES HoaDon(Id),
    FOREIGN KEY (IdChiTietSanPham) REFERENCES BinhGiuNhietChiTiet(Id),
)

INSERT INTO MauSac (MaMauSac,Ten) Values
('Mau01','Vàng'),
('Mau02','Xanh'),
('Mau03','Đỏ'),
('Mau04','Tím')

INSERT INTO ThuongHieu (MaThuongHieu,Ten) VALUES 
('TH01','Logking'),
('TH02','Bling'),
('TH03','Bình An'),
('TH04','Staff')

INSERT INTO ChatLieu (MaChatLieu,Ten) VALUES 
('CL01','Gốm'),
('CL02','Nhôm'),
('CL03','Nhựa')

INSERT INTO KHUYENMAI (MaKhuyenMai,GiaTri,NgayBatDau,NgayKetThuc,KieuGiamGia,TrangThai) VALUES
('KM01',20,'2022/10/12','2022/10/16',0,1),
('KM02',15,'2022/7/12','2022/7/16',0,0),
('KM03',10,'2022/8/12','2022/8/16',0,1),
('KM04',16,'2022/4/12','2022/4/16',0,0)

INSERT INTO BinhGiuNhiet (IdThuongHieu,IdChatLieu,NamSanXuat,MaBinhGiuNhiet,DungTich,Ten) Values
(1,1,2014,'SP01',2000,'Binh Log&Travel'),
(2,2,2016,'SP02',2200,'Binh Long'),
(3,3,2017,'SP03',1200,'Binh Journey')


INSERT INTO BinhGiuNhietChiTiet (IdBinhGiuNhiet,IdMauSac,SoLuong,GiaNhap,GiaBan,TrangThai) VALUES
(1,1,20,12000,20000,1),
(2,2,30,14100,16000,1),
(3,3,24,12200,16000,1)

INSERT INTO KhachHang (MaKhachHang,TenKhachHang,NgaySinh,SoDienThoai,Email,DiaChi) VALUES 
('KH01','Nguyễn Huy Toàn','2003-08-27','0882137281','toan@gmail.com','Hà nam'),
('KH02','Nguyễn Mạnh Hùng','2003-06-22','0322137281','hung@gmail.com','Hà Tĩnh'),
('KH03','Lê Anh Dũng','2002-04-25','0864213813','dung@gmail.com','Hà nội')


INSERT INTO NhanVien (ChucVu,MaNhanVien,Ten,NgaySinh,SoDienThoai,Email,MatKhau,GioiTinh,DiaChi,TrangThai) VALUES
(0,'NV01','Tuan','2003-10-24','095223419','tuan@gmail.com','123',1,'Ha Noi',0),
(1,'NV02','Nam','2001-09-12','098641271','nam@gmail.com','12',1,'Nam Tu Liem',1),
(1,'NV03','Hoang','2000-08-22','084712231','huang@gmail.com','123',1,'Nam Dinh',0),
(1,'NV04','Tuan Anh','2003-01-15','038741234','yt2410203@gmail.com','1234',0,'Ha Nam',1)


INSERT INTO GioHang (MaGioHang,NgayTao,TrangThai,IdKhachHang) VALUES
('GH01','2022-04-23',1,1),
('GH02','2022-06-22',1,2),
('GH03','2022-05-16',1,3)

INSERT INTO ChiTietGioHang (IdGioHang,SoLuong,IdBinhGiuNhietChiTiet) VALUES
(1,4,1),
(2,2,2),
(3,3,3)

INSERT INTO HoaDon (IdKhachHang,IdNhanVien,IdkhuyenMai,MaDoaDon,TienSauGiamGia,ThanhTien,PhuongThucThanhToan,NgayThanhToan) VALUES
(1,1,1,1,112399,120000,0,'2022-02-12'),
(2,2,2,2,112499,124000,0,'2022-02-14'),
(3,3,3,3,142399,153000,0,'2022-02-15')


INSERT INTO HOADONCHITIET (IdHoaHon,IdChiTietSanPham,SoLuong,DonGia) VALUES
(1,1,2,200000),
(2,2,1,220000),
(3,3,3,250000)