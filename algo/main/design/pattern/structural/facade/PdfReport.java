package main.design.pattern.structural.facade;

import java.sql.Connection;

public interface PdfReport {
	void generatePdfReport(Connection con, String tableName);
}
