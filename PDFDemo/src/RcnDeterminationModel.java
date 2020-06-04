
public class RcnDeterminationModel {
	private String runoffCurveNumberDetermination;
	private String acresandCurvenumbers;
	private String coverDescription;
	private String A;
	public String getRunoffCurveNumberDetermination() {
		return runoffCurveNumberDetermination == null ? "Runoff Curve Number Determination" : runoffCurveNumberDetermination;
	}
	public void setRunoffCurveNumberDetermination(String runoffCurveNumberDetermination) {
		this.runoffCurveNumberDetermination = runoffCurveNumberDetermination;
	}
	public String getAcresandCurvenumbers() {
		return acresandCurvenumbers == null ? "Acres & (Curve Numbers) for Hydrologic Soil Group" : acresandCurvenumbers;
	}
	public void setAcresandCurvenumbers(String acresandCurvenumbers) {
		this.acresandCurvenumbers = acresandCurvenumbers;
	}
	public String getCoverDescription() {
		return coverDescription == null ? "Cover Description" : coverDescription;
	}
	public void setCoverDescription(String coverDescription) {
		this.coverDescription = coverDescription;
	}
	public String getA() {
		return "A";
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return "B";
	}
	public void setB(String b) {
		B = b;
	}
	public String getC() {
		return "C";
	}
	public void setC(String c) {
		C = c;
	}
	public String getD() {
		return "D";
	}
	public void setD(String d) {
		D = d;
	}
	private String B;
	private String C;
	private String D;
	
}
