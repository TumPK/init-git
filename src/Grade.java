
public class Grade {
	public double score;
	
	public Grade(double score) {
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public String calculateGrade() {
		double score = this.getScore();
		String str = "";
		if(score > 100) {
			str += "over";
		}else {
			str += "ok";
		}
		return str;
	}
	
}
