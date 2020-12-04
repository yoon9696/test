package Test04;

public class ArrayTest6 {

	public static void main(String[] args) { //////맥주를 추가하고 싶을때 //////
		String [] menus = new String[3];
		menus[0]= "아이스크림";
		menus[1] = "치킨";
		menus[2] = "피자";
		
		String [] tmpMenus = menus; //////3 menus
		menus = new String[4]; //////4 menus
		for(int i = 0;i<tmpMenus.length;i++) {
			menus[i] = tmpMenus[i];
		}	
		menus[3] = "맥주";
		
		for(int i = 0; i<menus.length;i++){
			
			System.out.println(menus[i]);
		}
		
	}
}
