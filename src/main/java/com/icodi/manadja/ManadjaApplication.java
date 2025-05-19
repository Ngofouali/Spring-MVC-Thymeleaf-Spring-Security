package com.icodi.manadja;

import com.icodi.manadja.entities.Product;
import com.icodi.manadja.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManadjaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManadjaApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .nom("Ordinateur Portable")
                    .prix(750000.00)
                    .quantiteEnStock(15)
                    .build());

            productRepository.save(Product.builder()
                    .nom("Smartphone")
                    .prix(50000.00)
                    .quantiteEnStock(30)
                    .build());

            productRepository.save(Product.builder()
                        .nom("Casque Audio")
                        .prix(45000.00)
                        .quantiteEnStock(50)
                        .build());

            productRepository.save(Product.builder()
                        .nom("Clavier Mécanique")
                        .prix(12000.00)
                        .quantiteEnStock(20)
                        .build());

            productRepository.save(Product.builder()
                        .nom("Souris sans fil")
                        .prix(2500.00)
                        .quantiteEnStock(60)
                        .build());

            productRepository.save(Product.builder()
                        .nom("Ecran 27 pouces")
                        .prix(300000.00)
                        .quantiteEnStock(10)
                        .build());

            productRepository.findAll().forEach(p->System.out.println(p.toString()));
        };
    }

}


