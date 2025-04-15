package main.design.pattern.structural.facade;

import java.sql.Connection;

public class Driver {

	public static void main(String[] args) {

		Connection con = null;
		String tableName = "";

		/* you can use tihs */
		ExcelReport ex = new ExcelReportImp();
		ex.generateExcelReport(con, tableName);

		/* This is the cleaner */
		ReportFacade facade = new ReportFacade();
		facade.generateExcelReport(con, tableName);
		facade.generatePdfReport(con, tableName);
	}

}
