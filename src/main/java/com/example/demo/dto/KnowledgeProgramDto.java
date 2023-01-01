package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.globits.education.domain.KnowledgeProgram;
import com.globits.education.domain.Speciality;
import com.globits.education.domain.Subject;


public class KnowledgeProgramDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4936305148343592141L;

	private Long id;
	
	private Integer blockType;//(0= hỗn hợp, 1= bắt buộc, 2 = tự chọn, 3 = chứng chỉ, 4 = cần học - có đi học không tính điểm)
	private KnowledgeBlockDto knowledgeBlock;
	private EducationProgramDto program;
	private Integer minNumberCredit=0;//Số lượng tín chỉ tối thiểu cần tích lũy cho nhóm kiến thức này
	private Integer totalCredit;//Tổng số tín chỉ
	private Integer numberCourseSubject;//Số học phần
	private List<KnowledgeProgramDto> children;
	private KnowledgeProgramDto parent;
	private String displayName;
	private boolean isHaveChil;
	private SpecialityDto subSpeciality;//Chuyên ngành
	private Integer passedCredits=0;//Số tín chỉ đã tích lũy (dành cho trường hợp tra cứu điểm của 1 sinh viên)
	private List<ProgramSubjectDto> listProgramSubject;
	private List<StudentSubjectMarkDto> listStudentSubjectMark;
	private Boolean isComplete;
	private String blockName;
	private Boolean expanded=true;//thu hẹp hay mở rộng list tree
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
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
	public KnowledgeBlockDto getKnowledgeBlock() {
		return knowledgeBlock;
	}
	public void setKnowledgeBlock(KnowledgeBlockDto knowledgeBlock) {
		this.knowledgeBlock = knowledgeBlock;
	}
	public Integer getBlockType() {
		return blockType;
	}
	public void setBlockType(Integer blockType) {
		this.blockType = blockType;
	}
	public Integer getMinNumberCredit() {
		return minNumberCredit;
	}
	public void setMinNumberCredit(Integer minNumberCredit) {
		this.minNumberCredit = minNumberCredit;
	}
	public Integer getTotalCredit() {
		return totalCredit;
	}
	public void setTotalCredit(Integer totalCredit) {
		this.totalCredit = totalCredit;
	}
	public Integer getNumberCourseSubject() {
		return numberCourseSubject;
	}
	public void setNumberCourseSubject(Integer numberCourseSubject) {
		this.numberCourseSubject = numberCourseSubject;
	}
	public List<KnowledgeProgramDto> getChildren() {
		return children;
	}
	public void setChildren(List<KnowledgeProgramDto> children) {
		this.children = children;
	}
	public KnowledgeProgramDto getParent() {
		return parent;
	}
	public void setParent(KnowledgeProgramDto parent) {
		this.parent = parent;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public boolean isHaveChil() {
		return isHaveChil;
	}
	public void setHaveChil(boolean isHaveChil) {
		this.isHaveChil = isHaveChil;
	}
	public SpecialityDto getSubSpeciality() {
		return subSpeciality;
	}
	public void setSubSpeciality(SpecialityDto subSpeciality) {
		this.subSpeciality = subSpeciality;
	}
	
	public Integer getPassedCredits() {
		return passedCredits;
	}
	public void setPassedCredits(Integer passedCredits) {
		this.passedCredits = passedCredits;
	}
	public List<ProgramSubjectDto> getListProgramSubject() {
		return listProgramSubject;
	}
	public void setListProgramSubject(List<ProgramSubjectDto> listProgramSubject) {
		this.listProgramSubject = listProgramSubject;
	}
	public List<StudentSubjectMarkDto> getListStudentSubjectMark() {
		return listStudentSubjectMark;
	}
	public void setListStudentSubjectMark(List<StudentSubjectMarkDto> listStudentSubjectMark) {
		this.listStudentSubjectMark = listStudentSubjectMark;
	}
	public Boolean getIsComplete() {
		return isComplete;
	}
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	public Boolean getExpanded() {
		return expanded;
	}
	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}
	public KnowledgeProgramDto() {
		
	}
	private List<KnowledgeProgramDto> getListChildren(KnowledgeProgram kp){
		List<KnowledgeProgramDto> ret = new ArrayList<KnowledgeProgramDto>();
		
		if(kp.getChildren()!=null && kp.getChildren().size()>0) {
			this.setHaveChil(true);
			for(KnowledgeProgram k : kp.getChildren()) {
				KnowledgeProgramDto kDto = new KnowledgeProgramDto();
				kDto.setId(k.getId());
				kDto.setExpanded(true);
				if(k.getKnowledgeBlock()!=null) {
					KnowledgeBlockDto knowledgeBlockDto = new KnowledgeBlockDto(k.getKnowledgeBlock());
					kDto.setKnowledgeBlock(knowledgeBlockDto);
					kDto.setDisplayName(k.getKnowledgeBlock().getName());
				}
				if(k.getProgram()!=null) {
					EducationProgramDto program = new  EducationProgramDto(k.getProgram());
					kDto.setProgram(program);
				}
				if(k.getSubSpeciality() != null) {
					SpecialityDto dto = new SpecialityDto();
					dto.setId(k.getSubSpeciality().getId());
					dto.setName(k.getSubSpeciality().getName());
					dto.setCode(k.getSubSpeciality().getCode());
					kDto.setSubSpeciality(dto);
				}
//				if(k.getParent() != null) {
//					kDto.setParent(new KnowledgeProgramDto(k.getParent()));
//				}
				kDto.setBlockType(k.getBlockType());
				kDto.setMinNumberCredit(k.getMinNumberCredit());
				kDto.setTotalCredit(k.getTotalCredit());
				kDto.setNumberCourseSubject(k.getNumberCourseSubject());
				kDto.setChildren(getListChildren(k));
				ret.add(kDto);
			}
		}
		return ret;
	}
	public KnowledgeProgramDto(KnowledgeProgram kp) {
		if(kp!=null) {
			this.setId(kp.getId());
			this.setBlockType(kp.getBlockType());
			this.setExpanded(true);
			if(kp.getKnowledgeBlock()!=null) {
				KnowledgeBlockDto knowledgeBlockDto = new KnowledgeBlockDto(kp.getKnowledgeBlock());
				this.setKnowledgeBlock(knowledgeBlockDto);
				this.setDisplayName(kp.getKnowledgeBlock().getName());
				this.setBlockName(kp.getKnowledgeBlock().getName());
			}
			if(kp.getProgram()!=null) {
				EducationProgramDto program = new  EducationProgramDto(kp.getProgram());
				this.setProgram(program);
			}
			if(kp.getParent() != null) {
				KnowledgeProgramDto dto = new KnowledgeProgramDto();
				dto.setId(kp.getParent().getId());
				dto.setExpanded(true);
				if(kp.getParent().getKnowledgeBlock() != null) {
					KnowledgeBlockDto b = new KnowledgeBlockDto();
					b.setName(kp.getParent().getKnowledgeBlock().getName());
					b.setId(kp.getParent().getKnowledgeBlock().getId());
					b.setCode(kp.getParent().getKnowledgeBlock().getCode());
					dto.setKnowledgeBlock(b);
					dto.setDisplayName(kp.getParent().getKnowledgeBlock().getName());
					dto.setBlockName(b.getName());
				}
				if(kp.getParent().getProgram() != null) {
					EducationProgramDto e = new EducationProgramDto();
					e.setId(kp.getParent().getProgram().getId());
					e.setName(kp.getParent().getProgram().getName());
					e.setCode(kp.getParent().getProgram().getCode());
					dto.setProgram(e);
				}
				this.setParent(dto);
			}
			if(kp.getSubSpeciality() != null) {
				SpecialityDto dto = new SpecialityDto();
				dto.setId(kp.getSubSpeciality().getId());
				dto.setName(kp.getSubSpeciality().getName());
				dto.setCode(kp.getSubSpeciality().getCode());
				this.setSubSpeciality(dto);
			}
			this.setMinNumberCredit(kp.getMinNumberCredit());
			this.setTotalCredit(kp.getTotalCredit());
			this.setNumberCourseSubject(kp.getNumberCourseSubject());
			this.setChildren(getListChildren(kp));
		}
	}
	
	public KnowledgeProgramDto(KnowledgeProgram kp,Subject s) {
		if(kp!=null) {
			this.setId(kp.getId());
			this.setBlockType(kp.getBlockType());
			if(kp.getKnowledgeBlock()!=null) {
				KnowledgeBlockDto knowledgeBlockDto = new KnowledgeBlockDto(kp.getKnowledgeBlock());
				this.setKnowledgeBlock(knowledgeBlockDto);
				this.setDisplayName(kp.getKnowledgeBlock().getName());
			}
			if(kp.getProgram()!=null) {
				EducationProgramDto program = new  EducationProgramDto(kp.getProgram());
				this.setProgram(program);
			}
			if(kp.getParent() != null) {
				KnowledgeProgramDto dto = new KnowledgeProgramDto();
				dto.setId(kp.getParent().getId());
				if(kp.getParent().getKnowledgeBlock() != null) {
					KnowledgeBlockDto b = new KnowledgeBlockDto();
					b.setName(kp.getParent().getKnowledgeBlock().getName());
					b.setId(kp.getParent().getKnowledgeBlock().getId());
					b.setCode(kp.getParent().getKnowledgeBlock().getCode());
					dto.setKnowledgeBlock(b);
					dto.setDisplayName(kp.getParent().getKnowledgeBlock().getName());
				}
				if(kp.getParent().getProgram() != null) {
					EducationProgramDto e = new EducationProgramDto();
					e.setId(kp.getParent().getProgram().getId());
					e.setName(kp.getParent().getProgram().getName());
					e.setCode(kp.getParent().getProgram().getCode());
					dto.setProgram(e);
				}
				this.setParent(dto);
			}
			if(kp.getSubSpeciality() != null) {
				SpecialityDto dto = new SpecialityDto();
				dto.setId(kp.getSubSpeciality().getId());
				dto.setName(kp.getSubSpeciality().getName());
				dto.setCode(kp.getSubSpeciality().getCode());
				this.setSubSpeciality(dto);
			}
			this.setMinNumberCredit(kp.getMinNumberCredit());
			this.setTotalCredit(kp.getTotalCredit());
			this.setNumberCourseSubject(kp.getNumberCourseSubject());
			this.setChildren(getListChildren(kp));
		}
	}
}
