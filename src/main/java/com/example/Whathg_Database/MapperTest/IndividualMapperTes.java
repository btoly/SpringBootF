package com.example.Whathg_Database.MapperTest;

import org.junit.Assert;
import org.junit.Test;

import com.example.Whathg_Database.DTO.CertificationDTO;
import com.example.Whathg_Database.DTO.IndividualDTO;
import com.example.Whathg_Database.Mapper_Imalmation.CertificationLMP;
import com.example.Whathg_Database.Mapper_Imalmation.IndivdualMappelamp;
import com.example.Whathg_Database.model.Individual;







public class IndividualMapperTes {

	
	
	
	private final IndivdualMappelamp individualMapper = new IndivdualMappelamp();

	@Test
	public void IndividualMapper_domainToDto() {
		final IndividualDTO source =new IndividualDTO();

		source.setNationalID("W");
		source.setFName("W");
		source.setMName("W");
		source.setLName("W");
		source.setGender("W");
		source.setStatus("W");
		source.setSkills("W");
		source.setDateOfBirth(null);
		source.setAttachments("W");

		final Individual target = individualMapper.dtoToDomain(source);

		Assert.assertNotNull(target);
//		Assert.assertEquals("W", target.getNationalID());
//		Assert.assertEquals("W", target.getFirstName());
//		Assert.assertEquals("W", target.getMName());
//		Assert.assertEquals("W", target.getLastName());
//		Assert.assertEquals("W", target.getGender());
//		Assert.assertEquals("W", target.getStatus());
//		Assert.assertEquals("W", target.getSkills());
//	//	Assert.assertEquals(null, target.getDateOfBirth());
//		Assert.assertEquals("W", target.getAttachments());




	
	}

	@Test
	public void IndividualMapper_dtoToDomain() {

		final Individual source =new Individual();


		source.setFirstName("W");
		source.setMName("M");
		source.setLastName("W");
		source.setGender("W");
		source.setStatus("W");
		source.setSkills("W");
	//	source.setDateOfBirth(null);
		source.setAttachments("W");

		final IndividualDTO target = individualMapper.domainToDto(source);
		
		
		Assert.assertNotNull(target);
//		Assert.assertEquals("W", target.getNationalID());
//		Assert.assertEquals("W", target.getfName());
//		Assert.assertEquals("W", target.getmName());
//		Assert.assertEquals("W", target.getlName());
//		Assert.assertEquals("W", target.getGender());
//		Assert.assertEquals("W", target.getStatus());
//		Assert.assertEquals("W", target.getSkills());
//		Assert.assertEquals(null, target.getDateOfBirth());
//		Assert.assertEquals("W", target.getAttachments());



	}

	
	/*
	 * ///######
	 * 
	 * private final CertificationLMP certificationLMP = new CertificationLMP();
	 * 
	 * 
	 * @Test public void CertificationLMP_domainToDto() { final CertificationDTO
	 * source =new CertificationDTO();
	 * 
	 * source.setAddby("w); final Individual target =
	 * individualMapper.dtoToDomain(source);
	 * 
	 * Assert.assertNotNull(target); // Assert.assertEquals("W",
	 * target.getNationalID()); // Assert.assertEquals("W", target.getFirstName());
	 * // Assert.assertEquals("W", target.getMName()); // Assert.assertEquals("W",
	 * target.getLastName()); // Assert.assertEquals("W", target.getGender()); //
	 * Assert.assertEquals("W", target.getStatus()); // Assert.assertEquals("W",
	 * target.getSkills()); // // Assert.assertEquals(null,
	 * target.getDateOfBirth()); // Assert.assertEquals("W",
	 * target.getAttachments());
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	
}