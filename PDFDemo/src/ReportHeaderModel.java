import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;

public class ReportHeaderModel {
	private String project;
	private String description;
	private String state;
	private String county;
	private String landowner;
	private String township;
	private String range;
	private String section;
	private String tract;
	private String field;
	private String designedBy;
	public String dateDesigned;
	public String datePrinted;
	public String approvedBy;
	public String Date;
	public String filename;

	public String getState() {
		return state == null ? "State" : state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county == null ? "County" : county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getLandowner() {
		return landowner == null ? "Landowner" : landowner;
	}

	public void setLandowner(String landowner) {
		this.landowner = landowner;
	}

	public String getTownship() {
		return township == null ? "Township" : township;
	}

	public void setTownship(String township) {
		this.township = township;
	}

	public String getRange() {
		return range == null ? "Range" : range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getSection() {
		return section == null ? "Section" : section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getTract() {
		return tract == null ? "Tract" : tract;
	}

	public void setTract(String tract) {
		this.tract = tract;
	}

	public String getField() {
		return field == null ? "Field" : field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getDesignedBy() {
		return designedBy == null ? "Designed by" : designedBy;
	}

	public void setDesignedBy(String designedBy) {
		this.designedBy = designedBy;
	}

	public String getDateDesigned() {
		return dateDesigned == null ? "Date designed" : dateDesigned;
	}

	public void setDateDesigned(String dateDesigned) {
		this.dateDesigned = dateDesigned;
	}

	public String getDatePrinted() {
		return datePrinted == null ? "Date printed" : datePrinted;
	}

	public void setDatePrinted(String datePrinted) {
		this.datePrinted = datePrinted;
	}

	public String getApprovedBy() {
		return approvedBy == null ? "Approved by" : approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getDate() {
		return Date == null ? "Date" : Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getFilename() {
		return filename == null ? "filename" : filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getProject() {
		return project == null ? "Project" : project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getDescription() {
		return description == null ? "Description" : description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getLongestProperty() throws IllegalArgumentException, IllegalAccessException {


	    return 13;
	}
}
