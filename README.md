étape 5 :

Hibernate

Hibernate est un framework open source gérant la persistance des objets en base de données relationnelle.

Hibernate est adaptable en termes d'architecture, il peut donc être utilisé aussi bien dans un développement 
client lourd, que dans un environnement web léger de type Apache Tomcat ou dans un environnement Java EE complet : 
WebSphere, JBoss Application Server et Oracle WebLogic Server.

Hibernate apporte une solution aux problèmes d'adaptation entre le paradigme objet et les SGBD en remplaçant les 
accès à la base de données par des appels à des méthodes objet de haut niveau. 


JPA

Afin de pouvoir générer nos tables, nous avons besoin de transformer notre classe Product en entité gérée par JPA.

Nous allons commencer par importer toutes les dépendances nécessaires à l'utilisation du JPA. Spring Boot nous offre 
pour cela un starter prêt à l'emploi : spring-boot-starter-data-jpa. Commençons par l'ajouter dans la balise  <dependencies>  
de notre pom.xml

Web

Permet de communiquer facilement avec des apis web

H2

systeme de gestion de base de donnees relationnelles Java

DevTools
offre des outils en plus pour le developpement

Thymeleaf

permet de generer du HTML en java

étape 13 : 

1. Avec l'anotation @GetMapping("/greeting")
2. return "greeting";
3. Avec l'anotation @RequestPraram(name="nameGET", required=false, defaultValue="World")

étape 17 : 

oui, il y a une table nommé adress avec les champs que l'on a mis en attributs.

etape 18 :

les annotations que l'on a mis permettent de générer une table.

etape 20 : 

on peut voir toutes les info que l'on amis dans le fichier data.sql

etape 23 : 

C’est une annotation qui nous permet de faire l’injection de dépendances entre les beans de l’application (Spring va tout faire), 
il suffit juste d’annoter un constructeur ou une méthode avec cette dernière. et le conteneur Spring va faire la suite(La creation 
du bean, le chercher et l’injecter automatiquement…).

etape 30:

j'ai ajouté Bootstrap dans les dependences du projet dans le fichier pom.xml

--------Partie 2 

etape 6 : 

il faut une clé pour pouvoir utiliser darksky.

https://api.darksky.net/forecast/[key]/[latitude],[longitude]

La méthode utiliser est un GET, on peut voir les paramètres dans l'url.
Les paramètres sont placé dans l'url avec un & entre les paramètres.
l'information de temperature ce trouve dans la parti currently dans le champ temperature
l'information de prévision peut etre donné par heure ou par jour dans les hourly et daily


https://github.com/teddy-lemaille/PooDmNote

