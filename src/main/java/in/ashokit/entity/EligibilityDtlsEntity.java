package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ELIGIBILITY_DTLS")
public class EligibilityDtlsEntity {
 
	@Id
	@GeneratedValue
	
	@Column(name="ELIG_ID")
	private Integer eligId;
	
	@Column(name="CASE_NUM")
	private Long caseNum;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	@Column(name="PLAN_STATUS")
	private String planStatus;
	
	@Column(name="BENEFIT_AMT")
	private Double benefitAmt;
	
	@Column(name="START_DATE")
	private LocalDate startDate;
	
	@Column(name="END_DATE")
	private LocalDate endDate;
	
	@Column(name="DENIAL_REASON")
	private String denailReason;
	
	public Integer getEligId() {
		return eligId;
	}

	public void setEligId(Integer eligId) {
		this.eligId = eligId;
	}

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Double getBenefitAmt() {
		return benefitAmt;
	}

	public void setBenefitAmt(Double benefitAmt) {
		this.benefitAmt = benefitAmt;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getDenailReason() {
		return denailReason;
	}

	public void setDenailReason(String denailReason) {
		this.denailReason = denailReason;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Long getHolderSsn() {
		return holderSsn;
	}

	public void setHolderSsn(Long holderSsn) {
		this.holderSsn = holderSsn;
	}

	public String getPlanName() {
		return planName;
	}

	@Column(name="HOLDER_NAME")
	private String holderName;
	
	@Column(name="HOLDER_SSN")
	private Long holderSsn;
	

	

	