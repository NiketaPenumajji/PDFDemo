import org.apache.commons.lang3.StringUtils;

public class AuxiliarySpillwayModel {
	private String auxiliarySpillwayDetails;
	private String dischargeDetermination;
	private String auxiliaryElev;
	private String bottomWidth;
	private String flowDepth;
	private String exitChannel;
	private String maxVel;
	private String retardance;
	public String getAuxiliarySpillwayDetails() {
		return auxiliarySpillwayDetails == null ? "AUXILIARY SPILLWAY DETAILS" : auxiliarySpillwayDetails;
	}
	public void setAuxiliarySpillwayDetails(String auxiliarySpillwayDetails) {
		this.auxiliarySpillwayDetails = auxiliarySpillwayDetails;
	}
	public String getDischargeDetermination() {
		return dischargeDetermination == null ? "Discharge determination" : dischargeDetermination;
	}
	public void setDischargeDetermination(String dischargeDetermination) {
		this.dischargeDetermination = dischargeDetermination;
	}
	public String getAuxiliaryElev() {
		return auxiliaryElev == null ? StringUtils.rightPad("Auxiliary elev.", 30) : auxiliaryElev;
	}
	public void setAuxiliaryElev(String auxiliaryElev) {
		this.auxiliaryElev = auxiliaryElev;
	}
	public String getBottomWidth() {
		return bottomWidth == null ? StringUtils.rightPad("Bottom width, ft.", 30) : bottomWidth;
	}
	public void setBottomWidth(String bottomWidth) {
		this.bottomWidth = bottomWidth;
	}
	public String getFlowDepth() {
		return flowDepth == null ? StringUtils.rightPad("Flow depth, ft.", 30) : flowDepth;
	}
	public void setFlowDepth(String flowDepth) {
		this.flowDepth = flowDepth;
	}
	public String getExitChannel() {
		return exitChannel == null ? "EXIT CHANNEL" : exitChannel;
	}
	public void setExitChannel(String exitChannel) {
		this.exitChannel = exitChannel;
	}
	public String getMaxVel() {
		return maxVel == null ? StringUtils.rightPad("Max. vel., fps", 30) : maxVel;
	}
	public void setMaxVel(String maxVel) {
		this.maxVel = maxVel;
	}
	public String getRetardance() {
		return retardance == null ? StringUtils.rightPad("Retardance", 30) : retardance;
	}
	public void setRetardance(String retardance) {
		this.retardance = retardance;
	}
	public String getLevelSect() {
		return levelSect == null ? StringUtils.rightPad("Level sect. length, ft.", 30) : levelSect;
	}
	public void setLevelSect(String levelSect) {
		this.levelSect = levelSect;
	}
	public String getSideSlopeRatio() {
		return sideSlopeRatio == null ? StringUtils.rightPad("Side slope ratio, n:1", 30) : sideSlopeRatio;
	}
	public void setSideSlopeRatio(String sideSlopeRatio) {
		this.sideSlopeRatio = sideSlopeRatio;
	}
	public String getFlowCfs() {
		return flowCfs == null ? "Flow, Cfs" : flowCfs;
	}
	public void setFlowCfs(String flowCfs) {
		this.flowCfs = flowCfs;
	}
	public String getSettledFillElev() {
		return settledFillElev == null ? StringUtils.rightPad("Settled fill elev:", 20) : settledFillElev;
	}
	public void setSettledFillElev(String settledFillElev) {
		this.settledFillElev = settledFillElev;
	}
	public String getChannelElev() {
		return channelElev == null ? "Channel elev. (downstream toe):" : channelElev;
	}
	public void setChannelElev(String channelElev) {
		this.channelElev = channelElev;
	}
	public String getExitSlope() {
		return exitSlope == null ? "Exit slope, % --- Min:" : exitSlope;
	}
	public void setExitSlope(String exitSlope) {
		this.exitSlope = exitSlope;
	}
	public String getDrawdownTime() {
		return drawdownTime == null ? "Drawdown time, days-hrs" : drawdownTime;
	}
	public void setDrawdownTime(String drawdownTime) {
		this.drawdownTime = drawdownTime;
	}
	public String getAuxSpillwayTopOfDam() {
		return auxSpillwayTopOfDam == null ? "(Aux. spillway flow at top of the dam)" : auxSpillwayTopOfDam;
	}
	public void setAuxSpillwayTopOfDam(String auxSpillwayTopOfDam) {
		this.auxSpillwayTopOfDam = auxSpillwayTopOfDam;
	}
	public String getOverallHeight() {
		return overallHeight == null ? "Overall height, ft." : overallHeight;
	}
	public void setOverallHeight(String overallHeight) {
		this.overallHeight = overallHeight;
	}
	public String getMax() {
		return max == null ? "Max." : max;
	}
	public void setmax(String max) {
		this.max = max;
	}
	private String levelSect;
	private String sideSlopeRatio;
	private String flowCfs;
	private String settledFillElev;
	private String channelElev;
	private String exitSlope;
	private String drawdownTime;
	private String auxSpillwayTopOfDam;
	private String overallHeight;
	private String max;
	
}
