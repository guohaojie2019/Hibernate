package model;

/**
 * Lesson entity. @author MyEclipse Persistence Tools
 */

public class Lesson implements java.io.Serializable {

	// Fields

	private Integer lessonId;
	private String lessonName;
	private Integer teacherId;

	// Constructors

	/** default constructor */
	public Lesson() {
	}

	/** full constructor */
	public Lesson(String lessonName, Integer teacherId) {
		this.lessonName = lessonName;
		this.teacherId = teacherId;
	}

	// Property accessors

	public Integer getLessonId() {
		return this.lessonId;
	}

	public void setLessonId(Integer lessonId) {
		this.lessonId = lessonId;
	}

	public String getLessonName() {
		return this.lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public Integer getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

}