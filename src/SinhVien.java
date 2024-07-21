public class SinhVien {

    public void Infor() {
        String name = "Hoa"; //Biến cục bộ
        System.out.println("Thông tin đầy đủ của " + name + ":");
    }

    //Biến Toàn cục - instance
    int age = 22;
    String phone = "0826763234";

    //Biến static
    public static int height = 158;
    public static double weight = 51.5;

    public static void main(String[] args) {
        //Khởi tạo
        SinhVien sv = new SinhVien();

        sv.Infor();
        //Biến cục bộ - Local
        String firstName = "Hoa";
        String middleName = "Thị";
        String lastName = "Nguyễn";

        //In ra biến cục bộ
        System.out.println("Họ: " + lastName + "\nTên đệm: " + middleName + "\nTên: " + firstName);


        //In ra biến toàn cục
        System.out.println("Tuổi: " + sv.age);


        //In ra biến static
        System.out.println("Chiều cao: " + height + " cm");
        System.out.println("Cân nặng: " + weight + " kg");

        //In ra biến static ở class khác
        System.out.println("Tên công ty: " + ThongTin.company);
        System.out.println("Địa chỉ công ty: " + ThongTin.address);
    }
}
