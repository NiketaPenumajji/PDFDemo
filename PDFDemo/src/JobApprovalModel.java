
public class JobApprovalModel {
	private String hazardClass;
	private String effectiveHeight;
	private String effectiveStorage;
	private String overallHeight;
	private String totalStorage;
	private String storageEffectiveHeight;
	private String contributingDrainageArea;
	private String pipeConduitCapacity;
	private String openChannelSpillwayDesignFlow;
	private String peakInflowDesignStorm;
	private String conduitDiameter;
	private String conduitMaterial;
	private String inletType;
	private String jobApprovalClass;
	private String low;
	private String feet;
	private String Acft;
	private String Feet;
	public String getLow() {
		return low == null ? "Low" : low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getFeet() {
		return feet == null ? "Feet" : feet;
	}
	public void setFeet(String feet) {
		this.feet = feet;
	}
	public String getAcft() {
		return Acft == null ? "Ac-Ft" : Acft;
	}
	public void setAcft(String acft) {
		Acft = acft;
	}
	public String getAcFtxFt() {
		return AcFtxFt == null ? "Ac-Ft Ft" : AcFtxFt;
	}
	public void setAcFtxFt(String acFtxFt) {
		AcFtxFt = acFtxFt;
	}
	public String getSquareMiles() {
		return squareMiles == null ? "Square Miles" : squareMiles;
	}
	public void setSquareMiles(String squareMiles) {
		this.squareMiles = squareMiles;
	}
	public String getCFS() {
		return CFS == null ? "CFS" : CFS;
	}
	public void setCFS(String cFS) {
		CFS = cFS;
	}
	public String getInches() {
		return inches == null ? "Inches" :inches;
	}
	public void setInches(String inches) {
		this.inches = inches;
	}
	private String AcFtxFt;
	private String acres;
	private String squareMiles;
	private String CFS;
	private String inches;
	
	public String getAcres() {
		return acres == null ? "Acres" : acres;
	}
	
	public String getHazardClass() {
		return hazardClass == null ? "Hazard Class" : hazardClass;
	}
	public void setHazardClass(String hazardClass) {
		this.hazardClass = hazardClass;
	}
	public String getEffectiveHeight() {
		return effectiveHeight == null ? "Effective Height" : effectiveHeight;
	}
	public void setEffectiveHeight(String effectiveHeight) {
		this.effectiveHeight = effectiveHeight;
	}
	public String getEffectiveStorage() {
		return effectiveStorage == null ? "Effective Storage" : effectiveStorage;
	}
	public void setEffectiveStorage(String effectiveStorage) {
		this.effectiveStorage = effectiveStorage;
	}
	public String getOverallHeight() {
		return overallHeight == null ? "Overall Height" : overallHeight;
	}
	public void setOverallHeight(String overallHeight) {
		this.overallHeight = overallHeight;
	}
	public String getTotalStorage() {
		return totalStorage == null ? "Total Storage" : totalStorage;
	}
	public void setTotalStorage(String totalStorage) {
		this.totalStorage = totalStorage;
	}
	public String getStorageEffectiveHeight() {
		return storageEffectiveHeight == null ? "Storage x Effective Height" : storageEffectiveHeight;
	}
	public void setStorageEffectiveHeight(String storageEffectiveHeight) {
		this.storageEffectiveHeight = storageEffectiveHeight;
	}
	public String getContributingDrainageArea() {
		return contributingDrainageArea == null ? "Contributing Drainage Area" : contributingDrainageArea;
	}
	public void setContributingDrainageArea(String contributingDrainageArea) {
		this.contributingDrainageArea = contributingDrainageArea;
	}
	public String getPipeConduitCapacity() {
		return pipeConduitCapacity == null ? "Pipe Conduit Capacity" : pipeConduitCapacity;
	}
	public void setPipeConduitCapacity(String pipeConduitCapacity) {
		this.pipeConduitCapacity = pipeConduitCapacity;
	}
	public String getOpenChannelSpillwayDesignFlow() {
		return openChannelSpillwayDesignFlow == null ? "Open Channel Spillway Design Flow" : openChannelSpillwayDesignFlow;
	}
	public void setOpenChannelSpillwayDesignFlow(String openChannelSpillwayDesignFlow) {
		this.openChannelSpillwayDesignFlow = openChannelSpillwayDesignFlow;
	}
	public String getPeakInflowDesignStorm() {
		return peakInflowDesignStorm == null ? "Peak Inflow Aux Spillway Design Storm" : peakInflowDesignStorm;
	}
	public void setPeakInflowDesignStorm(String peakInflowDesignStorm) {
		this.peakInflowDesignStorm = peakInflowDesignStorm;
	}
	public String getConduitDiameter() {
		return conduitDiameter == null ? "Conduit - Inside Diameter" : conduitDiameter;
	}
	public void setConduitDiameter(String conduitDiameter) {
		this.conduitDiameter = conduitDiameter;
	}
	public String getConduitMaterial() {
		return conduitMaterial == null ? "Conduit Material" : conduitMaterial;
	}
	public void setConduitMaterial(String conduitMaterial) {
		this.conduitMaterial = conduitMaterial;
	}
	public String getInletType() {
		return inletType == null ? "Inlet Type" : inletType;
	}
	public void setInletType(String inletType) {
		this.inletType = inletType;
	}
	public String getJobApprovalClass() {
		return jobApprovalClass == null ? "Job Approval Class" : jobApprovalClass;
	}
	public void setJobApprovalClass(String jobApprovalClass) {
		this.jobApprovalClass = jobApprovalClass;
	}
	
	
	
}
