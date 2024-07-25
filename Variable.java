public class Variable {
    public static void main(String[] args) {
        int age = 16;
        int age_minseok;
        age_minseok = 23;

        int a,b;

        int x = 0, y = 0;

        //System.out.println(age_minseok);

        age = age + 1; // age == 17
        //System.out.println(age);

        int c = 10;
        int d = 20;

        int temp = 0; // temporary value

        temp = c;
        c = d; // c = 20
        d = temp;
        System.out.println(c);
        System.out.println(d);

        // Variable Naming Principle
        /*
        1. 대소문자 구분 (age and Age is different variable)
        2. 예약어 사용 X (true, static, public, int...)
        3. 숫자로 시작 X
        4. 특수문자는 _ 와 $만 허용
         */

        /*
        권장하는 내용
        1. 클래스 이름의 첫 글자는 항상 대문자로
        2. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 (nameOfSchool)
         */
    }
}
