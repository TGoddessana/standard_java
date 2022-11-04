package StandardJava.Chapter02;

/**
 * 기본형 : 8개의 타입이 있다. 논리형, 문자형, 정수형, 실수형으로 구분된다.
 */
public class PrimitiveType {

    public static void main(String[] args) {
        /* boolean : 논리형
         * - true, false 만 저장 가능, 2byte 차지
         * */
        boolean amIStrong = true;
        boolean amIWeak = false;
        System.out.println("am i strong ? : " + amIStrong);
        System.out.println("am i weak ? : " + amIWeak);

        /* char : 문자형
         * 유니코드를 사용하므로, 2byte 차지
         * */
        char myGrade = 'A';
        System.out.println("my grade is : " + myGrade);

        /* byte : 정수형
         * - 1byte 차지
         * */
        byte someByte = 100;
        System.out.println(someByte);

        /* short : 정수형
         * - 2byte 차지
         * */
        short someShort = 1000;
        System.out.println(someShort);

        /* int : 정수형
         * - 4byte 차지
         * */
        int someInt = 1000;
        System.out.println(someInt);

        /* long : 정수형
         * - 8byte 차지
         *  */
        long someLong = 1000000000L;
        System.out.println(someLong);

        /* float : 실수형
         * - 4byte 차지
         * - 접미사 'f' 붙어야 함
         *  */
        float someFloat = 1000000000f;
        System.out.println(someFloat);

        /* double : 실수형
         * - 8byte 차지
         * - 접미사 'd' 생략 가능
         *  */
        double someDouble = 1000000000d;
        double someDoubleWithoutSuffix = 1229122912291229d;
        System.out.println(someDouble);
        System.out.println(someDoubleWithoutSuffix);


    }
}