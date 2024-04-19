

- App quản lý sản phẩm có các chức năng như:
 + Thêm sản Phẩm.
 + Xoá sản phẩm.
 + Xem sản phẩm.
 + Kiểm tra sản phẩm hiện đang có.
 + Sử dụng Json làm nơi lưu trữ dữ liệu.

về Thêm sản phẩm:
- Thêm id sản phẩm, tên sản phẩm, ngày nhập hàng và giá sản phẩm.
- id sản phẩm là Interger; tên sản phẩm + ngày nhập hàng là String; giá sản phẩm là Double.

về Xoá sản phẩm:
 - Xoá sản phẩm bằng cách nhập id sản phẩm muốn xoá
 - Ở đây do quy định sản phẩm là số nguyên nên chỉ chạy vòng lặp rồi kiểm tra đơn giản rồi xoá.
 
về Xem sản phẩm:
 - Thực hiện chạy vòng lặp để xem sản phẩm có trong arrObj



Cấu trúc của Project:
 - App.java : chạy file hoạt động chính.
  + Sử dụng điều kiện để chạy chương trình.
  + Cân nhắc thay đổi thay đổi thành Switch/Case thay thế.

 - Products.java: chứa các đối tượng.
  + Các Methods:
   -- InputProduct(): Nhập sản phẩm.
   -- OutputProduct(): Xuất sản phẩm.
   -- DeleteProduct(): Xoá sản phẩm.
   -- loadFile(): Cập nhật dữ liệu đã thêm/xoá cho file Products.json.

   
Các chức năng cần thêm trong tương lai:
 + Kiểm tra các điều kiện như trong quá trình nhập sai dữ liệu đầu vào.
 + Kiểm tra phần thêm sản phẩm nếu trùng id thì chức năng xoá sản phẩm dựa trên Id là Interger sẽ hoạt động như thế nào.
 + Kiểm tra người dùng có chắc chắc muốn xoá sản phẩm đó không.
 + Thay đổi từ chạy chương trình từ console thành giao diện trực quan hơn. Có các nút bấm và trường để xem dữ liệu đẹp mắt và dễ dùng hơn.
