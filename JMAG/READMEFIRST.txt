Maven Archetype Generator
==========================
Develop a Web Application that generates Maven 3 Archetypes give an input:
1. Type of Project : Java Application, Web Application
2. Initial package
3. Name of the Project


SET UP PROJECT:
mvn archetype:generate -DgroupId=com.dfwcomputech.maven.archgen -DartifactId=JMAG -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
mvn eclipse:eclipse -Dwtpversion=2.0