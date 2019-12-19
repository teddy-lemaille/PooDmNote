Hibernate--------------------
Hibernate est un framework open source gérant la persistance des objets en base de données relationnelle.

Hibernate est adaptable en termes d'architecture, il peut donc être utilisé aussi bien dans un développement 
client lourd, que dans un environnement web léger de type Apache Tomcat ou dans un environnement Java EE complet : 
WebSphere, JBoss Application Server et Oracle WebLogic Server.

Hibernate apporte une solution aux problèmes d'adaptation entre le paradigme objet et les SGBD en remplaçant les 
accès à la base de données par des appels à des méthodes objet de haut niveau. 


JPA--------------
Afin de pouvoir générer nos tables, nous avons besoin de transformer notre classe Product en entité gérée par JPA.

Nous allons commencer par importer toutes les dépendances nécessaires à l'utilisation du JPA. Spring Boot nous offre 
pour cela un starter prêt à l'emploi : spring-boot-starter-data-jpa. Commençons par l'ajouter dans la balise  <dependencies>  de notre pom.xml