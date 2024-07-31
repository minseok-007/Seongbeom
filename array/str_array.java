package array;

public class str_array {
    public static void main(String[] args) {
        String name = "Seongbeom";
        System.out.println(name);

        String [] names = new String[3];
        names[0] = "Seongbeom";
        names[1] = "Minseok";
        names[2] = "JeongHwan";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // String 클래스는 char 배열에 기능을 추가한 것
        String str = "Java";
        str = str + " is Fun"; // concatenation
        System.out.println(str);

        String country = "Korea";
        System.out.println(country.charAt(0));
        System.out.println(country.length());
        System.out.println(country.substring(1));
        System.out.println(country.substring(1,3));

        // Instead of using ==, string should be compared using .equals method
        System.out.println("Seongbeom".equals("Seongbeom"));

        /* String 클래스의 주요 메소드
        char charAt(int index): 문자열에서 해당 index 에 있는 문자를 반환
        int length(): 문자의 길이 반환
        String substring(int from, int to): 문자열에서 해당 범위에 있는 문자열을 반환 (to - 1) / to 가 없으면 끝까지 다.
        boolean equals(String str): 문자열의 내용이 같은지 확인한다. 같으면 true, 다르면 false
        char[] toCharArray(): 문자열을 문자배열로 변환해서 반환
         */

        char [] chArr = {'A', 'B', 'C'};
        String word = new String(chArr);
        System.out.println(word);
        char [] temp = word.toCharArray();
        System.out.println(temp[0]);
    }
}
