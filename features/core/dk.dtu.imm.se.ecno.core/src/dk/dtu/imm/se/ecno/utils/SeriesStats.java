package dk.dtu.imm.se.ecno.utils;

public class SeriesStats {
	
	private int k = 0;
	private double m = 0;
	private double s = 0;
	
	public void addValue(double value) {
		if (k == 0) {
			m = value;
			s = 0;
			k = 1;
		} else {
			double m_old = m;
			m = m + (value - m) / k;
			s = s + (value - m_old)*(value - m);
			k++;
		}
	}
	
	public int numberOfValues() {
		return k;
	}
	
	public double mean() {
		if (k > 0) { 
			return m;
		} else {
			return Double.NaN;
		}
	}
	
	public double standardDeviation() {
		if (k > 1) {
			return Math.sqrt(s/(k-1));
		} else if (k == 1){
			return 0;
		} else {
			return Double.NaN;
		}
	}

}
