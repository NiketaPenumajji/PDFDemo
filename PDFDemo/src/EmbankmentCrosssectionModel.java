
public class EmbankmentCrosssectionModel {
	private String embankmentCrossSectionData;
	private String settlement;
	private String template;
	private String station;
	private String settledTopofFillElevation;
	private String topWidth;
	private String upstreamBermElev;
	private String upstreamBermWidth;
	private String downstreamBermElev;
	public String getEmbankmentCrossSectionData() {
		return embankmentCrossSectionData == null ? "EMBANKMENT CROSS SECTION DATA" : embankmentCrossSectionData;
	}
	public void setEmbankmentCrossSectionData(String embankmentCrossSectionData) {
		this.embankmentCrossSectionData = embankmentCrossSectionData;
	}
	public String getSettlement() {
		return settlement == null ? "% settlement" : settlement;
	}
	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}
	public String getTemplate() {
		return template == null ? "Template #" : template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public String getStation() {
		return station == null ? "Station" : station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getSettledTopofFillElevation() {
		return settledTopofFillElevation == null ? "Settled top of fill elev." : settledTopofFillElevation;
	}
	public void setSettledTopofFillElevation(String settledTopofFillElevation) {
		this.settledTopofFillElevation = settledTopofFillElevation;
	}
	public String getTopWidth() {
		return topWidth == null ? "Top width, ft." : topWidth;
	}
	public void setTopWidth(String topWidth) {
		this.topWidth = topWidth;
	}
	public String getUpstreamBermElev() {
		return upstreamBermElev == null ? "Upstream berm elev." : upstreamBermElev;
	}
	public void setUpstreamBermElev(String upstreamBermElev) {
		this.upstreamBermElev = upstreamBermElev;
	}
	public String getUpstreamBermWidth() {
		return upstreamBermWidth == null ? "berm width, ft." : upstreamBermWidth;
	}
	public void setUpstreamBermWidth(String upstreamBermWidth) {
		this.upstreamBermWidth = upstreamBermWidth;
	}
	public String getDownstreamBermElev() {
		return downstreamBermElev == null ? "Downstream berm elev." : downstreamBermElev;
	}
	public void setDownstreamBermElev(String downstreamBermElev) {
		this.downstreamBermElev = downstreamBermElev;
	}
	public String getDownstreamBermWidth() {
		return downstreamBermWidth == null ? "berm width, ft." : downstreamBermWidth;
	}
	public void setDownstreamBermWidth(String downstreamBermWidth) {
		this.downstreamBermWidth = downstreamBermWidth;
	}
	public String getFrontSlope() {
		return frontSlope == null ? "Front slope, n:1" : frontSlope;
	}
	public void setFrontSlope(String frontSlope) {
		this.frontSlope = frontSlope;
	}
	public String getBackSlope() {
		return backSlope == null ? "Back slope, n:1" : backSlope;
	}
	public void setBackSlope(String backSlope) {
		this.backSlope = backSlope;
	}
	public String getStrippingDepth() {
		return strippingDepth ==  null ? "Stripping depth, ft." : strippingDepth;
	}
	public void setStrippingDepth(String strippingDepth) {
		this.strippingDepth = strippingDepth;
	}
	public String getCoreBottomWidth() {
		return coreBottomWidth == null ? "Core bottom width, ft." : coreBottomWidth;
	}
	public void setCoreBottomWidth(String coreBottomWidth) {
		this.coreBottomWidth = coreBottomWidth;
	}
	public String getDepth() {
		return depth == null ? "depth, ft." : depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	public String getSideSlopes() {
		return sideSlopes == null ? "Side slopes, n:1" : sideSlopes;
	}
	public void setSideSlopes(String sideSlopes) {
		this.sideSlopes = sideSlopes;
	}
	public String getOffset() {
		return offset == null ? "Offset, ft" : offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	public String getBlclOffset() {
		return blclOffset == null ? "BL-CL Offset, ft." : blclOffset;
	}
	public void setBlclOffset(String blclOffset) {
		this.blclOffset = blclOffset;
	}
	private String downstreamBermWidth;
	private String frontSlope;
	private String backSlope;
	private String strippingDepth;
	private String coreBottomWidth;
	private String depth;
	private String sideSlopes;
	private String offset;
	private String blclOffset;
	
}
