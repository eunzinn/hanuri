import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numArr[] = new int[3]; //랜덤으로 뽑은 숫자를 넣기위한 length 3인 빈 배열
        int inputArr[] = new int[3]; // 유저가 입력한 숫자를 넣기위한 length 3인 빈 배열
        int strike = 0; //입력한 값의 strike를 저장받을 변수
        int ball = 0; //입력한 값의 ball을 입력받을 변수

        Scanner s = new Scanner(System.in);
        while(true) {
            //과정2 : inputArr.length만큼 반복해 유저가 입력한 숫자를 순서대로 inputArr에 넣는다.
            for(int i  = 0; i < inputArr.length; i++) {
                System.out.println("1~9사이의 정수를 입력하세요 : "); //console에 안내문 출력
                inputArr[i] = s.nextInt(); // scanner메서드를 이용해 inputArr에 유저가 입력한 숫자 넣기
                for(int j = 0; j < i; j++) {
                    if(inputArr[j] == inputArr[i]) {
                        //유저가 입력한 i인덱스에 들어갈 숫자가 중복된 숫자인지 확인
                        System.out.println("중복된 값을 입력했습니다.");
                        i--;
                        break;
                    }
                }
            }

            System.out.println("추가됨1");
            System.out.println("추가됨2");
            System.out.println("추가됨3");
            System.out.println("추가됨4");
            System.out.println("추가됨5");
            System.out.println("추가됨6");
            System.out.println("추가됨7");
            System.out.println("추가됨8");

            System.out.println(strike + "스트라이크" + ball + "볼");

            strike = 1;
            ball = 2;
        }
    }
}