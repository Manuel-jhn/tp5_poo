tp5

Le projet sur github : https://github.com/Manuel-jhn/tp5_poo

Hibernate : Hibernate est une solution open source de type ORM (Object Relational Mapping) qui permet de faciliter le développement de la couche persistance d'une application. 
Hibernate permet donc de représenter une base de données en objets Java et vice versa.

H2 Database : C'est l'un des systemes de gestion de base de données les plus connus écrits en Java.
Et il marche très bien avec Spring.

Thymeleaf : Thymeleaf est un générateur Java de template XML/XHTML/HTML5 qui peut travailler à la fois
dans des environnements Web (Servlet) et non Web. Il peut traiter n'importe quel fichier XML
même hors ligne.

Spring Web : is the original web framework built on the Servlet API and has been included in the Spring Framework from the very beginning. 
The formal name, “Spring Web MVC,” comes from the name of its source module (spring-webmvc), but it is more commonly known as “Spring MVC”.

Spring JPA : Framework permettant de faciliter l'utilisation de JPA. IL va permettre de générer toutes sortes d'opérations
vers la base de données sans avoir à écrire une requete ou une implémentation DAO.

Spring Boot : Permet de faciliter la configuration d'un projet SPring et de réduire le temps alloué au démarrage d'un projet.


Etape 13
1. avec : @GetMapping("/greeting")

2. avec : return greeting

3. on envoie le nom sous la forme "nameGET" qui sera ensuite récupéré en tant que variable dans le HTML 

Etape 17
La création d'une table Address avec en attributs id, creation et content 

Etape 18
"@Entity" correspond à une table dans Hibernate donc lors de notre création de classe avec @Entity nous avons créé une nouvelle table

Etape 20
L'on peut voir les deux addresses rentrées.

Etape 23
Injecte les dependances entre les beans.

Etape 30
<dependency>
	<groupId>org.webjars</groupId>
	<artifactId>jquery</artifactId>
	<version>3.4.1</version>
</dependency>
<dependency>
	<groupId>org.webjars</groupId>
	<artifactId>bootstrap</artifactId>
	<version>4.3.0</version>
</dependency>
<dependency>
	<groupId>org.webjars</groupId>
	<artifactId>bootstrap-datepicker</artifactId>
	<version>1.0.1</version>
</dependency>

Partie 2

Etape 6 
Oui il faut une clé que l'on récupère en s'inscrivant sur leur site web
URL : https://api.darksky.net/forecast/"clé"/"latitude","longitude"?lang=fr,"ajouts optionnels"
IL faut utiliser la méthode GET
A la fin de l'url il faut mettre ?nomParametre=valParametre
Dans la classe Currently avec le nom temperature et le nom summary