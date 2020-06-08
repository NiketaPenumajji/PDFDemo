/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2020 iText Group NV
    Authors: iText Software.
 
    For more information, please contact iText Software at this address:
    sales@itextpdf.com
 */
/*
 * This example is part of the iText 7 tutorial.
 */ 
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
 
/**
 * Simple Hello World example.
 */
public class PDFDemo {
    
    public static final String DEST = "PDFDemo/src/demo.pdf";
    
    public static void main(String args[]) throws IOException, IllegalArgumentException, IllegalAccessException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new PDFDemo().createPdf(DEST);
    }
    
    public void createPdf(String dest) throws IOException, IllegalArgumentException, IllegalAccessException {
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);
 
        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);
        
        // Initialize document
        Document document = new Document(pdf);
 
        //Add paragraph to the document
        Paragraph heading = new Paragraph("POND DESIGN");   
        heading.setUnderline();
        heading.setBold();
        heading.setTextAlignment(TextAlignment.CENTER);
        document.add(heading);
        
        // Creating the report header table       
        float [] reportHeaderColumnWidths = {150F, 350F};   
        Table reportHeaderTable = new Table(reportHeaderColumnWidths); 
        reportHeaderTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        
        //Get report header model
        ReportHeaderModel reportHeader = new ReportHeaderModel();
        int padLength = reportHeader.getLongestProperty();
                            
        
        // Adding header cells to the table
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getProject(), padLength, " "))));
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getDescription(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("This project is a dam located on John Farmer's farm on non-name creek near Interstate-70")));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getState(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getCounty(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));    
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getLandowner(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getTownship(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getRange(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getSection(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getTract(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getField(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getDesignedBy(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getDateDesigned(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getDatePrinted(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getApprovedBy(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(reportHeader.getDate()))); 
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
        reportHeaderTable.addCell(new Cell().add(new Paragraph(StringUtils.rightPad(reportHeader.getFilename(), padLength, " "))));       
        reportHeaderTable.addCell(new Cell().add(new Paragraph("aaa")));
                
           
        // Adding Table to document        
        document.add(reportHeaderTable);    
        
        document.add(new Paragraph());
        
        // Adding constant template document
        String disclaimerText = "The use of this software is intended for low-hazard dams conforming to Natural Resource Conservation Service, Pond (378) Conservation Practice Standard."
        		+ "\n Failure of the dam will not result in loss of life; damage to homes, commericial or industrial buildings, main highways, or railroads; or in interruption of the use or service"
        		+ " public utilities. \n NRCS 378 Pond Conservation Practice Standard limits the effective height to less than 35 feet and a height x storage value of less than 3,000 acre-feet-ft.";
        Paragraph disclaimer = new Paragraph(disclaimerText);
        disclaimer.setTextAlignment(TextAlignment.JUSTIFIED);
        
        // Adding disclaimer text
        document.add(disclaimer);
        
        //Adding job approval class table
        float [] jobApprovalColumnWidths = {350F, 150F, 150F};   
        Table jobApprovalTable = new Table(jobApprovalColumnWidths); 
        reportHeaderTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        Paragraph jobApprovalClass = new Paragraph("JOB APPROVAL CLASS"); 
        jobApprovalClass.setTextAlignment(TextAlignment.CENTER);
        jobApprovalClass.setBold();
        document.add(jobApprovalClass);
        
        JobApprovalModel jobApprovalModel = new JobApprovalModel();
        
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getHazardClass())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getLow())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getEffectiveHeight())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getFeet())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getEffectiveStorage())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getAcft())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getOverallHeight())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getFeet())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getTotalStorage())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getAcft())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getStorageEffectiveHeight())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getAcFtxFt())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getContributingDrainageArea())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getAcres())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getContributingDrainageArea())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getSquareMiles())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getPipeConduitCapacity())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getCFS())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getOpenChannelSpillwayDesignFlow())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getCFS())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getPeakInflowDesignStorm())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getCFS())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getConduitDiameter())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getInches())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getConduitMaterial())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getInletType())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph(jobApprovalModel.getJobApprovalClass())));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));
        jobApprovalTable.addCell(new Cell().add(new Paragraph("")));

              
        document.add(jobApprovalTable);
        
        document.add(new Paragraph(""));
        
        //Adding elevation storage table
        float [] elevationStorageColumnWidths = {100F, 100F, 100F, 100F, 100F};   
        Table elevationStorageTable = new Table(elevationStorageColumnWidths); 
        elevationStorageTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        
        Paragraph elevationStorage = new Paragraph("ELEVATION-STORAGE INPUT DATA"); 
        elevationStorage.setTextAlignment(TextAlignment.CENTER);
        elevationStorage.setBold();
        document.add(elevationStorage);
        
        Paragraph elevationStorageScale = new Paragraph("Scale: 1 in. = 100.00 ft.");
        elevationStorageScale.setTextAlignment(TextAlignment.CENTER);
        document.add(elevationStorageScale);
        
        ElevationStorageModel elevationStorageModel = new ElevationStorageModel();
        
        elevationStorageTable.addCell(new Cell(2, 1).add(new Paragraph(elevationStorageModel.getElev()).setTextAlignment(TextAlignment.CENTER)));
        elevationStorageTable.addCell(new Cell(1, 2).add(new Paragraph(elevationStorageModel.getPoolArea()).setTextAlignment(TextAlignment.CENTER)));        
        elevationStorageTable.addCell(new Cell(2, 1).add(new Paragraph(elevationStorageModel.getIntStorage()).setTextAlignment(TextAlignment.CENTER)));
        elevationStorageTable.addCell(new Cell(2, 1).add(new Paragraph(elevationStorageModel.getAccumStorage()).setTextAlignment(TextAlignment.CENTER)));
        elevationStorageTable.addCell(new Cell(1, 1).add(new Paragraph(elevationStorageModel.getSquareInches()).setTextAlignment(TextAlignment.CENTER)));
        elevationStorageTable.addCell(new Cell(1, 1).add(new Paragraph(elevationStorageModel.getAcres()).setTextAlignment(TextAlignment.CENTER)));
        elevationStorageTable.addCell(new Cell(1, 1).add(new Paragraph("0")).setTextAlignment(TextAlignment.RIGHT));
        elevationStorageTable.addCell(new Cell(1, 1).add(new Paragraph("0")).setTextAlignment(TextAlignment.RIGHT));
        elevationStorageTable.addCell(new Cell(1, 1).add(new Paragraph("0")).setTextAlignment(TextAlignment.RIGHT));
        elevationStorageTable.addCell(new Cell(1, 1).add(new Paragraph("0")).setTextAlignment(TextAlignment.RIGHT));
        elevationStorageTable.addCell(new Cell(1, 1).add(new Paragraph("0")).setTextAlignment(TextAlignment.RIGHT));
        
        document.add(elevationStorageTable);

        document.add(new Paragraph(""));

      //Adding storage volume table
        float [] storageVolumesColumnWidths = {150F, 150F, 150F, 150F};   
        Table storageVolumesTable = new Table(storageVolumesColumnWidths); 
        storageVolumesTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        
        Paragraph storageVolumes = new Paragraph("STORAGE VOLUMES"); 
        storageVolumes.setTextAlignment(TextAlignment.CENTER);
        storageVolumes.setBold();
        document.add(storageVolumes);
        
        StorageVolumesModel storageVolumesModel = new StorageVolumesModel();
        
        
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getElevation()).setTextAlignment(TextAlignment.CENTER)));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getArea()).setTextAlignment(TextAlignment.CENTER)));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getStorage()).setTextAlignment(TextAlignment.CENTER)));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getInlet())));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getAuxSpillway())));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getMaxWater())));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getSettledFill())));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getSedimentAboveInlet())));
        storageVolumesTable.addCell(new Cell(1, 2).add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getSedimentBelowInlet())));
        storageVolumesTable.addCell(new Cell(1, 2).add(new Paragraph("")));        
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getAuxInlet())));
        storageVolumesTable.addCell(new Cell(1, 2).add(new Paragraph("")));        
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph(storageVolumesModel.getAuxToMaxWater())));
        storageVolumesTable.addCell(new Cell(1, 2).add(new Paragraph("")));
        storageVolumesTable.addCell(new Cell().add(new Paragraph("")));
        
        document.add(storageVolumesTable);
        
        document.add(new Paragraph(""));
        
        //Adding rcn determination table
        float [] rcnDeterminationColumnWidths = {150F, 150F, 150F, 150F, 150F};   
        Table rcnDeterminationTable = new Table(rcnDeterminationColumnWidths); 
        rcnDeterminationTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        Paragraph rcnDetermination = new Paragraph("RCN Determination"); 
        rcnDetermination.setTextAlignment(TextAlignment.CENTER);
        rcnDetermination.setBold();
        document.add(rcnDetermination);
        
        
        RcnDeterminationModel rcnDeterminationModel = new RcnDeterminationModel();

        rcnDeterminationTable.addCell(new Cell(1, 1).add(new Paragraph(rcnDeterminationModel.getRunoffCurveNumberDetermination()).setTextAlignment(TextAlignment.CENTER)));
        rcnDeterminationTable.addCell(new Cell(1, 4).add(new Paragraph(rcnDeterminationModel.getAcresandCurvenumbers()).setTextAlignment(TextAlignment.CENTER)));
        rcnDeterminationTable.addCell(new Cell(1, 1).add(new Paragraph(rcnDeterminationModel.getCoverDescription()).setTextAlignment(TextAlignment.CENTER)));
        rcnDeterminationTable.addCell(new Cell(1, 1).add(new Paragraph(rcnDeterminationModel.getA()).setTextAlignment(TextAlignment.CENTER)));
        rcnDeterminationTable.addCell(new Cell(1, 1).add(new Paragraph(rcnDeterminationModel.getB()).setTextAlignment(TextAlignment.CENTER)));
        rcnDeterminationTable.addCell(new Cell(1, 1).add(new Paragraph(rcnDeterminationModel.getC()).setTextAlignment(TextAlignment.CENTER)));
        rcnDeterminationTable.addCell(new Cell(1, 1).add(new Paragraph(rcnDeterminationModel.getD()).setTextAlignment(TextAlignment.CENTER)));               
        
        document.add(rcnDeterminationTable);
 
        float[] bottomTableColumnWidths = {300F, 300F};
        Table bottomTable = new Table(bottomTableColumnWidths);
        bottomTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        bottomTable.addCell(new Cell(1, 1).add(new Paragraph("Accumulated: " + "0" + " Acres")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        bottomTable.addCell(new Cell(1, 1).add(new Paragraph("Weighted Curve Number: " + "0")).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
        
        document.add(bottomTable);
        
        document.add(new Paragraph(""));
        
        float[] hydrologicTableColumnWidths = {100F, 100F, 100F, 100F, 100F, 100F};
        Table hydrologicTable = new Table(hydrologicTableColumnWidths);
        hydrologicTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        HydrologicDataModel hydrologicDataModel = new HydrologicDataModel();
        
        hydrologicTable.addCell(new Cell().add(new Paragraph(hydrologicDataModel.getRainfallDistributionType())));
        hydrologicTable.addCell(new Cell().add(new Paragraph(hydrologicDataModel.getDrainageArea())));
        hydrologicTable.addCell(new Cell().add(new Paragraph(hydrologicDataModel.getRunoffCurveNumber())));
        hydrologicTable.addCell(new Cell().add(new Paragraph(hydrologicDataModel.getConcentrationTime())));
        hydrologicTable.addCell(new Cell().add(new Paragraph(hydrologicDataModel.getWatershedSlope())));
        hydrologicTable.addCell(new Cell().add(new Paragraph(hydrologicDataModel.getFlowLength())));
        hydrologicTable.addCell(new Cell().add(new Paragraph("0")));
        hydrologicTable.addCell(new Cell().add(new Paragraph("0")));
        hydrologicTable.addCell(new Cell().add(new Paragraph("0")));
        hydrologicTable.addCell(new Cell().add(new Paragraph("0")));
        hydrologicTable.addCell(new Cell().add(new Paragraph("0")));
        hydrologicTable.addCell(new Cell().add(new Paragraph("0")));

        document.add(hydrologicTable);
        
        document.add(new Paragraph(""));
        document.add(new Paragraph(""));
        document.add(new Paragraph(""));

        
        
        float[] hydrologicBottomTableColumnWidths = {150F, 150F, 150F};
        Table hydrologicBottomTable = new Table(hydrologicBottomTableColumnWidths);
        hydrologicBottomTable.setHorizontalAlignment(HorizontalAlignment.LEFT);
        
        
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph("")).setBorder(Border.NO_BORDER));
        hydrologicBottomTable.addCell(new Cell(1, 2).add(new Paragraph(hydrologicDataModel.getSpillway()).setTextAlignment(TextAlignment.CENTER)));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph("")).setBorder(Border.NO_BORDER));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph(hydrologicDataModel.getPrincipal()).setTextAlignment(TextAlignment.LEFT)).setBorderLeft(Border.NO_BORDER));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph(hydrologicDataModel.getAuxiliary()).setTextAlignment(TextAlignment.LEFT)));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph(hydrologicDataModel.getDesignFrequency()).setTextAlignment(TextAlignment.LEFT)));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph("1")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph("1")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph(hydrologicDataModel.getRainfallIn()).setTextAlignment(TextAlignment.LEFT)));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph("1")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph("1")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph(hydrologicDataModel.getPeakInflow()).setTextAlignment(TextAlignment.LEFT)));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph("1")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph("1")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph(hydrologicDataModel.getPeakOutflow()).setTextAlignment(TextAlignment.LEFT)));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph("1")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        hydrologicBottomTable.addCell(new Cell(1, 1).add(new Paragraph("1")).setTextAlignment(TextAlignment.LEFT).setBorderTop(Border.NO_BORDER).setBorderLeft(Border.NO_BORDER));
        
        
        document.add(hydrologicBottomTable);
        
        document.add(new Paragraph(""));
        
        PrincipalSpillwayModel principalSpillwayModel = new PrincipalSpillwayModel();
        
        document.add(new Paragraph(""));
        
        Paragraph principalSpillway = new Paragraph(principalSpillwayModel.getPrincipalSpillwayTrials());
        principalSpillway.setTextAlignment(TextAlignment.CENTER);
        document.add(principalSpillway);
        
        float[] principalSpillwayTopTableColumnWidths = {225F, 225F};
        Table principalSpillwaytopTable = new Table(principalSpillwayTopTableColumnWidths);
        principalSpillwaytopTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        principalSpillwaytopTable.addCell(new Cell(1, 1).add(new Paragraph(principalSpillwayModel.getInletType())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        principalSpillwaytopTable.addCell(new Cell(1, 1).add(new Paragraph(principalSpillwayModel.getInletElevation())).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
        
        document.add(principalSpillwaytopTable);
        
        float[] principalSpillwayTableColumnWidths = {150F, 100F, 100F, 100F};
        Table principalSpillwayTable = new Table(principalSpillwayTableColumnWidths);
        principalSpillwayTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getTrial1())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getTrial2())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getTrial3())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getConduit())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getDiameterIn())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getHeightIn())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getWidthIn())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getManningsIn())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getInletExt())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getLengthFt())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getEntranceCoefficient())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getRiserType())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getDiameterIn())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getLengthIn())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getWidthIn())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getWeirLength())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getCrestRadius())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getInvertElevation())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getAuxiliaryElevation())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getStorage())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getTemporary())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getTotalAuxiliary())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getEffectiveheight())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getHeightStorage())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getDrawdownTime())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getTrialUsed())));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayTable.addCell(new Cell().add(new Paragraph("")));
        
        document.add(principalSpillwayTable);
        
        Paragraph conduitTypes = new Paragraph();
        conduitTypes.add(principalSpillwayModel.getConduitTypes());
        
        document.add(new Paragraph(""));
        
        AuxiliarySpillwayModel auxiliarySpillwayModel = new AuxiliarySpillwayModel();

        Paragraph auxiliarySpillwayDetails = new Paragraph();
        auxiliarySpillwayDetails.add(auxiliarySpillwayModel.getAuxiliarySpillwayDetails());
        auxiliarySpillwayDetails.setTextAlignment(TextAlignment.CENTER);
                
        
        float[] dischargeDeterminationTableColumnWidths = {550F};
        Table dischargeDeterminationTable = new Table(dischargeDeterminationTableColumnWidths);
        dischargeDeterminationTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        dischargeDeterminationTable.addCell(new Cell().add(new Paragraph(auxiliarySpillwayModel.getDischargeDetermination())));
        
        
        document.add(dischargeDeterminationTable);
        
        // Auxiliary spillway details table 
        float[] auxiliarySpillwayDetailsTableColumnWidths = {100F, 10F, 80F, 120F, 10F, 100F};
        Table auxiliarySpillwayDetailsUpperTable = new Table(auxiliarySpillwayDetailsTableColumnWidths);
        auxiliarySpillwayDetailsUpperTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getAuxiliaryElev())));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getRetardance())));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getBottomWidth())));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getLevelSect())));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getFlowDepth())));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getSideSlopeRatio())));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getExitChannel())));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph("")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph("")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getMaxVel()).setTextAlignment(TextAlignment.RIGHT)));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getRetardance())));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsUpperTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));

        

        document.add(auxiliarySpillwayDetailsUpperTable);
        document.add(new Paragraph(""));
        
        Table auxiliarySpillwayDetailsLowerTable = new Table(auxiliarySpillwayDetailsTableColumnWidths);
        auxiliarySpillwayDetailsLowerTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getFlowCfs())));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getExitSlope())));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph("")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph("")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getMax()).setTextAlignment(TextAlignment.RIGHT)));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getSettledFillElev())));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getDrawdownTime())));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getFlowCfs())));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getAuxSpillwayTopOfDam())));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getChannelElev())));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderRight(Border.NO_BORDER).add(new Paragraph(auxiliarySpillwayModel.getOverallHeight())));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(":")));
        auxiliarySpillwayDetailsLowerTable.addCell(new Cell().setBorderLeft(Border.NO_BORDER).add(new Paragraph("1")));

        document.add(auxiliarySpillwayDetailsLowerTable);
        
        document.add(new Paragraph());       
        
        GroundDataModel groundDataModel = new GroundDataModel();
        
        document.add(new Paragraph(groundDataModel.getGroundData()).setTextAlignment(TextAlignment.CENTER));
        
        float[] groundDataTableColumnWidths = {150F, 150F, 150F, 150F};
        Table groundDataHeaderTable = new Table(groundDataTableColumnWidths);
        
        groundDataHeaderTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph(groundDataModel.getSta())));
        groundDataHeaderTable.addCell(new Cell().setBorder(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(groundDataModel.getHi())));
        groundDataHeaderTable.addCell(new Cell().setBorder(Border.NO_BORDER).setBorderRight(Border.NO_BORDER).add(new Paragraph(groundDataModel.getSlope())));
        groundDataHeaderTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph(groundDataModel.getDist())));
        
        document.add(groundDataHeaderTable);
        
        document.add(new Paragraph(groundDataModel.getPractice()).setTextAlignment(TextAlignment.CENTER));
        
        Table groundDataTable = new Table(groundDataTableColumnWidths);
        
        groundDataTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph("1")));
        groundDataTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph("")));
        groundDataTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph("")));
        groundDataTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph("1")));
        
        document.add(groundDataTable);
        
        document.add(new Paragraph(""));
        
        EmbankmentCrosssectionModel embankmentCrosssectionModel = new EmbankmentCrosssectionModel();
        document.add(new Paragraph(embankmentCrosssectionModel.getEmbankmentCrossSectionData()).setTextAlignment(TextAlignment.CENTER));
        
        document.add(new Paragraph(embankmentCrosssectionModel.getSettlement()).setTextAlignment(TextAlignment.RIGHT));
        
        float[] embankmentCrosssectionTableColumnWidths = {300F};
        Table embankmentCrosssectionUpperTable = new Table(embankmentCrosssectionTableColumnWidths);
        embankmentCrosssectionUpperTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getTemplate())));
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getStation())));
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getSettledTopofFillElevation())));
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getTopWidth())));
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getUpstreamBermElev())));
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getUpstreamBermWidth())));
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getTemplate()).setTextAlignment(TextAlignment.RIGHT)));
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getDownstreamBermElev())));
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getDownstreamBermWidth()).setTextAlignment(TextAlignment.RIGHT)));
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getFrontSlope())));
        embankmentCrosssectionUpperTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getBackSlope())));
        
        document.add(embankmentCrosssectionUpperTable);
        
        Table embankmentCrosssectionLowerTable = new Table(embankmentCrosssectionTableColumnWidths);
        embankmentCrosssectionLowerTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        embankmentCrosssectionLowerTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getStrippingDepth())));
        embankmentCrosssectionLowerTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getCoreBottomWidth())));
        embankmentCrosssectionLowerTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getDepth()).setTextAlignment(TextAlignment.CENTER)));
        embankmentCrosssectionLowerTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getSideSlopes()).setTextAlignment(TextAlignment.CENTER)));
        embankmentCrosssectionLowerTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getOffset()).setTextAlignment(TextAlignment.CENTER)));
        embankmentCrosssectionLowerTable.addCell(new Cell().add(new Paragraph(embankmentCrosssectionModel.getBlclOffset())));
                                                
        document.add(embankmentCrosssectionLowerTable);
        
        document.add(new Paragraph(""));
        
        ConduitModel conduitModel = new ConduitModel();
        
        document.add(new Paragraph("")); 
        document.add(new Paragraph(conduitModel.getConduitDetail()).setTextAlignment(TextAlignment.CENTER));
       
        
        float[] conduitDetailTableColumnWidths = {300F};
        Table conduitDetailUpperTable = new Table(conduitDetailTableColumnWidths);
        conduitDetailUpperTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        conduitDetailUpperTable.addCell(new Cell().add(new Paragraph(conduitModel.getInletType())));
        conduitDetailUpperTable.addCell(new Cell().add(new Paragraph(conduitModel.getConduitType())));
        conduitDetailUpperTable.addCell(new Cell().add(new Paragraph(conduitModel.getDiameter())));
        conduitDetailUpperTable.addCell(new Cell().add(new Paragraph(conduitModel.getInletExtention())));
        conduitDetailUpperTable.addCell(new Cell().add(new Paragraph(conduitModel.getLength())));
        conduitDetailUpperTable.addCell(new Cell().add(new Paragraph(conduitModel.getPipeLength())));
        conduitDetailUpperTable.addCell(new Cell().add(new Paragraph(conduitModel.getSlope())));
        conduitDetailUpperTable.addCell(new Cell().add(new Paragraph(conduitModel.getMaxFill())));
                
        document.add(conduitDetailUpperTable);
        
        Table conduitDetailLowerTable = new Table(conduitDetailTableColumnWidths);
        conduitDetailLowerTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        conduitDetailLowerTable.addCell(new Cell().add(new Paragraph(conduitModel.getHorizonatalDistance())));
        conduitDetailLowerTable.addCell(new Cell().add(new Paragraph(conduitModel.getUpStream()).setTextAlignment(TextAlignment.CENTER)));
        conduitDetailLowerTable.addCell(new Cell().add(new Paragraph(conduitModel.getDownStream()).setTextAlignment(TextAlignment.CENTER)));
                         
        document.add(conduitDetailLowerTable);
        
        document.add(new Paragraph(""));
        
        SummaryModel summaryModel = new SummaryModel();
        
        document.add(new Paragraph("")); 
        document.add(new Paragraph(summaryModel.getSummary()).setTextAlignment(TextAlignment.CENTER));
        
        float[] summaryTopTableColumnWidths = {225F, 225F};
        Table summarytopTable = new Table(summaryTopTableColumnWidths);
        summarytopTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        summarytopTable.addCell(new Cell(1, 1).add(new Paragraph(summaryModel.getInletType())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        summarytopTable.addCell(new Cell(1, 1).add(new Paragraph(summaryModel.getInletElevation())).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
        
        document.add(summarytopTable);
        
        float[] summaryTableColumnWidths = {300F};
        Table summaryUpperTable = new Table(summaryTableColumnWidths);
        summaryUpperTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        
        summaryUpperTable.addCell(new Cell().add(new Paragraph(summaryModel.getConduit())));
        summaryUpperTable.addCell(new Cell().add(new Paragraph(summaryModel.getRiser())));
        summaryUpperTable.addCell(new Cell().add(new Paragraph(summaryModel.getAux())));
        
                
        document.add(summaryUpperTable);
        
        Table summaryLowerTable = new Table(summaryTableColumnWidths);
        summaryLowerTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        summaryLowerTable.addCell(new Cell().add(new Paragraph(summaryModel.getEffectiveHeight())));
        summaryLowerTable.addCell(new Cell().add(new Paragraph(summaryModel.getStorageHeight())));
        summaryLowerTable.addCell(new Cell().add(new Paragraph(summaryModel.getOverallHeight())));
       
        document.add(summaryLowerTable);
        
        document.add(new Paragraph(""));
        
        EarthworkModel earthworkModel = new EarthworkModel();
        
        document.add(new Paragraph("")); 
        document.add(new Paragraph(earthworkModel.getEarthWorkVolumes()).setTextAlignment(TextAlignment.CENTER));
        
        float[] earthworkTableColumnWidths = {150F, 100F, 100F};
        Table earthworkTable = new Table(earthworkTableColumnWidths);
        earthworkTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        earthworkTable.addCell(new Cell().add(new Paragraph(earthworkModel.getEarthWorkQuantities())));
        earthworkTable.addCell(new Cell().add(new Paragraph(earthworkModel.getConstructed())));
        earthworkTable.addCell(new Cell().add(new Paragraph(earthworkModel.getSettled())));
                   
        document.add(earthworkTable);
        
        document.add(new Paragraph(""));
        
        ProjectDefaultsModel projectDefaultsModel = new ProjectDefaultsModel();
        
        document.add(new Paragraph("")); 
        document.add(new Paragraph(projectDefaultsModel.getProjectDefaults()).setTextAlignment(TextAlignment.CENTER));
        
        float[] projectDefaultsTableColumnWidths = {300F};
        Table projectDefaultsTable = new Table(projectDefaultsTableColumnWidths);
        projectDefaultsTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getDesign())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getBermsSettled())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getAuxSpillway())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getFreeboard())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getMinBottomWidth())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getMaxBottomWidth())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getInlet())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getStorage())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getMinFlow())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getOrificeCoeff())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getPipeFlow())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getStageRequired())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getDrainageArea())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getPrincipalRouting())));
        projectDefaultsTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getAuxRouting())));
                   
                   
        document.add(projectDefaultsTable);
        
        document.add(new Paragraph(""));
        document.add(new Paragraph(""));
               
        float[] projectTableColumnWidths = {150F, 100F, 100F};
        Table projectTable = new Table(projectTableColumnWidths);
        projectTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        projectTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getProject())));
        projectTable.addCell(new Cell().add(new Paragraph("")));
        projectTable.addCell(new Cell().add(new Paragraph("")));
        projectTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getPreparedFor())));
        projectTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getTWP())));
        projectTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getRNG())));
        projectTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getPreparedBy())));
        projectTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getSEC())));
        projectTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getFLD())));
        projectTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getCheckedBy())));
        projectTable.addCell(new Cell().add(new Paragraph(projectDefaultsModel.getDate())));
        projectTable.addCell(new Cell().add(new Paragraph("")));
        
        document.add(projectTable);
        
        document.add(new Paragraph(""));
        
        ConstructionCheckoutModel constructionCheckoutModel = new ConstructionCheckoutModel();
        
        document.add(new Paragraph("")); 
        document.add(new Paragraph(constructionCheckoutModel.getConstructionCheckout()).setTextAlignment(TextAlignment.CENTER));
        document.add(new Paragraph("TBM # : Elev.  +  B.S.  =   H.I.    TBM Description").setTextAlignment(TextAlignment.CENTER));
        document.add(new Paragraph("TBM # : Elev.  +  B.S.  =   H.I.    TBM Description").setTextAlignment(TextAlignment.CENTER));
        
        float[] constructionCheckoutTableColumnWidths = {300F};
        Table constructionCheckoutTopTable = new Table(constructionCheckoutTableColumnWidths);
        constructionCheckoutTopTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        constructionCheckoutTopTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph(constructionCheckoutModel.getCenterlineProfile()).setTextAlignment(TextAlignment.CENTER)));
        
        document.add(constructionCheckoutTopTable);
        
        float[] constructionCheckoutUpperTableColumnWidths = {30F, 30F, 30F, 30F, 30F,30F, 30F, 30F, 30F, 30F};
        Table constructionCheckoutUpperTable = new Table(constructionCheckoutUpperTableColumnWidths);
        constructionCheckoutUpperTable.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph(constructionCheckoutModel.getSTA())));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph(constructionCheckoutModel.getRdg())));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph(constructionCheckoutModel.getConstructionElevation())));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph(constructionCheckoutModel.getPlanElevation())));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph(constructionCheckoutModel.getDev())));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph(constructionCheckoutModel.getSTA())));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph(constructionCheckoutModel.getRdg())));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph(constructionCheckoutModel.getConstructionElevation())));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph(constructionCheckoutModel.getPlanElevation())));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph(constructionCheckoutModel.getDev())));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph(constructionCheckoutModel.getEmbankmentProfile())));
        constructionCheckoutUpperTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph(constructionCheckoutModel.getEmbankmentProfile())));
        constructionCheckoutUpperTable.addCell(new Cell().setBorder(Border.NO_BORDER).add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        constructionCheckoutUpperTable.addCell(new Cell().add(new Paragraph("")));
        
        document.add(constructionCheckoutUpperTable);
        
        document.add(new Paragraph("\\1 Planned elevations for top of dam are based on   0 % settlement.").setTextAlignment(TextAlignment.CENTER));
        
        document.add(new Paragraph(""));

        document.add(new Paragraph(principalSpillwayModel.getPrincipalSpillwayElev()).setTextAlignment(TextAlignment.CENTER));
       
        float[] principalSpillwayElevTableColumnWidths = {60F, 60F, 60F, 60F, 60F};
        Table principalSpillwayElevTable = new Table(principalSpillwayElevTableColumnWidths);
        principalSpillwayElevTable.setHorizontalAlignment(HorizontalAlignment.CENTER);  
        
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getInlet())));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getOutlet())));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph(principalSpillwayModel.getChannel())));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        principalSpillwayElevTable.addCell(new Cell().add(new Paragraph("")));
        
        document.add(principalSpillwayElevTable);

        //Close document
        document.close();
    }
}
