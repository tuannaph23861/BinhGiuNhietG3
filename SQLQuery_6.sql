CREATE DATABASE BinhDuNhietG3

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
MaDoaDon int,
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
    IdHoaHon int REFERENCES HoaDon(Id),
    IdChiTietSanPham int,
    SoLuong int,
    DonGia DECIMAL,
    FOREIGN KEY (IdHoaHon) REFERENCES HoaDon(Id),
    FOREIGN KEY (IdChiTietSanPham) REFERENCES BinhGiuNhietChiTiet(Id),
)