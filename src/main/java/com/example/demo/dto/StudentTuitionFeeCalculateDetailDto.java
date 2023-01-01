package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;

import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.FeeItem;
import com.globits.education.domain.StudentTuitionFeeCalculateDetail;

public class StudentTuitionFeeCalculateDetailDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private StudentTuitionFeeCalculateDto studentTuitionFeeCalculate;
	
	private Long studentTuitionFeeCalculateId;
	
	private StudentCourseSubjectDto studentCourseSubject;
	private CourseSubjectDto courseSubject;
	private String semesterCode;
	private String registerPeriodCode;
	private String subjectCode;
	private String subjectName;
	private Integer numberOfCredit;
	
	private FeeItemDto feeItem;//loại khoản	
	
	private String feeItemName;
	
	private Long feeItemId;
	private Double basicFeeUnit;
	private Double feeUnit;//mức phí đơn vị (số tiền/tín chỉ)	
	
	private Integer learningType;//Kiểu học: học đi, học lại, nâng điểm	
	
	private Double tuitionFee;//Số học phí	
	
	private Double discountPercent;//% Miễn giảm 	
	
	private Double discountValue;//số tiền Miễn giảm 	
	/**
	 * Phần trăm học phí sau khi hủy học phần
	 * Mặc định = 100% tương đương với chưa hủy hoặc hủy nhưng vẫn tính phí như thường
	 * Nếu =0% nghĩa là hủy nhưng không tính phí
	 */
	private Double cancelFeePercent=100D;
	
	/**
	 * Phí hủy học phần
	 */
	private Double cancelFee=0D;
	private Double restAmount;//Số tiền phải đóng sau khi trừ các khoản miễn giảm	
	
	private Integer formula;//Công thức tính
	private Boolean isMainSpec;//Là ngành chính	
	private Double objectCoefficient;//Hệ số đối tượng	
	private Double subjectCoefficient;//Hệ số Môn học	
	private String note;//Ghi chú
	/*
	 * Trạng thái
	 * 0 hoặc null: bình thường
	 * -1: đã hủy học phần
	 * EducationConstant.TuitionFeeCalculateDetailStatus
	 */
	private Integer status;//Trạng thái
	private Double courseSubjectCoefficient;//Hệ số  học phí lớp học phần	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StudentTuitionFeeCalculateDto getStudentTuitionFeeCalculate() {
		return studentTuitionFeeCalculate;
	}
	public void setStudentTuitionFeeCalculate(StudentTuitionFeeCalculateDto studentTuitionFeeCalculate) {
		this.studentTuitionFeeCalculate = studentTuitionFeeCalculate;
	}
	public Long getStudentTuitionFeeCalculateId() {
		return studentTuitionFeeCalculateId;
	}
	public void setStudentTuitionFeeCalculateId(Long studentTuitionFeeCalculateId) {
		this.studentTuitionFeeCalculateId = studentTuitionFeeCalculateId;
	}
	public StudentCourseSubjectDto getStudentCourseSubject() {
		return studentCourseSubject;
	}
	public void setStudentCourseSubject(StudentCourseSubjectDto studentCourseSubject) {
		this.studentCourseSubject = studentCourseSubject;
	}
	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}
	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}
	public String getSemesterCode() {
		return semesterCode;
	}
	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}
	public String getRegisterPeriodCode() {
		return registerPeriodCode;
	}
	public void setRegisterPeriodCode(String registerPeriodCode) {
		this.registerPeriodCode = registerPeriodCode;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Integer getNumberOfCredit() {
		return numberOfCredit;
	}
	public void setNumberOfCredit(Integer numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}
	
	public FeeItemDto getFeeItem() {
		return feeItem;
	}
	public void setFeeItem(FeeItemDto feeItem) {
		this.feeItem = feeItem;
	}
	public String getFeeItemName() {
		return feeItemName;
	}
	public void setFeeItemName(String feeItemName) {
		this.feeItemName = feeItemName;
	}
	public Long getFeeItemId() {
		return feeItemId;
	}
	public void setFeeItemId(Long feeItemId) {
		this.feeItemId = feeItemId;
	}
	public Double getBasicFeeUnit() {
		return basicFeeUnit;
	}
	public void setBasicFeeUnit(Double basicFeeUnit) {
		this.basicFeeUnit = basicFeeUnit;
	}
	public Double getFeeUnit() {
		return feeUnit;
	}
	public void setFeeUnit(Double feeUnit) {
		this.feeUnit = feeUnit;
	}
	public Integer getLearningType() {
		return learningType;
	}
	public void setLearningType(Integer learningType) {
		this.learningType = learningType;
	}
	public Double getTuitionFee() {
		return tuitionFee;
	}
	public void setTuitionFee(Double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}
	public Double getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}
	
	public Double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Double getCancelFeePercent() {
		return cancelFeePercent;
	}
	public void setCancelFeePercent(Double cancelFeePercent) {
		this.cancelFeePercent = cancelFeePercent;
	}
	public Double getCancelFee() {
		return cancelFee;
	}
	public void setCancelFee(Double cancelFee) {
		this.cancelFee = cancelFee;
	}
	public Double getRestAmount() {
		return restAmount;
	}
	public void setRestAmount(Double restAmount) {
		this.restAmount = restAmount;
	}
	public Integer getFormula() {
		return formula;
	}
	public void setFormula(Integer formula) {
		this.formula = formula;
	}
	public Boolean getIsMainSpec() {
		return isMainSpec;
	}
	public void setIsMainSpec(Boolean isMainSpec) {
		this.isMainSpec = isMainSpec;
	}
	public Double getObjectCoefficient() {
		return objectCoefficient;
	}
	public void setObjectCoefficient(Double objectCoefficient) {
		this.objectCoefficient = objectCoefficient;
	}
	public Double getSubjectCoefficient() {
		return subjectCoefficient;
	}
	public void setSubjectCoefficient(Double subjectCoefficient) {
		this.subjectCoefficient = subjectCoefficient;
	}	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}	
	public Double getCourseSubjectCoefficient() {
		return courseSubjectCoefficient;
	}
	public void setCourseSubjectCoefficient(Double courseSubjectCoefficient) {
		this.courseSubjectCoefficient = courseSubjectCoefficient;
	}
	public StudentTuitionFeeCalculateDetailDto() {
		
	}
	public StudentTuitionFeeCalculateDetailDto(StudentTuitionFeeCalculateDetail entity) {
		if(entity!=null) {
			this.id = entity.getId();
			if(entity.getFeeItem()!=null) {
				this.feeItemId = entity.getFeeItem().getId();
				this.feeItemName = entity.getFeeItem().getName();
			}
			this.basicFeeUnit = entity.getBasicFeeUnit();
			this.feeUnit = entity.getFeeUnit();
			this.formula = entity.getFormula();
			this.isMainSpec = entity.getIsMainSpec();
			this.tuitionFee = entity.getTuitionFee();
			this.learningType = entity.getLearningType();
			this.discountPercent = entity.getDiscountPercent();		
			this.discountValue = entity.getDiscountValue();
			this.cancelFee = entity.getCancelFee();
			this.cancelFeePercent = entity.getCancelFeePercent();
			this.objectCoefficient = entity.getObjectCoefficient();
			this.subjectCoefficient = entity.getSubjectCoefficient();
			this.courseSubjectCoefficient=entity.getCourseSubjectCoefficient();
			this.restAmount = entity.getRestAmount();
			this.note = entity.getNote();
			if(entity.getStudentTuitionFeeCalculate()!=null) {
				this.studentTuitionFeeCalculateId = entity.getStudentTuitionFeeCalculate().getId();
			}
//			if(entity.getStudentCourseSubject()!=null && entity.getStudentCourseSubject().getCourseSubject()!=null
//					&& entity.getStudentCourseSubject().getCourseSubject().getSemesterSubject()!=null) {
//				if(entity.getStudentCourseSubject().getCourseSubject().getSemesterSubject().getSubject()!=null) {
//					this.numberOfCredit = entity.getStudentCourseSubject().getCourseSubject().getSemesterSubject().getSubject().getNumberOfCredit();
//					this.subjectCode = entity.getStudentCourseSubject().getCourseSubject().getSemesterSubject().getSubject().getSubjectCode();
//					this.subjectName = entity.getStudentCourseSubject().getCourseSubject().getSemesterSubject().getSubject().getSubjectName();
//				}
//				if(entity.getStudentCourseSubject().getCourseSubject().getSemesterSubject().getSemester()!=null) {
//					this.semesterCode = entity.getStudentCourseSubject().getCourseSubject().getSemesterSubject().getSemester().getSemesterCode();
//					if(entity.getStudentCourseSubject().getCourseSubject().getSemesterSubject().getRegisterPeriod()!=null)
//						this.registerPeriodCode = entity.getStudentCourseSubject().getCourseSubject().getSemesterSubject().getRegisterPeriod().getName();
//				}
//			}
			if(entity.getCourseSubject()!=null) {
				this.courseSubject = new CourseSubjectDto();
				this.courseSubject.setId(entity.getCourseSubject().getId());
				this.courseSubject.setDisplayName(entity.getCourseSubject().getDisplayName());
				this.courseSubject.setCode(entity.getCourseSubject().getCode());
				this.courseSubject.setShortCode(entity.getCourseSubject().getShortCode());
				if(entity.getCourseSubject().getSemesterSubject().getSubject()!=null) {
					this.numberOfCredit = entity.getCourseSubject().getSemesterSubject().getSubject().getNumberOfCredit();
					this.subjectCode = entity.getCourseSubject().getSemesterSubject().getSubject().getSubjectCode();
					this.subjectName = entity.getCourseSubject().getSemesterSubject().getSubject().getSubjectName();
				}
				if(entity.getCourseSubject().getSemesterSubject().getSemester()!=null) {
					this.semesterCode = entity.getCourseSubject().getSemesterSubject().getSemester().getSemesterCode();
					if(entity.getCourseSubject().getSemesterSubject().getRegisterPeriod()!=null)
						this.registerPeriodCode = entity.getCourseSubject().getSemesterSubject().getRegisterPeriod().getName();
				}
			}
			this.status = entity.getStatus();
		}
	}
}
