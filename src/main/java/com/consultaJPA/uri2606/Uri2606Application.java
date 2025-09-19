package com.consultaJPA.uri2606;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.consultaJPA.uri2606.dto.ProductMinDTO;
import com.consultaJPA.uri2606.projections.ProductProjection;
import com.consultaJPA.uri2606.repositories.ProductRepository;

@SpringBootApplication
public class Uri2606Application implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2606Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<ProductProjection> list1 = productRepository.search1("super%");
		List<ProductMinDTO> listDTO1 = list1.stream().map(x -> new ProductMinDTO(x)).collect(Collectors.toList());
		System.out.println("---------------- M O V I E S   F O U N D   S Q L ----------------");
		for (ProductMinDTO obj : listDTO1) {
			System.out.println(obj);
		}
		System.out.println("-----------------------------------------------------------------");

		List<ProductMinDTO> listDTO2 = productRepository.search2("super%");
		System.out.println("---------------- M O V I E S   F O U N D   J P Q L ----------------");
		for (ProductMinDTO obj : listDTO2) {
			System.out.println(obj);
		}
		System.out.println("-----------------------------------------------------------------");

	}

}
