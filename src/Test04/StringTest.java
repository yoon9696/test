package Test04;

public class StringTest {

	public static void main(String[] args) {
		String str = "가나다라마바사";
		System.out.println(str.length()); ////글자수구하는거       7 
		System.out.println(str.indexOf("카"));/// 그 글자가 원하는 위치를 숫자로         -1("카"가 없으니 )
		System.out.println(str.substring(1,3));//// 지정하는 위치부터 글로 나옴         다라마바사
		System.out.println(str.contains("차"));////지정한게 포함하고있는지        false
		System.out.println(str.replace("가나","우리"));////// "가나" 를 "우리" 로 바꾼다 .. str을 바꾸는게 아니다 .출력만 바꾼다 .
		                                             // str = str.replace("가나","우리 ") 로 해야 완전히 바뀐다.
		str = "  하이  ";
		System.out.println(str.trim());           //양옆 공백을 없애준다. 글자 사이에 있는 공백은 x  ..str자체를 바꾸는건 아니다 .
												  // str = str.trim(); 완전히 바꿀려면 이렇게 입렵
		
	}
}
