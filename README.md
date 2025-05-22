<h3>1. Création du projet Spring Boot avec les dépendances</h3>
<img src="captures/InitializeProject.png">
<br/>

<h4>Les dépendances via pom.xml</h4>
<img src="captures/pomXML01.png">
<br/>
<img src="captures/pomXML02.png">
<br/>
<img src="captures/pomXML03.png">
<br/>
<img src="captures/pomXML04.png">
<br/>
<h3>2. Création de l'entité JPA Product</h3>
<img src="captures/JPAProduct.png">
<br/>
<h3>3. Création de l'interface ProductRepository basée sur Spring Data</h3>
<img src="captures/ProductRepository.png">
<br/>
<h4>Configuration de la datasource H2</h4>
<img src="captures/application-properties.png">
<br/>
<h3>4. Test de la couche DAO</h3>
<ul>
<li><h4>Classe principale ManadjaApplication.java</h4></li>
<img src="captures/TestDao.png">
<li><h4>Test</h4></li>
<img src="captures/Test.png">
<li><h4>Test de connexion à la base H2 Database</h4></li>
<img src="captures/connexion-H2.png">
<img src="captures/conx.png">
<img src="captures/Test-enregistrements.png">
</ul>
<br/>
<h3>5. Désactivation de la protection par défaut de Spring Security</h3>
<img src="captures/Desactivation-protection-Spring-Security.png">
<br>
<h3>6. Création du contrôleur Spring MVC et des vues Thymeleaf</h3>
<ul>
<li><h4>Contrôleur pour afficher la liste des produits</h4></li>
<img src="captures/Controleur-Afficher-Produits.png">
<li><h4>Vue Thymeleaf pour l'affichage de la liste des produits</h4></li>
<img src="captures/vueThymeleafAfficherProduits.png">
<li><h4>Contrôleur pour supprimer un produit</h4></li>
<img src="captures/supprimerProduitControleur.png">
<li><h4>Vue Thymeleaf pour supprimer un produit</h4></li>
<img src="captures/vueThymeleafSupprimerProd.png">
<li><h4>Page template basée sur Thymeleaf layout et Bootstrap</h4></li>
<img src="captures/pageTemplateThymeleafBootstrap.png">
</ul>
