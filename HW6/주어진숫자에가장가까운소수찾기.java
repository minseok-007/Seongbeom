package HW6;
//정수가 주어졌을 때, 해당 숫자에 가장 가까운 소수를 반환하는 메서드를 작성하세요. (동일한 거리의 소수가 있으면 더 작은 숫자를 반환)
//예시 입력: 10
//예시 출력: 11

public class 주어진숫자에가장가까운소수찾기 {
    public static int nearestPrimeNumber(int num) {
        if (num <= 1) return 2;

        int low = num - 1; // 9
        int high = num + 1; // 11
        if (isPrime(num)) return num;

        while(true) {
            if (low > 1 && isPrime(low)) return low;
            if (isPrime(high)) return high;
            low--;
            high++;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nearest = nearestPrimeNumber(10);
        System.out.println(nearest);

    }
}
