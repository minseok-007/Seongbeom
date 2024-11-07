package HW5.src;
//정수 배열 arr과 목표 합 target이 주어졌을 때, 배열 내 두 수의 합이 target이 되는 두 인덱스를 찾아 반환하는 함수를 작성해 보세요. 두 인덱스가 없으면 null을 반환합니다.
//예시 입력: arr = {2, 7, 11, 15}, target = 9
//예시 출력: [0, 1] (2 + 7 = 9)
//문자열 내 모든 순열 생성


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int [] findTwoSum(int[] arr, int target){
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int diff = target - arr[i];
            if(numMap.containsKey(diff)){
                return new int [] { numMap.get(diff), i};
            }
            numMap.put(arr[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int [] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(arr, target);
        if(result != null) {
            System.out.println(result[0] + result[1]);
        }else{
            System.out.println("No two sum solution");
        }
    }
}
