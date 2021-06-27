package homework05oop01._02.employee;

public enum Positions {
	JUNIOR("Junior developer"), MIDDLE("Average Java developer"), SENIOR, TECH_LEAD;

	private String position;

	private Positions() {
	}

	private Positions(String position) {
		this.position = position;
	}

	public String getPosition() {
		return position;
		
	}
}
