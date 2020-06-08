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
public class SummaryModel {
    
        
        private String summary;
        private String inletType;
        private String inletElevation;
	private String conduit;
	private String riser;
	private String aux;
	private String effectiveHeight;
	private String storageHeight;
	private String overallHeight;
	
        public String getSummary() {
		return summary == null ? "SUMMARY" : summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
        }

	public String getInletType() {
		return inletType == null ? "Inlet type:" : inletType;
	}

	public void setInletType(String inletType) {
		this.inletType = inletType;
	}
        
        public String getInletElevation() {
		return inletElevation == null ? "Inlet Elevation:" : inletElevation;
	}

	public void setInletElevation(String inletElevation) {
		this.inletElevation = inletElevation;
	}

	public String getConduit() {
		return conduit == null ? "CONDUIT: \n Type \n Diameter, in. \n Length, lin. ft."  : conduit;
	}

	public void setConduit(String conduit) {
		this.conduit = conduit;
	}

	public String getRiser() {
		return riser == null ? "RISER: \n Type \n Diameter, in. \n Length, lin. ft." : riser;
	}

	public void setRiser(String riser) {
		this.riser = riser;
	}

	public String getAux() {
		return aux == null ? "Aux. : \n Elevation \n Bottom width, ft.\n Hp, flow depth,ft.\n Exit slope, % min. \n max." : aux;
	}

	public void setAux(String aux) {
		this.aux = aux;
	}

	public String getEffectiveHeight() {
		return effectiveHeight == null ? "Effective height, ft." : effectiveHeight;
	}

	public void setEffectiveHeight(String effectiveHeight) {
		this.effectiveHeight = effectiveHeight;
	}
        
        public String getStorageHeight() {
		return storageHeight == null ? "Height x storage" : storageHeight;
	}

	public void setStorageHeight(String storageHeight) {
		this.storageHeight = storageHeight;
	}

	public String getOverallHeight() {
		return overallHeight == null ? "Overall height, ft. " : overallHeight;
	}

	public void setOverallHeight(String overallHeight) {
		this.overallHeight = overallHeight;
	}

	
}
