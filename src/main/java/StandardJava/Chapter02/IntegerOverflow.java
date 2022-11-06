package StandardJava.Chapter02;


/**
 * 연산 과정에서, 해당 타입이 표현할 수 있는 값의 범위를 넘어서는 것을 오버플로우라 한다.
 */
public class IntegerOverflow {

    public static void main(String[] args) {
        /* byte 형 임의의 정수가 있다고 가정하자. 값은 127로 할당하였다.
         * 해당 자료형에는 127 까지 저장될 수 있다.
         * 그 임의의 정수에 1을 더한다면, 오버플로우가 발생해 해당 자료형이 나타낼 수 있는 최솟값이 할당될 것이다.
         * */
        byte someByte = 127;
        System.out.println("오버플로우 이전 : " + someByte);

        // 오버플로우가 일어나기 전의 2진수 값
        int byteToBinary = Integer.parseInt(Integer.toBinaryString(someByte));
        System.out.printf("%032d%n", Integer.parseInt(String.valueOf(byteToBinary)));

        System.out.println("--------------------------------");

        // 오버플로우 발생
        someByte = (byte) (someByte + 1);

        // 오버플로우가 일어나고 나서의 2진수 값
        String byteToString = Integer.toBinaryString(someByte);
        System.out.printf("%32s%n", byteToString);

        // 오버플로우 이후
        System.out.println("오버플로우 이후 : " + someByte);

    }
}
