# Generate Maven Site documentation
To generate a Maven Site documentation, you'll need the **java doc maven plugin** implemented inside your pom.xml file.

## Configuration of site.xml and pom.xml
### General 
- add < developers > with all according < developer > tags of the developer who contributed to the project inside it
### pom.xml: 
- make sure this are plugins inside < build > : maven-surefire-plugin, maven-compiler-plugin, maven-resources-plugin, maven-site-plugin, jacoco-maven-plugin
- inside < reporting > > < plugins > add these plugins: maven-project-info-reports-plugin, maven-site-plugin, maven-javadoc-plugin, jacoco-maven-plugin