package com.example.demo.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.globits.core.domain.TrainingBase;
import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.EnrollmentClass;
import com.globits.hr.dto.StaffDto;

@XmlRootElement
public class EnrollmentClassDto implements Serializable {
	private static final long serialVersionUID = 5405782142010466260L;
	private Long id;
	private String className;
	private String classCode;
	private Integer schoolYear;
	private DepartmentDto department;
	private SpecialityDto speciality;
	private Integer retCode=1;
	private CourseYearDto courseyear;
	private Long numberOfStudent;
	private Long numberOfFemale;
	private Long numberOfBoarding ;
	private StaffDto teacher;
	private TrainingBaseDto trainingBase;
	private int pageIndex;
	private int pageSize;
	private boolean isDuplicateCode; //để kiểm tra xem có trùng mã không
	private int numberOfClasses;
	private EducationProgramDto program;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public Integer getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(Integer schoolYear) {
		this.schoolYear = schoolYear;
	}

	public Integer getRetCode() {
		return retCode;
	}

	public void setRetCode(Integer retCode) {
		this.retCode = retCode;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}

	public SpecialityDto getSpeciality() {
		return speciality;
	}

	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}

	public CourseYearDto getCourseyear() {
		return courseyear;
	}

	public void setCourseyear(CourseYearDto courseyear) {
		this.courseyear = courseyear;
	}

	public StaffDto getTeacher() {
		return teacher;
	}

	public void setTeacher(StaffDto teacher) {
		this.teacher = teacher;
	}

	public Long getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(Long numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public Long getNumberOfFemale() {
		return numberOfFemale;
	}

	public void setNumberOfFemale(Long numberOfFemale) {
		this.numberOfFemale = numberOfFemale;
	}

	public Long getNumberOfBoarding() {
		return numberOfBoarding;
	}

	public void setNumberOfBoarding(Long numberOfBoarding) {
		this.numberOfBoarding = numberOfBoarding;
	}

	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public boolean isDuplicateCode() {
		return isDuplicateCode;
	}

	public void setDuplicateCode(boolean isDuplicateCode) {
		this.isDuplicateCode = isDuplicateCode;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}	

	public EducationProgramDto getProgram() {
		return program;
	}

	public void setProgram(EducationProgramDto program) {
		this.program = program;
	}

	public EnrollmentClassDto() {

	}

	public EnrollmentClassDto(EnrollmentClass enrollmentClass) {
		if (enrollmentClass != null) {
			this.classCode = enrollmentClass.getClassCode();
			this.className = enrollmentClass.getClassName();
			this.id = enrollmentClass.getId();
			if (enrollmentClass.getCourseyear() != null) {
				this.courseyear = new CourseYearDto(enrollmentClass.getCourseyear());
			}
			if (enrollmentClass.getDepartment() != null) {
				this.department = new DepartmentDto(enrollmentClass.getDepartment());
			}
			this.numberOfStudent =enrollmentClass.getNumberOfStudent();
			if(enrollmentClass.getSpeciality()!=null) {
				this.speciality = new SpecialityDto(enrollmentClass.getSpeciality());
			}
			
			if(enrollmentClass.getTrainingBase()!=null) {
				this.trainingBase=new TrainingBaseDto();
				this.trainingBase.setId(enrollmentClass.getTrainingBase().getId());
				this.trainingBase.setCode(enrollmentClass.getTrainingBase().getCode());
				this.trainingBase.setName(enrollmentClass.getTrainingBase().getName());
			}
			this.schoolYear= enrollmentClass.getSchoolYear();
			if(enrollmentClass.getProgram()!=null) {
				this.program=new EducationProgramDto();
				this.program.setId(enrollmentClass.getProgram().getId());
				this.program.setCode(enrollmentClass.getProgram().getCode());
				this.program.setName(enrollmentClass.getProgram().getName());
				if(enrollmentClass.getProgram().getCourseYear()!=null) {
					CourseYearDto cs=new CourseYearDto();
					cs.setId(enrollmentClass.getProgram().getCourseYear().getId());
					cs.setCode(enrollmentClass.getProgram().getCourseYear().getCode());
					cs.setName(enrollmentClass.getProgram().getCourseYear().getName());
					this.program.setCourseYear(cs);
				}
				
			}
		}
	}
	
	public EnrollmentClassDto(EnrollmentClass enrollmentClass, boolean isSimple) {
		if (enrollmentClass != null && isSimple == true) {
			this.classCode = enrollmentClass.getClassCode();
			this.className = enrollmentClass.getClassName();
			this.id = enrollmentClass.getId();
		}
	}
	
	public EnrollmentClassDto(EnrollmentClass enrollmentClass, boolean isSimple, int type) {
		if (enrollmentClass != null) {
			this.classCode = enrollmentClass.getClassCode();
			this.className = enrollmentClass.getClassName();
			this.id = enrollmentClass.getId();
		}
		if(enrollmentClass.getSpeciality()!=null) {
			this.speciality = new SpecialityDto(enrollmentClass.getSpeciality(), false);
		}
		if (enrollmentClass.getDepartment() != null) {
			this.department = new DepartmentDto(enrollmentClass.getDepartment());
		}
		if (enrollmentClass.getCourseyear() != null) {
			this.courseyear = new CourseYearDto(enrollmentClass.getCourseyear(), false);
		}
		if(enrollmentClass.getTrainingBase()!=null) {
			this.trainingBase = new TrainingBaseDto();
			this.trainingBase.setId(enrollmentClass.getTrainingBase().getId());
			this.trainingBase.setCode(enrollmentClass.getTrainingBase().getCode());
			this.trainingBase.setName(enrollmentClass.getTrainingBase().getName());
		}
	}

}
