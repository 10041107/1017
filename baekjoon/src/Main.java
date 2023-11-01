import java.util.Scanner;

public class Main {
    /*
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    각 테스트 케이스는 거스름돈 C를 나타내는 정수 하나로 이루어져 있다.
    C의 단위는 센트이다. (1달러 = 100센트) (1<=C<=500)
    각 테스트케이스에 대해 필요한

    거스름돈의 액수가 주어지면
    쿼터의 개수,(Quarter, $0.25) 25
    다임의 개수,(Dime, $0.10) 10
    니켈의 개수,(Nickel, $0.05) 5
    페니의 개수를(Penny, $0.01) 1
    공백으로 구분하여 출력한다.
    예를 들어, $1.24를 거슬러 주어야 한다면,
    손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int money = sc.nextInt();

            if (money < 5) {
                continue;
            } else if (money < 1 || money > 500) {
                continue;
            }
         else {
                int quarter = money / 25; // %=나머지, /=나누기
                int quarterDumb = money % 25;
                int dime = quarterDumb / 10;
                int dimedumb = quarterDumb % 10;
                int nickel = dimedumb / 5;
                int penny = dimedumb % 5;

                System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
            }
        }
    }
}