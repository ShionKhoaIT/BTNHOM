
public class Group8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group8 gr = new Group8();
		System.out.println("Tổng 2 số nguyên là: "+gr.Tong(2,5) );
		System.out.println("Tổng 2 số nguyên là: "+gr.Hieu(8,3));
	}
	public int Tong(int a, int b) {
		return a+b;
	}
	public int Hieu(int a, int b) {
		return a-b;
	}
}
