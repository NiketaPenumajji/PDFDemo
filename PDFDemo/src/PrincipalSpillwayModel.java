
public class PrincipalSpillwayModel {
	private String principalSpillwayTrials;
	private String inletType;
	private String inletElevation;
	private String conduit;
	private String diameterIn;
	private String heightIn;
	private String widthIn;
	private String manningsIn;
	private String inletExt;
	private String lengthFt;
	private String trial1;
	private String trial2;
	private String trial3;
	private String entranceCoefficient;
	private String riserType;
	private String lengthIn;
	private String weirLength;
	private String crestRadius;
	private String invertElevation;
	private String drawdownTimeInfo;
	private String exceedsMaxValue;
    private String principalSpillwayElev;
	private String inlet;
	private String outlet;
	private String channel;

	public String getPrincipalSpillwayTrials() {
		return principalSpillwayTrials == null ? "PRINCIPAL SPILLWAY TRIALS" : principalSpillwayTrials;
	}
	public void setPrincipalSpillwayTrials(String principalSpillwayTrials) {
		this.principalSpillwayTrials = principalSpillwayTrials;
	}
	public String getInletType() {
		return inletType == null ? "Inlet Type" : inletType;
	}
	public void setInletType(String inletType) {
		this.inletType = inletType;
	}
	public String getInletElevation() {
		return inletElevation == null ? "Inlet Elevation" : inletElevation;
	}
	public void setInletElevation(String inletElevation) {
		this.inletElevation = inletElevation;
	}
	public String getConduit() {
		return conduit == null ? "Conduit : Type" : conduit;
	}
	public void setConduit(String conduit) {
		this.conduit = conduit;
	}
	public String getDiameterIn() {
		return diameterIn == null ? "Diameter, in" : diameterIn;
	}
	public void setDiameterIn(String diameterIn) {
		this.diameterIn = diameterIn;
	}
	public String getHeightIn() {
		return heightIn == null ? "Height, in." : heightIn;
	}
	public void setHeightIn(String heightIn) {
		this.heightIn = heightIn;
	}
	public String getWidthIn() {
		return widthIn == null ? "Width, in," : widthIn;
	}
	public void setWidthIn(String widthIn) {
		this.widthIn = widthIn;
	}
	public String getManningsIn() {
		return manningsIn == null ? "Mannings, n." : manningsIn;
	}
	public void setManningsIn(String manningsIn) {
		this.manningsIn = manningsIn;
	}
	public String getInletExt() {
		return inletExt == null ? "Inlet ext., ft." : inletExt;
	}
	public void setInletExt(String inletExt) {
		this.inletExt = inletExt;
	}
	public String getLengthFt() {
		return lengthFt == null ? "Length ft." : lengthFt;
	}
	public void setLengthFt(String lengthFt) {
		this.lengthFt = lengthFt;
	}
	public String getTrial1() {
		return trial1 == null ? "TRIAL 1" : trial1;
	}
	public void setTrial1(String trial1) {
		this.trial1 = trial1;
	}
	public String getTrial2() {
		return trial2 == null ? "TRIAL 2" : trial2;
	}
	public void setTrial2(String trial2) {
		this.trial2 = trial2;
	}
	public String getTrial3() {
		return trial3 == null ? "TRIAL 3" : trial3;
	}
	public void setTrial3(String trial3) {
		this.trial3 = trial3;
	}
	public String getEntranceCoefficient() {
		return entranceCoefficient == null ? "Entrance Coefficient, Ke" : entranceCoefficient;
	}
	public void setEntranceCoefficient(String entranceCoefficient) {
		this.entranceCoefficient = entranceCoefficient;
	}
	public String getRiserType() {
		return riserType == null ? "RISER : Type" : riserType;
	}
	public void setRiserType(String riserType) {
		this.riserType = riserType;
	}
	public String getLengthIn() {
		return lengthIn == null ? "Length, in" : lengthIn;
	}
	public void setLengthIn(String lengthIn) {
		this.lengthIn = lengthIn;
	}
	public String getWeirLength() {
		return weirLength == null ? "Weir length, in." : weirLength;
	}
	public void setWeirLength(String weirLength) {
		this.weirLength = weirLength;
	}
	public String getCrestRadius() {
		return crestRadius == null ? "Crest radius, in." : crestRadius;
	}
	public void setCrestRadius(String crestRadius) {
		this.crestRadius = crestRadius;
	}
	public String getInvertElevation() {
		return invertElevation == null ? "Invert elevation" : invertElevation;
	}
	public void setInvertElevation(String invertElevation) {
		this.invertElevation = invertElevation;
	}
	public String getAuxiliaryElevation() {
		return auxiliaryElevation == null ? "Auxiliary elevation" : auxiliaryElevation;
	}
	public void setAuxiliaryElevation(String auxiliaryElevation) {
		this.auxiliaryElevation = auxiliaryElevation;
	}
	public String getStorage() {
		return storage == null ? "STORAGE (ac. ft.)" : storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getTemporary() {
		return temporary == null ? "TEMPORARY (PS-AS)" : temporary;
	}
	public void setTemporary(String temporary) {
		this.temporary = temporary;
	}
	public String getTotalAuxiliary() {
		return totalAuxiliary == null ? "Total at Auxiliary" : totalAuxiliary;
	}
	public void setTotalAuxiliary(String totalAuxiliary) {
		this.totalAuxiliary = totalAuxiliary;
	}
	public String getEffectiveheight() {
		return effectiveheight == null ? "Effective height, ft." : effectiveheight;
	}
	public void setEffectiveheight(String effectiveheight) {
		this.effectiveheight = effectiveheight;
	}
	public String getHeightStorage() {
		return heightStorage == null ? "Height x storage" : heightStorage;
	}
	public void setHeightStorage(String heightStorage) {
		this.heightStorage = heightStorage;
	}
	public String getDrawdownTime() {
		return drawdownTime == null ? "Drawdown time, days-hrs." : drawdownTime;
	}
	public void setDrawdownTime(String drawdownTime) {
		this.drawdownTime = drawdownTime;
	}
	public String getTrialUsed() {
		return trialUsed == null ? "Trial used" : trialUsed;
	}
	public void setTrialUsed(String trialUsed) {
		this.trialUsed = trialUsed;
	}
	public String getConduitTypes() {
		return conduitTypes == null ? "CONDUIT TYPES" : conduitTypes;
	}
	public void setConduitTypes(String conduitTypes) {
		this.conduitTypes = conduitTypes;
	}
	public String getDrawdownTimeInfo() {
		return drawdownTimeInfo == null ? "The drawdown time could not be determined" : drawdownTimeInfo;
	}
	public void setDrawdownTimeInfo(String drawdownTimeInfo) {
		this.drawdownTimeInfo = drawdownTimeInfo;
	}
	public String getExceedsMaxValue() {
		return drawdownTimeInfo == null ? "Exceeds max. value allowed in NRCS Conservation Practice Std. 378 (Pond)." : exceedsMaxValue;
	}
	public void setExceedsMaxValue(String exceedsMaxValue) {
		this.exceedsMaxValue = exceedsMaxValue;
	}
        public String getPrincipalSpillwayElev() {
		return principalSpillwayElev == null ? "Principal Spillway Elevs." : principalSpillwayElev;
	}
	public void setPrincipalSpillwayElev(String principalSpillwayElev) {
		this.principalSpillwayElev = principalSpillwayElev;
	}
	public String getInlet() {
		return inlet == null ? "INLET" : inlet;
	}
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	public String getOutlet() {
		return outlet == null ? "OUTLET" : outlet;
	}
	public void setOutlet(String inletElevation) {
		this.outlet = outlet;
	}
	public String getChannel() {
		return channel == null ? "CHANNEL" : channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	private String auxiliaryElevation;
	private String storage;
	private String temporary;
	private String totalAuxiliary;
	private String effectiveheight;
	private String heightStorage;
	private String drawdownTime;
	private String trialUsed;
	private String conduitTypes;
	
}
