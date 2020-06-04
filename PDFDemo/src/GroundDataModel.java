
public class GroundDataModel {
	private String groundData;
	private String sta;
	private String hi;
	private String practice;
	public String getGroundData() {
		return groundData == null ? "GROUND DATA" : groundData;
	}
	public void setGroundData(String groundData) {
		this.groundData = groundData;
	}
	public String getSta() {
		return sta == null ? "STA" : sta;
	}
	public void setSta(String sta) {
		this.sta = sta;
	}
	public String getHi() {
		return hi == null ? "HI" : hi;
	}
	public void setHi(String hi) {
		this.hi = hi;
	}
	public String getSlope() {
		return slope == null ? "%SLOPE" : slope;
	}
	public void setSlope(String slope) {
		this.slope = slope;
	}
	public String getDist() {
		return dist == null ? "(FS OR ELEV)/ DIST" : dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getPractice() {
		return practice == null ? "PRACTICE: " : practice;
	}
	public void SetPractice(String practice) {
		this.practice = practice;
	}
	private String slope;
	private String dist;
}
