package model;

/**
 * Score entity. @author MyEclipse Persistence Tools
 */

public class Score implements java.io.Serializable {

	// Fields

	private Integer scoreId;
	private Integer studentId;
	private Integer iessonId;
	private Integer score;

	// Constructors

	/** default constructor */
	public Score() {
	}

	/** minimal constructor */
	public Score(Integer studentId, Integer iessonId) {
		this.studentId = studentId;
		this.iessonId = iessonId;
	}

	/** full constructor */
	public Score(Integer studentId, Integer iessonId, Integer score) {
		this.studentId = studentId;
		this.iessonId = iessonId;
		this.score = score;
	}

	// Property accessors

	public Integer getScoreId() {
		return this.scoreId;
	}

	public void setScoreId(Integer scoreId) {
		this.scoreId = scoreId;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getIessonId() {
		return this.iessonId;
	}

	public void setIessonId(Integer iessonId) {
		this.iessonId = iessonId;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}