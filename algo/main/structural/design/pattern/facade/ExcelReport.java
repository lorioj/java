package main.structural.design.pattern.facade;

import java.sql.Connection;

public interface ExcelReport {
	void generateExcelReport(Connection con, String tableName);
}
