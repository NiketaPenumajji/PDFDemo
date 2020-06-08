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
public class ConstructionCheckoutModel {
    
        private String constructionCheckout;
        private String centerlineProfile;
        private String STA;
        private String rdg;
	private String constructionElevation;
	private String planElevation;
	private String dev;
        private String embankmentProfile;
	
	
        public String getConstructionCheckout() {
		return constructionCheckout == null ? "POND CONSTRUCTION CHECKOUT" : constructionCheckout;
	}
	public void setconstructionCheckout(String constructionCheckout) {
		this.constructionCheckout = constructionCheckout;
        }

	public String getCenterlineProfile() {
		return centerlineProfile == null ? "CENTERLINE PROFILES:" : centerlineProfile;
	}

	public void setCenterlineProfile(String centerlineProfile) {
		this.centerlineProfile = centerlineProfile;
	}
        
        public String getSTA() {
		return STA == null ? "STA" : STA;
	}

	public void setSTA(String STA) {
		this.STA = STA;
	}

	public String getRdg() {
		return rdg == null ? "Rod \n rdg. \n (FS)"  : rdg;
	}

	public void setRdg(String rdg) {
		this.rdg = rdg;
	}

	public String getConstructionElevation() {
		return constructionElevation == null ? "Constr. \n Elev. \n(HI-FS)" : constructionElevation;
	}

	public void setConstructionElevation(String constructionElevation) {
		this.constructionElevation = constructionElevation;
	}

	public String getPlanElevation() {
		return planElevation == null ? "Plan.\n Elev. \1:" : planElevation;
	}

	public void setPlanElevation(String planElevation) {
		this.planElevation = planElevation;
	}

	public String getDev() {
		return dev == null ? "Dev. \n (+/-)" : dev;
	}

	public void setDev(String dev) {
		this.dev = dev;
	}
        
        public String getEmbankmentProfile() {
		return embankmentProfile == null ? "Embankment CL Profile" : embankmentProfile;
	}

	public void setEmbankmentProfile(String embankmentProfile) {
		this.embankmentProfile = embankmentProfile;
	}         
    
}
