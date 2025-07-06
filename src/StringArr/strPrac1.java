package StringArr;

public class strPrac1 {
    public static void main(String[] args) {
        String text = "banana";

        //문자열 인덱싱
        char ch1 = text.charAt(0);
        char ch2 = text.charAt(1);

        System.out.println("index0 : "+ch1);
        System.out.println("index1 : "+ch2);
        System.out.println();

        //문자열의 주요 메소드

        //문자열의 길이 알아내기
        int l = text.length();

        System.out.println("length = "+l);
        System.out.println();

        //문자열 자르기
        String t1 = "Hello World!";
        String sub1 = t1.substring(6);
        String sub2 = t1.substring(0,6);

        System.out.println("sub1 = "+sub1);
        System.out.println("sub2 = "+sub2);
        System.out.println();

        //대소문자 변환 및 양쪽 공백제거
        String paragraph = "    et efficitur lacinia.   ";
        String Up = paragraph.toUpperCase();
        String Down = paragraph.toLowerCase();
        String Tr = paragraph.trim();

        System.out.println("Up = "+Up);
        System.out.println("Down = "+Down);
        System.out.println("Trim= "+Tr);

    }
}
