package TrycatchExample;

public class Tryexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
		
		data1 = args[0];
		data2 = args[1];
		
		System.out.println(data1);
		System.out.println(data2);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("���� �Ű����� ���� �����մϴ�.");
		System.out.println("[���� ���]");
		System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");		
	return;
	}

}
