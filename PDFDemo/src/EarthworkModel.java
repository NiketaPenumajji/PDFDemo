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
public class EarthworkModel {
    
        private String earthWorkVolumes;
        private String earthWorkQuantities;
        private String constructed;
	private String settled;

	
        public String getEarthWorkVolumes() {
		return earthWorkVolumes == null ? "EARTHWORK VOLUMES" : earthWorkVolumes;
	}
	public void setEarthWorkVolumes(String earthWorkVolumes) {
		this.earthWorkVolumes = earthWorkVolumes;
        }

	public String getEarthWorkQuantities() {
		return earthWorkQuantities == null ? "EARTHWORK QUANTITIES(cu. yds.) \n settlement \n Fill \n Stripping \n core \n TOTALS" : earthWorkQuantities;
	}

	public void setEarthWorkQuantities(String earthWorkQuantities) {
		this.earthWorkQuantities = earthWorkQuantities;
	}
        
        public String getConstructed() {
		return constructed == null ? "CONSTRUCTED" : constructed;
	}

	public void setConstructed(String constructed) {
		this.constructed = constructed;
	}

	public String getSettled() {
		return settled == null ? "SETTLED"  : settled;
	}

	public void setSettled(String settled) {
		this.settled = settled;
	}
    
}
