package num_1212;

public class Change {
	public String w;
	private int a;
	private String sum="";
	
	public Change() {
		
	}
	public Change(String w) {
		this.a = Integer.parseInt(w);
	}
	
	public void setA(int a) {
		this.a = a;
		while(true) {
			this.sum += this.a%2;
			this.a = this.a/2;
			if(this.a == 0) {
				break;
			}
		}
	}
	
	public void setW(String w) {
		this.a = Integer.parseInt(w);
		while(true) {
			this.sum += this.a%2;
			this.a = this.a/2;
			if(this.a == 0) {
				break;
			}
		}
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	public int getA() {
		return a;
	}

	public String getW() {
		return w;
	}
	public String getSum() {
		return sum;
	}
	
	public void info() {
		System.out.println(sum);
	}
	
}
