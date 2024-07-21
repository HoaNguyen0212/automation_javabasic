public class Calculator {

    public static int tong2SoNguyen(int number1, int number2) {
        return number1 + number2;
    }
    public static float tong2SoThuc(float number1, float number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {

        //Tổng 2 số nguyên
        System.out.println("Tổng 2 số nguyên là: "+tong2SoNguyen(2,12));

        //Tổng 2 số thực
        System.out.println("Tổng 2 số thực là: "+tong2SoThuc(20.5F, 79.5F));
    }

}
