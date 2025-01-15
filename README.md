# Saucedemo Selenium Test Project
## Mô tả
Dự án này là bộ kiểm thử tự động cho trang web **Saucedemo** bằng Selenium và JUnit.

## Cài đặt
1. Cài đặt Maven và Selenium.
3. Chạy `mvn test` để thực hiện các bài kiểm thử.

## Các bài kiểm thử
- Kiểm thử đăng nhập hợp lệ và không hợp lệ.
- Kiểm thử hiển thị danh sách sản phẩm sau khi đăng nhập thành công.

## Kịch bản kiểm thử
### 1. Kiểm thử đăng nhập với thông tin hợp lệ
#### Mục tiêu:
Xác minh rằng người dùng có thể đăng nhập thành công với thông tin hợp lệ. 
#### Bước thực hiện
1. Mở trình duyệt Chrome. Truy cập vào trang https://www.saucedemo.com/.
2. Nhập tên đăng nhập: "standard_user".
3. Nhập mật khẩu: "secret_sauce".
4. Nhấn nút đăng nhập. Kiểm tra xem người dùng đã đăng nhập thành công chưa.

#### Kết quả mong đợi:
- Người dùng được chuyển hướng đến trang danh sách sản phẩm.
- Không xuất hiện thông báo lỗi.
### 2. Kiểm thử: Đăng nhập thất bại với thông tin không hợp lệ
#### Mục tiêu: 
Đảm bảo hệ thống hiển thị thông báo lỗi khi người dùng nhập sai thông tin đăng nhập.
#### Bước thực hiện
  1. Mở trình duyệt Chrome.
  2. Truy cập vào trang https://www.saucedemo.com/.
  3. Nhập tên đăng nhập: "invalid_user".
  4. Nhập mật khẩu: "invalid_pass".
  5. Nhấn nút đăng nhập.
#### Kết quả mong đợi:
  - Hiển thị thông báo lỗi: "Epic sadface: Username and password do not match any user in this service".
  - Người dùng không được chuyển hướng đến trang khác.

### 3. Kiểm thử: Thêm sản phẩm vào giỏ hàng
#### Mục tiêu: 
Xác minh người dùng có thể thêm sản phẩm vào giỏ hàng sau khi đăng nhập thành công.
#### Bước thực hiện
  1. Đăng nhập với tài khoản hợp lệ: "standard_user" / "secret_sauce".
  2. Nhấn vào nút "Add to cart" của sản phẩm "Sauce Labs Back.
  3. Nhấn vào biểu tượng giỏ hàng.
#### Kết quả mong đợi:
- Sản phẩm "Sauce Labs Backpack" xuất hiện trong giỏ hàng.
- Không xuất hiện thông báo lỗi.
  
## Đầu ra
![image](https://github.com/user-attachments/assets/93c7ada5-bc04-4d95-932b-a0612b3f9a9c)

## Nguồn
https://chatgpt.com/share/67863c69-f628-8007-9a22-83698b00f20d
## Tác giả
Nguyễn Diệu Linh
