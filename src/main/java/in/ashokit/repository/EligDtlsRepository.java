package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.EligibilityDtlsEntity;

public interface EligDtlsRepository extends JpaRepository<EligibilityDtlsEntity,Integer> {
	
	@Query("select distinct(planName) from EligibilityDtlsEntity")
	public List<String> getUniquePlanNames();
	
	@Query("select distinct(planStatus) from EligibilityDtlsEntity")
	public List<String> getUniquePlanStatuses();
	
	public List<EligibilityDtlsEntity> findByPlanName(String planName);

	public List<EligibilityDtlsEntity> findByPlanStatus(String planStatus);

	public List<EligibilityDtlsEntity> findByPlanNameAndPlanStatus(String planName,String planStatus);
}
