
public class ElevationStorageModel {
	private String elev;
	private String poolArea;
	private String intStorage;
	private String accumStorage;
	private String squareInches;
	private String acres;
	public String getAcres() {
		return acres == null ? "acres" : acres;		
	}
	public void setAcres(String acres) {
		this.acres = acres;
	}
	public String getSquareInches() {
		return squareInches == null ? "sq. in." : squareInches;
	}	
	public void setSquareInches(String squareInches) {
		this.squareInches = squareInches;
	}
	public String getElev() {
		return elev == null ? "Elev \n\t (ft)" : elev;
	}
	public void setElev(String elev) {
		this.elev = elev;
	}
	public String getPoolArea() {
		return poolArea == null ? "Pool Area" : poolArea;
	}
	public void setPoolArea(String poolArea) {
		this.poolArea = poolArea;
	}
	public String getIntStorage() {
		return intStorage == null ? "Int. Storage \n\t   (ac. ft.)" : intStorage;
	}
	public void setIntStorage(String intStorage) {
		this.intStorage = intStorage;
	}
	public String getAccumStorage() {
		return accumStorage == null ? "Accum. Storage \n\t (ac. ft.)" : accumStorage;
	}
	public void setAccumStorage(String accumStorage) {
		this.accumStorage = accumStorage;
	}		
}
