
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
		}else if(score >= 80) {
			str += "A";
		}else if(score >= 70) {
			str += "B";
		}else if(score >= 60) {
			str += "C";
		}else if(score >= 50) {
			str += "D";
		}else if(score >= 0){
			str += "F";
		}else{
			str += "lower";
		}
		return str;
	}
	
}
