package StringArr;

public class strPrac2 {
    public static void main(String[] args) {
        //특정 문자열 대체
        String str = "Hello World!";
        String newStr = str.replace("Hello", "Bye");

        System.out.println("old string : "+str);
        System.out.println("new string : "+newStr);
        System.out.println();

        //문자열 찾기
        String str1 = "Aliquam ultricies nunc.";
        System.out.println(str1.indexOf("n")); //가장 처음 등장한 위치의 시작 인덱스 반환
        System.out.println(str1.indexOf("banana")); //찾지 못하면 -1 반환

        String str2 = "Duis accumsan commodo augue ac venenatis.";
        System.out.println(str2.lastIndexOf("ac")); //마지막으로 등장한 위치의 시작 인덱스 반환



    }
}
