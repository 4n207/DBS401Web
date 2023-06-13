#DBS401Web
- Clone project sau đó vào folder setupFile trong project folder, cắt file build.sh ra ngoài ngang hang với folder DBS401Web.
- Cấp quyền execute cho file: chmod +x build.sh
- Chạy file build.sh: ./build.sh
- Khi file chạy đến phần setup sql server: chọn phiên bản 2 -> chọn Y -> chọn password là Password123@. Và chọn Yes 2 lần trong thông báo tiếp đó khi cài sqlcmd.
- Sau khi script chạy xong, đóng terminal và chạy lại script một lần nữa để build database.
- Tiếp theo, mở Netbeans, mở project. Chọn tab Tools/Servers -> Add server -> chọn Apache Tomcat or TomEE -> chọn Server Location: DBS401Web/other/apache-tomcat-9.0.75 -> setup username và password tùy ý (admin/123) -> Finish -> Chỉnh sever port thành 8081 -> Close
- Run project

