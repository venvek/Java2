package obj;

import java.lang.reflect.Member;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1= new Member("blue");
		Member obj2 = obj1;
		Member obj3= new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}
}
