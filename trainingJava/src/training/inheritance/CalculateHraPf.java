package training.inheritance;

public class CalculateHraPf extends Employee {

	private float hra;
	private float pf;

	public void calculateValues(float x) {
		float hra = (5 * x) / 100;
		float pf = (20 * x) / 100;
		
		setHra(hra);
		setPf(pf);

	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}
}
