
public class StorageVolumesModel {
	private String elevation;
	private String area;
	private String storage;
	private String inlet;
	private String auxSpillway;
	private String maxWater;
	private String settledFill;
	public String getElevation() {
		return elevation == null ? "Elevation \n (ft)" : elevation;
	}
	public void setElevation(String elevation) {
		this.elevation = elevation;
	}
	public String getArea() {
		return area == null ? "Area \n (acres)" : area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStorage() {
		return storage == null ? "Storage \n (ac. ft.)" : storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getInlet() {
		return inlet == null ? "Inlet (princ. spillway)" : inlet;
	}
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	public String getAuxSpillway() {
		return auxSpillway == null ? "Aux. spillway" : auxSpillway;
	}
	public void setAuxSpillway(String auxSpillway) {
		this.auxSpillway = auxSpillway;
	}
	public String getMaxWater() {
		return maxWater == null ? "Max. water" : maxWater;
	}
	public void setMaxWater(String maxWater) {
		this.maxWater = maxWater;
	}
	public String getSettledFill() {
		return settledFill == null ? "Settled top of fill" : settledFill;
	}
	public void setSettledFill(String settledFill) {
		this.settledFill = settledFill;
	}
	public String getSedimentAboveInlet() {
		return sedimentAboveInlet == null ? "Sediment - above inlet" : sedimentAboveInlet;
	}
	public void setSedimentAboveInlet(String sedimentAboveInlet) {
		this.sedimentAboveInlet = sedimentAboveInlet;
	}
	public String getSedimentBelowInlet() {
		return sedimentBelowInlet == null ? "Sediment - below inlet" : sedimentBelowInlet;
	}
	public void setSedimentBelowInlet(String sedimentBelowInlet) {
		this.sedimentBelowInlet = sedimentBelowInlet;
	}
	public String getAuxInlet() {
		return auxInlet == null ? "Inlet to aux." : auxInlet;
	}
	public void setAuxInlet(String auxInlet) {
		this.auxInlet = auxInlet;
	}
	public String getAuxToMaxWater() {
		return auxToMaxWater == null ? "Aux. to max. water" : auxToMaxWater;
	}
	public void setAuxToMaxWater(String auxToMaxWater) {
		this.auxToMaxWater = auxToMaxWater;
	}
	private String sedimentAboveInlet;
	private String sedimentBelowInlet;
	private String auxInlet;
	private String auxToMaxWater;
}
