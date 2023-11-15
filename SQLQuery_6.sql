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
IdThuongHieu int REFERENCES ThuongHieu(Id),
IdChatLieu int REFERENCES ChatLieu(Id),
NamSanXuat int,
MaBinhGiuNhiet nvarchar(10),
DungTich int,
Ten nvarchar(50),
UrlAnh varchar(200),
)

CREATE TABLE BinhGiuNhietChiTiet(
Id int IDENTITY PRIMARY KEY,
IdBinhGiuNhiet int REFERENCES BinhGiuNhiet (Id),
idMauSac int REFERENCES MauSac(Id),
SoLuong int,
GiaNhap Decimal,
GiaBan Decimal,
TrangThai bit,
)

CREATE TABLE GioHang(
    Id int IDENTITY PRIMARY KEY,
    MaGioHang VARCHAR(10),
    NgayTao DATETIME2,
    TrangThai BIT,
    IdKhachHang INT REFERENCES KhachHang(Id)
)

CREATE TABLE ChiTietGioHang(
    Id             int IDENTITY PRIMARY KEY,
    IdGioHang      int REFERENCES GioHang(Id),
    SoLuong        int,
    IdBinhGiuNhietChiTiet int REFERENCES BinhGiuNhietChiTiet(Id),
)

CREATE TABLE HoaDon(
Id int IDENTITY  PRIMARY KEY,
IdKhachHang int REFERENCES KhachHang(Id),
IdNhanVien int REFERENCES NhanVien(Id),
IdkhuyenMai int REFERENCES khuyenMai(Id),
MaDoaDon int,
TienSauGiamGia DECIMAL,
ThanhTien DECIMAL,
PhuongThucThanhToan bit,
NgayThanhToan datetime2
)

CREATE TABLE HOADONCHITIET
(
    Id int IDENTITY PRIMARY KEY,
    IdHoaHon int REFERENCES HoaDon(Id),
    IdChiTietSanPham int REFERENCES BinhGiuNhietChiTiet(Id),
    SoLuong int,
    DonGia DECIMAL
)