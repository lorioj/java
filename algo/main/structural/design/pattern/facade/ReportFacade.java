package main.structural.design.pattern.facade;

import java.sql.Connection;

public class ReportFacade {

	private ExcelReport excelReport;

	private PdfReport pdfReport;

	public ReportFacade() {
		this.excelReport = new ExcelReportImp();
		this.pdfReport = new PdfReportImp();
	}

	public void generateExcelReport(Connection con, String tableName) {
		this.excelReport.generateExcelReport(con, tableName);
	}

	public void generatePdfReport(Connection con, String tableName) {
		this.pdfReport.generatePdfReport(con, tableName);
	}

}
