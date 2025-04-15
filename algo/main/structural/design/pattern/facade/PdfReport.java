package main.structural.design.pattern.facade;

import java.sql.Connection;

public interface PdfReport {
	void generatePdfReport(Connection con, String tableName);
}
