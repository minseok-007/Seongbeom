package HW6;
//정수가 주어질 때, 해당 숫자를 뒤집어서 반환하는 메서드를 작성하세요. (음수도 고려하세요.)
//예시 입력: 123
//예시 출력: 321
//예시 입력: -456
//예시 출력: -654

public class 숫자뒤집기 {
    public static int reverse(int number){
//    int absNumber = Math.abs(number);
//    String reversdStr = new StringBuilder(String.valueOf(absNumber)).reverse().toString();
//    int reversedNumber = Integer.parseInt(reversdStr);
//
//    if (number < 0){
//        reversedNumber = -reversedNumber;
//        }
//    return reversedNumber;

        // 0
        // 321
        int sign = number < 0 ? - 1 : 1;
        number = Math.abs(number);
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber * sign;

    }
    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(reverse(-456));
    }
}
