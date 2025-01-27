package com.mayssa.etudiants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.mayssa.etudiants.entities.Etudiant;
import com.mayssa.etudiants.repos.EtudiantRepository;
import com.mayssa.etudiants.service.EtudiantService;


@SpringBootTest
class EtudiantsApplicationTests {

	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private EtudiantService  etudiantService;
	@Test
	public void testCreateEtudiant() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateNaiss = null;
        try {
            dateNaiss = dateFormat.parse("14/07/2003");
        } catch (ParseException e) {
            e.printStackTrace();
        }
	Etudiant etud = new Etudiant("makhlouf","ahmed",dateNaiss,"tunis","ahmed@gmail.com",2023,"GC");
	etudiantRepository.save(etud);
	}
	@Test
	public void testFindEtudiant()
	{
	Etudiant e = etudiantRepository.findById(1L).get();
	System.out.println(e);
	}
	@Test
	public void testUpdateEtudiant()
	{
		Etudiant e = etudiantRepository.findById(1L).get();
	   e.setAnneeEtudes(2023);
	   etudiantRepository.save(e);
	   System.out.println(e);
	}
	@Test
	public void testDeleteEtudiant()
	{
	etudiantRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousEtudiant()
	{
	List<Etudiant> etuds = etudiantRepository.findAll();
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}
	}
	@Test
	public void testFindByNomEtudiantContains()
	{
	Page<Etudiant> etuds = etudiantService.getAllEtudiantsParPage(0,2);
	System.out.println(etuds .getSize());
	System.out.println(etuds.getTotalElements()); System.out.println(etuds.getTotalPages());
	etuds.getContent().forEach(p -> {System.out.println(p.toString());
	});
	/*ou bien
	for (Produit p : prods)
	{
	System.out.println(p);
	} */
	}


}
