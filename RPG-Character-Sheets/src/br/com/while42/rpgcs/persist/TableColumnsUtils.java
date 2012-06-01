package br.com.while42.rpgcs.persist;

public class TableColumnsUtils {
	public String getAsCommaSeparatedString(String[] columns) {
		return this.getAsCommaSeparatedString(columns, 0);
	}

	public String getAsCommaSeparatedStringWithoutFirstColumn(String[] columns) {
		return this.getAsCommaSeparatedString(columns, 1);
	}

	public String getQuestionMarks(String[] columns) {
		return this.getQuestionMarks(columns, 0);
	}

	public String getQuestionMarksWithoutFirstColumn(String[] columns) {
		return this.getQuestionMarks(columns, 1);
	}

	private String getQuestionMarks(String[] columns, int firstColumn) {
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		for (int i = firstColumn; i < columns.length; i++) {
			sb.append("?");
			if (i + 1 < columns.length) {
				sb.append(", ");
			}
		}
		sb.append(")");

		return sb.toString();
	}

	private String getAsCommaSeparatedString(String[] columns, int firstColumn) {
		StringBuilder sb = new StringBuilder();
		for (int i = firstColumn; i < columns.length; i++) {
			sb.append(columns[i]);
			if (i + 1 < columns.length) {
				sb.append(", ");
			}
		}

		return sb.toString();
	}
}
