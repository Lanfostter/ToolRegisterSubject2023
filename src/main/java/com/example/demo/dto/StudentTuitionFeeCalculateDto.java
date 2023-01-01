package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globits.education.domain.Student;
import com.globits.education.domain.StudentTuitionFeeCalculate;
import com.globits.education.domain.StudentTuitionFeeCalculateDetail;

public class StudentTuitionFeeCalculateDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentDto student;	
	
	private SemesterDto semester;	
	
	private SemesterRegisterPeriodDto registerPeriod;
	
	private List<StudentTuitionFeeCalculateDetailDto> details;
	
	private Date calculateDate;
	private Integer numberOfSubject;//Số học phần	
	
	private Integer numberOfCredit;//Số tín chỉ
	private Double totalTuitionFee;//Tổng số học phí (chưa trừ các khoản miễn giảm)
	private Double firstTimeLearnFee;//Học phí các môn học lần 1
	private Double relearnFee;//Học phí các môn học lại
	private Double upgradeMarkFee;//Học phí các môn học nâng điểm
	private Double discountPercent;//Miễn giảm %	
	private Double discountValue;//Miễn giảm số tiền	
	private Double restAmount;//Số tiền phải đóng sau khi trừ các khoản miễn giảm	
	private Boolean isLock;//Đã chốt học phí	
	private Double account;
	private String trainingBaseName;
	private String className;
	/*
	 * Loại học phí
	 * 0: học phí lớp riêng
	 * 1: học phí lớp thường
	 * Const: StudentTuitionFeeCalculateTypeEnum
	 */	
	private Integer type;
	private String modifiedBy;
	private Boolean voided;
	private String createdBy;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}
	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}
	
	public List<StudentTuitionFeeCalculateDetailDto> getDetails() {
		return details;
	}
	public void setDetails(List<StudentTuitionFeeCalculateDetailDto> details) {
		this.details = details;
	}
	public Date getCalculateDate() {
		return calculateDate;
	}
	public void setCalculateDate(Date calculateDate) {
		this.calculateDate = calculateDate;
	}
	public Integer getNumberOfSubject() {
		return numberOfSubject;
	}
	public void setNumberOfSubject(Integer numberOfSubject) {
		this.numberOfSubject = numberOfSubject;
	}
	public Integer getNumberOfCredit() {
		return numberOfCredit;
	}
	public void setNumberOfCredit(Integer numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}
	public Double getTotalTuitionFee() {
		return totalTuitionFee;
	}
	public void setTotalTuitionFee(Double totalTuitionFee) {
		this.totalTuitionFee = totalTuitionFee;
	}
	public Double getFirstTimeLearnFee() {
		return firstTimeLearnFee;
	}
	public void setFirstTimeLearnFee(Double firstTimeLearnFee) {
		this.firstTimeLearnFee = firstTimeLearnFee;
	}
	public Double getRelearnFee() {
		return relearnFee;
	}
	public void setRelearnFee(Double relearnFee) {
		this.relearnFee = relearnFee;
	}
	public Double getUpgradeMarkFee() {
		return upgradeMarkFee;
	}
	public void setUpgradeMarkFee(Double upgradeMarkFee) {
		this.upgradeMarkFee = upgradeMarkFee;
	}
	public Double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Double getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}
	public Double getRestAmount() {
		return restAmount;
	}
	public void setRestAmount(Double restAmount) {
		this.restAmount = restAmount;
	}
	public Boolean getIsLock() {
		return isLock;
	}
	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}
	public Double getAccount() {
		return account;
	}
	public void setAccount(Double account) {
		this.account = account;
	}	
	public String getTrainingBaseName() {
		return trainingBaseName;
	}
	public void setTrainingBaseName(String trainingBaseName) {
		this.trainingBaseName = trainingBaseName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}	
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	public Boolean getVoided() {
		return voided;
	}
	public void setVoided(Boolean voided) {
		this.voided = voided;
	}	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public StudentTuitionFeeCalculateDto() {
		
	}
	public StudentTuitionFeeCalculateDto(StudentTuitionFeeCalculate entity) {
		if(entity!=null) {
			this.id = entity.getId();
			if(entity.getStudent()!=null) {
				this.student = new StudentDto();
				this.student.setId(entity.getStudent().getId());
				this.student.setStudentCode(entity.getStudent().getStudentCode());
				this.student.setDisplayName(entity.getStudent().getDisplayName());
				this.student.setBankAccount(entity.getStudent().getBankAccount());
				if(entity.getStudent().getEnrollmentClass()!=null&&entity.getStudent().getEnrollmentClass().getClassName()!=null){
					this.student.setClassName(entity.getStudent().getEnrollmentClass().getClassName());
					this.className=entity.getStudent().getEnrollmentClass().getClassName();
				}
			}
			if(entity.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(entity.getSemester().getId());
				this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
				this.semester.setSemesterName(entity.getSemester().getSemesterName());
			}
			if(entity.getRegisterPeriod()!=null) {
				this.registerPeriod = new SemesterRegisterPeriodDto();
				this.registerPeriod.setId(entity.getRegisterPeriod().getId());
				this.registerPeriod.setName(entity.getRegisterPeriod().getName());
			}
			this.account = entity.getAccount();
			this.calculateDate = entity.getCalculateDate();
			this.discountPercent = entity.getDiscountPercent();
			this.discountValue = entity.getDiscountValue();
			this.isLock = entity.getIsLock();
			this.numberOfCredit = entity.getNumberOfCredit();
			this.numberOfSubject = entity.getNumberOfSubject();
			this.relearnFee = entity.getRelearnFee();
			this.firstTimeLearnFee = entity.getFirstTimeLearnFee();
			this.upgradeMarkFee = entity.getUpgradeMarkFee();
			this.restAmount = entity.getRestAmount();
			this.totalTuitionFee = entity.getTotalTuitionFee();
			this.type = entity.getType();
			this.modifiedBy=entity.getModifiedBy();
			this.voided=entity.getVoided();
			this.createdBy=entity.getCreatedBy();
			if(entity.getTrainingBase()!=null) {
				this.trainingBaseName=entity.getTrainingBase().getName();
			}
			
			if(entity.getDetails()!=null && entity.getDetails().size()>0) {
				this.details = new ArrayList<StudentTuitionFeeCalculateDetailDto>();
				for (StudentTuitionFeeCalculateDetail detail : entity.getDetails()) {					
					this.details.add(new StudentTuitionFeeCalculateDetailDto(detail));
				}
			}
		}
	}
	public StudentTuitionFeeCalculateDto(StudentTuitionFeeCalculate entity,Student student) {
		if(student!=null) {
			this.student = new StudentDto();
			this.student.setId(student.getId());
			this.student.setStudentCode(student.getStudentCode());
			this.student.setDisplayName(student.getDisplayName());
			this.student.setBankAccount(student.getBankAccount());
			if(student.getEnrollmentClass()!=null&&student.getEnrollmentClass().getClassName()!=null) {
				this.student.setClassName(student.getEnrollmentClass().getClassName());
				this.className=student.getEnrollmentClass().getClassName();
			}
		}
		if(entity!=null) {
			this.id = entity.getId();			
			if(entity.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(entity.getSemester().getId());
				this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
				this.semester.setSemesterName(entity.getSemester().getSemesterName());
			}
			if(entity.getRegisterPeriod()!=null) {
				this.registerPeriod = new SemesterRegisterPeriodDto();
				this.registerPeriod.setId(entity.getRegisterPeriod().getId());
				this.registerPeriod.setName(entity.getRegisterPeriod().getName());
			}
			this.account = entity.getAccount();
			this.calculateDate = entity.getCalculateDate();
			this.discountPercent = entity.getDiscountPercent();
			this.discountValue = entity.getDiscountValue();
			this.isLock = entity.getIsLock();
			this.numberOfCredit = entity.getNumberOfCredit();
			this.numberOfSubject = entity.getNumberOfSubject();
			this.relearnFee = entity.getRelearnFee();
			this.firstTimeLearnFee = entity.getFirstTimeLearnFee();
			this.upgradeMarkFee = entity.getUpgradeMarkFee();
			this.restAmount = entity.getRestAmount();
			this.totalTuitionFee = entity.getTotalTuitionFee();
			this.type = entity.getType();
//			if(entity.getDetails()!=null && entity.getDetails().size()>0) {
//				this.details = new ArrayList<StudentTuitionFeeCalculateDetailDto>();
//				for (StudentTuitionFeeCalculateDetail detail : entity.getDetails()) {					
//					this.details.add(new StudentTuitionFeeCalculateDetailDto(detail));
//				}
//			}
			if(entity.getTrainingBase()!=null) {
				this.trainingBaseName=entity.getTrainingBase().getName();
			}
		}
		else {
			this.numberOfCredit = 0;
			this.numberOfSubject = 0;
			this.relearnFee = 0D;
			this.firstTimeLearnFee = 0D;
			this.upgradeMarkFee = 0D;
			this.restAmount = 0D;
			this.totalTuitionFee = 0D;
		}
	}
}
