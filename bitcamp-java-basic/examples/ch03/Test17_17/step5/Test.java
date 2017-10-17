// ## 메서드 - 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드 V
// - 메서드를 이용하여 인스턴스를 다루는 방법을 알아보자!
//

package bitcamp.java100.Test17_17.step5;

// 5단계: 넓이를 구하는 메서드를 별도의 클래스로 분류한다. 
public class Test {

    
    
    public static void main(String[] args) {
        // 면적을 구하는 예제
        // 1) 면적을 계산할 때 필요한 데이터를 저장할 변수 선언
        Rect rect; // 인스턴스 주소를 저장할 레퍼런스 선언
        rect = new Rect(); // 인스턴스 생성하고 그 주소를 레퍼런스에 저장한다.

        // 인스턴스의 각 필드(항목)에 값을 저장한다.
        rect.width = 390;
        rect.height = 420;
        
        
        // 2) 너비와 높이를 가지고 넓이를 구한다. 
        // => 평방미터 
        System.out.println(Rect.area(rect));
        
        // => 평 
        System.out.println(Rect.pyeong(rect));
        
    }
}













