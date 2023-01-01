package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.globits.education.domain.EquivalentSubject;
import com.globits.education.domain.GroupSubjectProgram;
import com.globits.education.domain.PrerequisiteSubject;
import com.globits.education.domain.ProgramSubject;

public class ProgramSubjectDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private EducationProgramDto program;
	private SubjectDto subject;
	private Integer mark;
	private Integer semester;
	private List<PrerequisiteSubjectDto> prerequiteSubjects;
	private GroupSubjectProgramDto group;
	private String displaySubjectName;
	private List<PrerequisiteSubjectDto> children;
	private boolean isRoot;
	private KnowledgeProgramDto knowledgeProgram;
	private Integer subjectType; //(0= hỗn hợp, 1= bắt buộc, 2 = tự chọn, 3 = chứng chỉ, 4 = cần học - có đi học không tính điểm)
	private Integer semesterIndex;//Môn học này thuộc học kỳ nào(HK I - II...IX).
	private List<EquivalentSubjectDto> equivalentSubjects;
	private Double tuitionCoefficient;
	private Double feePerCredit;
	
	/*START
	 * Các thuộc tính dưới đây Dùng cho tính năng kiểm tra hoàn thành chương trình đào tạo
	 */
	private Boolean hasMark;//Đã có điểm
	private Boolean passed;//Đã qua môn	
	private Double mark4;//Điểm thang 4
	private String charMark;//điểm chữ
	private Double subjectMark;//Điểm thang 10
	private Integer result;//Kết quả thi: DAT = 1, HOCLAI=-1, THILAI=-2
	/*
	 * END
	 */
	private Long programId;
	private Long subjectId;
	private Long knowledgeProgramId;
	private String subjectCode;
	private Boolean checked;
	
	public Double getFeePerCredit() {
		return feePerCredit;
	}

	public void setFeePerCredit(Double feePerCredit) {
		this.feePerCredit = feePerCredit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EducationProgramDto getProgram() {
		return program;
	}

	public void setProgram(EducationProgramDto program) {
		this.program = program;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public List<PrerequisiteSubjectDto> getPrerequiteSubjects() {
		return prerequiteSubjects;
	}

	public void setPrerequiteSubjects(List<PrerequisiteSubjectDto> prerequiteSubjects) {
		this.prerequiteSubjects = prerequiteSubjects;
	}

	public GroupSubjectProgramDto getGroup() {
		return group;
	}

	public void setGroup(GroupSubjectProgramDto group) {
		this.group = group;
	}

	public String getDisplaySubjectName() {
		return displaySubjectName;
	}

	public void setDisplaySubjectName(String displaySubjectName) {
		this.displaySubjectName = displaySubjectName;
	}

	public List<PrerequisiteSubjectDto> getChildren() {
		return children;
	}

	public void setChildren(List<PrerequisiteSubjectDto> children) {
		this.children = children;
	}
	
	public boolean isRoot() {
		return isRoot;
	}

	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;
	}

	public KnowledgeProgramDto getKnowledgeProgram() {
		return knowledgeProgram;
	}

	public void setKnowledgeProgram(KnowledgeProgramDto knowledgeProgram) {
		this.knowledgeProgram = knowledgeProgram;
	}
	
	public Integer getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(Integer subjectType) {
		this.subjectType = subjectType;
	}
	
	public Integer getSemesterIndex() {
		return semesterIndex;
	}

	public void setSemesterIndex(Integer semesterIndex) {
		this.semesterIndex = semesterIndex;
	}

	public Boolean getHasMark() {
		return hasMark;
	}

	public void setHasMark(Boolean hasMark) {
		this.hasMark = hasMark;
	}

	public Boolean getPassed() {
		return passed;
	}

	public void setPassed(Boolean passed) {
		this.passed = passed;
	}

	public Double getMark4() {
		return mark4;
	}

	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}

	public String getCharMark() {
		return charMark;
	}

	public void setCharMark(String charMark) {
		this.charMark = charMark;
	}

	public Double getSubjectMark() {
		return subjectMark;
	}

	public void setSubjectMark(Double subjectMark) {
		this.subjectMark = subjectMark;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public List<EquivalentSubjectDto> getEquivalentSubjects() {
		return equivalentSubjects;
	}

	public void setEquivalentSubjects(List<EquivalentSubjectDto> equivalentSubjects) {
		this.equivalentSubjects = equivalentSubjects;
	}

	public Double getTuitionCoefficient() {
		return tuitionCoefficient;
	}

	public void setTuitionCoefficient(Double tuitionCoefficient) {
		this.tuitionCoefficient = tuitionCoefficient;
	}	

	public Long getProgramId() {
		return programId;
	}

	public void setProgramId(Long programId) {
		this.programId = programId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getKnowledgeProgramId() {
		return knowledgeProgramId;
	}

	public void setKnowledgeProgramId(Long knowledgeProgramId) {
		this.knowledgeProgramId = knowledgeProgramId;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}	

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public ProgramSubjectDto() {

	}

}
