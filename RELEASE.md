### RELEASE NEW VERSION (by jgitflow maven plugin / don't use cmder - problems with gpg on windows)
 
    mvn jgitflow:release-start -Dgpg.skip=false     => starting the new release
    mvn jgitflow:release-finish -Dgpg.skip=false    => finishing the release (and makes other stuff related with gitflow & artifacts deployment)
    
    Then, Go to https://oss.sonatype.org
    Login to the Nexus UI.
    Go to Staging Repositories page.
    Select a staging repository.
    Click the Close button (on the top bar).
    THEN Click the Release button and it should also appear in maven central etc

### DEPLOY (don't use cmder - problems with gpg on windows / use the version 2 of GPG on windows not provided gpg1.4 git-for-windows)

    mvn javadoc:jar source:jar deploy -Dgpg.skip=false -Darguments=-Dgpg.passphrase=PASSPHRASE
 
### GENERATE SNAPSHOT

    mvn clean javadoc:jar source:jar deploy -Darguments=-Dgpg.passphrase=PASSPHRASE

### RELEASE NEW VERSION (by the maven release plugin) DEPRECATED

    mvn release:clean
    mvn release:prepare -Darguments=-Dgpg.passphrase=PASSPHRASE
    mvn release:perform -Darguments=-Dgpg.passphrase=PASSPHRASE
 
With the approach with maven release plugin the manual branching is required.    
See more there: [http://vincent.demeester.fr/2012/07/maven-release-gitflow/](http://vincent.demeester.fr/2012/07/maven-release-gitflow/)
