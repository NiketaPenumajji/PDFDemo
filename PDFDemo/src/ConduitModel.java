/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDFDemo;

/**
 *
 * @author DELL
 */
public class ConduitModel {
    
        private String conduitDetail;
        private String inletType;
	private String conduitType;
	private String diameter;
	private String inletExtention;
	private String length;
	private String pipeLength;
	private String slope;
	private String maxFill;
	private String horizonatalDistance;
	private String upStream;
	private String downStream;
	
        public String getConduitDetail() {
		return conduitDetail == null ? "CONDUIT DETAIL" : conduitDetail;
	}
	public void setConduitDetail(String conduitDetail) {
		this.conduitDetail = conduitDetail;
        }

	public String getInletType() {
		return inletType == null ? "Inlet Type" : inletType;
	}

	public void setInletType(String inletType) {
		this.inletType = inletType;
	}

	public String getConduitType() {
		return conduitType == null ? "Conduit Type" : conduitType;
	}

	public void setConduitType(String conduitType) {
		this.conduitType = conduitType;
	}

	public String getDiameter() {
		return diameter == null ? "Diameter, in." : diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getInletExtention() {
		return inletExtention == null ? "Inlet extention, ft." : inletExtention;
	}

	public void setInletExtention(String inletExtention) {
		this.inletExtention = inletExtention;
	}

	public String getLength() {
		return length == null ? "Length, lin. ft." : length;
	}

	public void setLength(String range) {
		this.length = length;
	}

	public String getPipeLength() {
		return pipeLength == null ? "Length, lin. ft." : pipeLength;
	}

	public void setPipeLength(String pipeLength) {
		this.pipeLength = pipeLength;
	}

	public String getSlope() {
		return slope == null ? "Slope, %" : slope;
	}

	public void setSlope(String tract) {
		this.slope = slope;
	}

	public String getMaxFill() {
		return maxFill == null ? "Max.fill over pipe, ft." : maxFill;
	}

	public void setMaxFill(String maxFill) {
		this.maxFill = maxFill;
	}

	public String getHorizonatalDistance() {
		return horizonatalDistance == null ? "Horizontal Distances (ft.) " : horizonatalDistance;
	}

	public void setHorizonatalDistance(String horizonatalDistance) {
		this.horizonatalDistance = horizonatalDistance;
	}

	public String getUpStream() {
		return upStream == null ? "Upstrm: edge of top width to inlet end of pipe :" : upStream;
	}

	public void setUpStream(String upStream) {
		this.upStream = upStream;
	}

	public String getDownStream() {
		return downStream == null ? "Dnstrm: edge of top width to toe ------------- :" : downStream;
	}

	public void setDownStream(String downStream) {
		this.downStream = downStream;
	}
    
}
