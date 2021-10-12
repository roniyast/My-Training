package training.interfacee;

public class HDFC implements RBI {

	private float maturityValue;

	@Override
	public void recurringDeposit(Float amount, float duration) {

		float maturityCalculation = amount * ((1 + INTEREST_RATE / 100) * (duration));
		setMaturityValue(maturityCalculation);

	}

	public void display() {

		System.out.println("Maturity value " + getMaturityValue());

	}

	public float getMaturityValue() {
		return maturityValue;
	}

	public void setMaturityValue(float maturityValue) {
		this.maturityValue = maturityValue;
	}
}
