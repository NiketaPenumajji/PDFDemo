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
public class ProjectDefaultsModel {
    
        private String projectDefaults;
        private String design;
        private String bermsSettled;
	private String auxSpillway;
	private String freeboard;
	private String minBottomWidth;
	private String maxBottomWidth;
	private String inlet;
	private String storage;
        private String minFlow;
        private String orificeCoeff;
        private String pipeFlow;
	private String stageRequired;
	private String drainageArea;
	private String principalRouting;
	private String auxRouting;
	private String project;
	private String preparedFor;
	private String preparedBy;
        private String checkedBy;
        private String TWP;
        private String RNG;
	private String SEC;
	private String FLD;
	private String date;
	
        public String getProjectDefaults() {
		return projectDefaults == null ? "PROJECT DEFAULTS" : projectDefaults;
	}
	public void setProjectDefaults(String projectDefaults) {
		this.projectDefaults = projectDefaults;
        }

	public String getDesign() {
		return design == null ? "Design based on:" : design;
	}

	public void setDesign(String design) {
		this.design = design;
	}
        
        public String getBermsSettled() {
		return bermsSettled == null ? "Berms settled:" : bermsSettled;
	}

	public void setBermsSettled(String bermsSettled) {
		this.bermsSettled = bermsSettled;
	}

	public String getAuxSpillway() {
		return auxSpillway == null ? "Auxiliary spillway to Top of Dam:"  : auxSpillway;
	}

	public void setAuxSpillway(String auxSpillway) {
		this.auxSpillway = auxSpillway;
	}

	public String getFreeboard() {
		return freeboard == null ? "Freeboard:" : freeboard;
	}

	public void setFreeboard(String freeboard) {
		this.freeboard = freeboard;
	}

	public String getMinBottomWidth() {
		return minBottomWidth == null ? "Minimum bottom width:" : minBottomWidth;
	}

	public void setMinBottomWidth(String minBottomWidth) {
		this.minBottomWidth = minBottomWidth;
	}

	public String getMaxBottomWidth() {
		return maxBottomWidth == null ? "Maximum bottom width:" : maxBottomWidth;
	}

	public void setMaxBottomWidth(String maxBottomWidth) {
		this.maxBottomWidth = maxBottomWidth;
	}
        
        public String getInlet() {
		return inlet == null ? "Feet above inlet (Drawdown):" : inlet;
	}

	public void setInlet(String inlet) {
		this.inlet = inlet;
	}

	public String getStorage() {
		return storage == null ? "Percent or storage drained (Drawdown):" : storage;
	}

	public void setStorage(String overallHeight) {
		this.storage = storage;
	}
        
        public String getMinFlow() {
		return minFlow == null ? "Minimum flow (Drawdown):" : minFlow;
	}
	public void setMinFlow(String minFlow) {
		this.minFlow = minFlow;
        }

	public String getOrificeCoeff() {
		return orificeCoeff == null ? "Orifice Coefficient:" : orificeCoeff;
	}

	public void setOrificeCoeff(String orificeCoeff) {
		this.orificeCoeff = orificeCoeff;
	}
        
        public String getPipeFlow() {
		return pipeFlow == null ? "Full Pipe Flow Required?" : pipeFlow;
	}

	public void setPipeFlow(String pipeFlow) {
		this.pipeFlow = pipeFlow;
	}

	public String getStageRequired() {
		return stageRequired == null ? "Stage required above Prin. Spwy. Crest:"  : stageRequired;
	}

	public void setStageRequired(String stageRequired) {
		this.stageRequired = stageRequired;
	}

	public String getDrainageArea() {
		return drainageArea == null ? "Max. drainage area for required stage:" : drainageArea;
	}

	public void setDrainageArea(String drainageArea) {
		this.drainageArea = drainageArea;
	}

	public String getPrincipalRouting() {
		return principalRouting == null ? " Exclude PS flow in Prin. Routing for dia. < :" : principalRouting;
	}

	public void setPrincipalRouting(String principalRouting) {
		this.principalRouting = principalRouting;
	}

	public String getAuxRouting() {
		return auxRouting == null ? " Exclude PS flow in Aux. Routing for dia. < :" : auxRouting;
	}

	public void setAuxRouting(String auxRouting) {
		this.auxRouting = auxRouting;
	}
        public String getProject() {
		return project == null ? "Project:" : project;
	}

	public void setProject(String project) {
		this.orificeCoeff = project;
	}
        
        public String getPreparedFor() {
		return preparedFor == null ? "Prepared for:" : preparedFor;
	}

	public void setPreparedFor(String preparedFor) {
		this.preparedFor = preparedFor;
	}

	public String getPreparedBy() {
		return preparedBy == null ? "Prepared by:"  : preparedBy;
	}

	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}

	public String getCheckedBy() {
		return checkedBy == null ? "Checked by:" : checkedBy;
	}

	public void setCheckedBy(String checkedBy) {
		this.checkedBy = checkedBy;
	}

	public String getTWP() {
		return TWP == null ? "TWP:" : TWP;
	}

	public void setTWP(String TWP) {
		this.TWP = TWP;
	}

	public String getRNG() {
		return RNG == null ? "RNG:" : RNG;
	}

	public void setRNG(String RNG) {
		this.RNG = RNG;
	}
        
	public String getSEC() {
		return SEC == null ? "SEC:" : SEC;
	}

	public void setSEC(String SEC) {
		this.SEC = SEC;
	}

	public String getFLD() {
		return FLD == null ? "FLD:" : FLD;
	}

	public void setFLD(String FLD) {
		this.FLD = FLD;
	}
        
        public String getDate() {
		return date == null ? "date:" : date;
	}

	public void setDate(String date) {
		this.date = date;
	}
    
}
