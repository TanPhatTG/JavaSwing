package Interface;

public class MayTinhCasioFX500 implements MayTinhBoTui{

	@Override
	public double Cong(double a, double b) {
		return a+b;

	}

	@Override
	public double Tru(double a, double b) {
		return a-b;
	}

	@Override
	public double Nhan(double a, double b) {
		return a*b;

	}

	@Override
	public double Chia(double a, double b) {
		return a/b;

	}
}
