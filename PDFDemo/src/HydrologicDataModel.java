
public class HydrologicDataModel {
	private String hydrologicData;
	private String rainfallDistributionType;
	private String drainageArea;
	private String runoffCurveNumber;
	private String concentrationTime;
	private String minutes;
	private String watershedSlope;
	private String flowLength;
	private String spillway;
	private String principal;
	private String auxiliary;
	private String designFrequency;
	private String rainfallIn;
	private String runoff;
	private String peakInflow;
	private String peakOutflow;
	private String userDefinedValue;
	private String min;
	public String getHydrologicData() {
		return hydrologicData == null ? "Hydrologic Data" : hydrologicData;
	}
	public void setHydrologicData(String hydrologicData) {
		this.hydrologicData = hydrologicData;
	}
	public String getRainfallDistributionType() {
		return rainfallDistributionType == null ? "Rainfall distr. type" : rainfallDistributionType;
	}
	public void setRainfallDistributionType(String rainfallDistributionType) {
		this.rainfallDistributionType = rainfallDistributionType;
	}
	public String getDrainageArea() {
		return drainageArea == null ? "Drainage area, acres": drainageArea;
	}
	public void setDrainageArea(String drainageArea) {
		this.drainageArea = drainageArea;
	}
	public String getRunoffCurveNumber() {
		return runoffCurveNumber == null ? "Runoff curve number" : runoffCurveNumber;
	}
	public void setRunoffCurveNumber(String runoffCurveNumber) {
		this.runoffCurveNumber = runoffCurveNumber;
	}
	public String getConcentrationTime() {
		return concentrationTime == null ? "Time of concentration, hrs." : concentrationTime;
	}
	public void setConcentrationTime(String concentrationTime) {
		this.concentrationTime = concentrationTime;
	}
	public String getMinutes() {
		return minutes == null ? "min." : minutes;
	}
	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}
	public String getWatershedSlope() {
		return watershedSlope == null ? "Watershed slope, %" : watershedSlope;
	}
	public void setWatershedSlope(String watershedSlope) {
		this.watershedSlope = watershedSlope;
	}
	public String getFlowLength() {
		return flowLength == null ? "Flow length, ft. -" : flowLength;
	}
	public void setFlowLength(String flowLength) {
		this.flowLength = flowLength;
	}
	public String getSpillway() {
		return spillway == null ? "Spillway" : spillway;
	}
	public void setSpillway(String spillway) {
		this.spillway = spillway;
	}
	public String getPrincipal() {
		return principal == null ? "Principal" : principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getAuxiliary() {
		return auxiliary == null ? "Auxiliary" : auxiliary;
	}
	public void setAuxiliary(String auxiliary) {
		this.auxiliary = auxiliary;
	}
	public String getDesignFrequency() {
		return designFrequency == null ? "Design frequency, yrs. ---- :" : designFrequency;
	}
	public void setDesignFrequency(String designFrequency) {
		this.designFrequency = designFrequency;
	}
	public String getRainfallIn() {
		return rainfallIn == null ? "24 hr. rainfall, in. ----------- :" : rainfallIn;
	}
	public void setRainfallIn(String rainfallIn) {
		this.rainfallIn = rainfallIn;
	}
	public String getRunoff() {
		return runoff == null ? "Runoff, in. -----" : runoff;
	}
	public void setRunoff(String runoff) {
		this.runoff = runoff;
	}
	public String getPeakInflow() {
		return peakInflow == null ? "Peak inflow, CFS ---------- :" : peakInflow;
	}
	public void setPeakInflow(String peakInflow) {
		this.peakInflow = peakInflow;
	}
	public String getPeakOutflow() {
		return peakOutflow == null ? "Peak outflow, CFS -------- :" : peakOutflow;
	}
	public void setPeakOutflow(String peakOutflow) {
		this.peakOutflow = peakOutflow;
	}
	public String getUserDefinedValue() {
		return userDefinedValue == null ? "* - User Defined Value" : userDefinedValue;
	}
	public void setUserDefinedValue(String userDefinedValue) {
		this.userDefinedValue = userDefinedValue;
	}
	public String getMin() {
		return min == null ? "(min." : min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	
}
